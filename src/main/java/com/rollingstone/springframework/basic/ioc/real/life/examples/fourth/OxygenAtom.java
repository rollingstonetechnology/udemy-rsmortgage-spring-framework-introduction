package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

public class OxygenAtom {

	private int numElectronos;
	
	private int numProtons;
	
	private int numNetrons;
	
	public OxygenAtom(){
		
	}

	public OxygenAtom(int numElectronos, int numProtons, int numNetrons) {
		super();
		this.numElectronos = numElectronos;
		this.numProtons = numProtons;
		this.numNetrons = numNetrons;
	}

	public int getNumElectronos() {
		return numElectronos;
	}

	public void setNumElectronos(int numElectronos) {
		this.numElectronos = numElectronos;
	}

	public int getNumProtons() {
		return numProtons;
	}

	public void setNumProtons(int numProtons) {
		this.numProtons = numProtons;
	}

	public int getNumNetrons() {
		return numNetrons;
	}

	public void setNumNetrons(int numNetrons) {
		this.numNetrons = numNetrons;
	}
	
	
}
