package POO_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
class heranca_filha_pessoajuridica extends heranca_pai_pessoa
{
   private String cnpj;
   private String nomefantasia;
   private String ramoatividade;
   private String gerente; 
   	
   public void incluir(String cnpj, String nomefantasia, String ramoatividade, String gerente)	
   {
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
