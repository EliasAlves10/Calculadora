package metodos_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE 
//www.informaticon.com.br - videoaulasneri@gmail.com
import javax.swing.JOptionPane;
class sobrecarga2
{
	static String mensagem;
    public static void main(String args[])
    {   
          ler_mensagem(9); 
          mostrar_mensagem();	
    }
    public static void ler_mensagem() 
    	{   mensagem = "Método sem parametros"; }
    public static void ler_mensagem(String texto) 
    	{   mensagem = "Método com um parâmetro Texto = "+texto; }
    public static void ler_mensagem(String p1, String p2) 
    	{   mensagem = "Método 2 parametros String = "+(p1 + p2); }    
    public static void ler_mensagem(int oque) 
    	{   mensagem = "Método com parâmetro Inteiro "+oque; }
    public static void ler_mensagem(double numero) 
    	{   mensagem = "Método com parâmetro Numérico "+numero; }    	
    
   
    public static void mostrar_mensagem()
    {  JOptionPane.showMessageDialog(null," "+mensagem);
    }    	
}