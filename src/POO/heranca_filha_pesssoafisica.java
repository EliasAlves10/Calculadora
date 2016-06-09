package POO_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
class heranca_filha_pessoafisica extends heranca_pai_pessoa
{
   private String cpf;
   private String rg;
   private int idade;
   private char sexo; 
   	
   public void incluir(String cpf, String rg, int idade, char sexo)	
   {
   	   this.cpf = cpf;
   	   this.rg = rg;
   	   this.idade = idade;
   	   this.sexo = sexo;
   }
   public String retorna_cpf() { return(cpf);  }
   public String retorna_rg() { return(rg);  }
   public int retorna_idade() { return(idade);  }
   public char retorna_sexo() { return(sexo);  }
   
}
