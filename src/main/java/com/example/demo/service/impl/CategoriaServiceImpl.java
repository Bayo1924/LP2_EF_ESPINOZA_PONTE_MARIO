package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.CategoriaEntity;
import com.example.demo.repository.CategoriaRepository;
import com.example.demo.service.CategoriaService;

public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<CategoriaEntity> buscarTodasCategorias() {
		return categoriaRepository.findAll();
	}

}
