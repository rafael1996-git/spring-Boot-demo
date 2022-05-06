package com.ine.cartografia.entity;

public class Usuario {
	private Integer id_usuario;
	private String nombre ;
	private String ape_pat ;
	private String ape_mat ;
	
	private String puesto ;
	private int entidad;
	
	private int id_tipo_usuario;
	
	private String correo ;
	
	private String password ;

	public Usuario() {
		
	}

	public Usuario(Integer id_usuario, String nombre, String ape_pat, String ape_mat, String puesto, int entidad,
			int id_tipo_usuario, String correo, String password) {
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.ape_pat = ape_pat;
		this.ape_mat = ape_mat;
		this.puesto = puesto;
		this.entidad = entidad;
		this.id_tipo_usuario = id_tipo_usuario;
		this.correo = correo;
		this.password = password;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe_pat() {
		return ape_pat;
	}

	public void setApe_pat(String ape_pat) {
		this.ape_pat = ape_pat;
	}

	public String getApe_mat() {
		return ape_mat;
	}

	public void setApe_mat(String ape_mat) {
		this.ape_mat = ape_mat;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getEntidad() {
		return entidad;
	}

	public void setEntidad(int entidad) {
		this.entidad = entidad;
	}

	public int getId_tipo_usuario() {
		return id_tipo_usuario;
	}

	public void setId_tipo_usuario(int id_tipo_usuario) {
		this.id_tipo_usuario = id_tipo_usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
