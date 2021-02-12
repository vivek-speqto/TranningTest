package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductServiceInter{

	@Override
	public List<Product> findAll() {
		ArrayList<Product> pro=new ArrayList<Product>();
		pro.add(new Product(101,"LED",5000));
		pro.add(new Product(102,"Table",500));
		pro.add(new Product(103,"Chair",50));
		pro.add(new Product(104,"Car",500));
		pro.add(new Product(105,"Bus",1500));
		pro.add(new Product(106,"Washing Machine",15000));
		return pro;
	}

}
