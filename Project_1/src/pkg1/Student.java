package pkg1;

public class Student {
	
	int a;	
	public void name() {
		System.out.println("welcome to all of you");
	}	
	public static void main(String[] args) {
		Student abc = new Student();
		abc.a = 130;
		abc.name();
		System.out.println(abc.a);
		abc.a = 350;
		System.out.println(abc.a);
	}

}
