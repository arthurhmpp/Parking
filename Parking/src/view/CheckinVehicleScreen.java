package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import controller.ParkingController;
import controller.ParkingException;
import controller.VehicleException;

public class CheckinVehicleScreen extends JFrame implements ActionListener{
	
	private JFrame parent;
	private JTextField txtBrandCar;
	private JTextField txtModel;
	private JTextField txtColor;
	private JFormattedTextField tfLicensePlate;
	private JButton btnOk;
	private JButton btnCancel; 
	
	public static void main(String[] args) {
		CheckinVehicleScreen screen = new CheckinVehicleScreen(null);
		screen.setVisible(true);		
	}
	

	public CheckinVehicleScreen(JFrame parent) {
		setResizable(false);
		setSize(400,300);
		setTitle("Entrada de veiculo");
		this.parent = parent;
		getContentPane().setLayout(null);
		
		JLabel lblLicensePlate = new JLabel("Placa:");
		lblLicensePlate.setBounds(108, 51, 70, 15);
		getContentPane().add(lblLicensePlate);
		
		JLabel lblBrandCar = new JLabel("Marca:");
		lblBrandCar.setBounds(108, 78, 70, 15);
		getContentPane().add(lblBrandCar);
		
		JLabel lblModel = new JLabel("Modelo:");
		lblModel.setBounds(108, 105, 70, 15);
		getContentPane().add(lblModel);
		
		JLabel lblColor = new JLabel("Cor:");
		lblColor.setBounds(108, 132, 70, 15);
		getContentPane().add(lblColor);
		
		txtBrandCar = new JTextField();
		txtBrandCar.setBounds(201, 132, 114, 19);
		getContentPane().add(txtBrandCar);
		txtBrandCar.setColumns(10);
		
		txtModel = new JTextField();
		txtModel.setBounds(201, 105, 114, 19);
		getContentPane().add(txtModel);
		txtModel.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.setBounds(201, 79, 114, 19);
		getContentPane().add(txtColor);
		txtColor.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(59, 189, 117, 25);
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		getContentPane().add(btnOk);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(221, 189, 117, 25);
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("cancel");
		getContentPane().add(btnCancel);
		
		try {
			tfLicensePlate = new JFormattedTextField(new MaskFormatter("UUU-####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			assert false : "Padrão de placa errada!";
		}
		tfLicensePlate.setBounds(201, 51, 114, 19);
		getContentPane().add(tfLicensePlate);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("ok")) {
			ParkingController controller = new ParkingController();
			try {
				controller.checkin(tfLicensePlate.getText(), txtBrandCar.getText(), txtModel.getText(), txtColor.getText());
				JOptionPane.showMessageDialog(null, "Veiculo registrado com sucesso", "Entrada de veiculo", JOptionPane.INFORMATION_MESSAGE);
			} catch (ParkingException | VehicleException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Falha na Entrada", JOptionPane.ERROR_MESSAGE);
			}
			this.parent.setVisible(true);
			this.dispose();
		}
		
		this.parent.setVisible(true);
		this.dispose();
		
	}
}
