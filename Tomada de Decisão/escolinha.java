import java.util.*;
public class escolinha {
	public static void main(String[] args) {
		//Scanner
		Scanner ler = new Scanner (System.in);
		//Vari�veis
		int an, c;
		//Leitura
		System.out.println("Insira o ano de nascimento: ");
		an = ler.nextInt();
		//C�lculo
		c = 2024-an;
		//IF - Tomada de decis�o
		if (c<6 || c==6) {
			System.out.println("Dente de Leite");
		}else if (c<10){
			System.out.println("Infantil 1");
		}else if (c<14){
			System.out.println("Infantil 2");
		}else if  (c<16){
			System.out.println("Juvenil 1");
		}else if  (c<17){
			System.out.println("Juvenil 2");
		}else
			System.out.println("N�o s�o permitidos maiores de 18 anos.");
		ler.close();
	}
}
