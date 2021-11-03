package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.IProductoDAO;
import com.ecommerce.entity.producto;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private IProductoDAO iProductoDAO ;
	
	@Override
	public producto save(producto producto) {
		// TODO Auto-generated method stub
		return iProductoDAO.save(producto);
	}

	@Override
	public Optional<producto> get(Long id) {
		// TODO Auto-generated method stub
		return iProductoDAO.findById(id);
	}

	@Override
	public void update(producto producto) {
		// TODO Auto-generated method stub
		iProductoDAO.save(producto);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		iProductoDAO.deleteById(id);
	}

	@Override
	public List<producto> findAll() {
		// TODO Auto-generated method stub
		return iProductoDAO.findAll();
	}

}
