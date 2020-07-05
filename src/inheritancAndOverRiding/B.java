package inheritancAndOverRiding;

public class B extends A{
	
	public static void main(String[] args) {
		B obj2=new B();
		obj2.sub();
		obj2.mul();
		obj2.add();
		obj2.div();
	}
	
	public void mul() {
		System.out.println("from class b mul method");
	}
	public void sub() {
		System.out.println("from class b mul method");
	}
	

}
