package switchCase02;
import java.util.*;
public class cantina {
	public static void main(String[] args) {
		//Scanner
		Scanner ler = new Scanner (System.in);
		//Vari�vel
		int c;
		//Leitura
		System.out.println("Insira o c�digo do lanche:");
		c = ler.nextInt();
		//Switch Case
		switch (c) {
		case 1:
			System.out.println("Cachorro quente ");
			System.out.println("Pre�o: R$ 8,00 ");
			break;
		case 2:
			System.out.println("Cheeseburger ");
			System.out.println("Pre�o: R$ 12,00 ");
			break;
		case 3:
			System.out.println("X-Salada ");
			System.out.println("Pre�o: R$ 15,00 ");
			break;
		case 4:
			System.out.println("X-Salada ");
			System.out.println("Pre�o: R$ 15,00 ");
			break;
		case 5:
			System.out.println("Misto Quente ");
			System.out.println("Pre�o: R$ 11,00 ");
		case 6:
			System.out.println("P�o na chapa ");
			System.out.println("Pre�o: R$ 6,00 ");
		ler.close();
		}
	}
}
