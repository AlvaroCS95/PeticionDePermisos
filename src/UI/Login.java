package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txt_NombreUsuario;
	private JTextField txt_Contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(108, 56, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1.setBounds(108, 96, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		txt_NombreUsuario = new JTextField();
		txt_NombreUsuario.setBounds(179, 53, 86, 20);
		contentPane.add(txt_NombreUsuario);
		txt_NombreUsuario.setColumns(10);
		
		txt_Contraseña = new JTextField();
		txt_Contraseña.setBounds(179, 93, 86, 20);
		contentPane.add(txt_Contraseña);
		txt_Contraseña.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Bienvenido: "+txt_NombreUsuario.getText()
				+"\nContraseña: "+txt_Contraseña.getText());
			}
		});
		btnIngresar.setBounds(325, 92, 89, 23);
		contentPane.add(btnIngresar);
	}
}
