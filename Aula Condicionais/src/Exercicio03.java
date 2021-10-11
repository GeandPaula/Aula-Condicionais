import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite suas tres notas: ");
		double n1  = sc.nextInt();
		//System.out.println("Digite a senha de acesso:");
		double n2  = sc.nextInt();
		//System.out.println("Digite a senha de acesso:");
		double n3  = sc.nextInt();
		
		double media = (n1+n2+n3)/3;
		
		if (media >= 0 && media <= 10) {		
		
		if (media >= 7 && media < 10) {
			System.out.println("Aluno foi Aprovado!");
		}else if (media < 7){
			System.out.println("Aluno foi Reprovado!");
		}else {
			System.out.println("Aluno foi Aprovado com Distinção!");
		}
		}else {
			System.out.println("Valor invalido");
		}
		sc.close();
	}

}
