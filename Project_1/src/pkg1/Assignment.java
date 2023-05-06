package pkg1;

public class Assignment 
{
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int p, int q)
	{
		int r = p-q;
		System.out.println("substract result is "+r);
		return r;
	}
	public void multi(int s1, int s2)
	{
		int s3 = s1*s2;
		System.out.println("multiplication result is "+s3);
	}
	public static void main(String[] args) {
		Assignment obj = new Assignment();
		int sumresult = obj.sum(10, 2);
		int subresult = obj.sub(10, 2);
		obj.multi(sumresult, subresult);
		
	}
}
