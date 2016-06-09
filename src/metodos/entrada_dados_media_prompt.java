package metodos_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.*;
class entrada_dados_media_prompt
{
    public static void main(String dados[])
    {
        double nota1, nota2, media;
        if (dados.length == 2)
        {
            try
            {
        	   	nota1 = Double.parseDouble(dados[0]);
                nota2 = Double.parseDouble(dados[1]);
                //JOptionPane.showMessageDialog(null,"Primeiro Argumento.: "+dados[0]);
                //JOptionPane.showMessageDialog(null,"Segundo Argumento.: "+dados[1]);
                media = (nota1 + nota2) / 2;
                JOptionPane.showMessageDialog(null, "A média foi : "+media);
            }    
            catch(NumberFormatException erroNumber)    
            {
        	    JOptionPane.showMessageDialog(null,"Digitar somente números validos");

            }
        }
        else
        	JOptionPane.showMessageDialog(null,"Atenção, você deve obrigatoriamente passar 2 valores numéricos")   ;
    }
}