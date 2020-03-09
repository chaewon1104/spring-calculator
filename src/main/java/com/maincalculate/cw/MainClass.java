package com.maincalculate.cw;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//사용자: xml에서 지정한 객체의 필드 및 메소드를 그대로 뿌려줌
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		다음과 같은 구조를 똑같이 구현
		
		MyCalculate mycalculator=new MyCalculate();
		mycalculator.setCalculate(new Calculate());
		
		mycalculator.setFirstNum(10);
		mycalculator.setSecondNum(2);
		
		mycalculator.add();
		mycalculator.sub();
		mycalculator.mul();
		mycalculator.div();
		*/

		String configlocation="classpath:calculate_configuration.xml";
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(configlocation);
		MyCalculate myCalculate=ctx.getBean("myCalculate",MyCalculate.class);
		
		myCalculate.add();
		myCalculate.sub();
		myCalculate.mul();
		myCalculate.div();
		
		
	}

}
