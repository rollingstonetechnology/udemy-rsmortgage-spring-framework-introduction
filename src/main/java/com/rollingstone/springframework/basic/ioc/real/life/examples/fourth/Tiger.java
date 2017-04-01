package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tiger extends Animal {

	private static final Logger logger = LoggerFactory.getLogger(Tiger.class);
	
	


	public void breathe() throws InterruptedException {
		logger.info("Draw Oxygen molecules from Air");
		breatheIn(getLivingEnvironment().getAtmosphere().getOxygenReservoir().take());
		breatheOut();
	}

	@Override
	public void eat() {
		logger.info("Find a deer!");
	}

	@Override
	public void communicate() {
		logger.info("Roar!!!!");
	}

	
	@Override
	public void breatheIn(OxygenMolecule oxygenMolecule) {
		logger.info("Use Oxygen molecules in cells to generate energy");
	}

	@Override
	public void breatheOut() {
		logger.info("Tiger Release CO2!");
		
	}

}
