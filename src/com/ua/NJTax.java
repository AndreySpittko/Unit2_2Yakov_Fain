package com.ua;

public class NJTax extends Tax {
	
	double adjustForStudents(double stateTax) {
		double adjustedTax = stateTax - 500;
		return adjustedTax;
	}
	
	@Override	//переопредилили радительский метод
	public double calcTax() {
		
		if(grossIncome < 50000) {
			return grossIncome * 16 / 100;
		} else {
			return grossIncome * 18 / 100;
		}
		
//		return super.calcTax();
	}

}
