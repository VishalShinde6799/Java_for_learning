class Student
{
private int roll;
private float percentage;
private String name;

Student() //explicit or no argument constructor
{
	roll = -1;
	percentage = 45.0f;
	name= "Pradnya";
}

Student(int r, float f, String n) //explicit parameterized constructor
{
	roll = r;
	percentage = f;
	name= n;
}

public void setRoll(int roll)
	{
		this.roll=roll;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setPercentage(float percentage)
	{
		this.percentage=percentage;
	}
	/*****************************************/
	public float getPercentage()
	{return percentage;}
	
	public int getRoll()
	{return roll;}
	
	public String getName()
	{return name;}
    /*****************************************/

public void initStudent()
{
	roll=52;
	name="Vishal";
	percentage=35.0f;
}
	
	public void printDetails()
	{
		System.out.println("Roll no: " +roll +"\n" +"Name: " +name +"\n"+"Percentage: " +percentage +"\n");
	
	}
	
	
}

class Studdemo
{
	public static void main(String Prads[])
	{
	  Student t= new Student();
	  
	  t.printDetails();
	  t.initStudent();
	  t.printDetails();
	  
	  Student t1= new Student(10, 99.0f, "VISHII");

	  t1.printDetails();
	  t1.initStudent();
	  t1.printDetails();
	  System.out.println("After using setter and getter methods::\n");
		t1.setRoll(55);
		t1.printDetails();
		System.out.println(t1.getName());
	}
}
