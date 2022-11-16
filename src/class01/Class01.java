package com.syntax.class01;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Batch 14");
		
		Class01 obj = new Class01();

		int result = obj.add();
		
		System.out.println("Printing result" + result);
		
		obj.dummy(result);
		
	}

	public int add()
	{
		int sum = 10 + 20;
		
		System.out.println("Printing Sum : " + sum);
		
		return sum;
	}
	
	public void dummy(int input)
	{
		int abc = 100 + input;
		System.out.println("Printing abc : " + abc);
	}
}
