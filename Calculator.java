import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		char ch;
		double n1,n2;
		System.out.println("Enter your first number: ");
		Scanner r=new Scanner(System.in);
		n1=r.nextDouble();
		System.out.println("Enter your operator (+, -, *, / : ");
		ch=r.next().charAt(0);
		System.out.println("Enter your second number: ");
		n2=r.nextDouble();
		r.close();
		switch(ch) {
		case '+' :
			System.out.printf("%f + %f = %f", n1,n2,(n1+n2));
			break;
		case '-' :
			System.out.printf("%f - %f = %f", n1,n2,(n1-n2));
			break;
		case '*' :
			System.out.printf("%f * %f = %f", n1,n2,(n1*n2));
			break;
		case '/' :
			if (n2 !=0) {
				System.out.printf("%.2f / %.2f = %.2f", n1,n2,(n1/n2));
			}
			else {
				System.out.printf("Divide by zero situation");
			}
			break;
		default:
			System.out.printf("%c is an invalid operator", ch);
		}
		
		

	}

}
