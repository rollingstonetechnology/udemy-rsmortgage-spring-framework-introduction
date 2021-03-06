package com.rollingstone.springframework.basic.ioc.contructor.injection.collection.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestSimpleSpringIOC {

	private static final Logger logger = LoggerFactory.getLogger(TestSimpleSpringIOC.class);

	
	public static void main(String[] args) {  
        
        Resource r=new ClassPathResource("applicationContext-constructor-arg-collection-list.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        ShoppingCart  cartOfStrings =(ShoppingCart)factory.getBean("cartOfStrings");  
        logger.info("List of Strings :"+cartOfStrings.toString());  
        
        
        ShoppingCartWithItemObjects  cartOfObjects =(ShoppingCartWithItemObjects)factory.getBean("cartOfObjects");  
        logger.info("List Of Custom Java Objects : "+cartOfObjects.toString());  
          
    }  
}
