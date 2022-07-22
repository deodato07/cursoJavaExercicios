package src.Strems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Times t1 = new Times ("Flamengo", 50, 10);
		Times t2 = new Times ("Palmeiras", 55, 12);
		Times t3 = new Times ("Santos", 48, 9);
		Times t4 = new Times ("São Paulo", 20, 2);
		Times t5 = new Times ("Avaí", 27, 4);
		Times t6 = new Times ("Internacional", 41, 8);
		Times t7 = new Times ("Goias", 19, 3);
		Times t8 = new Times ("Ceará", 41, 7);
		Times t9 = new Times ("Botafogo", 23, 2);
		
		List<Times> times = Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8, t9);
		
		Predicate<Times>primeirosColocados = t -> t.pontos >= 40;
		Predicate<Times>classificados = t -> t.vitorias >= 8;
		Function<Times, String>saudacaoClassificados = 
				t->"Parabéns " + t.nome + "! Classificados Para a proxima fase!";
		
		times.stream()
			 .filter(primeirosColocados)
			 .filter(classificados)
			 .map(saudacaoClassificados)
		     .forEach(System.out::println);
	}
}
