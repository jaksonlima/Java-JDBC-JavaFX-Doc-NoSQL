package CriandoExceçõesPersonalizadas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.reserva.Reserva;

public class TesteExecoes {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/HH/yyyy");
		
		System.out.println("Room Number: ");
		int numero = sc.nextInt();
		System.out.println("Checkin data (dd/HH/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		System.out.println("chechout data (dd/HH/yyyy): ");
		Date chechout = sdf.parse("dd/HH/yyyy");
		
		if(!chechout.after(checkin)) {
			System.out.println("Erro na reserva datas incorretas: ");
		}else {
			Reserva reserv = new Reserva(numero, checkin, chechout);
			System.out.println("Reserva: " + reserv);
			
		}
	}

}
