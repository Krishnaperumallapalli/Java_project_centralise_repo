package pkg1;

public class Student_1 {
	
	int roolNo;
	int age;
	public void display1() {
		System.out.println("welcome to all of you");
	}
	public void display2() {
		System.out.println("automation is vary easy");
	}
	public static void main(String[] args) {
		Student_1 obj = new Student_1();
		obj.roolNo = 12345;
		System.out.println(obj.roolNo);
		obj.age = 35;
		System.out.println(obj.age);
		obj.display1();
		obj.display2();				
	}

}
