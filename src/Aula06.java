import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aula06 extends JPanel {
	JProgressBar pbInstalar;
	JButton btAumentar, btDiminuir;
	JLabel lbimg1;
	ImageIcon img1;
	int andar = 40;

	public Aula06() {
		inicializarComponetes();
		definirEventos();
	}

	private void inicializarComponetes() {
		setBackground(Color.black);
		setLayout(null);
		img1 = new ImageIcon("Imagens\\baby-car.png");
		lbimg1 = new JLabel(img1);
		lbimg1.setBounds(andar, 50, 150, 120);

		pbInstalar = new JProgressBar();
		pbInstalar.setBounds(30, 150, 530, 30);
		pbInstalar.setBackground(Color.white);
		btAumentar = new JButton("Aumentar");
		btAumentar.setBounds(400, 200, 150, 35);
		btAumentar.setMnemonic('A');
		btAumentar.setForeground(Color.white);
		btAumentar.setBackground(Color.black);
		btAumentar.setFont(new Font("Papyrus", Font.BOLD, 20));
		
		btDiminuir = new JButton("Diminuir");
		btDiminuir.setBounds(50, 200, 150, 35);
		btDiminuir.setMnemonic('D');
		btDiminuir.setForeground(Color.white);
		btDiminuir.setBackground(Color.black);
		btDiminuir.setFont(new Font("Papyrus", Font.BOLD, 20));
		
		add(pbInstalar);
		add(btAumentar);
		add(btDiminuir);
		add(lbimg1);

	}

	private void definirEventos() {
		btAumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				pbInstalar.setValue(pbInstalar.getValue() + 3);
				andar += 11;
				lbimg1.setBounds(andar, 50, 150, 120);
				if (pbInstalar.getValue() < 33) {
					pbInstalar.setForeground(Color.red);
				}
				if (pbInstalar.getValue() >= 34 && pbInstalar.getValue() <= 66) {
					pbInstalar.setForeground(Color.yellow);
				}
				if (pbInstalar.getValue() >= 67) {
					pbInstalar.setForeground(Color.green);
				}
			}
		});
		btDiminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pbInstalar.setValue(pbInstalar.getValue() - 3);
				andar-=11;
				lbimg1.setBounds(andar, 50, 150, 120);
				if (pbInstalar.getValue() < 33) {
					pbInstalar.setForeground(Color.red);
				}
				if (pbInstalar.getValue() >= 34 && pbInstalar.getValue() <= 66) {
					pbInstalar.setForeground(Color.yellow);
				}
				if (pbInstalar.getValue() >= 67) {
					pbInstalar.setForeground(Color.green);
				}
			}
		});
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Corrida");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Aula06());
		frame.setBounds(300, 200, 600, 400);
		frame.setVisible(true);
	}

}