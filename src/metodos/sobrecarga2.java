package metodos_class;
//V�DEO AULAS PROF NERI ALDOIR NEITZKE 
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
    	{   mensagem = "M�todo sem parametros"; }
    public static void ler_mensagem(String texto) 
    	{   mensagem = "M�todo com um par�metro Texto = "+texto; }
    public static void ler_mensagem(String p1, String p2) 
    	{   mensagem = "M�todo 2 parametros String = "+(p1 + p2); }    
    public static void ler_mensagem(int oque) 
    	{   mensagem = "M�todo com par�metro Inteiro "+oque; }
    public static void ler_mensagem(double numero) 
    	{   mensagem = "M�todo com par�metro Num�rico "+numero; }    	
    
   
    public static void mostrar_mensagem()
    {  JOptionPane.showMessageDialog(null," "+mensagem);
    }    	
}