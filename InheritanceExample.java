class Calculator {
	public int add(int i, int j) {
		return i+j;
	}
}
class Calcsub extends Calculator {
	public int sub(int i, int j) {
		return i-j;
	}
}
class Calcmul extends Calcsub {
	public int mul(int i, int j) {
		return i*j;
	}
}
public class InheritanceExample {
	public static void main(String[] args) {
		Calcmul c1=new Calcmul();
		int result1=c1.add(8, 45);
		int result2=c1.sub(6, 2);
		int result3=c1.mul(3, 7);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
