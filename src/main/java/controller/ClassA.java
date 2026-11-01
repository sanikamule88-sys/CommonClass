package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import services.ShoppingMart;

public class ClassA 
{
	
	@GetMapping("print{type}")
public String Shopping(@PathVariable String type)
{
	
	ShoppingMart s= Factory.createObject(type);
	s.furniture();
	s.makeupProducts();
	s.DailyNeeds();
	s.Clothes();
	s.Electronics();
	s.CustomerAddress();
	s.CustomerMobile();
	 return s.welcome();
	
	
	
}
	
	
}
