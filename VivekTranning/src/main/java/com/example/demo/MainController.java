package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired  
	private ProductServiceInter productService;  
	//mapping the getProduct() method to /product  
	@GetMapping(value ="/product")  
	public List<Product> getProduct()   
	{  
	//finds all the products  
	List<Product> products = productService.findAll();  
	//returns the product list  
	return products;  
	}  
	
}
