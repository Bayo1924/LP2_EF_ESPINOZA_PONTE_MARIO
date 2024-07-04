package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.ProductoEntity;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.service.ProductoService;

public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<ProductoEntity> buscarTodosProductos() {
		return productoRepository.findAll();
	}

	@Override
	public ProductoEntity buscarPorId(Integer id) {
		return productoRepository.findById(id).get();
	}

	@Override
	public ProductoEntity crearProducto(ProductoEntity producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoEntity actualizarProducto(ProductoEntity producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
