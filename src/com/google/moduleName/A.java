package com.google.moduleName;

public class A {

	public int value=100;
	
	public void add() {
		System.out.println("from add method");
	}
	public void sub() {
		System.out.println("from add method");
	}
	public static void main(String[] args) {
		A a=new A();
		a.add();
		a.sub();
		System.out.println(a.value);
	}

}
