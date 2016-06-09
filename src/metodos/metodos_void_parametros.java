
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.JOptionPane;
class metodos_void_parametros
{
	static double nota1=0, nota2=0, media=0;
    public static void main(String args[])
    {
          ler_notas(8,7); //chamando o método ler_notas
          calcula_media(nota1, nota2);
          mensagem(media); 
    }
    public static void ler_notas(double pnt1, double pnt2)
    {
        nota1 = pnt1;//Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota 1: "));
        nota2 = pnt2;//Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota 2: "));    	
    }
    public static void calcula_media(double nt1, double nt2)
    {
        media = (nt1 + nt2) / 2;    
    }
    public static void mensagem(double calc_media)
    {
    	 JOptionPane.showMessageDialog(null,"A media das notas foi "+calc_media);
    }    	
}