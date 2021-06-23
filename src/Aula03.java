import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aula03 extends JPanel {
	JCheckBox cklanche1, cklanche2, cklanche3, ckAcom1, ckAcom2, ckAcom3, ckBebida1, ckBebida2, ckBebida3;
	JRadioButton rbCartao, rbDinheiro, rbVR;
	ButtonGroup btGroup;
	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11;
	ImageIcon img1, img2, img3, img4, img5, img6, img7, img8, img9;
	JButton btVerPreco, btFinalizar;

	public Aula03() {
		InicializarComponentes();
		DefinirEventos();
	}

	public void InicializarComponentes() {
		setLayout(null);
		setBackground(Color.orange);
		img1 = new ImageIcon("Imagens\\x-salada.png");
		lb1 = new JLabel(img1);

		img2 = new ImageIcon("Imagens\\x-burger.png");
		lb2 = new JLabel(img2);

		img3 = new ImageIcon("Imagens\\x-bacon.png");
		lb3 = new JLabel(img3);

		img4 = new ImageIcon("Imagens\\batata-frita.png");
		lb4 = new JLabel(img4);

		img5 = new ImageIcon("Imagens\\nugget.png");
		lb5 = new JLabel(img5);

		img6 = new ImageIcon("Imagens\\batata-cheddar.png");
		lb6 = new JLabel(img6);

		img7 = new ImageIcon("Imagens\\coca.png");
		lb7 = new JLabel(img7);

		img8 = new ImageIcon("Imagens\\suco.png");
		lb8 = new JLabel(img8);

		img9 = new ImageIcon("Imagens\\milk-shake.png");
		lb9 = new JLabel(img9);

		cklanche1 = new JCheckBox("X-SaladaR$18,00");
		cklanche1.setBackground(Color.orange);
		cklanche1.setFont(new Font("Lucida Sans", Font.BOLD, 14));

		cklanche2 = new JCheckBox("X-Burger R$15,00");
		cklanche2.setBackground(Color.orange);
		cklanche2.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		
		cklanche3 = new JCheckBox("X-Bacon R$20,00");
		cklanche3.setBackground(Color.orange);
		cklanche3.setFont(new Font("Lucida Sans", Font.BOLD, 14));

		ckAcom1 = new JCheckBox("Batata-Frita R$8,00");
		ckAcom1.setBackground(Color.orange);
		ckAcom1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		
		ckAcom2 = new JCheckBox("Nuggets R$10,00");
		ckAcom2.setBackground(Color.orange);
		ckAcom2.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		
		ckAcom3 = new JCheckBox("Batata com Cheddar R$11,00");
		ckAcom3.setBackground(Color.orange);
		ckAcom3.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		
		ckBebida1 = new JCheckBox("Coca R$8,00");
		ckBebida1.setBackground(Color.orange);
		ckBebida1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		
		ckBebida2 = new JCheckBox("Suco de laranja R$9,00");
		ckBebida2.setBackground(Color.orange);
		ckBebida2.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		
		ckBebida3 = new JCheckBox("Milk Shake Chocolate R$10,00");
		ckBebida3.setBackground(Color.orange);
		ckBebida3.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		
		lb10 = new JLabel("Escolha sua forma de pagamento:");
		lb10.setFont(new Font("Lucida Sans", Font.BOLD, 16));

		rbCartao = new JRadioButton("Cartão");
		rbCartao.setBackground(Color.orange);
		rbCartao.setFont(new Font("Lucida Sans", Font.BOLD, 16));

		rbDinheiro = new JRadioButton("Dinheiro");
		rbDinheiro.setBackground(Color.orange);
		rbDinheiro.setFont(new Font("Lucida Sans", Font.BOLD, 16));

		rbVR = new JRadioButton("VR");
		rbVR.setBackground(Color.orange);
		rbVR.setFont(new Font("Lucida Sans", Font.BOLD, 16));

		lb11 = new JLabel("");

		btGroup = new ButtonGroup();

		btGroup.add(rbCartao);

		btGroup.add(rbDinheiro);

		btGroup.add(rbVR);

		btVerPreco = new JButton("Ver Preço");
		btVerPreco.setBackground(Color.orange);
		btVerPreco.setForeground(Color.black);
		btVerPreco.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		
		btFinalizar = new JButton("Finalizar");
		btFinalizar.setBackground(Color.orange);
		btFinalizar.setForeground(Color.black);
		btFinalizar.setFont(new Font("Lucida Sans", Font.BOLD, 16));

		lb1.setBounds(15, 0, 150, 150);
		lb2.setBounds(225, 0, 150, 150);
		lb3.setBounds(425, 0, 150, 150);
		lb4.setBounds(20, 200, 150, 150);
		lb5.setBounds(220, 200, 150, 150);
		lb6.setBounds(430, 200, 150, 150);
		lb7.setBounds(15, 400, 150, 150);
		lb8.setBounds(200, 400, 150, 150);
		lb9.setBounds(420, 400, 150, 150);
		lb10.setBounds(600, 0,350, 150);
		lb11.setBounds(720, 300, 150, 150);

		cklanche1.setBounds(30, 120, 160, 25);
		cklanche2.setBounds(235, 120, 160, 25);
		cklanche3.setBounds(435, 120, 160, 25);

		ckAcom1.setBounds(30, 350, 170, 25);
		ckAcom2.setBounds(235, 350, 160, 25);
		ckAcom3.setBounds(405, 350, 240, 25);

		ckBebida1.setBounds(30, 540, 130, 25);
		ckBebida2.setBounds(205, 540, 190, 25);
		ckBebida3.setBounds(405, 540, 250, 25);

		rbCartao.setBounds(600, 100, 150, 25);
		rbDinheiro.setBounds(600, 150, 150, 25);
		rbVR.setBounds(600, 200, 70, 25);

		btVerPreco.setBounds(700, 250, 120, 35);
		btFinalizar.setBounds(700, 300, 120, 35);
		

		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(lb6);
		add(lb7);
		add(lb8);
		add(lb9);
		add(lb10);
		add(lb11);

		add(cklanche1);
		add(cklanche2);
		add(cklanche3);
		add(ckAcom1);
		add(ckAcom2);
		add(ckAcom3);
		add(ckBebida1);
		add(ckBebida2);
		add(ckBebida3);

		add(rbCartao);
		add(rbDinheiro);
		add(rbVR);

		add(btVerPreco);
		add(btFinalizar);
	}

	private void DefinirEventos() {
		btVerPreco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double TotalPreco = 0;
				
				if (cklanche1.isSelected()) {
					TotalPreco += 18.00;
					
				}
				if (cklanche2.isSelected()) {
					TotalPreco += 15.00;
				}
				if (cklanche3.isSelected()) {
					TotalPreco += 20.00;
				}
				if(ckAcom1.isSelected()) {
					TotalPreco += 8.00;
				}
				if(ckAcom2.isSelected()) {
					TotalPreco += 10.00;
				}
				if(ckAcom3.isSelected()) {
					TotalPreco += 11.00;
				}
				if(ckBebida1.isSelected()) {
					TotalPreco += 8.00;
				}
				if(ckBebida2.isSelected()) {
					TotalPreco += 9.00;
				}
				if(ckBebida3.isSelected()) {
					TotalPreco += 10.00;
				}
				lb11.setText("Valor Total: " + String.valueOf(TotalPreco));
			}

		});
		btFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showInternalMessageDialog(null, "Sua compra foi finalizada com sucesso.\n BOM APETITE!");
				
			}});
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Lanchonete EGS");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Aula03());
		frame.setBounds(0, 0, 1000, 700);
		frame.setVisible(true);
	}

}