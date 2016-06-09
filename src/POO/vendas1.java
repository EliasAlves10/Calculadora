package POO_class;
import javax.swing.JOptionPane;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
//MODIFICADORES DE ACESSO:
//public = Não tem restrição
//private = é um nível rígido de acesso em que somente a propria classe tem acesso
//protected = nível intermediário de controle de acesso, apenas a classe e a subclasse tem acesso
//this = faz referência ao objeto corrente
class vendas1
{
	public String cliente;
	protected String produto;
	private double valor=50;
	
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
