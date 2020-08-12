/*in method overloading, return types don't matter*/

class MathEngine
{
public int add(int a, int b)
{
return a+b;
}

public float add(float a, int b)
{
return a+b;
}

public float add(int a, float b)
{
return a+b;
}
public void add(float a, float b)
{
 System.out.println("the addition is: "+ (a+b));
}
}

class EngineDemo
{
	public static void main(String args[])
	{
		MathEngine m= new MathEngine();
		int a= m.add(10, 20);
		float b= m.add(35.0f, 15);
		float c= m.add(22, 42.0f);
		System.out.println("The result of add number 1 is: "+a);
		System.out.println("The result of add number 2 is: "+b);
		System.out.println("The result of add number 3 is: "+c);
		m.add(22.0f, 22.0f);
	}
}

