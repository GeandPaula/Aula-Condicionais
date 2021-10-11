
public class Impostoderenda {

	public static void main(String[] args) {
		double salario= 3900.0;
		if(salario<2500.0) {
			System.out.println("Asua aliquota é de 15 %");
		    System.out.println("Você pode deduzir até 350.0");
		} else if(salario>=2500.0 && salario<=3500.0) {
			System.out.println("Sua aliquota é de 18%");
			System.out.println("Você pode deduzir até 500");
		}
		else {
			System.out.println("Sua aliquota é de 23%");
			System.out.println("Você pode deduzir até 630");
		}
		

	}

}

