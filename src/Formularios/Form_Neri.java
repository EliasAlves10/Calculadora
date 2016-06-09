package forms_swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Form_Neri extends JFrame  implements ActionListener, ItemListener, FocusListener
{
   JLabel lb_titulo, lb_autor, lb_logo;
   JButton bt_cadastro, bt_sair;
   JTextField tf_nome;
   ImageIcon imagem_logo;
   JComboBox jcb_familia;
   JList jl_frutas;
   JRadioButton jrb_masc,jrb_fem;
   ButtonGroup grupo_sexo;
   JPanel panel_sexo;
   JPasswordField tf_senha;
   JTextArea texto;
   JScrollPane scroll_texto;
   JMenuBar barra_menu;
   JMenu menus_cadastros, menus_consultas, menus_relatorios, menus_utilitarios;
   JMenuItem mi_cad_cliente, mi_cad_cidade, mi_cad_bairro,mi_sair;
   JMenuItem mi_rel_cliente, mi_rel_cidade, mi_rel_bairro;

   public Form_Neri()    //método construtor
   {
       setTitle("Aprendendo Formulários com o Neri - INFORMATICON");
       setSize(800,600);   //define o tamanho em pixel largura,altura
       setLocation(75,75);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(true);
       //getContentPane().setBackground(Color.red);
       getContentPane().setBackground(new Color(150,120,50));

       //Gerenciador FlowLayout() Posiciona automaticamente os componentes na tela
       //getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

       //Gerenciador GridLayout
       //getContentPane().setLayout(new GridLayout(numero_de_linas,numero de colunas,espaçamento_horizontal, espaçamento_vertical));
       //getContentPane().setLayout(new GridLayout(2,5,10,10));

       //Gerenciador BorderLayout  disponibiiza os componentes em 5 regiões diferentes
       //getContentPane().setLayout(new BorderLayout(20,50));

       getContentPane().setLayout(null); //informa que não vai usar Gerenciador de Layout





       imagem_logo = new ImageIcon("D:/videoaulas/java SE II/imagens/neri_informaticon.GIF");
       //labels
       lb_titulo = new JLabel("Vídeo Aulas Prof. Neri Neitzke - INFORMATICON");
       lb_autor  = new JLabel("NERIZON");
       lb_logo   = new JLabel(imagem_logo);
       //botoes
       bt_cadastro = new JButton("Botão Cadastro");
       bt_sair     = new JButton("Saída");
       //os textfields
       tf_nome = new JTextField(20);
       tf_senha = new JPasswordField();
       tf_senha.setEchoChar('*');

       jcb_familia = new JComboBox();
       jcb_familia.addItem("Neri Neitzke");
       jcb_familia.addItem("Pai Selvino");
       jcb_familia.addItem("Mae Romilda");
       jcb_familia.addItem("Filho Gustavo");
       jcb_familia.addItem("Filha Giulia");
       jcb_familia.addItem("Esposa Lisiane");
       jcb_familia.addItem("Amigo Marcos");

       String frutas [] =  {"Maça","Pera","Uva","Jaboticaba","Laranja"};
       jl_frutas = new JList(frutas);

       jrb_masc = new JRadioButton ("Masculino");
       jrb_fem  = new JRadioButton ("Feminino ");

       grupo_sexo = new ButtonGroup();
       grupo_sexo.add(jrb_masc);
       grupo_sexo.add(jrb_fem);
       panel_sexo = new JPanel();
       panel_sexo.setLayout(new GridLayout(1,2));
       panel_sexo.add(jrb_masc);
       panel_sexo.add(jrb_fem);
       texto = new JTextArea("Texto do Neri",10,10);
       scroll_texto = new JScrollPane(texto);

       //inserção de Menus
       barra_menu = new JMenuBar();
       setJMenuBar(barra_menu);
       menus_cadastros    = new JMenu("Cadastros");
       menus_consultas    = new JMenu("Consultas");
       menus_relatorios   = new JMenu("Relatórios");
       menus_utilitarios  = new JMenu("Utilitários");
       barra_menu.add(menus_cadastros);
       barra_menu.add(menus_consultas);
       barra_menu.add(menus_relatorios);
       barra_menu.add(menus_utilitarios);

       mi_cad_cliente = new JMenuItem("Clientes");
       mi_cad_cidade  = new JMenuItem("Cidades");
       mi_cad_bairro  = new JMenuItem("Bairros");
       mi_sair        = new JMenuItem("Sair");

       mi_rel_cliente = new JMenuItem("Clientes");
       mi_rel_cidade  = new JMenuItem("Cidades");
       mi_rel_bairro  = new JMenuItem("Bairros");


       menus_cadastros.add(mi_cad_cliente);
       menus_cadastros.add(mi_cad_cidade);
       menus_cadastros.add(mi_cad_bairro);
       menus_cadastros.addSeparator(); //adiciona um alinha para separar os itens de menus
       menus_cadastros.add(mi_sair);

       menus_relatorios.add(mi_rel_cliente);
       menus_relatorios.add(mi_rel_cidade);
       menus_relatorios.add(mi_rel_bairro);


       //manipulando Cores para os componentes
       lb_titulo.setForeground(Color.black);
       bt_sair.setBackground(Color.yellow);
       bt_cadastro.setBackground(Color.green);
       lb_autor.setForeground(Color.cyan);

       //manipulando tamanho das fontes
       lb_titulo    .setFont(new Font("Arial",Font.BOLD,30));
       lb_autor     .setFont(new Font("Courier",Font.BOLD,20));
       bt_sair      .setFont(new Font("Arial",Font.BOLD,30));
       bt_cadastro  .setFont(new Font("Arial",Font.BOLD,20));




       //Posicionando os componentes na Tela
       //objeto.setBounds(posicaoColuna,posicaoLinha,comprimentodalinha,alturadalinha);
       lb_titulo   .setBounds(50,250,700, 40);
       lb_logo     .setBounds(10,5,600,  100);
       bt_cadastro .setBounds(50,550,300, 35);
       lb_autor    .setBounds(200,100,200,70);
       tf_nome     .setBounds(300,150,100,20);
       bt_sair     .setBounds(50,200,150, 50);
       jcb_familia .setBounds(300,450,200,30);
       jl_frutas   .setBounds(500,300,200,150);
       //jrb_masc  .setBounds(500,150,100,25);
       //jrb_fem   .setBounds(500,200,100,25);
       //grupo_sexo.setBounds(600,50,100,50);
       panel_sexo  .setBounds(500,150,250,30);
       tf_senha    .setBounds(300,190,100,30);
       scroll_texto.setBounds(50,300,200, 200);


       //registro dos objetos que vão sofrer ações
       bt_cadastro.addActionListener(this);
       bt_sair    .addActionListener(this);
       mi_sair    .addActionListener(this);
       jcb_familia.addItemListener  (this);
       jcb_familia.addActionListener(this);
       tf_senha   .addFocusListener (this);


       //getContentPane().add("North",lb_titulo);
       //getContentPane().add("South",bt_cadastro);
       //getContentPane().add("Center",tf_nome);
       //getContentPane().add("West",lb_autor);
       //getContentPane().add("East",bt_sair);
       getContentPane().add(lb_titulo);
       getContentPane().add(lb_logo);
       getContentPane().add(bt_cadastro);
       getContentPane().add(tf_nome);
       getContentPane().add(lb_autor);
       getContentPane().add(bt_sair);
       getContentPane().add(jcb_familia);
       getContentPane().add(jl_frutas);
       //getContentPane().add(jrb_masc);
       //getContentPane().add(jrb_fem);
       //getContentPane().add(grupo_sexo);
       getContentPane().add(panel_sexo);
       getContentPane().add(tf_senha);
       getContentPane().add(scroll_texto);

   }
   public static void main(String args[])
   {
      JFrame obj_form = new  Form_Neri();
      //obj_form.show(); //antes para mostrar usava-se o método show();
      obj_form.setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == bt_cadastro)
          JOptionPane.showMessageDialog(null,"Ação ocorreu no botão cadastro");
      if (e.getSource() == bt_sair || e.getSource() == mi_sair)
          System.exit(0);
      if (e.getSource() == jcb_familia)
          JOptionPane.showMessageDialog(null,"Cliquei no JComboBox Familia");

   }
   public void itemStateChanged(ItemEvent e)
   {
       //if (e.getSource() == jcb_familia)
       //   JOptionPane.showMessageDialog(null,"Selecionei um item do JComboBox Familia");

   }
   public void focusLost(FocusEvent e)
   {
      if (e.getSource() == tf_senha)
         JOptionPane.showMessageDialog(null,"Saiu do campo senha");
   }
    public void focusGained(FocusEvent e)
    {
    }
}
// awt   = Frame Button
// swing = JFrame JButton