package constructor_java;

class Person {
	String name;
	int age;
	long mobno;
	String email;
	Person(String name,int age,long mobno,String email)
	{
		this.name=name;
		this.age=age;
		this.mobno=mobno;
		this.email=email;
		this.hashCode();
	}
}

public class Constructor_practice extends Person {
	int rollno;
	int marks;
	Constructor_practice(String name,int age,long mobno,String email,int rollno,int marks){
		super(name, age, mobno, email);
		this.rollno=rollno;
		this.marks=marks;
		this.hashCode();
	}

	
public static void main(String[] args) {
	Constructor_practice c=new Constructor_practice("Rupesh",25,55225, "srupesh181@gmail.com",23, 50);
	System.out.println();
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args){
//		for(int i=0;i<5;i++) {
//			for(int j=5;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=0;k<i;k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//}
}
