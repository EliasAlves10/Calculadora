package metodos_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.JOptionPane;
class metodos_simples_void
{
	static double nota1=0, nota2=0, media=0;
    public static void main(String args[])
    {
          ler_notas(); //chamando o método ler_notas
          calcula_media();
          mensagem(); 
    }
    public static void ler_notas()
    {
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota 1: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota 2: "));    	
    }
    public static void calcula_media()
    {
        media = (nota1 + nota2) / 2;    
    }
    public static void mensagem()
    {
    	 JOptionPane.showMessageDialog(null,"A media das notas foi "+media);
    }    	
}