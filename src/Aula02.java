import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aula02 extends JPanel {

	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lbResp;
	JButton btCalcular;
	JTextField tx1, tx2, tx3, tx4, tx5, tx6;
	ImageIcon img1, img2;

	public Aula02() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		
		
		//Feito por: Sidney Santos
		
		setLayout(null);
		setBackground(Color.black);

		lb1 = new JLabel("Nome:");
		lb1.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		tx1 = new JTextField("");

		lb2 = new JLabel("Número:");
		lb2.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		tx2 = new JTextField("");

		lb3 = new JLabel("Turma:");
		lb3.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		tx3 = new JTextField("");

		lb4 = new JLabel("Nota 1:");
		lb4.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		tx4 = new JTextField("");

		lb5 = new JLabel("Nota 2:");
		lb5.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		tx5 = new JTextField("");

		lb6 = new JLabel("Nota 3:");
		lb6.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		tx6 = new JTextField("");

		btCalcular = new JButton("Calcular");

		lbResp = new JLabel("");
		lbResp.setVisible(false);

		img2 = new ImageIcon("");
		lb8 = new JLabel(img2);

		lb1.setBounds(10, 10, 100, 30);
		lb2.setBounds(0, 45, 100, 25);
		lb3.setBounds(210, 45, 100, 25);
		lb4.setBounds(7, 80, 100, 25);
		lb5.setBounds(160, 80, 100, 25);
		lb6.setBounds(305, 80, 100, 25);

		lb8.setBounds(180, 200, 90, 70);
		lb8.setVisible(false);

		tx1.setBounds(75, 10, 355, 25);
		tx2.setBounds(75, 45, 120, 25);
		tx3.setBounds(280, 45, 150, 25);
		tx4.setBounds(75, 80, 75, 25);
		tx5.setBounds(225, 80, 75, 25);
		tx6.setBounds(370, 80, 60, 25);

		btCalcular.setBounds(180, 130, 100, 30);
		btCalcular.setBackground(Color.white);
		btCalcular.setForeground(Color.black);
		btCalcular.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		

		lbResp.setBounds(10, 170, 500, 35);
		lbResp.setForeground(Color.white);
		lbResp.setFont(new Font("Lucida Sans", Font.BOLD, 14));

		lb1.setForeground(Color.white);
		lb2.setForeground(Color.white);
		lb3.setForeground(Color.white);
		lb4.setForeground(Color.white);
		lb5.setForeground(Color.white);
		lb6.setForeground(Color.white);

		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(lb6);
		add(lb8);
		add(lbResp);

		add(tx1);
		add(tx2);
		add(tx3);
		add(tx4);
		add(tx5);
		add(tx6);

		add(btCalcular);
	}

	public void definirEventos() {

		btCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lbResp.setVisible(true);

				double media1 = Double.parseDouble(tx4.getText());
				double media2 = Double.parseDouble(tx5.getText());
				double media3 = Double.parseDouble(tx6.getText());

				double media = media1 + media2 + media3;
				double mediaFinal = media / 3;
				double m = Math.round(mediaFinal);
				if (mediaFinal >= 6.0) {
					String.valueOf(mediaFinal);
					lbResp.setText("O aluno(a) " + tx1.getText() + " da turma " + tx3.getText()
							+ " está APROVADO(A) com média " + m);
					lb8.setVisible(true);
					img2 = new ImageIcon("Imagens\\feliz.png");
					lb8.setIcon(img2);
				}
				if (mediaFinal <= 5.9 && mediaFinal >= 4.0) {
					String.valueOf(mediaFinal);
					lbResp.setText("O aluno(a) " + tx1.getText() + " da turma " + tx3.getText()
							+ " está de RECUPERAÇÃO com média " + mediaFinal);
					lb8.setVisible(true);
					img2 = new ImageIcon("Imagens\\confuso.png");
					lb8.setIcon(img2);
				}
				if (mediaFinal <= 3.9) {
					String.valueOf(mediaFinal);
					lbResp.setText("O aluno(a) " + tx1.getText() + " da turma" + tx3.getText()
							+ " está REPROVADO(A) com média " + mediaFinal);
					lb8.setVisible(true);
					img2 = new ImageIcon("Imagens\\bravo.png");
					lb8.setIcon(img2);
				}

			}
		});
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Média do Aluno");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Aula02());
		frame.setBounds(250, 250, 500, 330);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}