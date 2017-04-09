package com.rollingstone.springframework.basic.ioc.setter.injection.third;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rollingstone.springframework.aop.example.fifth.RunAirportOperation;

public class TestSetterInjection {

	private static final Logger logger = LoggerFactory.getLogger(TestSetterInjection.class);

	 public static void main(String[] args) {  
         
	        Resource r=new ClassPathResource("applicationContext-setter-injection.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Customer customer =(Customer)factory.getBean("customer");  
	        logger.info("Customer Infromation : "+customer.toString());  
	        
	        CustomerWithAddress customerWithAddress =(CustomerWithAddress)factory.getBean("customerWithAddress");  
	        logger.info("Customer With Address Infromation : "+customerWithAddress.toString());  
	        
	        
	          
	    }  
}
