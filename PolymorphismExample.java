class Bird {
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}
class Pigeon extends Bird {
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}
class Crow extends Bird {
	public void sing() {
		System.out.println("caow caow caow");
	}
}
public class PolymorphismExample {

	public static void main(String[] args) {
		Crow a=new Crow();
		a.sing();
		
	}

}
