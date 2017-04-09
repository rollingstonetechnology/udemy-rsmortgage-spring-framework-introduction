package com.rollingstone.springframework.basic.ioc.real.life.examples.fourth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dolphins extends Animal{

	private static final Logger logger = LoggerFactory.getLogger(Dolphins.class);

	private Nature livingEnvironment;
	
	public Nature getLivingEnvironment() {
		return livingEnvironment;
	}

	public void setLivingEnvironment(Nature livingEnvironment) {
		this.livingEnvironment = livingEnvironment;
	}

	public static Logger getLogger() {
		return logger;
	}

	
	@Override
	public void eat() {
		logger.info("Find fish!");
	}

	@Override
	public void communicate() {
		logger.info("Make Dolphin sounds!!");
	}

	@Override
	public void breatheIn(OxygenMolecule oxygenMolecule) throws InterruptedException {
		logger.info("Dolpins Draw Oxygen molecules from Water");
		logger.info("Use Oxygen molecules in cells to generate energy");

	}

	@Override
	public void breatheOut() {
		logger.info("Dolphin Release CO2 into water!");
		
	}

	@Override
	public void breathe() throws InterruptedException {
		logger.info("Draw Oxygen molecules from Water");
		breatheIn(getLivingEnvironment().getAtmosphere().getOxygenReservoir().take());
		breatheOut();
		
	}

}
