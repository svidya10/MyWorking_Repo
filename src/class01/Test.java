package com.syntax.class01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add two numbers");
		Test addObj = new Test();
		int answer = addObj.add(2, 10);
		int answer2 = addObj.add(2+2, 5+2);
				
		System.out.println("Add method output = " +answer);
		System.out.println("Add method output = " +answer2);
		
		char y1 = addObj.name('t');
		System.out.println("Add method output = " +y1);
		System.out.println("syso--> cntrl space");
		
		
	}
		public int add(int a , int b)
		{
			int sum = a+b;
			return sum;
		}
		
		public char name (char i)
		{
			char y = 'T';
			System.out.println(y);
			
			return y;
			
			//boolean t = true;
			//System.out.println(t);
		
		}
		
	}


