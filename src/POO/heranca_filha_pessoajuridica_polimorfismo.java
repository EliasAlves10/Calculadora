package POO_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
class heranca_filha_pessoajuridica_polimorfismo extends heranca_pai_pessoa
{
   private String cnpj;
   private String nomefantasia;
   private String ramoatividade;
   private String gerente; 
   	
   public void incluir(String nome,String endereco,int numero,String cidade,String telefone, String cnpj, String nomefantasia, String ramoatividade, String gerente)	
   {
   	   super.incluir(nome,endereco,numero,cidade,telefone);
   	   this.cnpj = cnpj;
   	   this.nomefantasia = nomefantasia;
   	   this.ramoatividade = ramoatividade;
   	   this.gerente = gerente;
   } 
   public String retorna_cnpj() { return(cnpj);}
   public String retorna_nomefantasia() { return(nomefantasia);}
   public String retorna_ramoatividade() { return(ramoatividade);}
   public String retorna_gerente() { return(gerente);}   

}
