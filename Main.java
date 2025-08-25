class A{
	public A(){
	System.out.println("In class A");
}
public A(int n){
System.out.println("In class A Parameterized");
}
}

class B extends A{

public B(){
super();
System.out.println("In class B");
}
public B(int n){
System.out.println("In class B Parameterized");
}
}

class Main{
public static void main(String ar[]){
B b = new B();
}
}