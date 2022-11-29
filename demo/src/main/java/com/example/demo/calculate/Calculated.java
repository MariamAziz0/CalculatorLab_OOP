package com.example.demo.calculate;

public class Calculated {
	private static Calculated calc;
	
	private String firstNumber;
	private String operator;
	private String secondNumber;
	private String result;
	
	private Calculated() {}

	public static Calculated getInstance() {
		if(calc == null) {
			calc = new Calculated();
		}
		return calc;
	}
	public String getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(String firstNumber) {
		this.firstNumber = firstNumber;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(String secondNumber) {
		this.secondNumber = secondNumber;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
