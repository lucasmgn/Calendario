package exerciciosLogica.basico;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DesafioCalendarJava {
	
	public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String month = input.next();
        String day = input.next();
        String year = input.next();
        String inputDate = day + "/" + month + "/" + year;
        
        SimpleDateFormat formate1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
        	DateFormat format2 = new SimpleDateFormat("EEEE");
        	String finally_day = format2.format(formate1.parse(inputDate));
        	System.out.println(finally_day.toUpperCase());
        }catch(Exception e){
        	
        }
    }}
	

