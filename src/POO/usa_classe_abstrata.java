package POO_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
import javax.swing.JOptionPane;
class usa_classe_abstrata extends classe_abstrata
{
    private String curso, dias;
    
    public usa_classe_abstrata(String nome, String fone, String curso, String dias)
    {
    	super(nome,fone);
    	this.curso = curso;
    	this.dias = dias;
    }
    public void imprime_dados()
	{
		super.imprime_dados();
		System.out.println("O Curso que ele vai fazer é "+curso);
		System.out.println("Nos dias "+dias);
		
	}
    
    public void imprimir()
    {
    	JOptionPane.showMessageDialog(null,"Meu nome é Neri Neitzke");
    }
}