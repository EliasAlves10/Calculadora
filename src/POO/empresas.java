package POO_class;
//V�DEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com

import javax.swing.JOptionPane;
class empresas
{
    public static void main(String args[])
    {
        heranca_filha_pessoajuridica obj_empresa = new heranca_filha_pessoajuridica();
        obj_empresa.incluir("INFORMATICON","Av Flores da Cunha",1545,"Carazinho","5433301222");
        obj_empresa.incluir("010005140001-85","Informaticon Cursos e Video Aulas","Cursos","Neri Neitzke");
        
        System.out.println("O nome � "+obj_empresa.retorna_nome());
        System.out.println("O endere�o � "+obj_empresa.retorna_endereco());
        System.out.println("O numero � "+obj_empresa.retorna_numero());        
        System.out.println("A cidade � "+obj_empresa.retorna_cidade());
        System.out.println("O telefone � "+obj_empresa.retorna_telefone());                	
        System.out.println("O CNPJ � "+obj_empresa.retorna_cnpj());                	        	
        System.out.println("O Nome Fantasia � "+obj_empresa.retorna_nomefantasia());                	        	
        System.out.println("O ramo de atividade � "+obj_empresa.retorna_ramoatividade());                	        	
        System.out.println("O gerente � "+obj_empresa.retorna_gerente());                	        	        	       
        
    }
}