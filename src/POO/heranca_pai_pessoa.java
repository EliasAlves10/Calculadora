package POO_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
class heranca_pai_pessoa
{
	private String nome;
	private String endereco;
	private int numero;
	private String cidade;
	private String telefone;
	
	public void incluir(String nome,String endereco,int numero,String cidade,String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.telefone = telefone;
	}
	public String retorna_nome() {	return(nome); }
	public String retorna_endereco() {	return(endereco); }
	public int retorna_numero() {	return(numero); }
	public String retorna_cidade() {	return(cidade); }
	public String retorna_telefone() {	return(telefone); }

}
