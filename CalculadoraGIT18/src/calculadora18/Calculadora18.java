package calculadora18;
 /** soy Lier Rodriguez Rey y soy listo */
public class Calculadora18 {
	public int sumar(int a, int b) {
		 return a + b;
		 }
	public int restar(int a, int b) {
		 return a - b;
		 }
	public int multiplicar(int a, int b) { 
		 return a * b; 
		} 
	public double dividir(int a, int b) { 
		 return (double) a / b; 
		} 
	public double dividir(int a, int b) { 
			if (b == 0) { 
			throw new IllegalArgumentException("No se puede dividir entre cero");  } 
			return (double) a / b; 
		} 

	public double dividir(int a, int b) { 
		 if (b == 0) { 
		 System.out.println("Error: división entre cero"); 
		 return 0; 
		 } 
		 return (double) a / b; 
		} 



}
