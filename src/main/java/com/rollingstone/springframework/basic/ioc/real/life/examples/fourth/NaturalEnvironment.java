package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NaturalEnvironment {

	Nature nature;
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DI-application-context-real-life.xml");
		
		Nature nature = (Nature) context.getBean("nature");
		
		nature.generateOxygen();
		nature.generateOxygen();
		nature.generateOxygen();
		
		for (Animal animal: nature.getAnimals()){
			try {
				animal.breathe();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
