package lista01;
import java.util.Scanner;
public class ConversorDeDias {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int dias, meses, anos;
		System.out.println ("Insira o n�mero de dias: ");
		dias = ler.nextInt ();
		meses = dias/30;
		anos = dias/365;
		System.out.println ("N�mero de mese(s): " +meses);
		System.out.println ("N�mero de ano(s): " +anos);
	}
}
