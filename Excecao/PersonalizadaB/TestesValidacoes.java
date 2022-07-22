package Excecao.PersonalizadaB;

import Excecao.Aluno;

public class TestesValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
		    System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException 
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			e.printStackTrace();
		} catch (NumeroForaIntervaloException e) {
			e.printStackTrace();
		}
		
		System.out.println("fim :)");
		
	}
}
