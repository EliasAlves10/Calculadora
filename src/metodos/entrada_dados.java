package metodos_class;
//V�DEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.JOptionPane;
class entrada_dados
{
    public static void main(String args[])
    {
        
        String nome;
        nome = JOptionPane.showInputDialog("Digite o seu nome.: ");
        JOptionPane.showMessageDialog(null,"Iniciando o segundo curso de java");
        JOptionPane.showMessageDialog(null,"O nome digitado foi "+nome);

    }
}