package POO_class;
import javax.swing.JOptionPane;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
class vendas1_construtor
{
	public String cliente;
	protected String produto;
	private double valor=50;
	
	public vendas1_construtor(String cliente)
	{
	   this.cliente = cliente;	
	}
	public vendas1_construtor(String cliente, String produto)
	{
	   this.cliente = cliente;	
       this.produto = produto;		   	
	   	
	}	
	public vendas1_construtor(double valor)
	{
	   this.valor = valor;	
	}
	
	public double altera_valor(double valor)
	{
		this.valor = valor;
		return valor;
	}
	public void imprime(double valor)
	{
		JOptionPane.showMessageDialog(null,"Nome .: "+cliente+
			                               "\nProduto.: "+produto+
			                               "\nValor .: "+altera_valor(valor));
	}
	
}
