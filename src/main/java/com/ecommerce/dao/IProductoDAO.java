package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.producto;

@Repository
public interface IProductoDAO extends JpaRepository<producto, Long> {

}
