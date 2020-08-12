package pack;
import mypack.MyClass;
import mypack.subpack.YourClass;
class PackDemo
{
	public static void main(String args[])
	{
		//mypack.MyClass ob= new mypack.MyClass();
		MyClass ob= new MyClass();
		ob.show();
		//mypack.subpack.YourClass obj= new mypack.subpack.YourClass();
		YourClass obj= new YourClass();
		obj.display();
	}
	
}