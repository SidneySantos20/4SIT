import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aula04 extends JPanel {
	JRadioButton rb1A, rb1B, rb1C, rb1D, rb1E, rb2A, rb2B, rb2C, rb2D, rb2E, rb3A, rb3B, rb3C, rb3D, rb3E, rb4A, rb4B,
			rb4C, rb4D, rb4E, rb5A, rb5B, rb5C, rb5D, rb5E, rb6A, rb6B, rb6C, rb6D, rb6E, rb7A, rb7B, rb7C, rb7D, rb7E;

	ButtonGroup btGroup1, btGroup2, btGroup3, btGroup4, btGroup5, btGroup6, btGroup7;

	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lbNome, lbPontos, lbBemVindo, lbLogo, lbCreditos, lbCreditos2, lbimg1,
			lbimg2, lbimg3, lbimg4, lbimg5, lbimg6, lbimg7, lbimg8, lbimg9, lbimg10, lbimg11, lbimg12, lbimg13, lbimg14,
			lbimg15, lbimg16, lbimg17, lbimg18, lbimg19, lbimg20, lbimg21, lbimg22, lbr1, lbr2, lbr3, lbr4, lbr5, lbr6,
			lbr7;
	ImageIcon imgLogo, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15,
			img16, img17, img18, img19, img20, img21, img22;

	JTextField txNome;

	JTabbedPane tpAbas;
	JPanel panelInicio, panel1, panel2, panel3, panel4, panel5, panel6, panel7, panelPontuacao;

	JButton btConf1, btConf2, btConf3, btConf4, btConf5, btConf6, btConf7, btVerPontuacao;

	int Pontos = 0;

	public Aula04() {
		InicializarComponentes();
		DefinirEventos();
	}

	public void InicializarComponentes() {
		setLayout(null);

		panelInicio = new JPanel();
		panelInicio.setLayout(null);
		panelInicio.setBackground(Color.black);
		imgLogo = new ImageIcon("Imagens\\bola-logo.png");
		lbLogo = new JLabel(imgLogo);
		lbBemVindo = new JLabel("Bem vindo ao QUIZ de Futebol da ESG Esportes!");
		lbNome = new JLabel("Digite seu nome: ");
		txNome = new JTextField("");
		lbCreditos = new JLabel("Feito por:");
		lbCreditos2 = new JLabel("Erik Ferreira, Guilherme Ferreira, Sidney de Jesus");
		lbLogo.setBounds(250, 0, 250, 250);
		lbBemVindo.setBounds(100, 300, 600, 25);
		lbNome.setBounds(100, 350, 200, 35);
		txNome.setBounds(300, 355, 250, 25);
		lbCreditos.setBounds(350, 550, 350, 25);
		lbCreditos2.setBounds(220, 590, 400, 25);
		lbBemVindo.setForeground(new Color(0, 134, 139));
		lbBemVindo.setFont(new Font("Papyrus", Font.BOLD, 24));
		lbNome.setForeground(new Color(0, 134, 139));
		lbNome.setFont(new Font("Papyrus", Font.BOLD, 24));
		lbCreditos.setFont(new Font("Papyrus", Font.BOLD, 20));
		lbCreditos.setForeground(Color.white);
		lbCreditos2.setForeground(Color.white);
		lbCreditos2.setFont(new Font("Papyrus", Font.BOLD, 16));

		panelInicio.add(lbBemVindo);
		panelInicio.add(lbNome);
		panelInicio.add(txNome);
		panelInicio.add(lbLogo);
		panelInicio.add(lbCreditos);
		panelInicio.add(lbCreditos2);

		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.black);
		img1 = new ImageIcon("Imagens\\cr7.png");
		lbimg1 = new JLabel(img1);
		img8 = new ImageIcon("Imagens\\interrogacao.png");
		lbimg8 = new JLabel(img8);
		img15 = new ImageIcon("Imagens\\x.png");
		lbimg15 = new JLabel(img15);
		lbimg15.setVisible(false);
		lbimg1.setVisible(false);
		lb1 = new JLabel("Quem é o maior artilheiro da Champions League?");
		lb1.setForeground(new Color(0, 134, 139));
		rb1A = new JRadioButton("Lionel Messi");
		rb1A.setForeground(new Color(0, 134, 139));
		rb1A.setBackground(Color.black);

		rb1B = new JRadioButton("Neymar Jr.");
		rb1B.setForeground(new Color(0, 134, 139));
		rb1B.setBackground(Color.black);

		rb1C = new JRadioButton("Zidane");
		rb1C.setForeground(new Color(0, 134, 139));
		rb1C.setBackground(Color.black);

		rb1D = new JRadioButton("Cristiano Ronaldo");
		rb1D.setForeground(new Color(0, 134, 139));
		rb1D.setBackground(Color.black);

		rb1E = new JRadioButton("Ronaldo Fenômeno");
		rb1E.setForeground(new Color(0, 134, 139));
		rb1E.setBackground(Color.black);

		btConf1 = new JButton("Confirmar resposta");
		btConf1.setFont(new Font("Papyrus", Font.BOLD, 20));
		btConf1.setForeground(new Color(0, 134, 139));
		btConf1.setBackground(Color.black);
		
		lbr1 = new JLabel(
				"Siiii! CR7 é o maior artilheiro da Champhios League com 134 gols em 174 jogos.");
		lbr1.setVisible(false);
		lbr1.setForeground(new Color(0, 134, 139));
		btGroup1 = new ButtonGroup();
		btGroup1.add(rb1A);
		btGroup1.add(rb1B);
		btGroup1.add(rb1C);
		btGroup1.add(rb1D);
		btGroup1.add(rb1E);
		lbimg1.setBounds(300, 100, 150, 150);
		lbimg8.setBounds(300, 0, 200, 200);
		lbimg15.setBounds(300, 0, 200, 200);
		lb1.setBounds(20, 250, 600, 35);
		rb1A.setBounds(20, 300, 200, 35);
		rb1B.setBounds(20, 350, 200, 35);
		rb1C.setBounds(20, 400, 200, 35);
		rb1D.setBounds(20, 450, 250, 35);
		rb1E.setBounds(20, 500, 230, 35);
		btConf1.setBounds(150, 550, 450, 30);
		lbr1.setBounds(15, 40, 750, 35);
		lb1.setFont(new Font("Papyrus", Font.BOLD, 25));
		lb1.setBackground(new Color(0, 134, 139));
		rb1A.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb1B.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb1C.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb1D.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb1E.setFont(new Font("Papyrus", Font.BOLD, 20));
		lbr1.setFont(new Font("Papyrus", Font.BOLD, 20));

		panel1.add(lb1);
		panel1.add(rb1A);
		panel1.add(rb1B);
		panel1.add(rb1C);
		panel1.add(rb1D);
		panel1.add(rb1E);
		panel1.add(btConf1);
		panel1.add(lbimg1);
		panel1.add(lbimg8);
		panel1.add(lbr1);
		panel1.add(lbimg15);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.black);
		img2 = new ImageIcon("Imagens\\palmeiras.jpeg");
		lbimg2 = new JLabel(img2);
		img9 = new ImageIcon("Imagens\\interrogacao.png");
		lbimg9 = new JLabel(img9);
		img16 = new ImageIcon("Imagens\\x.png");
		lbimg16 = new JLabel(img16);
		lbimg16.setVisible(false);
		lbimg2.setVisible(false);
		lb2 = new JLabel("Quem é o atual campeão da Libertadores?");
		lb2.setForeground(new Color(0, 134, 139));
		
		rb2A = new JRadioButton("Palmeiras");
		rb2A.setForeground(new Color(0, 134, 139));
		rb2A.setBackground(Color.black);
		
		rb2B = new JRadioButton("Flamengo");
		rb2B.setForeground(new Color(0, 134, 139));
		rb2B.setBackground(Color.black);
		
		rb2C = new JRadioButton("São Paulo");
		rb2C.setForeground(new Color(0, 134, 139));
		rb2C.setBackground(Color.black);
		
		rb2D = new JRadioButton("Boca Junior");
		rb2D.setForeground(new Color(0, 134, 139));
		rb2D.setBackground(Color.black);
		
		rb2E = new JRadioButton("River Plate");
		rb2E.setForeground(new Color(0, 134, 139));
		rb2E.setBackground(Color.black);
		
		btConf2 = new JButton("Confirmar resposta");
		btConf2.setFont(new Font("Papyrus", Font.BOLD, 20));
		btConf2.setForeground(new Color(0, 134, 139));
		btConf2.setBackground(Color.black);
		
		lbr2 = new JLabel(
				"Sim! o Palmeiras é o atual campeão da Libertadores ");
		lbr2.setForeground(new Color(0, 134, 139));
		lbr2.setVisible(false);
		btGroup2 = new ButtonGroup();
		btGroup2.add(rb2A);
		btGroup2.add(rb2B);
		btGroup2.add(rb2C);
		btGroup2.add(rb2D);
		btGroup2.add(rb2E);
		lbimg2.setBounds(300, 100, 150, 150);
		lbimg9.setBounds(300, 0, 200, 200);
		lbimg16.setBounds(300, 0, 200, 200);
		lb2.setBounds(20, 250, 600, 35);
		rb2A.setBounds(20, 300, 200, 35);
		rb2B.setBounds(20, 350, 200, 35);
		rb2C.setBounds(20, 400, 200, 35);
		rb2D.setBounds(20, 450, 200, 35);
		rb2E.setBounds(20, 500, 200, 35);
		btConf2.setBounds(150, 550, 450, 30);
		lbr2.setBounds(100, 40, 800, 25);
		lb2.setFont(new Font("Papyrus", Font.BOLD, 25));
		lbr2.setFont(new Font("Papyrus", Font.BOLD, 20));
		lb2.setBackground(new Color(0, 134, 139));
		rb2A.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb2B.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb2C.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb2D.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb2E.setFont(new Font("Papyrus", Font.BOLD, 20));

		panel2.add(lb2);
		panel2.add(rb2A);
		panel2.add(rb2B);
		panel2.add(rb2C);
		panel2.add(rb2D);
		panel2.add(rb2E);
		panel2.add(btConf2);
		panel2.add(lbimg2);
		panel2.add(lbimg9);
		panel2.add(lbr2);
		panel2.add(lbimg16);

		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.black);
		img3 = new ImageIcon("Imagens\\italia.png");
		lbimg3 = new JLabel(img3);
		img10 = new ImageIcon("Imagens\\interrogacao.png");
		lbimg10 = new JLabel(img10);
		img17 = new ImageIcon("Imagens\\x.png");
		lbimg17 = new JLabel(img17);
		lbimg17.setVisible(false);
		lbimg3.setVisible(false);
		lb3 = new JLabel("Qual foi a seleção campeã da Copa do Mundo de 2006?");
		lb3.setForeground(new Color(0, 134, 139));
		
		rb3A = new JRadioButton("França");
		rb3A.setForeground(new Color(0, 134, 139));
		rb3A.setBackground(Color.black);
		
		rb3B = new JRadioButton("Brasil");
		rb3B.setForeground(new Color(0, 134, 139));
		rb3B.setBackground(Color.black);
		
		rb3C = new JRadioButton("Itália");
		rb3C.setForeground(new Color(0, 134, 139));
		rb3C.setBackground(Color.black);
		
		rb3D = new JRadioButton("Inglaterra");
		rb3D.setForeground(new Color(0, 134, 139));
		rb3D.setBackground(Color.black);
		
		rb3E = new JRadioButton("Portugal");
		rb3E.setForeground(new Color(0, 134, 139));
		rb3E.setBackground(Color.black);
		
		btConf3 = new JButton("Confirmar resposta");
		btConf3.setFont(new Font("Papyrus", Font.BOLD, 20));
		btConf3.setForeground(new Color(0, 134, 139));
		btConf3.setBackground(Color.black);
		
		lbr3 = new JLabel("Isso mesmo! a Itália foi a seleção campeã da copa de 2006.");
		lbr3.setForeground(new Color(0, 134, 139));
		lbr3.setVisible(false);
		btGroup3 = new ButtonGroup();
		btGroup3.add(rb3A);
		btGroup3.add(rb3B);
		btGroup3.add(rb3C);
		btGroup3.add(rb3D);
		btGroup3.add(rb3E);
		lbimg3.setBounds(300, 70, 180, 180);
		lbimg10.setBounds(300, 0, 200, 200);
		lbimg17.setBounds(300, 0, 200, 200);
		lb3.setBounds(20, 250, 700, 35);
		rb3A.setBounds(20, 300, 200, 35);
		rb3B.setBounds(20, 350, 200, 35);
		rb3C.setBounds(20, 400, 200, 35);
		rb3D.setBounds(20, 450, 200, 35);
		rb3E.setBounds(20, 500, 200, 35);
		btConf3.setBounds(150, 550, 450, 30);
		lbr3.setBounds(100, 40, 850, 25);
		lb3.setFont(new Font("Papyrus", Font.BOLD, 25));
		lbr3.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb3A.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb3B.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb3C.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb3D.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb3E.setFont(new Font("Papyrus", Font.BOLD, 20));

		panel3.add(lb3);
		panel3.add(rb3A);
		panel3.add(rb3B);
		panel3.add(rb3C);
		panel3.add(rb3D);
		panel3.add(rb3E);
		panel3.add(btConf3);
		panel3.add(lbimg3);
		panel3.add(lbimg10);
		panel3.add(lbr3);
		panel3.add(lbimg17);

		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(Color.black);
		img4 = new ImageIcon("Imagens\\sergi-roberto.png");
		lbimg4 = new JLabel(img4);
		img11 = new ImageIcon("Imagens\\interrogacao.png");
		lbimg11 = new JLabel(img11);
		img18 = new ImageIcon("Imagens\\x.png");
		lbimg18 = new JLabel(img18);
		lbimg18.setVisible(false);
		lbimg4.setVisible(false);
		lb4 = new JLabel("Quem fez o gol da classificação do Barcelona contra o Paris Saint German em 2017?");
		lb4.setForeground(new Color(0, 134, 139));
		
		rb4A = new JRadioButton("Pique");
		rb4A.setForeground(new Color(0, 134, 139));
		rb4A.setBackground(Color.black);
		
		rb4B = new JRadioButton("Neymar");
		rb4B.setForeground(new Color(0, 134, 139));
		rb4B.setBackground(Color.black);
		
		rb4C = new JRadioButton("Messi");
		rb4C.setForeground(new Color(0, 134, 139));
		rb4C.setBackground(Color.black);
		
		rb4D = new JRadioButton("Sergi Roberto");
		rb4D.setForeground(new Color(0, 134, 139));
		rb4D.setBackground(Color.black);
		
		rb4E = new JRadioButton("Luis Suarez");
		rb4E.setForeground(new Color(0, 134, 139));
		rb4E.setBackground(Color.black);
		
		btConf4 = new JButton("Confirmar resposta");
		btConf4.setFont(new Font("Papyrus", Font.BOLD, 20));
		btConf4.setForeground(new Color(0, 134, 139));
		btConf4.setBackground(Color.black);
		
		lbr4 = new JLabel(
				"Sim!Sergi Roberto foi o autor do gol da classificação do Barcelona sobre o PSG. ");
		lbr4.setForeground(new Color(0, 134, 139));
		lbr4.setVisible(false);
		
		btGroup4 = new ButtonGroup();
		btGroup4.add(rb4A);
		btGroup4.add(rb4B);
		btGroup4.add(rb4C);
		btGroup4.add(rb4D);
		btGroup4.add(rb4E);
		lbimg4.setBounds(300, 100, 150, 150);
		lbimg11.setBounds(300, 0, 200, 200);
		lbimg18.setBounds(300, 0, 200, 200);
		lb4.setBounds(20, 250, 800, 35);
		rb4A.setBounds(20, 300, 200, 35);
		rb4B.setBounds(20, 350, 200, 35);
		rb4C.setBounds(20, 400, 200, 35);
		rb4D.setBounds(20, 450, 200, 35);
		rb4E.setBounds(20, 500, 200, 35);
		btConf4.setBounds(150, 550, 450, 30);
		lbr4.setBounds(25, 40, 900, 25);
		lbr4.setFont(new Font("Papyrus", Font.BOLD, 20));
		lb4.setFont(new Font("Papyrus", Font.BOLD, 18));
		rb4A.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb4B.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb4C.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb4D.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb4E.setFont(new Font("Papyrus", Font.BOLD, 20));

		panel4.add(lb4);
		panel4.add(rb4A);
		panel4.add(rb4B);
		panel4.add(rb4C);
		panel4.add(rb4D);
		panel4.add(rb4E);
		panel4.add(btConf4);
		panel4.add(lbimg4);
		panel4.add(lbimg11);
		panel4.add(lbr4);
		panel4.add(lbimg18);

		panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBackground(Color.black);
		img5 = new ImageIcon("Imagens\\gotze.png");
		lbimg5 = new JLabel(img5);
		img12 = new ImageIcon("Imagens\\interrogacao.png");
		lbimg12 = new JLabel(img12);
		img19 = new ImageIcon("Imagens\\x.png");
		lbimg19 = new JLabel(img19);
		lbimg19.setVisible(false);
		lbimg5.setVisible(false);
		lb5 = new JLabel("Qual jogador fez o gol da final da Copa do Mundo de 2014?");
		lb5.setForeground(new Color(0, 134, 139));
		
		rb5A = new JRadioButton("Thomas Muller");
		rb5A.setForeground(new Color(0, 134, 139));
		rb5A.setBackground(Color.black);
		
		rb5B = new JRadioButton("Mario Gotze");
		rb5B.setForeground(new Color(0, 134, 139));
		rb5B.setBackground(Color.black);
		
		rb5C = new JRadioButton("Toni Kross");
		rb5C.setForeground(new Color(0, 134, 139));
		rb5C.setBackground(Color.black);
		
		rb5D = new JRadioButton("Manuel Neuer");
		rb5D.setForeground(new Color(0, 134, 139));
		rb5D.setBackground(Color.black);
		
		rb5E = new JRadioButton("Philipp Lahm");
		rb5E.setForeground(new Color(0, 134, 139));
		rb5E.setBackground(Color.black);
		
		btConf5 = new JButton("Confirmar resposta");
		btConf5.setFont(new Font("Papyrus", Font.BOLD, 20));
		btConf5.setForeground(new Color(0, 134, 139));
		btConf5.setBackground(Color.black);
		
		lbr5 = new JLabel(
				"Isso! Mario Gotze foi o autor do gol que deu o título da copa de 2014.");
		lbr5.setForeground(new Color(0, 134, 139));
		lbr5.setVisible(false);
		btGroup5 = new ButtonGroup();
		btGroup5.add(rb5A);
		btGroup5.add(rb5B);
		btGroup5.add(rb5C);
		btGroup5.add(rb5D);
		btGroup5.add(rb5E);
		lbimg5.setBounds(300, 100, 150, 150);
		lbimg12.setBounds(300, 0, 200, 200);
		lbimg19.setBounds(300, 0, 200, 200);
		lb5.setBounds(20, 250, 700, 35);
		rb5A.setBounds(20, 300, 200, 35);
		rb5B.setBounds(20, 350, 200, 35);
		rb5C.setBounds(20, 400, 200, 35);
		rb5D.setBounds(20, 450, 200, 35);
		rb5E.setBounds(20, 500, 200, 35);
		btConf5.setBounds(150, 550, 450, 30);
		lbr5.setBounds(45, 40, 650, 25);
		lb5.setFont(new Font("Papyrus", Font.BOLD, 25));
		lbr5.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb5A.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb5B.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb5C.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb5D.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb5E.setFont(new Font("Papyrus", Font.BOLD, 20));

		panel5.add(lb5);
		panel5.add(rb5A);
		panel5.add(rb5B);
		panel5.add(rb5C);
		panel5.add(rb5D);
		panel5.add(rb5E);
		panel5.add(btConf5);
		panel5.add(lbimg5);
		panel5.add(lbimg12);
		panel5.add(lbr5);
		panel5.add(lbimg19);

		panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBackground(Color.black);
		img6 = new ImageIcon("Imagens\\bruno-fernandes.png");
		lbimg6 = new JLabel(img6);
		img13 = new ImageIcon("Imagens\\interrogacao.png");
		lbimg13 = new JLabel(img13);
		img20 = new ImageIcon("Imagens\\x.png");
		lbimg20 = new JLabel(img20);
		lbimg20.setVisible(false);
		lbimg6.setVisible(false);
		lb6 = new JLabel("Qual jogador ganhou 4x o prêmio de melhor jogador da Premier League em um ano?");
		lb6.setForeground(new Color(0, 134, 139));
		
		rb6A = new JRadioButton("Cristiano Ronaldo");
		rb6A.setForeground(new Color(0, 134, 139));
		rb6A.setBackground(Color.black);
		
		rb6B = new JRadioButton("Pepe");
		rb6B.setForeground(new Color(0, 134, 139));
		rb6B.setBackground(Color.black);
		
		rb6C = new JRadioButton("Bernardo Silva");
		rb6C.setForeground(new Color(0, 134, 139));
		rb6C.setBackground(Color.black);
		
		rb6D = new JRadioButton("Rui Patrício");
		rb6D.setForeground(new Color(0, 134, 139));
		rb6D.setBackground(Color.black);
		
		rb6E = new JRadioButton("Bruno Fernandes");
		rb6E.setForeground(new Color(0, 134, 139));
		rb6E.setBackground(Color.black);
		
		btConf6 = new JButton("Confirmar resposta");
		btConf6.setFont(new Font("Papyrus", Font.BOLD, 20));
		btConf6.setForeground(new Color(0, 134, 139));
		btConf6.setBackground(Color.black);
		
		lbr6 = new JLabel(
				"Correto! Bruno Fernandes conquistou 4x o prêmio.");
		lbr6.setForeground(new Color(0, 134, 139));
		lbr6.setVisible(false);
		btGroup6 = new ButtonGroup();
		btGroup6.add(rb6A);
		btGroup6.add(rb6B);
		btGroup6.add(rb6C);
		btGroup6.add(rb6D);
		btGroup6.add(rb6E);
		lbimg6.setBounds(300, 100, 150, 150);
		lbimg13.setBounds(300, 0, 200, 200);
		lbimg20.setBounds(300, 0, 200, 200);
		lb6.setBounds(20, 250, 750, 35);
		rb6A.setBounds(20, 300, 200, 35);
		rb6B.setBounds(20, 350, 200, 35);
		rb6C.setBounds(20, 400, 200, 35);
		rb6D.setBounds(20, 450, 200, 35);
		rb6E.setBounds(20, 500, 200, 35);
		btConf6.setBounds(150, 550, 450, 30);
		lbr6.setBounds(100, 40, 900, 25);
		lb6.setFont(new Font("Papyrus", Font.BOLD, 20));
		lbr6.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb6A.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb6B.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb6C.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb6D.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb6E.setFont(new Font("Papyrus", Font.BOLD, 20));

		panel6.add(lb6);
		panel6.add(rb6A);
		panel6.add(rb6B);
		panel6.add(rb6C);
		panel6.add(rb6D);
		panel6.add(rb6E);
		panel6.add(btConf6);
		panel6.add(lbimg6);
		panel6.add(lbimg13);
		panel6.add(lbr6);
		panel6.add(lbimg20);

		panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBackground(Color.black);
		img7 = new ImageIcon("Imagens\\kaka.png");
		lbimg7 = new JLabel(img7);
		img14 = new ImageIcon("Imagens\\interrogacao.png");
		lbimg14 = new JLabel(img14);
		img21 = new ImageIcon("Imagens\\x.png");
		lbimg21 = new JLabel(img21);
		lbimg21.setVisible(false);
		lbimg7.setVisible(false);
		lb7 = new JLabel("Quem foi o último brasileiro a ganhar o prêmio de melhor jogador do mundo?");
		lb7.setForeground(new Color(0, 134, 139));
		
		rb7A = new JRadioButton("Ronaldinho Gaucho");
		rb7A.setForeground(new Color(0, 134, 139));
		rb7A.setBackground(Color.black);
		
		rb7B = new JRadioButton("Neymar");
		rb7B.setForeground(new Color(0, 134, 139));
		rb7B.setBackground(Color.black);
		
		rb7C = new JRadioButton("Kaká");
		rb7C.setForeground(new Color(0, 134, 139));
		rb7C.setBackground(Color.black);
		
		rb7D = new JRadioButton("Ronaldo Fenômeno");
		rb7D.setForeground(new Color(0, 134, 139));
		rb7D.setBackground(Color.black);
		
		rb7E = new JRadioButton("Adriano Imperador");
		rb7E.setForeground(new Color(0, 134, 139));
		rb7E.setBackground(Color.black);
		
		btConf7 = new JButton("Confirmar resposta");
		btConf7.setFont(new Font("Papyrus", Font.BOLD, 20));
		btConf7.setForeground(new Color(0, 134, 139));
		btConf7.setBackground(Color.black);
		
		lbr7 = new JLabel(
				"Sim! Kaká foi o último BR que conquistou o prêmio de melhor do mundo.");
		lbr7.setForeground(new Color(0, 134, 139));
		lbr7.setVisible(false);
		btGroup7 = new ButtonGroup();
		btGroup7.add(rb7A);
		btGroup7.add(rb7B);
		btGroup7.add(rb7C);
		btGroup7.add(rb7D);
		btGroup7.add(rb7E);
		lbimg7.setBounds(300, 100, 150, 150);
		lbimg14.setBounds(300, 0, 200, 200);
		lbimg21.setBounds(300, 0, 200, 200);
		lb7.setBounds(20, 250, 750, 35);
		rb7A.setBounds(20, 300, 300, 35);
		rb7B.setBounds(20, 350, 300, 35);
		rb7C.setBounds(20, 400, 300, 35);
		rb7D.setBounds(20, 450, 300, 35);
		rb7E.setBounds(20, 500, 300, 35);
		btConf7.setBounds(150, 550, 450, 30);
		lbr7.setBounds(90, 40, 650, 25);
		lb7.setFont(new Font("Papyrus", Font.BOLD, 22));
		lbr7.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb7A.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb7B.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb7C.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb7D.setFont(new Font("Papyrus", Font.BOLD, 20));
		rb7E.setFont(new Font("Papyrus", Font.BOLD, 20));

		panel7.add(lb7);
		panel7.add(rb7A);
		panel7.add(rb7B);
		panel7.add(rb7C);
		panel7.add(rb7D);
		panel7.add(rb7E);
		panel7.add(btConf7);
		panel7.add(lbimg7);
		panel7.add(lbimg14);
		panel7.add(lbr7);
		panel7.add(lbimg21);

		panelPontuacao = new JPanel();
		panelPontuacao.setLayout(null);
		panelPontuacao.setBackground(Color.black);
		lbPontos = new JLabel();
		lbPontos.setForeground(new Color(0, 134, 139));
		btVerPontuacao = new JButton("Ver Pontuação");
		
		img22 = new ImageIcon("Imagens\\bola-logo.png");
		lbimg22 = new JLabel(img22);
		btVerPontuacao.setBounds(150, 200, 450, 30);
		btVerPontuacao.setFont(new Font("Papyrus", Font.BOLD, 20));
		btVerPontuacao.setForeground(new Color(0, 134, 139));
		btVerPontuacao.setBackground(Color.black);
		
		lbPontos.setBounds(150, 100, 750, 45);
		lbimg22.setBounds(250, 250, 250, 250);
		panelPontuacao.add(lbPontos);
		panelPontuacao.add(btVerPontuacao);
		panelPontuacao.add(lbimg22);
		lbPontos.setFont(new Font("Papyrus", Font.BOLD, 28));

		tpAbas = new JTabbedPane();
		tpAbas.addTab("Bem vindo", panelInicio);
		tpAbas.addTab("Questão 1", panel1);
		tpAbas.addTab("Questão 2", panel2);
		tpAbas.addTab("Questão 3", panel3);
		tpAbas.addTab("Questão 4", panel4);
		tpAbas.addTab("Questão 5", panel5);
		tpAbas.addTab("Questão 6", panel6);
		tpAbas.addTab("Questão 7", panel7);
		tpAbas.addTab("Pontuação", panelPontuacao);

		tpAbas.setBounds(0, 0, 800, 700);

		add(tpAbas);
	}

	private void DefinirEventos() {
		btConf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rb1A.isSelected()) {
					lbimg1.setVisible(false);
					lbimg8.setVisible(false);
					lbr1.setVisible(false);
					lbimg15.setVisible(true);
				}
				if (rb1B.isSelected()) {
					lbimg1.setVisible(false);
					lbimg8.setVisible(false);
					lbr1.setVisible(false);
					lbimg15.setVisible(true);
				}
				if (rb1C.isSelected()) {
					lbimg1.setVisible(false);
					lbimg8.setVisible(false);
					lbr1.setVisible(false);
					lbimg15.setVisible(true);
				}
				if (rb1D.isSelected()) {
					Pontos += 1;
					lbimg8.setVisible(false);
					lbimg15.setVisible(false);
					lbimg1.setVisible(true);
					lbr1.setVisible(true);
				}
				if (rb1E.isSelected()) {
					lbimg1.setVisible(false);
					lbimg8.setVisible(false);
					lbr1.setVisible(false);
					lbimg15.setVisible(true);
				}

			}
		});
		btConf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rb2A.isSelected()) {
					Pontos += 1;

					lbimg9.setVisible(false);
					lbimg16.setVisible(false);
					lbimg2.setVisible(true);
					lbr2.setVisible(true);
				}
				if (rb2B.isSelected()) {
					lbimg2.setVisible(false);
					lbimg9.setVisible(false);
					lbr2.setVisible(false);
					lbimg16.setVisible(true);
				}
				if (rb2C.isSelected()) {
					lbimg2.setVisible(false);
					lbimg9.setVisible(false);
					lbr2.setVisible(false);
					lbimg16.setVisible(true);
				}
				if (rb2D.isSelected()) {
					lbimg2.setVisible(false);
					lbimg9.setVisible(false);
					lbr2.setVisible(false);
					lbimg16.setVisible(true);
				}
				if (rb2E.isSelected()) {
					lbimg2.setVisible(false);
					lbimg9.setVisible(false);
					lbr2.setVisible(false);
					lbimg16.setVisible(true);
				}

			}
		});
		btConf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rb3A.isSelected()) {
					lbimg3.setVisible(false);
					lbimg10.setVisible(false);
					lbr3.setVisible(false);
					lbimg17.setVisible(true);
				}
				if (rb3B.isSelected()) {
					lbimg3.setVisible(false);
					lbimg10.setVisible(false);
					lbr3.setVisible(false);
					lbimg17.setVisible(true);
				}
				if (rb3C.isSelected()) {
					Pontos += 1;
					lbimg17.setVisible(false);
					lbimg10.setVisible(false);
					lbimg3.setVisible(true);
					lbr3.setVisible(true);
				}
				if (rb3D.isSelected()) {
					lbimg3.setVisible(false);
					lbimg10.setVisible(false);
					lbr3.setVisible(false);
					lbimg17.setVisible(true);
				}
				if (rb3E.isSelected()) {
					lbimg3.setVisible(false);
					lbimg10.setVisible(false);
					lbr3.setVisible(false);
					lbimg17.setVisible(true);
				}

			}
		});
		btConf4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rb4A.isSelected()) {
					lbimg4.setVisible(false);
					lbimg11.setVisible(false);
					lbr4.setVisible(false);
					lbimg18.setVisible(true);
				}
				if (rb4B.isSelected()) {
					lbimg4.setVisible(false);
					lbimg11.setVisible(false);
					lbr4.setVisible(false);
					lbimg18.setVisible(true);
				}
				if (rb4C.isSelected()) {
					lbimg4.setVisible(false);
					lbimg11.setVisible(false);
					lbr4.setVisible(false);
					lbimg18.setVisible(true);
				}
				if (rb4D.isSelected()) {
					Pontos += 1;
					lbimg11.setVisible(false);
					lbimg18.setVisible(false);
					lbimg4.setVisible(true);
					lbr4.setVisible(true);
				}
				if (rb4E.isSelected()) {
					lbimg4.setVisible(false);
					lbimg11.setVisible(false);
					lbr4.setVisible(false);
					lbimg18.setVisible(true);
				}

			}
		});
		btConf5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rb5A.isSelected()) {
					lbimg5.setVisible(false);
					lbimg12.setVisible(false);
					lbr5.setVisible(false);
					lbimg19.setVisible(true);
				}
				if (rb5B.isSelected()) {
					Pontos += 1;
					lbimg19.setVisible(false);
					lbimg12.setVisible(false);
					lbimg5.setVisible(true);
					lbr5.setVisible(true);
				}
				if (rb5C.isSelected()) {
					lbimg5.setVisible(false);
					lbimg12.setVisible(false);
					lbr5.setVisible(false);
					lbimg19.setVisible(true);
				}
				if (rb5D.isSelected()) {
					lbimg5.setVisible(false);
					lbimg12.setVisible(false);
					lbr5.setVisible(false);
					lbimg19.setVisible(true);
				}
				if (rb5E.isSelected()) {
					lbimg5.setVisible(false);
					lbimg12.setVisible(false);
					lbr5.setVisible(false);
					lbimg19.setVisible(true);
				}

			}
		});
		btConf6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rb6A.isSelected()) {
					lbimg6.setVisible(false);
					lbimg13.setVisible(false);
					lbr6.setVisible(false);
					lbimg20.setVisible(true);
				}
				if (rb6B.isSelected()) {
					lbimg6.setVisible(false);
					lbimg13.setVisible(false);
					lbr6.setVisible(false);
					lbimg20.setVisible(true);
				}
				if (rb6C.isSelected()) {
					lbimg6.setVisible(false);
					lbimg13.setVisible(false);
					lbr6.setVisible(false);
					lbimg20.setVisible(true);
				}
				if (rb6D.isSelected()) {
					lbimg6.setVisible(false);
					lbimg13.setVisible(false);
					lbr6.setVisible(false);
					lbimg20.setVisible(true);
				}
				if (rb6E.isSelected()) {
					Pontos += 1;
					lbimg13.setVisible(false);
					lbimg20.setVisible(false);
					lbimg6.setVisible(true);
					lbr6.setVisible(true);
				}
			}
		});
		btConf7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rb7A.isSelected()) {
					lbimg7.setVisible(false);
					lbimg14.setVisible(false);
					lbr7.setVisible(false);
					lbimg21.setVisible(true);
				}
				if (rb7B.isSelected()) {
					lbimg7.setVisible(false);
					lbimg14.setVisible(false);
					lbr7.setVisible(false);
					lbimg21.setVisible(true);
				}
				if (rb7C.isSelected()) {
					Pontos += 1;
					lbimg21.setVisible(false);
					lbimg14.setVisible(false);
					lbimg7.setVisible(true);
					lbr7.setVisible(true);
				}
				if (rb7D.isSelected()) {
					lbimg7.setVisible(false);
					lbimg14.setVisible(false);
					lbr7.setVisible(false);
					lbimg21.setVisible(true);
				}
				if (rb7E.isSelected()) {
					lbimg7.setVisible(false);
					lbimg14.setVisible(false);
					lbr7.setVisible(false);
					lbimg21.setVisible(true);
				}

			}
		});
		btVerPontuacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbPontos.setText(txNome.getText() + " sua pontuação no QUIZ foi " + Pontos);
			}
		});

	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Quiz Futebol");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Aula04());
		frame.setBounds(0, 0, 800, 700);
		frame.setVisible(true);
	}

}
