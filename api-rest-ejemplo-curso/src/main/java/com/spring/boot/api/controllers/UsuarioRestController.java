package com.spring.boot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.spring.boot.api.entity.Usuario;
import com.spring.boot.api.service.IUsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/usuario")
	@ResponseStatus(HttpStatus.OK)
	public List<Usuario> mostrar(){
		return usuarioService.getUsuarios();
	}
	
	@GetMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Usuario getUsuarioId(@PathVariable Integer id) {
		return usuarioService.getUsuarioId(id);
	}
	
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.OK)
	public Usuario saveUsuario(@RequestBody Usuario user) {
		return usuarioService.saveUsuario(user);
	}
	
	@PutMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Usuario updateUsuario(@RequestBody Usuario usuario, @PathVariable Integer id){
		Usuario usuarioActual = usuarioService.getUsuarioId(id);
		usuarioActual.setCorreo(usuario.getCorreo());
		usuarioActual.setContrasena(usuario.getContrasena());
		usuarioActual.setUsuario(usuario.getUsuario());
		return usuarioService.saveUsuario(usuarioActual);
	}
	
	@DeleteMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteUsuario(@PathVariable Integer id) {
		usuarioService.deleteUsuario(id);
	}
}
