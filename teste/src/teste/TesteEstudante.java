package teste;

public class TesteEstudante {

	public static void main (String args []) {
		Estudante E01 = new Estudante();
		E01.exibir();
		Estudante E02 = new Estudante ("claudia", 'F');
		E02.exibir();
		Estudante E03 = new Estudante ("moises", 'M', 202020);
		E03.exibir();
//		E01.matricula = 2004001;
//		E01.nome="Marina Silva";
//		E01.sexo='F';
//		E01.atribuirNota(1,7.0);
//		E01.atribuirNota(2, 8.2);
//		E01.atribuirNota(3, 6.0);
//		E01.atribuirNota(4, 5.5);
		E01.exibir();
		E01.calcularMedia();
		E01.calcularStatus();
//		for (int x = 0; x<4; x++) {
//			E01.notas[x] = 1;}
//		E01.exibir();
//		E01.atribuirNota(0);
//		E01.atribuirNota(1);
//		E01.atribuirNota(2);
//		E01.atribuirNota(3);
		E01.exibir("matricula");
		E01.exibir("nome");
		E01.exibir();
		E01.calcularMedia();
		E02.atribuirNota(1, 7.0);
		E02.atribuirNota(2, 5.0);
		E02.atribuirNota(3);
		E02.atribuirNota(4, 8.5);
		E02.exibir();
		E02.exibir("dados do estudante");
		E03.atribuirNota(1, 7.0);
		E03.atribuirNota(2, 5.0);
		E03.atribuirNota(3);
		E03.atribuirNota(4, 8.5);
		E03.exibir();
		E03.exibir("dados do estudante");
		E03.exibir("notas");
		
		
	}
}
