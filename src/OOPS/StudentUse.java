package OOPS;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("shubham",20);
		Student s2=new Student();
		//bydefault value of string is null and int is zero
//		System.out.println(s1.name+" "+s1.rollno);
		//seting value to objects
//		s1.name="shubham";
//		s1.rollno=50;
//		s2.name="abhi";
//		s2.rollno=70;
		System.out.println(s1.numstudent);
		System.out.println(s2.numstudent);
		System.out.println(s1.name+" "+s1.rollno);
		System.out.println(s2.name+" "+s2.rollno);
		
		

	}

}
