import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField textoopcion;
	private Ventanaprecioal frameprecio;
	private VentanaPel framepelicula;
	Precioal precio = new Precioal(); 
	Peliculas pelicula = new Peliculas();
	
	public Menu() {
		setTitle("Menu Principal Alquiler/Venta De Peliculas y Videojuegos ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1 - Alquiler Peliculas o Videojuegos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(56, 34, 295, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2 - Venta Peliculas o Videojuegos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(56, 54, 260, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3 - Modificaci\u00F3n de Precios");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(56, 76, 295, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("4 - Insertar Peliculas o Videojuegos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(56, 94, 280, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("5 - Contabilidad");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(56, 112, 295, 21);
		contentPane.add(lblNewLabel_5);
		
		textoopcion = new JTextField();
		textoopcion.setBounds(56, 170, 18, 20);
		contentPane.add(textoopcion);
		textoopcion.setColumns(10);
		
		JButton botonopcion = new JButton("Elegir Opci\u00F3n");
		botonopcion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				String textonum;
				int num;
				textonum=textoopcion.getText();
				num=Integer.parseInt(textonum);
				if (num > 0 && num <6){
					switch (num){
					case 1:
											
						break;
					case 2:
						System.out.println("hola2");
						break;
					case 3:
						abrirventanaprecios(precio);
						break;
					case 4:
						abrirventanapelicula(pelicula);
						break;
					case 5:
						System.out.println("hola5");
						break;
					}					
					}
				else{
					JOptionPane.showMessageDialog(null, "Opción Incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE); 
				}
				
				
				
				}
				catch (NumberFormatException textoopcion)
				
				{
					System.out.println("Numero erroneo");
				}
			     
				
			}
		});
		botonopcion.setBounds(84, 169, 252, 23);
		contentPane.add(botonopcion);
	}
	
	private void abrirventanaprecios(Precioal precio){
		frameprecio = new Ventanaprecioal(precio);
		frameprecio.setVisible(true);
		frameprecio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	private void abrirventanapelicula(Peliculas pelicula){
		framepelicula = new VentanaPel(pelicula);
		framepelicula.setVisible(true);
		framepelicula.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
