package Clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnUsuario = new JTextPane();
		txtpnUsuario.setText("Usuario:");
		txtpnUsuario.setBounds(71, 83, 59, 22);
		frame.getContentPane().add(txtpnUsuario);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Contrase\u00F1a:");
		txtpnPassword.setBounds(71, 132, 76, 22);
		frame.getContentPane().add(txtpnPassword);
		
		textField = new JTextField();
		textField.setBounds(160, 83, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 132, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario u = new Cliente();
				u.setNombreAcceso(textField.getText());
				u.setPass(textField_1.getText());
				
			}
		});
		btnNewButton.setBounds(73, 187, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar");
		btnNewButton_1.setBounds(196, 187, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
	}
}
