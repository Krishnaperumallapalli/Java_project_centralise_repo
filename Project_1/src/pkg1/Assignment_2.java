package pkg1;

public class Assignment_2 {
	public int multi(int a, int b) 
	{
		int c =a*b;
		System.out.println("multiplication result is "+c);
		return c;
	}
	public int sum(int a1, int b1) 
	{
		int c1 =a1+b1;
		System.out.println("sum result is "+c1);
		return c1;
	}
	public int sub(int a2, int b2) 
	{
		int c2 =a2-b2;
		System.out.println("sub result is "+c2);
		return c2;
	}
	public int sub1(int a3, int b3) 
	{
		int c3 =a3-b3;
		System.out.println("sub is "+c3);
		return c3;
	}
	public int div(int a4, int b4) 
	{
		int c4 =a4/b4;
		System.out.println("division is "+c4);
		return c4;
	}
	public static void main(String[] args) {
		Assignment_2 obj = new Assignment_2();
		int multiresult = obj.multi(10, 2);
		int sumresult = obj.sum(multiresult, 2);
		int subresult = obj.sub(sumresult, 2);
		int subresult1 = obj.sub1(subresult, 2);
		obj.div(subresult1, 2);	
		
	}
	
}
