package com.ua;

public class TestTax {

	public static void main(String[] args) {
		Tax t1 = new Tax();	//создал инстанс (екземпл€р) етого класса
		t1.grossIncome = 40000;
		t1.state = "NJ";
		t1.numberOfDependents = 2;
		
		double yourTax = t1.calcTax();
		System.out.println("Your tax is " + yourTax);
		System.out.println("++++++++++++++++");
		
		NJTax t3 = new NJTax();	//создал инстанс (екземпл€р) етого класса
		NJTax t2 = new NJTax();	//создал инстанс (екземпл€р) етого класса
		t2.grossIncome = 55000;
		t2.state = "NJ";
		t2.numberOfDependents = 4;
		double yourTaxNJ = t2.calcTax(); // здесь посчитан налог
		/**
		 * 	расчитиваю размер налога дл€ штата Ќью ƒжерси
		 * визива€ метод "adjustForStudents" 
		 */
		double totalTaxNJ = t2.adjustForStudents(yourTaxNJ);
		
//		System.out.println("Your tax is " + t2.adjustForStudents(yourTaxNJ));
		System.out.println(totalTaxNJ);

	}

}
