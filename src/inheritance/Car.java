package inheritance;

public class Car extends Vehicle {
  int numdoors;
  
  public void printcar() {
	  System.out.println("vehicle maxspeed is"+maxspeed+" color is "+getcolor()+" numdoors is"+numdoors);
  }
}
