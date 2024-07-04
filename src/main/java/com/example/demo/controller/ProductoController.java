package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.ProductoEntity;
import com.example.demo.entity.UsuarioEntity;
import com.example.demo.service.ProductoService;
import com.example.demo.service.UsuarioService;

import jakarta.servlet.http.HttpSession;

public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/menu")
	private String vistaMenu(HttpSession session, Model model) {
		if(session.getAttribute("usuario") == null) {
			return "redirect:/";
		}
		String correo = session.getAttribute("usuario").toString();
		UsuarioEntity usuarioEncontradoLogeado = usuarioService.buscarUsuarioPorCorreo(correo);
		
		List<ProductoEntity> productos = productoService.buscarTodosProductos();
		model.addAttribute("productos", productos);
		model.addAttribute("nombre", usuarioEncontradoLogeado.getNombre());
		return "menu";
	}

}
