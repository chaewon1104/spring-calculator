package com.maincalculate.cw;




//개발자 관점에서의 소스: 객체를 setter로 받아 이 객체를 이용해서 작업수행
public class MyCalculate {
	private Calculate calculate;
	private int firstNum;
	private int secondNum;
	
	public Calculate getCalculate() {
		return calculate;
	}
	
	public void setCalculate(Calculate cal)
	{
		calculate=cal;
	}
	
	
	public int getFirstNum(int firstNum) {
		return firstNum;
	}
	
	public void setFirstNum(int firstNum) {
		this.firstNum=firstNum;
	}
	
	public int getSecondNum(int secondNum) {
		return secondNum;
	}
	
	public void setSecondNum(int secondNum) {
		this.secondNum=secondNum;
	}
	
	public void add() {
		calculate.add(firstNum,secondNum);
	}
	
	public void sub() {
		calculate.sub(firstNum,secondNum);
	}
	
	public void mul() {
		calculate.mul(firstNum,secondNum);
	}
	
	public void div() {
		calculate.div(firstNum,secondNum);
	}
	
}
