package com.ecommerce.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecommerce.dao.IProductoDAO;
import com.ecommerce.entity.producto;

@Controller
public class ProductoController___ {
	
	@Autowired
	private IProductoDAO productoDao;
	@GetMapping("/")
	public String form(Model model) {
		model.addAttribute("productos",new producto());
		return "form";
	}
	
	@PostMapping("/")
	public String guardar(@RequestParam(name="file", required = false) MultipartFile foto, producto producto,
			RedirectAttributes flash) {
		
		if (!foto.isEmpty()) {
			String ruta = "C:\\Users\\JOHAN\\Desktop";
			
			try {
				byte[] bytes = foto.getBytes();
				Path rutaAbsoluta = Paths.get(ruta + "//" + foto.getOriginalFilename());
				Files.write(rutaAbsoluta, bytes);
				producto.setFoto(foto.getOriginalFilename());
			}catch(Exception e) {
				
			}
			
			productoDao.save(producto);
			flash.addFlashAttribute("success","Producto Agregado");
			
		}
		return "redirect:/";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("productos", productoDao.findAll());
		return "listar";
	}
}
