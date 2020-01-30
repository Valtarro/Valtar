package part2;

public class Car extends Machine {
	
	
	@Override
	public void start() {
		System.out.println("Car startdsfdsfdsfsed");
	}

	public void lightsOn () {
		System.out.println("Lights on");
	}
	
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void showInfo() {
		System.out.println(name);
	}

}
