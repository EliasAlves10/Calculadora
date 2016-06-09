package forms_swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculadora extends JFrame  implements ActionListener
{
   JLabel lb_titulo, lb_autor, lb_logo, lb_num1, lb_num2, lb_resultado;
   JButton bt_somar, bt_sair, bt_subtrair, bt_multiplicar, bt_dividir, bt_limpar;
   JTextField tf_num1, tf_num2, tf_resultado;
   ImageIcon imagem_logo;
   JMenuBar barra_menu;
   JMenu menu_calculadora;
   JMenuItem mi_somar, mi_dividir, mi_multiplicar, mi_subtrair, mi_limpar, mi_sair;

   public calculadora()    //método construtor
   {
       setTitle("Calculadora do NeriAprendendo Formulários com o Neri - INFORMATICON");
       setSize(800,600);   //define o tamanho em pixel largura,altura
       setLocation(75,75);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(true);
       //getContentPane().setBackground(Color.red);
       //getContentPane().setBackground(new Color(100,120,50));

       //Gerenciador FlowLayout() Posiciona automaticamente os componentes na tela
       //getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

       //Gerenciador GridLayout
       //getContentPane().setLayout(new GridLayout(numero_de_linas,numero de colunas,espaçamento_horizontal, espaçamento_vertical));
       //getContentPane().setLayout(new GridLayout(2,5,10,10));

       //Gerenciador BorderLayout  disponibiiza os componentes em 5 regiões diferentes
       //getContentPane().setLayout(new BorderLayout(20,50));

       getContentPane().setLayout(null); //informa que não vai usar Gerenciador de Layout

       imagem_logo  = new ImageIcon("D:/videoaulas/java SE II/imagens/neri_informaticon.GIF");
       //labels
       lb_titulo    = new JLabel("Aprendendo a fazer uma calculadora com o Neri - INFORMATICON");
       lb_autor     = new JLabel("Neri Aldoir Neitzke");
       lb_logo      = new JLabel(imagem_logo);
       lb_num1      = new JLabel("Número 1.: ");
       lb_num2      = new JLabel("Número 2.: ");
       lb_resultado = new JLabel("Resultado.: ");
       //botoes
       bt_somar       = new JButton("Somar");
       bt_multiplicar = new JButton("Multiplicar");
       bt_dividir     = new JButton("dividir");
       bt_subtrair    = new JButton("Subtrair");
       bt_limpar      = new JButton("Limpar");
       bt_sair        = new JButton("Sair");
       //os textfields
       tf_num1        = new JTextField(10);
       tf_num2        = new JTextField(10);
       tf_resultado   = new JTextField(20);
       tf_resultado.setEditable(false); //não permite alterações no campo

       //inserção de Menus
       barra_menu = new JMenuBar();
       setJMenuBar(barra_menu);
       menu_calculadora   = new JMenu("Calculadora");
       barra_menu.add(menu_calculadora);

       mi_somar        = new JMenuItem("Somar");
       mi_multiplicar  = new JMenuItem("Multiplicar");
       mi_dividir      = new JMenuItem("Dividir");
       mi_subtrair     = new JMenuItem("Subtrair");
       mi_limpar       = new JMenuItem("Limpar");
       mi_sair         = new JMenuItem("Sair");

       menu_calculadora.add(mi_somar);
       menu_calculadora.add(mi_multiplicar);
       menu_calculadora.add(mi_dividir);
       menu_calculadora.add(mi_subtrair);
       menu_calculadora.addSeparator();
       menu_calculadora.add(mi_limpar);
       menu_calculadora.addSeparator();
       menu_calculadora.add(mi_sair);

       //manipulando Cores para os componentes
       lb_titulo.setForeground(Color.black);
       bt_sair.setBackground(Color.yellow);
       lb_autor.setForeground(Color.red);

       //manipulando tamanho das fontes
       lb_titulo    .setFont(new Font("Arial",Font.BOLD,18));
       lb_autor     .setFont(new Font("Courier",Font.BOLD,14));
       bt_sair      .setFont(new Font("Arial",Font.BOLD,16));





       //Posicionando os componentes na Tela
       //objeto.setBounds(posicaoColuna,posicaoLinha,comprimentodalinha,alturadalinha);
       lb_titulo     .setBounds(50,300,600, 40);
       lb_logo       .setBounds(10,5,600,  100);
       lb_autor      .setBounds(200,100,200,70);
       lb_num1       .setBounds(10,100,80,25);
       lb_num2       .setBounds(10,140,80,25);
       lb_resultado  .setBounds(10,230,200, 30);
       tf_num1       .setBounds(100,100,50,25);
       tf_num2       .setBounds(100,140,50,25);
       bt_somar      .setBounds(50, 180,100, 30);
       bt_multiplicar.setBounds(160,180,100, 30);
       bt_subtrair   .setBounds(270,180,100, 30);
       bt_dividir    .setBounds(380,180,100, 30);
       bt_limpar     .setBounds(490,180,100, 30);

       bt_sair       .setBounds(50,400,80, 30);
       tf_resultado  .setBounds(100,230,200, 30);

       //registro dos objetos que vão sofrer ações
       bt_somar      .addActionListener(this);
       bt_multiplicar.addActionListener(this);
       bt_subtrair   .addActionListener(this);
       bt_dividir    .addActionListener(this);
       bt_limpar     .addActionListener(this);
       bt_sair       .addActionListener(this);


       getContentPane().add(lb_titulo);
       getContentPane().add(lb_logo);
       getContentPane().add(bt_somar);
       getContentPane().add(bt_multiplicar);
       getContentPane().add(bt_subtrair);
       getContentPane().add(bt_dividir);
       getContentPane().add(bt_limpar);
       getContentPane().add(lb_autor);
       getContentPane().add(bt_sair);

       //getContentPane().add(jrb_masc);
       //getContentPane().add(jrb_fem);
       //getContentPane().add(grupo_sexo);
       getContentPane().add(tf_num1);
       getContentPane().add(tf_num2);
       getContentPane().add(tf_resultado);
       getContentPane().add(lb_num1);
       getContentPane().add(lb_num2);
       getContentPane().add(lb_resultado);


   }
   public static void main(String args[])
   {
      JFrame obj_calc = new  calculadora();
      //obj_form.show(); //antes para mostrar usava-se o método show();
      obj_calc.setVisible(true);
   }
   public void actionPerformed(ActionEvent acao)
   {
       if (acao.getSource() == bt_somar)
       {
           double num1 = Double.parseDouble(tf_num1.getText());
           double num2 = Double.parseDouble(tf_num2.getText());
           double resultado = num1 + num2;
           //tf_resultado.setText(String.valueOf(resultado));   ou
           tf_resultado.setText(""+resultado);

       }
       if (acao.getSource() == bt_multiplicar)
       {
           double num1 = Double.parseDouble(tf_num1.getText());
           double num2 = Double.parseDouble(tf_num2.getText());
           double resultado = num1 * num2;
           //tf_resultado.setText(String.valueOf(resultado));   ou
           tf_resultado.setText(""+resultado);

       }
       if (acao.getSource() == bt_dividir)
       {
           double num1 = Double.parseDouble(tf_num1.getText());
           double num2 = Double.parseDouble(tf_num2.getText());
           double resultado = num1 / num2;
           //tf_resultado.setText(String.valueOf(resultado));   ou
           tf_resultado.setText(""+resultado);

       }
       if (acao.getSource() == bt_subtrair)
       {
           double num1 = Double.parseDouble(tf_num1.getText());
           double num2 = Double.parseDouble(tf_num2.getText());
           double resultado = num1 - num2;
           //tf_resultado.setText(String.valueOf(resultado));   ou
           tf_resultado.setText(""+resultado);

       }
       if(acao.getSource() == bt_limpar)
       {
           tf_num1.setText("");
           tf_num2.setText("");
           tf_resultado.setText("");
           tf_num1.requestFocus();

       }

   }
}
