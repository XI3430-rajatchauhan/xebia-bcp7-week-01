abstract class Car {
	String name;
	int cost;
}
class Amaze extends Car {
	void work() {
		System.out.println("Amaze is part of Honda cars");
	}
}
class Suzuki extends Car {
	void work() {
		System.out.println("Suzuki is part of Maruti cars");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Amaze a=new Amaze();
		a.work();
		Suzuki s=new Suzuki();
		s.work();

	}

}
