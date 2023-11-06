package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.ProductDAO;
import com.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDAO productDao;
	

	@RequestMapping("/")
	public String home(Model m)
	{
		List<Product> products = productDao.getProducts();
		System.out.println(products);
		m.addAttribute("products", products);
		
		return "home";
	}
	
	
	// addproduct.jsp
	@RequestMapping("addproduct")
	public String addProduct(Model m)
	{
		m.addAttribute("title", "Add Product");
		return "addproduct";
	}
	
	//handle addProduct
	@RequestMapping(value="/handleaddproduct",method = RequestMethod.POST)
	public RedirectView handleaddproduct(@ModelAttribute Product product, Model m,HttpServletRequest request)
	{
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView r = new RedirectView();
		r.setUrl(request.getContextPath() + "/"); // it is homepage path
		return r;
	}
	
	// handle deleteProduct
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest request)
	{
		productDao.deleteProduct(productId);
		
		RedirectView rv = new RedirectView();
		rv.setUrl(request.getContextPath());
		
		return rv;
	}
	
	// updateProduct.jsp
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId,Model m)
	{
	Product product = productDao.getProduct(productId);
		m.addAttribute("product",product);
		
		return "updateproduct";
	}
	
	// handle updateProduct
		@RequestMapping(value="/handleupdateproduct",method = RequestMethod.POST)
		public RedirectView handleupdateproduct(@ModelAttribute Product product, Model m,HttpServletRequest request)
		{
			System.out.println(product);
			productDao.updateProduct(product);
			RedirectView r = new RedirectView();
			r.setUrl(request.getContextPath() + "/"); // it is homepage path
			return r;
		}
	
}
