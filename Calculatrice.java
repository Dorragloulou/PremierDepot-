package Ex_calculatrice;

public class Calculatrice {
	    public double add(double a, double b) {
	        return a + b;
	    }

	    public double soustraction(double a, double b) {
	        return a - b;
	    }

	    public double mult(double a, double b) {
	        return a * b;
	    }


	    public double div(double a, double b) {
	        if (b == 0) {
	            System.out.println("Erreur : Division par zéro !");
	          }
	        return a / b;
	    }
}


