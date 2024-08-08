import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#,##0.00");
		double peso=0,altura=0;
		int cont=0,idade=0,somaIdade=0,quant50=0,quantIdade=0;
		int quantAzul=0,quantRuiva=0;		
		char corOlho,corCabelo;
		
		for(int i =0;i<5;i++) {
			System.out.println("Digite a sua idade:");
			idade = e.nextInt();
			
			System.out.println("Digite sua altura:");
			altura =e.nextDouble();
			
			System.out.println("Digite o seu peso:");
			peso = e.nextDouble();
			
			System.out.println("Digite a cor do seus olhos:");
			corOlho = e.next().toUpperCase().charAt(0);
			
			while(corOlho!='A'&& corOlho != 'P' && corOlho!='V' && corOlho!='C') {
				System.out.println("Digite a cor corretamente: A/P/V/C");
				corOlho = e.next().toUpperCase().charAt(0);	
			}
			
			System.out.println("Digite a cor do seus cabelos:");
			corCabelo = e.next().toUpperCase().charAt(0);
			
			while(corCabelo!='P'&& corCabelo != 'C' && corCabelo!='L' && corCabelo!='R') {
				System.out.println("Digite a cor corretamente: P/C/L/R");
				corCabelo = e.next().toUpperCase().charAt(0);	
			}
			
			if(idade > 50 && peso <60) {
				quant50++;
			}
			
			if(altura<1.5) {
				quantIdade++;
				somaIdade += somaIdade + idade;
			}
			
			if(corOlho == 'A') {
				quantAzul++;
			}
			
			if(corCabelo == 'R' && corOlho != 'A') {
				quantRuiva++;
			}
			
			cont++;
		}
		System.out.println("A quantidade de pessoas com idade superior a 50 e peso inferior a 60Kg :"+quant50);
		if(quantIdade!=0) {
			System.out.println("A média das idades das pessoas com altura inferior a 1.50 :"+somaIdade/quantIdade);
			
		}else {
			System.out.println("A média das idades das pessoas com alura inferior a 1.50: 0");
			
		}
		
		System.out.println("A porcentagem de pessoas com ohlos azuis entre todas as pessoas analisadas:"+(double)quantAzul/cont);
		System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis:"+quantRuiva);

	}

}
