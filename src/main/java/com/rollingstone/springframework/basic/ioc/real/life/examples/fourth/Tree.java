package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tree {

	private static final Logger logger = LoggerFactory.getLogger(Tree.class);

	private String name;
	
	private String height;
	
	private String age;
	
	private String habitat;
	
	private String type;
	
	private Nature livingEnvironment;
	
	public void receiveSunLight(){
		logger.info("Thank God!");

		prepareFood();
	}
	
	
	public void prepareFood(){
		logger.info("drawSunLight");
		logger.info("drawWater");
		logger.info("conductPhotoSynthesis");
		logger.info("releaseOxygen");
		drawSunLight();
		drawWater();
		conductPhotoSynthesis();
		releaseOxygen();
	}
	
	public void drawSunLight(){
		logger.info("Draw Sunlight");

	}
	
	public void drawWater(){
		logger.info("Draw Water");

	}
	
	public void conductPhotoSynthesis(){
		logger.info("conductPhotoSynthesis using Chlrophill");

	}
	
	public void releaseOxygen(){
		logger.info("releaseOxygen into environment");
		
		List<OxygenAtom> atoms = new ArrayList<OxygenAtom>();
		OxygenAtom firstOxygenAtom = new OxygenAtom(8,8,8);
		OxygenAtom secondOxygenAtom = new OxygenAtom(8,8,8);
		
		atoms.add(firstOxygenAtom);
		atoms.add(secondOxygenAtom);
		
		OxygenMolecule oxygenMolecule = new OxygenMolecule(atoms);
		
		livingEnvironment.getAtmosphere().getOxygenReservoir().offer(oxygenMolecule);
		

	}
	
	public void breathe() throws InterruptedException{
		logger.info("Draw Oxygen");
		OxygenMolecule oxygenMolecule = getLivingEnvironment().getAtmosphere().getOxygenReservoir().take();
		logger.info("Supply Oxygen to cells");
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Nature getLivingEnvironment() {
		return livingEnvironment;
	}


	public void setLivingEnvironment(Nature livingEnvironment) {
		this.livingEnvironment = livingEnvironment;
	}


	public static Logger getLogger() {
		return logger;
	}
	
	
	
}
