package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import AccesoADatos.GestorDeConeccion;
import LogicaDeNegocio.CoordinadorDeUsuarios;
import Modelos.Usuarios;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 89, 414, 173);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre del estudiante","Carne", "Hora de ingreso", "Hora de salida",
			}
		));
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			/*	try {
				CoordinadorDeUsuarios elCoordinador= new CoordinadorDeUsuarios("root", "12345");
				Usuarios elUsuario= new Usuarios("B42747","Laura" , "Garcia","Jimenez","12345");
				elCoordinador.IngresarUsuarios(elUsuario);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		});
		button.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/Editar.png")));
		button.setBounds(194, 22, 56, 46);
		contentPane.add(button);
		table.getColumnModel().getColumn(0).setPreferredWidth(119);
		table.getColumnModel().getColumn(1).setPreferredWidth(87);
		table.getColumnModel().getColumn(2).setPreferredWidth(79);
	}
}
