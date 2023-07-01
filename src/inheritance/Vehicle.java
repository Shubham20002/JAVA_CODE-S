package inheritance;

public class Vehicle {
       int maxspeed;
      private String color;
       
       public void print() {
    	   System.out.println("vehicle maxspeed is"+maxspeed+" color is "+color);
       }
       
       public String getcolor() {
    	   return color;
       }
       
       public void setcolor(String c) {
    	   this.color=c;
       }
}
