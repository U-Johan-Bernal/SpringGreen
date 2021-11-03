package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.entity.producto;

public interface ProductoService {
	public producto save (producto producto);
	public Optional <producto> get(Long id);
	public void update(producto producto);
	public void delete(Long id);
	public List<producto> findAll();
}
