package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.producto;

public interface IProductoDAO extends JpaRepository<producto, Long> {

}
