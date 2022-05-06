package com.ine.cartografia.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ine.cartografia.entity.Usuario;

public class UsuarioMapper {
	private final Logger logger = LoggerFactory.getLogger(Usuario.class);

	public Usuario mapRow(ResultSet rs, int arg1) throws SQLException {
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
		logger.info("UserControl2mapper: "+user.toString());
		return user;
	}
}
