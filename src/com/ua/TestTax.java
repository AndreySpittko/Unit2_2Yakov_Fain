package com.ua;

public class TestTax {

	public static void main(String[] args) {
		Tax t1 = new Tax();	//������ ������� (���������) ����� ������
		t1.grossIncome = 40000;
		t1.state = "NJ";
		t1.numberOfDependents = 2;
		
		double yourTax = t1.calcTax();
		System.out.println("Your tax is " + yourTax);
		System.out.println("++++++++++++++++");
		
		NJTax t2 = new NJTax();	//������ ������� (���������) ����� ������
		t2.grossIncome = 55000;
		t2.state = "NJ";
		t2.numberOfDependents = 4;
		double yourTaxNJ = t2.calcTax(); // ����� �������� �����
		/**
		 * 	���������� ������ ������ ��� ����� ��� ������
		 * ������� ����� "adjustForStudents" 
		 */
		double totalTaxNJ = t2.adjustForStudents(yourTaxNJ);
		
//		System.out.println("Your tax is " + t2.adjustForStudents(yourTaxNJ));
		System.out.println(totalTaxNJ);

		NJTax t3 = new NJTax();	//������ ������� (���������) ����� ������
		t3.grossIncome = 85000;
		t3.state = "NJ";
		t3.numberOfDependents = 4;
		double yourTaxNJone = t3.calcTax(); // ����� �������� �����
		double totalTaxNJone = t3.adjustForStudents(yourTaxNJone);
		System.out.println(totalTaxNJone);
	}

}
