package POO_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
public class interface_implementada implements interface_calculos
{
    private static double num1, num2;
    
    public interface_implementada(double num1, double num2)
    {
    	this.num1 = num1;
    	this.num2 = num2;
    }
    
    public static void main(String args[])
    {
    	interface_implementada obj_calc = new interface_implementada(20,5);
    	System.out.println("A Soma é "+obj_calc.somar());
    	System.out.println("A divisao é "+obj_calc.dividir());
    	System.out.println("A multiplicacao é "+obj_calc.multiplicar());
    	System.out.println("A subtração fica "+obj_calc.subtrair(num1,num2));
    }
    public double somar()
    {
        return num1 + num2;
    }
    public double multiplicar()
    {
        return num1 * num2;
    }
    public double dividir()
    {
        return num1 / num2;
    }
    public double subtrair(double num1, double num2)
    {
    	return num1 - num2;
    }
    
}