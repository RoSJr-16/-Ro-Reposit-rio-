package lista02;
import java.util.Scanner;
public class IPVA {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int vv, ipva;
		System.out.println("Insira o pre�o do seu ve�culo:");
		vv = ler.nextInt ();
		ipva = vv/100*4;
		System.out.println("O valor do IPVA so seu ve�culo:" +ipva);
		ler.close();
	}

}
