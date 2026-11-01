package controller;

import org.springframework.web.bind.annotation.RestController;

import services.Amazon;
import services.Flipkart;
import services.ShoppingMart;
@RestController
public class Factory
{

	public static ShoppingMart createObject(String type)
	{
		if (type.equals("amazon"))
		{
		 Amazon a1=new Amazon();
		 return a1;
	}
	   if (type.equals("flipkart"))
		{
			Flipkart f1=new Flipkart();
			return f1;
		}
	
	return null;
	}
}
