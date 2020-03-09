package com.maincalculate.cw;





//기본적인 소스
public class Calculate {
	//덧셈
	public void add(int i, int j) {
		int result=i+j;
		
		System.out.println("덧셈 결과");
		System.out.println(i+"+"+j+"="+result);		
	}
	
	//뺄셈
	public void sub(int i, int j) {
		int result=i-j;

		System.out.println("뺄셈 결과");
		System.out.println(i+"-"+j+"="+result);		
	}

	//곱셈
	public void mul(int i, int j) {
		int result=i*j;
		
		System.out.println("곱셈 결과");
		System.out.println(i+"*"+j+"="+result);		
	}

	//나눗셈
	public void div(int i, int j) {
		int result=i/j;

		System.out.println("나눗셈 결과");
		System.out.println(i+"/"+j+"="+result);		
	}

}
