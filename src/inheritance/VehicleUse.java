package inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1=new Vehicle();
		v1.print();
//		v1.color="red";
		v1.setcolor("red");
		v1.print();
		
		
		Car c1=new Car();
//		c1.color="pink";
		c1.setcolor("pink");
		c1.maxspeed=220;
		c1.numdoors=4;
//		c1.print();
		c1.printcar();
		
		Truck t1=new Truck();
//		t1.color="yellow";
		t1.print();

	}

}
