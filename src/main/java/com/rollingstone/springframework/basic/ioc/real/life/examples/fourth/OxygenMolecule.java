package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

import java.util.ArrayList;
import java.util.List;

public class OxygenMolecule {

	private List<OxygenAtom> atoms = new ArrayList<OxygenAtom>();

	public OxygenMolecule(List<OxygenAtom> atoms) {
		super();
		this.atoms = atoms;
	}

	public OxygenMolecule() {
		super();
	}

	public List<OxygenAtom> getAtoms() {
		return atoms;
	}

	public void setAtoms(List<OxygenAtom> atoms) {
		this.atoms = atoms;
	}
	
	
}
