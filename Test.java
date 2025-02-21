package Ex_calculatrice;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        Calculatrice calc = new Calculatrice();

	        System.out.println("Choisir l' opération :");

	        char op = s.next().charAt(0);
	        System.out.println("a : ");
	        double a = s.nextDouble();
	        System.out.println("b : ");
	        double b = s.nextDouble();

	        double r = 0;
	        switch (op) {
	            case '+':
	                r = calc.add(a, b);
	                break;
	            case '-':
	                r = calc.soustraction(a, b);
	                break;
	            case '*':
	                r = calc.mult(a, b);
	                break;
	            case '/':
	                r = calc.div(a, b);
	                break;
	            default:
	                System.out.println(" invalide ");
	                return;
	        }

	        System.out.println("Résultat : " + r);
	        s.close();
	    }
	}

