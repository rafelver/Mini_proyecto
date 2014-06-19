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


public class VentanaPel extends JFrame {

	private JPanel contentPane;
	private JTextField textopelicula;
	private JTextField textogenero;
	private JTextField textoaño;
	private Peliculas pelicula;

	
	public VentanaPel(Peliculas peliculanuv) {
		pelicula=peliculanuv;
		setTitle("Ventana Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre Pelicula");
		lblNewLabel.setBounds(10, 21, 107, 14);
		contentPane.add(lblNewLabel);
		
		textopelicula = new JTextField();
		textopelicula.setBounds(117, 18, 227, 20);
		contentPane.add(textopelicula);
		textopelicula.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Genero");
		lblNewLabel_1.setBounds(10, 56, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textogenero = new JTextField();
		textogenero.setBounds(117, 53, 133, 20);
		contentPane.add(textogenero);
		textogenero.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("A\u00F1o");
		lblNewLabel_2.setBounds(10, 87, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textoaño = new JTextField();
		textoaño.setBounds(117, 84, 86, 20);
		contentPane.add(textoaño);
		textoaño.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pelicula.setnombrepel(textopelicula.getText());
				pelicula.setgeneropel(textogenero.getText());
				try{
					String año;
					int numero;
					año=textoaño.getText();
					numero=Integer.parseInt(año);
					if (numero > 1900 && numero <2020){
					pelicula.setañopel(Integer.valueOf(textoaño.getText()));
					}
					else{
					JOptionPane.showMessageDialog(null, "Año Incorrecto", "Error", JOptionPane.INFORMATION_MESSAGE); 	
					}
				}
				catch (NumberFormatException nfe)
				{
            
              JOptionPane.showMessageDialog(null, "Año Incorrecto", "Error", JOptionPane.INFORMATION_MESSAGE); 	
				}
			}
		});
		btnNewButton.setBounds(64, 189, 89, 23);
		contentPane.add(btnNewButton);
	}

}
