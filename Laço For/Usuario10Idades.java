import java.util.Scanner;
public class Usuario10Idades {
	public static void main(String[] args) {
		int i, aa, an , idademaxi, idademini, id;
		Scanner ler = new Scanner (System.in);
		
		//leitura
		System.out.println("Insira o ano atual");
		aa = ler.nextInt();
		System.out.println(" ");
		System.out.println("Insira o ano de nascimento");
		an = ler.nextInt();
		idademaxi = aa - an;
		idademini = idademaxi;
		System.out.println(idademaxi);
		
		//La�o For...
		for (i=2; i<=10; i++) {
			System.out.println("Insira o ano de nascimento");
			an = ler.nextInt();	
			System.out.println(" ");
			id = aa - an;
			System.out.println(id);
		//tomada de decis�o para saber o mais novo e mais velho
			if (id>idademaxi){
				idademaxi = id;
			}
			
			if (id<idademini){
				idademini = id;
			}
		}
		System.out.println("Essa � a maior idade: "+idademaxi);
		System.out.println("Essa � a menor idade: "+idademini);
		ler.close();
	}
}