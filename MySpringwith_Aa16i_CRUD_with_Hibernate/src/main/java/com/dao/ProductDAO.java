package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;

@Component
public class ProductDAO {

	// create
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int createProduct(Product product)
	{
		int i = (Integer)this.hibernateTemplate.save(product);
		
		if(i>0)	
		i = 1;
		
		return i;
		
	}
	
	
	// get all products
	public List<Product> getProducts()
	{
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		
		return products;
	}
	
	// get single product
	public Product getProduct(int pid)
	{
		
		Product product =  this.hibernateTemplate.get(Product.class,pid);
		return product;
	}
	
	// delete the single product
	@Transactional
	public void deleteProduct(int pid)
	{
	Product p = this.hibernateTemplate.load(Product.class, pid);
	this.hibernateTemplate.delete(p);
	}
	
	// update product
	@Transactional
	public void updateProduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	
}
