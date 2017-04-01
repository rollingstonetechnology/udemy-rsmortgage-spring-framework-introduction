package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

	private String name;
	
	private String species;
	
	private String naturalHabitat;
	
	private boolean endengered;
	
	private int age;
	
	private String color;
	
	private Nature livingEnvironment;
	
	private List<OxygenMolecule> oxygen = new ArrayList<OxygenMolecule>();
	
	public Animal(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getSpecies() {
		return species;
	}



	public void setSpecies(String species) {
		this.species = species;
	}



	public String getNaturalHabitat() {
		return naturalHabitat;
	}



	public void setNaturalHabitat(String naturalHabitat) {
		this.naturalHabitat = naturalHabitat;
	}



	public boolean isEndengered() {
		return endengered;
	}



	public void setEndengered(boolean endengered) {
		this.endengered = endengered;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getColor() {
		return color;
	}
	
	public Nature getLivingEnvironment() {
		return livingEnvironment;
	}

	public void setLivingEnvironment(Nature livingEnvironment) {
		this.livingEnvironment = livingEnvironment;
	}
	



	public void setColor(String color) {
		this.color = color;
	}



	public List<OxygenMolecule> getOxygen() {
		return oxygen;
	}



	public void setOxygen(List<OxygenMolecule> oxygen) {
		this.oxygen = oxygen;
	}
	
	public abstract void breatheIn(OxygenMolecule oxygenMolecule) throws InterruptedException;
	
	public abstract void breatheOut();
	
	public abstract void breathe() throws InterruptedException;
	
	public abstract void eat();	
	
	public abstract void communicate();	
}
