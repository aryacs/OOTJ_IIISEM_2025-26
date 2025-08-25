public abstract class Base{
	public abstract void show();
	public void drive(){
	System.out.println("In Abstract class");

	}
}
class Child extends Base{

	public void show(){
	System.out.println("In Abstract Method defined");
}

}
class Demo2{
public static void main(String arg[]){
Base b = new Base();//error
Base b1 = new Child();
b1.show();
b1.drive();
}
}