import java.util.*;
public class inss {
	public static void main(String[] args) {
		//Scanner
		Scanner ler = new Scanner (System.in);
		//Vari�veis
		int r;
		//Leitura
		System.out.println("Insira a renda: ");
		r = ler.nextInt();
		//Tomada de decis�o
		if (r<=1.412){
			System.out.println("7,5%");
			
		}else if (r>2.666){
			System.out.println("9%");
			
		}else if (r>4.000) {
			System.out.println("12%");
		}else if (r>7.768) {
			System.out.println("14%");
		}else
			System.out.println("16%");
		ler.close();
		}
	}
