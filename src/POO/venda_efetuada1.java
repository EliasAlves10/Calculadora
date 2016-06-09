package POO_class;
import javax.swing.JOptionPane;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
class venda_efetuada1
{
	public static void main(String args[])
	{
		vendas1 obj_vendas1 = new vendas1();
		obj_vendas1.cliente = "Neri Neitzke";
		obj_vendas1.produto = "Bola de Futebol Vermelha";
		obj_vendas1.imprime(789);

		obj_vendas1.cliente = "INFORMATICON";
		obj_vendas1.produto = "Curso de Java";
		obj_vendas1.imprime(986);
		
		
		
		
	}
}