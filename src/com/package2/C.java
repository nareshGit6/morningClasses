package com.package2;

import com.package1.A;

public class C  extends A{
	public void div() {
		System.out.println("coming from package 2 class c");
	}

	public static void main(String[] args) {
		A a=new A();
		a.add();

	}

}
