package POO_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
public abstract class classe_abstrata
{
	private String nome;
	private String fone;
	
	public classe_abstrata(String nome, String fone)
	{
		this.nome = nome;
		this.fone = fone;
	}
	
	public void imprime_dados()
	{
		System.out.println("O nome do aluno é "+nome);
		System.out.println("O fone do aluno é "+fone);
		
	}
	
	public abstract void imprimir();
}
	
	