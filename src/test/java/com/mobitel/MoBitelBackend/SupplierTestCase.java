package com.mobitel.MoBitelBackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MoBitelBackend.dao.SupplierDAO;
import com.mobitel.MoBitelBackend.model.Supplier;

public class SupplierTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MoBitelBackend");
		
		context.refresh();
		
		//Inserting a Product Object.
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		
		//Insertion TestCase
		
		Supplier supplier=new Supplier();
		
		supplier.setSuppname("WIFIMobile");
		supplier.setSuppdesc("This Mobile is WIFI Enabled. You can Enjoy Internet");

		supplierDAO.insertUpdateSupplier(supplier);		
		System.out.println("Supplier Inserted");
		
		//Retrieval TestCase
		
		/*Supplier supplier=supplierDAO.getSupplier(2);
		System.out.println("Supplier Name:"+supplier.getSuppname());
		System.out.println("Supplier Description:"+supplier.getSuppdesc());*/
		
		//Deletion TestCase
		/*Supplier supplier=supplierDAO.getSupplier(2);
		supplierDAO.deleteSupplier(supplier);
		System.out.println("The Supplier Deleted");*/
		
		//Retrieving the Data
		
		/*List<Supplier> list=supplierDAO.getSupplierDetails();
		
		for(Supplier supplier:list)
		{
			System.out.println(supplier.getSuppid()+":"+supplier.getSuppname()+":"+supplier.getSuppdesc());
		}*/
		
		//Update the Product
//		Supplier supplier=supplierDAO.getSupplier(3);
//		supplier.setSuppname("WifiEnMobile");
//		supplierDAO.insertUpdateSupplier(supplier);
//		System.out.println("The Supplier Updated");
		
	}
}
