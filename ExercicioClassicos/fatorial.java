import java.util.*;
public class fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, i=1, f=1;
		//Leitura
		System.out.println("Digite um n�mero inteiro");
		n = ler.nextInt ();
		//While
		while(i<=n) {
			f = f*i;
			i++;
		}
		System.out.println("O fatorial de " +n+ " � igual a " +f);
		ler.close();
	}
}