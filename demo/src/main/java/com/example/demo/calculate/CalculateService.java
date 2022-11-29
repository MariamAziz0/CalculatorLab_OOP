package com.example.demo.calculate;

import org.springframework.stereotype.*;

@Service
public class CalculateService {
	private Calculated calc = Calculated.getInstance();
		
	public Calculated twoOperandOperator(Calculated calc) {
		this.calc = calc;
		if(this.calc.getOperator().equals("+")) {
			this.add();
		}
		else if(this.calc.getOperator().equals("-")) {
			this.subtract();
		}
		else if(this.calc.getOperator().equals("*")) {
			this.multiple();
		}
		else if(this.calc.getOperator().equals("/")) {
			this.divide();
		}
		else if(this.calc.getOperator().equals("%")) {
			this.module();
		}
		return calc;
	}
	
	public Calculated oneOperandOperator(Calculated calc) {
		this.calc = calc;
		if(this.calc.getOperator().equals("sqrt")) {
			this.squareRoot();
		}
		else if(this.calc.getOperator().equals("1/")) {
			this.reverse();
		}
		else if(this.calc.getOperator().equals("^2")) {
			this.square();
		}
		return calc;
	}
	
	public void add() {
		try {
			double first = Double.parseDouble(this.calc.getFirstNumber());
			double second = Double.parseDouble(this.calc.getSecondNumber());
			this.calc.setResult((first+second)+"");
		}
		catch(Exception e) {
			this.calc.setResult("Error");
		}
	}
	
	public void subtract() {
		try {
			double first = Double.parseDouble(this.calc.getFirstNumber());
			double second = Double.parseDouble(this.calc.getSecondNumber());
			this.calc.setResult((first-second)+"");
		}
		catch(Exception e) {
			this.calc.setResult("Error");
		}
	}
	
	public void multiple() {
		try {
			double first = Double.parseDouble(this.calc.getFirstNumber());
			double second = Double.parseDouble(this.calc.getSecondNumber());
			this.calc.setResult((first*second)+"");
		}
		catch(Exception e) {
			this.calc.setResult("Error");
		}
	}
	
	public void divide() {
		try {
			double first = Double.parseDouble(this.calc.getFirstNumber());
			double second = Double.parseDouble(this.calc.getSecondNumber());
			if(Math.abs(second)<Math.pow(10, -18)) {
				this.calc.setResult("Error");
				return;
			}
			this.calc.setResult((first/second)+"");
		}
		catch(Exception e) {
			this.calc.setResult("Error");
		}
	}
	
	public void module() {
		try {
			int first = (int)Double.parseDouble(this.calc.getFirstNumber());
			int second = (int)Double.parseDouble(this.calc.getSecondNumber());
			this.calc.setResult((first%second)+"");
		}
		catch(Exception e) {
			this.calc.setResult("Error");
		}
	}
	
	public void squareRoot() {
		try {
			double first = (int)Double.parseDouble(this.calc.getFirstNumber());
			if(first < 0) {
				this.calc.setResult("Error");
				return;
			}
			this.calc.setResult((Math.sqrt(first))+"");
		}
		catch(Exception e) {
			this.calc.setResult("Error");
		}
	}
	
	public void square() {
		try {
			double first = (int)Double.parseDouble(this.calc.getFirstNumber());
			this.calc.setResult((Math.pow(first,2))+"");
		}
		catch(Exception e) {
			this.calc.setResult("Error");
		}
	}
	
	public void reverse() {
		try {
			double first = (int)Double.parseDouble(this.calc.getFirstNumber());
			if(Math.abs(first)<Math.pow(10, -18)) {
				this.calc.setResult("Error");
				return;
			}
			this.calc.setResult((1/first)+"");
		}
		catch(Exception e) {
			this.calc.setResult("Error");
		}
	}
}
