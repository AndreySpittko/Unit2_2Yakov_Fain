package com.ua;

public class Tax {
	double grossIncome;	//����� ���������� �����
	String state;	//����� �����(����� ����������)
	int numberOfDependents;	//���. ��������� ����� ���� ����
	
	public double calcTax() {	//�������� ������ ������ 
		if(grossIncome < 50000) {
			return grossIncome * 6 / 100;
		} else {
			return grossIncome * 8 / 100;
		}
		
//		return 243.55; 
	}

}
