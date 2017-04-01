package com.rollingstone.springframework.basic.ioc.contructor.injection.first;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Investment {

	private String investmentId;
	
	private String investmentName;
	
	private String investmentDescription;
	
	private LocalDate investmentStartDate;
	
	private LocalDate invetsmentMaturityDate;



	public String getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(String investmentId) {
		this.investmentId = investmentId;
	}

	public String getInvestmentName() {
		return investmentName;
	}

	public void setInvestmentName(String investmentName) {
		this.investmentName = investmentName;
	}

	public String getInvestmentDescription() {
		return investmentDescription;
	}

	public void setInvestmentDescription(String investmentDescription) {
		this.investmentDescription = investmentDescription;
	}

	public LocalDate getInvestmentStartDate() {
		return investmentStartDate;
	}

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	public void setInvestmentStartDate(LocalDate investmentStartDate) {
		this.investmentStartDate = investmentStartDate;
	}

	public LocalDate getInvetsmentMaturityDate() {
		return invetsmentMaturityDate;
	}

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	public void setInvetsmentMaturityDate(LocalDate invetsmentMaturityDate) {
		this.invetsmentMaturityDate = invetsmentMaturityDate;
	}

	public Investment(String investmentId, String investmentName, String investmentDescription,
			LocalDate investmentStartDate, LocalDate invetsmentMaturityDate) {
		super();
		this.investmentId = investmentId;
		this.investmentName = investmentName;
		this.investmentDescription = investmentDescription;
		this.investmentStartDate = investmentStartDate;
		this.invetsmentMaturityDate = invetsmentMaturityDate;
	}
	
	public Investment(String investmentId, String investmentName, String investmentDescription) {
		super();
		this.investmentId = investmentId;
		this.investmentName = investmentName;
		this.investmentDescription = investmentDescription;
	
	}

	public Investment() {
		super();
	}

	@Override
	public String toString() {
		return "Investment [investmentId=" + investmentId + ", investmentName=" + investmentName
				+ ", investmentDescription=" + investmentDescription + ", investmentStartDate=" + investmentStartDate
				+ ", invetsmentMaturityDate=" + invetsmentMaturityDate + "]";
	}
	
	
	
}
