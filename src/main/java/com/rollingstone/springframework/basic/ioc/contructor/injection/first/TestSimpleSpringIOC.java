package com.rollingstone.springframework.basic.ioc.contructor.injection.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rollingstone.springframework.basic.ioc.real.life.examples.fourth.Dolphins;

public class TestSimpleSpringIOC {

	private static final Logger logger = LoggerFactory.getLogger(TestSimpleSpringIOC.class);

	
	public static void main(String[] args) {  
        
        Resource r=new ClassPathResource("spring-ioc-constructor-arg.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Investment investment =(Investment)factory.getBean("investment01");  
        logger.info(investment.toString());  
          
    }  
}
