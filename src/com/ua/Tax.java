package com.ua;

public class Tax {
	double grossIncome;	//общее количество денег
	String state;	//назва штату(места жительства)
	int numberOfDependents;	//кол. зависящих людей жена дети
	
	public double calcTax() {	//пощиталь размет налога 
		if(grossIncome < 50000) {
			return grossIncome * 6 / 100;
		} else {
			return grossIncome * 8 / 100;
		}
		
//		return 243.55; 
	}

}
