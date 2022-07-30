package assisted;

class Vehicle{
	int speed=100;
	int distance=150;
 void stop() {
	 System.out.println("Method stop() of Vehicle");
 }
 void run() {
	 System.out.println("Method run() of Vehicle");
 }
 void fuel(int cap) {
	System.out.println("The fuel capacity is "+cap);
 }
 void fuel(float capa,String type)
 {
	 System.out.println("The fuel capacity is "+capa+" for "+type);
 }
 void fuel(char c,int j) {
	System.out.println("The vehicle type is "+c+" of year "+j);
}
 Vehicle(){
	System.out.println("Constructor of vehicle");
 }
 Vehicle(String name,int price){
System.out.println("The vehicle is "+name+" and it costs $"+price);
}
}
class twowheeler extends Vehicle{
	int speed=140;
	int distance=301;
	int no_of_tyre=2;
	void run() {
System.out.println("Method run() of twowheeler");
}
	void stop() {
		System.out.println("Method stop() of twowheeler");
	}
	twowheeler(){
		System.out.println("Constructor of twowheeler");
	}
	void display(){
System.out.println("The speed and distance of class twowheeler are "+speed+" and "+distance+" and no.of tyre is "+no_of_tyre);
System.out.println("The speed and distance of class Vehicle are "+super.speed+" and "+super.distance);
	}

}
public class oopspillars {
public static void main(String[] args) {
	Vehicle v1 =new Vehicle();
	twowheeler v =new twowheeler();
    v.display();
    v1.run();
    v1.stop();
    v.run();
    v.stop();
	}
}
