package com.ine.cartografia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ine.cartografia.dao.IServiceDao;
import com.ine.cartografia.entity.Usuario;


@Repository

public class DaoServiceImplement implements IDaoService{

	@Autowired
	 private IServiceDao servicio;
	@Override
	public List<Usuario> GetAll() {
		// TODO Auto-generated method stub
		return servicio.GetAll();
	}

}
