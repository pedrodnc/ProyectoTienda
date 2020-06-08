package Clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Login {

	private JFrame frmMitienda;
	private JTextField txtNombre;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmMitienda.setVisible(true);
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
		frmMitienda = new JFrame();
		frmMitienda.getContentPane().setBackground(Color.CYAN);
		frmMitienda.getContentPane().setForeground(Color.BLACK);
		frmMitienda.setForeground(Color.LIGHT_GRAY);
		frmMitienda.setTitle("miTienda");
		frmMitienda.setBounds(100, 100, 338, 216);
		frmMitienda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMitienda.getContentPane().setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(160, 36, 116, 22);
		frmMitienda.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setBounds(160, 83, 116, 22);
		frmMitienda.getContentPane().add(txtPass);
		txtPass.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtNombre.getText().isEmpty() &&!txtPass.getText().isEmpty()) {
					UsuarioDAO uDao=new UsuarioDAO();
					Usuario u =uDao.leer(txtNombre.getText(), txtPass.getText());
					if (u==null) {
						//No se ha encontrado, (aqui ya comparamos)
					}else {
						//Ir a la ventana menu
						// Menu.setVisible.true
						VentanaUsuario frame = new VentanaUsuario();
						frame.setVisible(true);
					}
				}else {
					//Lanzar excepcion campos no completados
				}
				
			}
		});
		btnNewButton.setBounds(62, 118, 97, 25);
		frmMitienda.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar");
		btnNewButton_1.setBounds(170, 118, 97, 25);
		frmMitienda.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(55, 39, 56, 16);
		frmMitienda.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1.setBounds(52, 86, 77, 16);
		frmMitienda.getContentPane().add(lblNewLabel_1);
	}
}
