package com.mobitel.MoBitelBackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MoBitelBackend.dao.ProductDAO;
import com.mobitel.MoBitelBackend.model.Product;


public class ProductTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MoBitelBackend");
		
		context.refresh();
		
		//Inserting a Product Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		
		Product product=new Product();
		
		product.setProdname("WIFIMobile");
		product.setProddesc("This Mobile is WIFI Enabled. You can Enjoy Internet");
		product.setPrice(13000);
		product.setQuantity(10);
		product.setSuppid(9);
		product.setCatid(8);

		productDAO.insertUpdateProduct(product);		
		System.out.println("Product Inserted");
		
		//Retrieval TestCase
		
		/*Product product=productDAO.getProduct(2);
		System.out.println("Product Name:"+product.getProdname());
		System.out.println("Product Description:"+product.getProddesc());*/
		
		//Deletion TestCase
		/*Product product=productDAO.getProduct(2);
		productDAO.deleteProduct(product);
		System.out.println("The Product Deleted");*/
		
		//Retrieving the Data
		
		/*List<Product> list=productDAO.getProductDetails();
		
		for(Product product:list)
		{
			System.out.println(product.getProdid()+":"+product.getProdname()+":"+product.getProddesc());
		}*/
		
		//Update the Product
//		Product product=productDAO.getProduct(3);
//		product.setProdname("WifiEnMobile");
//		productDAO.insertUpdateProduct(product);
//		System.out.println("The Product Updated");
		
	}
}
