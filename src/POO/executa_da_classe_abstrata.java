package POO_class;
//V�DEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.JOptionPane;
class executa_da_classe_abstrata
{
    public static void main(String args[])
    {
        usa_classe_abstrata obj_criado;
        obj_criado = new usa_classe_abstrata("Neri","33301222","Java","S�bados");
        obj_criado.imprime_dados();
        
        obj_criado.imprimir();     
    }
}