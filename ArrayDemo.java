class ArrayDemo
{
public static void main(String args[])
{
//declare array reference::
int  []arr;
int []arr1[];

int a1[]= {1,2,3,4,5,6,7,8,9};

//create new array object::
arr= new int[5];
arr1= new int[2][];

arr1[0]=new int[4];
arr1[1]=new int[7];

arr[4]=10;
arr[2]=30;
arr[0]=21;
arr[1]=23;
arr[3]=24;

System.out.println("elements with even value::");
for(int i=0; i<arr.length; i++)
{
	if(arr[i]%2==0)
	System.out.println(arr[i]);
}

System.out.println("elements with even index::");
for(int i=0; i<arr.length; i+=2)
{

	System.out.println(arr[i]);
}

System.out.println("elements in reverse order::");
for(int i=arr.length-1; i>=0; i--)
{
	System.out.println(arr[i]);
}

System.out.println("using for-each mechanism::");  //automated bound check
for(int i:arr)
{
	System.out.println(i);
}

System.out.println("2d array printing");
for(int i=0; i<arr1.length; i++)
{
	System.out.println("");
	for(int j=0; j<arr1[i].length;j++)
	{
		System.out.print(arr1[i][j]);
	}
}

System.out.println("\n2d array printing using for each constructs:: ");
for(int i[]:arr1)
{
	System.out.println("");
	for(int j:i)
	{
		System.out.print(j);
	}
}

String[] cities={"aaa","sss","ddd","fff"};

for(String city:cities)
{
	System.out.println(city);
}
}
}