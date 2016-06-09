package metodos_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.JOptionPane;
class entrada_dados_media_joptionpane
{
    public static void main(String args[])
    {
        double nota1=0, nota2=0, media=0;
        try
        {
               nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota 1: "));
               nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota 2: "));
               media = (nota1 + nota2) / 2;
               JOptionPane.showMessageDialog(null,"A media das notas foi "+media);
        }
        finally
        {
        	JOptionPane.showMessageDialog(null, "Final da aplicação");
        }       
    }
}