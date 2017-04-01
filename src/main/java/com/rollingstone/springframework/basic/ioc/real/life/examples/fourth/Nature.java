package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

import java.util.ArrayList;
import java.util.List;

public class Nature {

	List<String> lands  = new ArrayList<String> ();
	
	List<String> waterBodies  = new ArrayList<String> ();
	
	List<Forest> forests  = new ArrayList<Forest> ();
	
	List<Tree> trees  = new ArrayList<Tree> ();
	
	List<Animal> animals  = new ArrayList<Animal> ();

	Atmosphere atmosphere;

	public List<String> getLands() {
		return lands;
	}

	public void setLands(List<String> lands) {
		this.lands = lands;
	}

	public List<String> getWaterBodies() {
		return waterBodies;
	}

	public void setWaterBodies(List<String> waterBodies) {
		this.waterBodies = waterBodies;
	}

	
	
	public Atmosphere getAtmosphere() {
		return atmosphere;
	}

	public void setAtmosphere(Atmosphere atmosphere) {
		this.atmosphere = atmosphere;
	}

	public List<Forest> getForests() {
		return forests;
	}

	public void setForests(List<Forest> forests) {
		this.forests = forests;
		for (Forest forest : forests){
			forest.setLivingEnvironment(this);
		}
	}

	public List<Tree> getTrees() {
		return trees;
	}

	public void setTrees(List<Tree> trees) {
		this.trees = trees;
		for (Tree tree : trees){
			tree.setLivingEnvironment(this);
		}
	}
	
	

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
		
		for (Animal animal : animals){
			animal.setLivingEnvironment(this);
		}
	}

	public void generateOxygen(){
		
		for (Tree tree : trees){
			tree.receiveSunLight();
		}
		
		for (Forest forest : forests){
			forest.releaseOxygen();
		}
	}
}
