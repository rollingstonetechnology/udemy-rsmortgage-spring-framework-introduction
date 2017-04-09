package com.rollingstone.springframework.basic.ioc.contructor.injection.collection.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rollingstone.springframework.basic.ioc.real.life.examples.fourth.Dolphins;

public class TestSpringIOCMap {

	private static final Logger logger = LoggerFactory.getLogger(TestSpringIOCMap.class);

	
	public static void main(String[] args) {  
        
        Resource r=new ClassPathResource("applicationContext-constructor-arg-collection-map.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        CarOwner  carOwner =(CarOwner)factory.getBean("ownerCarMapOfStrings");  
        logger.info("Map Of Strings :"+carOwner.toString());  
        
        
        CarOwnerWithMapObjects  ownerCarMapOfObjects =(CarOwnerWithMapObjects)factory.getBean("ownerCarMapOfObjects");  
        logger.info("Map of Custom Java Objects : "+ownerCarMapOfObjects.toString());  
          
    }  
}
