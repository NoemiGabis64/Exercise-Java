package PROVA;

public class Aluno {
    
	String nome;
	int matricula;
	int numdisciplinasA = 0;
	int numdisciplinasR = 0;

	public void DadosdoAluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public void exibirResultado() {
		System.out.printf("O aluno ", nome ," foi aprovado em ", numdisciplinasA ," disciplina(s) e reprovado em ", numdisciplinasR ," disciplina(s). ");
	}
}
