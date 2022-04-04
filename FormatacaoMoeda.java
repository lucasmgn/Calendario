package exerciciosLogica.basico;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatacaoMoeda {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	double valor = input.nextDouble();
	BigDecimal payment = new BigDecimal(valor);
	
	Locale us = Locale.US;
	Locale china = Locale.CHINA;
	Locale france = Locale.FRANCE;
		
	NumberFormat US = NumberFormat.getCurrencyInstance(us);
	NumberFormat CH = NumberFormat.getCurrencyInstance(china);
	NumberFormat FR = NumberFormat.getCurrencyInstance(france);
	
	System.out.println("US: " + US.format(payment));
	System.out.printf("India: %s\n",NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment));
	System.out.println("China: " + CH.format(payment));
	System.out.println("France: " + FR.format(payment));
	}
}
