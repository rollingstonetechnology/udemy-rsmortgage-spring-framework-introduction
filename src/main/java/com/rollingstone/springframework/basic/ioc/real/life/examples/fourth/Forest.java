package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

import java.util.ArrayList;
import java.util.List;

public class Forest {
	
	private List<Tree> trees  = new ArrayList<Tree>();
	
	private Nature livingEnvironment;

	public List<Tree> getTrees() {
		return trees;
	}

	public void setTrees(List<Tree> trees) {
		this.trees = trees;
	}

	public Forest(List<Tree> trees) {
		super();
		this.trees = trees;
	}

	public Forest() {
		super();
	}
	
	public void releaseOxygen(){
		for (Tree tree : trees){
			tree.receiveSunLight();
		}
	}

	public Nature getLivingEnvironment() {
		return livingEnvironment;
	}

	public void setLivingEnvironment(Nature livingEnvironment) {
		this.livingEnvironment = livingEnvironment;
		for (Tree tree : trees){
			tree.setLivingEnvironment(livingEnvironment);
		}
	}
	
	

}
