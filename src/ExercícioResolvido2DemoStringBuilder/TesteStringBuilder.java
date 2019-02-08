package ExercícioResolvido2DemoStringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteStringBuilder {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Muito show top de mais: ");
		Comment c2 = new Comment("Muito show zica de mais: ");

		Post p1 = new Post(sdf.parse("21/06/2019 13:05:04"), "Nova Zelandia", " Irei visitar 100% ", 5);

		p1.addComments(c1);
		
		System.out.println(p1);

	}

}
