package metodos_class;
//V�DEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.JOptionPane;
import java.io.*;
class entrada_dados_media_teclado2
{
    public static void main(String args[])
    {
        double nota1=0, nota2=0, media=0;
        BufferedReader dado_entrada;
        String nota_digitada;
        try
        {
            System.out.println("Digite a primeira nota .: ");
            dado_entrada = new BufferedReader(new InputStreamReader(System.in));
            nota_digitada = dado_entrada.readLine();
            nota1 = Double.parseDouble(nota_digitada);
            
            System.out.println("Digite a segunda nota .: ");
            dado_entrada = new BufferedReader(new InputStreamReader(System.in));
            nota_digitada = dado_entrada.readLine();
            nota2 = Double.parseDouble(nota_digitada);
            
            media = (nota1 + nota2) / 2;
            System.out.println("A media das notas foi "+media);
            //JOptionPane.showMessageDialog(null,"A media das notas foi "+media);
        	
        }
        catch(IOException erroIO)
        {
             System.out.println("Erro de entrada de dados "+erroIO);		
        }
        catch(NumberFormatException erroNumber)	
        {
            System.out.println("Digite um valor num�rico v�lido "+erroNumber);	
        }	     
    }
}