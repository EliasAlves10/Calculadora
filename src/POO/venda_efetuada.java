package POO_class;
import javax.swing.JOptionPane;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
class venda_efetuada
{
	public static void main(String args[])
	{
		vendas obj_vendas = new vendas();
		obj_vendas.cliente = "Neri Neitzke";
		obj_vendas.produto = "Bola de Futebol Vermelha";
		obj_vendas.valor = 40.00;
		JOptionPane.showMessageDialog(null,"Nome .: "+obj_vendas.cliente+
			                               "\nProduto.: "+obj_vendas.produto+
			                               "\nValor .: "+obj_vendas.valor);
		obj_vendas.cliente = "INFORMATICON";
		obj_vendas.produto = "Curso de Java";
		obj_vendas.valor = 50.40;	
		JOptionPane.showMessageDialog(null,"Nome .: "+obj_vendas.cliente+
			                               "\nProduto.: "+obj_vendas.produto+
			                               "\nValor .: "+obj_vendas.valor);
		
		
		
	}
}