package Excecao;

public class Basico {

		public static void main(String[] args) {
			
			Aluno a1 =null;
			
			try {
			imprimirNomeDoAluno(a1);
			}catch (Exception excecao) {
				System.out.println("Ocorreu um erro que impede"
						+ " nome do usuario ");
			}
			
			try {
				System.out.println(7/0);
			} catch (ArithmeticException e) {
				System.out.println("Ocorreu um erro: " + e.getMessage());
			}
			
			System.out.println("fim !!");
		}
		
		public static void imprimirNomeDoAluno(Aluno aluno) {
			System.out.println(aluno.nome);
		}
		
}
