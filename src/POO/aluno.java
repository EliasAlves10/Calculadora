package POO_class;
//V�DEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.JOptionPane;
class aluno
{
    public static void main(String args[])
    {
        heranca_filha_pessoafisica obj_aluno = new heranca_filha_pessoafisica();
        obj_aluno.incluir("Neri Aldoir Neitzke","Av Flores da Cunha",1545,"Carazinho","5433301222");
        obj_aluno.incluir("6548465465","54684648",18,'M');
        
        System.out.println("O nome � "+obj_aluno.retorna_nome());
        System.out.println("O endere�o � "+obj_aluno.retorna_endereco());
        System.out.println("O numero � "+obj_aluno.retorna_numero());        
        System.out.println("A cidade � "+obj_aluno.retorna_cidade());
        System.out.println("O telefone � "+obj_aluno.retorna_telefone());                	
        System.out.println("O CPF � "+obj_aluno.retorna_cpf());                	        	
        System.out.println("O RG � "+obj_aluno.retorna_rg());                	        	
        System.out.println("A idade � "+obj_aluno.retorna_idade());                	        	
        System.out.println("O Sexo � "+obj_aluno.retorna_sexo());                	        	        	       
        
    }
}