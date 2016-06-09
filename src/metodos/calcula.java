package metodos_class;
//VÍDEO AULAS PROF NERI ALDOIR NEITZKE
//www.informaticon.com.br - videoaulasneri@gmail.com
class calcula
{
	static double soma=0, valor1=0, valor2=0;
	public static void somar()
	{
		soma = valor1 + valor2;
	}
	public static void somar(double vl1, double vl2)
	{
		soma = vl1 + vl2;
	}
	public static double retorna_soma(double vl1, double vl2)
	{
		return vl1 + vl2;
	}	
}