package metodos_class;
//V�DEO AULAS PROF NERI ALDOIR NEITZKE - www.informaticon.com.br - videoaulasneri@gmail.com
import javax.swing.JOptionPane;
class metodos_retornan_parametros
{
	static double nota1=0, nota2=0, media=0;
    public static void main(String args[])
    {
          ler_notas(); //chamando o m�todo ler_notas
          //calcula_media(nota1, nota2);
          mensagem(); 
    }
    public static void ler_notas()
    {
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota 1: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota 2: "));    	
    }
    public static double calcula_media(double nt1, double nt2)
    {
        return (nt1 + nt2) / 2;    
    }
    public static void mensagem()
    {
    	 JOptionPane.showMessageDialog(null,"A media das notas foi "+calcula_media(nota1,nota2));
    }    	
}