package day5;

public class demo1 {
	
	public void methodOne() {
		System.out.println("demo1 and m1 method");
	}
	public void methodTwo() {
		System.out.println("demo1 and m2 method");
		
	}
	public void methodThree() {
		System.out.println("demo1 and m3 method");
	}
	/*
	 * className obj(obj can be any variable like kiran or varun)=new class();
	 */
	public static void main(String[] args) {
		System.out.println("hell");
		demo1 obj=new demo1();
		int a=100;
//		demo1 obj2=new demo1();
//		demo1 obj2=new demo1();
		obj.methodOne();
		obj.methodTwo();
		demo1 obj2=new demo1();
	}
}
