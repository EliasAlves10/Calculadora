package POO_class;
//V�DEO AULAS PROF NERI ALDOIR NEITZKE
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
		System.out.println("O nome do aluno � "+nome);
		System.out.println("O fone do aluno � "+fone);
		
	}
	
	public abstract void imprimir();
}
	
	