package overLoading;

public class A {
	
	public static void main(String[] args) {
		A obj=new A();
		String s="hello";
		obj.m1();
		obj.m1(2);
		
		//method over loading
		// in a single class method names are same and method signature are different
		//when ever we create object for that class based on the passing the parameters
		//particular method will be invoked
		
		
	}
	
	public void m1() {
		System.out.println(" from m1 method");
	}
	public void m1(int a) {
		System.out.println(" from m1 method  >>"+a);
	}
	public void m1(String b,int k) {
		System.out.println(" from m1 method >>"+b);
	}
	public void m1(int a,String b) {
		System.out.println(" from m1 method >>"+b);
	}

}
