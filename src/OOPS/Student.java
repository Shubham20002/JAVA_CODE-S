package OOPS;

public class Student {
        String name;
        int rollno;
        static int numstudent;
        
        public Student(String n,int roll) {
        	this.name=n;
        	this.rollno=roll;
        	numstudent++;
        	
        }
        public Student(){
        	
        }
}
