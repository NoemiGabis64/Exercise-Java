package URI;
/*construtor escola*/
public class Exercise10 {

	Aluno carlos = new Aluno();
	
	String nome;
	Aluno aluno;
	Professor professor;
	double n1;
	double n2;
	double n3;
	double n4;
	double media;
	String aprovacao;
	
	public void EstadodaDisciplina (String nome, Aluno aluno, Professor professor) {
		this.nome = nome;
		this.aluno = aluno;
		this.professor = professor;
		this.aprovacao = "REPROVADO";
		this.n1 = 0;
		this.n2 = 0;
		this.n3 = 0;
		this.n4 = 0;
		this.media = 0;
	}
	
	public void lancarNota(double n1, double n2, double n3, double n4) {
		this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        /* Repasse as notas recebidas como parâmetros para os atributos notas da classe. **/
		
		System.out.printf("Notas lançadas com sucesso para o aluno", aluno , " na disciplina  ", nome ,"! \r\n"
				+ "");
	}
	
	public void calcularMedia() {
		media = (n1 + n2 + n3 + n4) /4;
		
		System.out.printf("Média calculada! O aluno", aluno ," obteve média ", media , "na disciplina  de ", nome ,", sob a responsabilidade do docente ", professor ,". ");
		
		
		if(media >= 6) {
			aprovacao = "APROVADO";
			carlos.numdisciplinasA++;
		}else {
			aprovacao = "REPROVADO";
			carlos.numdisciplinasR++;
		}
	}
}
