package Inheritance;

public class B extends A{
	
	
	
	public void methodFour() {
		System.out.println("method 4");
	}
	
	
	public void methodFive() {
		System.out.println("class B method 5");
	}
	public void methodOne() {
		System.out.println("B class and m1 method");
	}
	
	public static void main(String[] args) {
//		B b=new B(); // child class object targets to child class reference variable
//		b.methodFive();
//		b.methodOne();
//		
//		System.out.println("****");
//		
//		A a=new A();// parent class object targets to parent class reference variable
//		a.methodTwo();
//		a.methodOne();
//		
		System.out.println("********");
		A c=new B();//child class object targets parent class reference variable same method names in both the classes compile it will
		//shows parent class method but run time it will executes child class method
		c.methodOne();
		
	}

}
