package TiposListCuringaWildCardtypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteCoringa {
	public static void main(String[] args) {

		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers; // erro de compila��o

		List<?> list = new ArrayList<Integer>();
//		list.add(3); // erro de compila��o}

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {

		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
