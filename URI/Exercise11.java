package PROVA;

import java.util.Locale;
import java.util.Scanner;

public class caminhao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); 
		
		double Custo_de_Fabrica = 0;
		double Porcentagem_do_Distribuidor = 0;
		double Imposto = 0;
		double veiculo = 20.000;
		
		
		Custo_de_Fabrica = ((Porcentagem_do_Distribuidor*0.35)   + (Imposto*0.57));
		
		veiculo = veiculo + Custo_de_Fabrica;
		
		System.out.println("O Custo de Fábrica é :" + Custo_de_Fabrica);
		System.out.println("A Porcentagem do Distribuidor é:" + Porcentagem_do_Distribuidor);
		System.out.println("O Imposto é:" + Imposto);
		
	}

}