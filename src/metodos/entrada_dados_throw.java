package metodos_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.JOptionPane;
class entrada_dados_throw
{
    public static void main(String args[])
    {
      try
      {     
          String nome;
          nome = JOptionPane.showInputDialog("Digite o seu nome.: ");
          JOptionPane.showMessageDialog(null,"Iniciando o segundo curso de java");
          JOptionPane.showMessageDialog(null,"O nome digitado foi "+nome);
          throw new Exception ("ErroOcorrido");
      }
      catch(Exception ErroOcorrido)
      {
      	JOptionPane.showMessageDialog(null,"Chamou este EroOcorrido");
      }	
    }  
}