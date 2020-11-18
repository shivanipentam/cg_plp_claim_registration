package com.cg.dto;

public class Policy {
	private int policyNumber;
	private float PolicyPremium;
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public float getPolicyPremium() {
		return PolicyPremium;
	}
	public void setPolicyPremium(float policyPremium) {
		PolicyPremium = policyPremium;
	}
	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", PolicyPremium=" + PolicyPremium + "]";
	}
	public Policy(int policyNumber, float policyPremium) {
		super();
		this.policyNumber = policyNumber;
		PolicyPremium = policyPremium;
	}
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
