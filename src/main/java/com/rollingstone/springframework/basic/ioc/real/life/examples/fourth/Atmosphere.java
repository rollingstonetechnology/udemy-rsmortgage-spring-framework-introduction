package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Atmosphere {

	BlockingQueue<OxygenMolecule> oxygenReservoir = new ArrayBlockingQueue<OxygenMolecule>(100);

	
	public BlockingQueue<OxygenMolecule> getOxygenReservoir() {
		return oxygenReservoir;
	}

	public void setOxygenReservoir(BlockingQueue<OxygenMolecule> oxygenReservoir) {
		this.oxygenReservoir = oxygenReservoir;
	}

	public OxygenMolecule provideOxygen() throws InterruptedException{
		return oxygenReservoir.take();
	}

	public void storeOxygen(OxygenMolecule o) throws InterruptedException{
		oxygenReservoir.offer(o);
	}

	
}