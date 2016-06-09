package metodos_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
import javax.swing.JOptionPane;
class chama_metodo_outra_classe
{
    public static void main(String args[])
    {
         calcula.valor1 = 8;
         calcula.valor2 = 13;
         calcula.somar();
         JOptionPane.showMessageDialog(null,"A soma é "+calcula.soma);
         
         calcula.somar(6,8);
         JOptionPane.showMessageDialog(null,"A soma com parametro "+calcula.soma);
         
         JOptionPane.showMessageDialog(null,"A soma com retorno do método "+
         	                                 calcula.retorna_soma(9,22));
         
    }
}