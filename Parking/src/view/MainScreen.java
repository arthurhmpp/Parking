package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainScreen extends JFrame implements ActionListener{
	private JButton btnGetin;
	private JButton btnGetout;
	
	//TODO 	retirar na nora da entraga
	
	public static void main(String[] args) {
		MainScreen screen = new MainScreen();
		screen.setVisible(true);
	}
	
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(450,300));
		setResizable(false);
		setTitle("Sistema de Estacionamento ");
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		btnGetin = new JButton("");
		btnGetin.setIcon(new ImageIcon(MainScreen.class.getResource("/resource/getin.png")));
		btnGetin.addActionListener(this);
		btnGetin.setActionCommand("entrada");
		getContentPane().add(btnGetin);
		
		btnGetout = new JButton("");
		btnGetout.setIcon(new ImageIcon(MainScreen.class.getResource("/resource/getout.png")));
		btnGetout.addActionListener(this);
		btnGetout.setActionCommand("saida");
		getContentPane().add(btnGetout);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		JFrame screen = null;
		
		if(cmd.equals("entrada")) {
			screen = new CheckinVehicleScreen(this);
		}else {
			screen = new CheckoutVehicleScreen(this);
		}
		
		screen.setVisible(true);
		this.setVisible(false);
	}

}
