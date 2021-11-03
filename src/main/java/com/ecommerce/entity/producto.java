package com.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class producto /*implements Serializable*/{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long ean; 
	private String nombre;
	private String descripcion;
	private Long precio;
	private Long cantidad;
	private String foto;
	
	
	public producto() {
		//
	}
	public producto(Long id,  Long ean, String nombre, String descripcion, Long precio, Long cantidad, String foto) {
		super();
		this.id = id;
		this.ean = ean;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.foto = foto;
	}
	
	public Long getEan() {
		return ean;
	}
	public void setEan(Long ean) {
		this.ean = ean;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "producto [id=" + id + ", ean=" + ean + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", cantidad=" + cantidad + ", foto=" + foto + "]";
	}

	//private static final long serialVersionUID = 1L;
}
