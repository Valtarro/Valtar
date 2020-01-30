package part2;

public class inheritance {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		machine1.start();
		machine1.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.lightsOn();
		car1.stop();
		
		car1.showInfo();

	}

}
