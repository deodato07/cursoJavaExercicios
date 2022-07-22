package src.Strems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStrems {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("java ", "Lua ", "Js\n");
		langs.forEach(print);
		
		String [] maisLangs = {"Python ", "Lisp ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1 , 4).forEach(print);
		
		List<String> outraLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outraLangs.stream().forEach(print);
		outraLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
				
		}
	}

