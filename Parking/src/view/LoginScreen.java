package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class LoginScreen extends JFrame implements ActionListener {
	
	private JPasswordField LoginTextPassword;
	private JPanel panel_2;
	private JRadioButton rdbtnOperational;
	private JRadioButton rdbtnReport;
	private JButton btnOK;
	
	//TODO remover ao entregar o projeto
	public static void main(String[] args) {
		LoginScreen screen = new LoginScreen();
		screen.setVisible(true);
	}
	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500,150));
		setResizable(false);
		setTitle("Login");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		btnOK.setActionCommand("ok");
		panel.add(btnOK);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblPassword = new JLabel("Senha:");
		panel_2.add(lblPassword);
		
		LoginTextPassword = new JPasswordField();
		LoginTextPassword.setColumns(20);
		panel_2.add(LoginTextPassword);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		
		ButtonGroup group = new ButtonGroup();
		rdbtnOperational = new JRadioButton("Operacional");
		rdbtnOperational.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnOperational.setSelected(true);
		rdbtnOperational.addActionListener(this);
		rdbtnOperational.setActionCommand("operacional");
		group.add(rdbtnOperational);
		panel_3.add(rdbtnOperational);
		
		
		rdbtnReport = new JRadioButton("Relatório");
		rdbtnReport.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnReport.addActionListener(this);
		rdbtnReport.setActionCommand("relatorio");
		group.add(rdbtnReport);
		panel_3.add(rdbtnReport);
		
		panel_2.setVisible(false);
		
		setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		String cmd = event.getActionCommand();
		JFrame LoginScreen = null;
		
		if(cmd.equals("operacional")) {
			panel_2.setVisible(false);
		}else if(cmd.equals("relatorio")) {
			LoginTextPassword.setText("");
			panel_2.setVisible(true);		
		}else if (cmd.equals("ok")) {
			if(rdbtnOperational.isSelected()) {
				LoginScreen = new MainScreen();
				LoginScreen.setVisible(true);
			}else {
				String password = new String(LoginTextPassword.getPassword());
				if(password.equals("tutu")) {
					LoginScreen = new ReportScreen();
					LoginScreen.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Senha Inválida", "Falha Login", JOptionPane.ERROR_MESSAGE);
					LoginTextPassword.setText("");
					return;
				}
			}
			this.dispose();
		}
	}
}
