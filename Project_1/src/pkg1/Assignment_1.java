package pkg1;

public class Assignment_1 {
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sum1(int a1, int b1)
	{
		int c1 = a1+b1;
		System.out.println("sum result is "+c1);
		return c1;
	}
	public int sub(int p, int q)
	{
		int r = p-q;
		System.out.println("subtraction result is "+r);
		return r;
	}
	public int multi(int s1, int s2)
	{
		int s3 = s1*s2;
		System.out.println("multiplication result is "+s3);
		System.out.println("i am done");
		return s3;
	}
	public int div(int x, int y)
	{
		int z = x/y;
		System.out.println("divion result is "+z);
		return z;
	}
	public static void main(String[] args) {
		Assignment_1 obj = new Assignment_1();
		int sumresult = obj.sum(10, 2);
		int sumresult1 = obj.sum1(sumresult, 2);
		int subresult = obj.sub(sumresult1, 2);
		int multiresult = obj.multi(subresult, 2);
		obj.div(multiresult, 2);
	}
}
