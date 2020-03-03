package teste2.src.teste;

public class Estudante {

	private int matricula;
	private String nome;
	private char sexo;
	private double[] notas = new double [4];
	private double media;
	
	Estudante() {matricula = 0;
				nome = "nome";
				sexo = '0';
				for (int x = 0; x <notas.length; x++) {
					notas[x] = 10;
				}
				}
	
	Estudante (String nomenovo, char sexonovo) {
		nome = nomenovo;
		sexo = sexonovo;
	}
	
	Estudante (String nomenovo, char sexonovo, int matriculanovo) {
		nome = nomenovo;
		sexo = sexonovo;
		matricula = matriculanovo;
	}
	
	void exibir () {
		System.out.println ("Matricula: "+matricula+", nome: "+nome+", sexo: "+sexo+", notas:"+notas[0]+"; "+notas[1]+"; "+notas[2]+"; "+notas[3]+"; "+media);
	}
	
	void exibir (String titulo) {
		if (titulo == "matricula") {
			System.out.println (matricula);
		}
		else if (titulo == "nome") {
			System.out.println (nome);
		}
		else if (titulo =="sexo") {
			System.out.println (sexo);
		}
		else if (titulo == "notas") {
			for (int i = 0; i < notas.length; i++ ){
				System.out.println (notas[i] + " ");
			}
		}
		else if (titulo == "dados do estudante") {
			System.out.println ("Matricula: "+matricula+", nome: "+nome+", sexo: "+sexo+", notas:"+notas[0]+"; "+notas[1]+"; "+notas[2]+"; "+notas[3]+"; "+media);
		}
	}
	
	void atribuirNota (int numProva, double nota) {
		notas[numProva-1]=nota;
	}
	
	void atribuirNota (int indice) {
		notas[indice] = 0.0;
	}

	void lerNota (int numProva) {
		System.out.println (notas[numProva-1]);
	}
	
	void calcularMedia () {
		int soma = 0;
		for (int i = 0; i< notas.length; i++) {
			soma += notas[i];
		}
		media = soma/notas.length;
		System.out.println(media);
	}
	
	void calcularStatus () {
		if (media>=7) {
			System.out.println("aprovado!");
		}
		if (media <7) {
			System.out.println("reprovado!");
		}
	}
	
	public void getNome () {
		System.out.println (nome);
	}
	
	public void getSexo () {
		System.out.println (sexo);
	}
	
	public void getMatricula () {
		System.out.println (matricula);
	}
	
	public void getNotas () {
		for (int i = 0; i < notas.length; i++ ){
			System.out.println (notas[i] + " ");
		}
	}
	
	public void getNota (int numProva) {
		System.out.println (notas[numProva-1]);
	}
	
	public void imprimirDados () {
		System.out.println ("Matricula: "+matricula+", nome: "+nome+", sexo: "+sexo+", notas:"+notas[0]+"; "+notas[1]+"; "+notas[2]+"; "+notas[3]+"; "+media);
	}
	
	public void setNome (String novoNome) {
		nome = novoNome;
	}
	
	public void setSexo (char novoSexo) {
		sexo = novoSexo;
	}
	
	public void setMatricula (int novaMatricula) {
		matricula = novaMatricula;
	}
	
	public void setNotas () {
		for (int x = 0; x <notas.length; x++) {
			notas[x] = 10;
	}
	}
	
	public void setNota (int numProva, double nota) {
		notas[numProva-1]=nota;
	}

}
