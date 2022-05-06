package com.ine.cartografia.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ine.cartografia.entity.Usuario;


public class ServiceDaoImplement implements IServiceDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	private final Logger logger = LoggerFactory.getLogger(ServiceDaoImplement.class);

	@Override
	public List<Usuario> GetAll() {
		String sql = "SELECT * FROM public.usuario ";
		List<Usuario> list = jdbcTemplate.query(sql, new RowMapper<Usuario>() {

			@Override
			public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
				Usuario user = new Usuario();
				user.setId_usuario(rs.getInt("id_usuario"));
				user.setNombre(rs.getString("nombre"));
				user.setApe_pat(rs.getString("ape_pat"));
				user.setApe_mat(rs.getString("ape_mat"));
				user.setPuesto(rs.getString("puesto"));
				user.setEntidad(rs.getInt("entidad"));
				user.setId_tipo_usuario(rs.getInt("id_tipo_usuario"));
				user.setCorreo(rs.getString("correo"));
				user.setPassword(rs.getString("password"));

				return user;
			}

		});

		return list;
	}

}
