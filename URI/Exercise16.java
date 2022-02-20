package URI;
/**construtor escola */
public class Exercise16{

	public static void main(String[] args) {
		
		Aluno carlos = new Aluno("Carlos", 12345);  
		Professor teacher1 = new Professor("José", "Graduado");  
        Professor teacher2 = new Professor("Maria", "Mestre");  
        Professor teacher3 = new Professor("Paulo", "Doutor");  
        Disciplinas matematica = new Disciplinas("Matemática", carlos, teacher1);  
        Disciplinas portugues = new Disciplinas("Português", carlos, teacher2);  
        Disciplinas fisica = new Disciplinas("Física", carlos, teacher3);  
        
        matematica.lancarNota(6.5f, 5.0f, 7.0f, 4.5f);  
		matematica.calcularMedia();
		portugues.lancarNota(8f, 9f, 7.0f, 4.5f);
		
		portugues.calcularMedia();  
		fisica.lancarNota(2.5f, 5.0f, 9.0f, 5.5f);  
		fisica.calcularMedia();  
		carlos.exibirResultado();  
		 

	}

}