package com.rollingstone.springframework.basic.ioc.contructor.injection.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestSimpleSpringIOC {

	private static final Logger logger = LoggerFactory.getLogger(TestSimpleSpringIOC.class);

	
	public static void main(String[] args) {  
        
        Resource r=new ClassPathResource("spring-ioc-constructor-arg.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
       
        Customer customer01 =(Customer)factory.getBean("customer01");  
        logger.info("Customer Bean : "+customer01.toString());  
        
        
        Investment investment =(Investment)factory.getBean("investment01");  
        logger.info("Investment Bean : "+investment.toString());  
          
    }  
}
