package src.Strems;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		
		System.out.println("usando o foreach ");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Interator...");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\nUsanso stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		}
}
