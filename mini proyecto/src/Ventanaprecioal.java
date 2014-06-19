import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.Box;


public class Ventanaprecioal extends JFrame {

	private JPanel contentPane;
	private JTextField textoprenuevnorm;
	private JTextField textoprenuevofer;
	private JTextField textopreantigunor;
	private JTextField textopreantiguofer;
	private Precioal precio;
	private JTextField textonunorventa;
	private JTextField textonueoferven;
	private JTextField textoantinorvent;
	private JTextField textoantoferventa;
	private ObjectOutputStream salida;
	private ObjectInputStream entrada;

	public Ventanaprecioal(Precioal preciomodificar) {
		precio=preciomodificar;
		setTitle("Ventana Precios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Precio Normal");
		lblNewLabel.setBounds(26, 83, 98, 14);
		contentPane.add(lblNewLabel);
		
		textoprenuevnorm = new JTextField();
		textoprenuevnorm.setBounds(26, 108, 75, 20);
		contentPane.add(textoprenuevnorm);
		textoprenuevnorm.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Precio Oferta");
		lblNewLabel_1.setBounds(26, 139, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio Nuevo");
		lblNewLabel_2.setBounds(26, 58, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textoprenuevofer = new JTextField();
		textoprenuevofer.setBounds(26, 164, 75, 20);
		contentPane.add(textoprenuevofer);
		textoprenuevofer.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Precio Antiguo");
		lblNewLabel_3.setBounds(134, 58, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Precio Normal");
		lblNewLabel_4.setBounds(134, 83, 88, 14);
		contentPane.add(lblNewLabel_4);
		
		textopreantigunor = new JTextField();
		textopreantigunor.setEnabled(false);
		textopreantigunor.setBounds(134, 108, 69, 20);
		contentPane.add(textopreantigunor);
		textopreantigunor.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Precio Oferta");
		lblNewLabel_5.setBounds(134, 139, 91, 14);
		contentPane.add(lblNewLabel_5);
		
		textopreantiguofer = new JTextField();
		textopreantiguofer.setEnabled(false);
		textopreantiguofer.setBounds(134, 164, 69, 20);
		contentPane.add(textopreantiguofer);
		textopreantiguofer.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				   precio.setPrecionormal(Float.valueOf(textoprenuevnorm.getText()));
		           precio.setPreciooferta(Float.valueOf(textoprenuevofer.getText()));
		           textopreantigunor.setText(String.valueOf(precio.getPrecionormal()));
		           textopreantiguofer.setText(String.valueOf(precio.getPreciooferta()));
		           guardaralquiler();
		           guardarEnFichero();
				}
                catch (NumberFormatException nfe)
				{
            
              JOptionPane.showMessageDialog(null, "El Precio No Es Correcto", "Error", JOptionPane.INFORMATION_MESSAGE); 	
				}
                
			}
		});
		btnNewButton.setBounds(12, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Precios Alquiler");
		lblNewLabel_6.setBounds(78, 21, 104, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Precios Venta");
		lblNewLabel_7.setBounds(296, 21, 98, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Precio Nuevo");
		lblNewLabel_8.setBounds(257, 58, 75, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Precio Antiguo");
		lblNewLabel_9.setBounds(374, 58, 75, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Precio Normal");
		lblNewLabel_10.setBounds(257, 83, 98, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Precio Oferta");
		lblNewLabel_11.setBounds(374, 139, 95, 14);
		contentPane.add(lblNewLabel_11);
		
		textonunorventa = new JTextField();
		textonunorventa.setBounds(246, 108, 86, 20);
		contentPane.add(textonunorventa);
		textonunorventa.setColumns(10);
		
		textonueoferven = new JTextField();
		textonueoferven.setBounds(246, 164, 86, 20);
		contentPane.add(textonueoferven);
		textonueoferven.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Precio Oferta");
		lblNewLabel_12.setBounds(257, 139, 98, 14);
		contentPane.add(lblNewLabel_12);
		
		textoantinorvent = new JTextField();
		textoantinorvent.setEnabled(false);
		textoantinorvent.setBounds(363, 108, 86, 20);
		contentPane.add(textoantinorvent);
		textoantinorvent.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Precio Normal");
		lblNewLabel_13.setBounds(374, 83, 95, 14);
		contentPane.add(lblNewLabel_13);
		
		textoantoferventa = new JTextField();
		textoantoferventa.setEnabled(false);
		textoantoferventa.setBounds(363, 164, 86, 20);
		contentPane.add(textoantoferventa);
		textoantoferventa.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(220, 11, 12, 240);
		contentPane.add(verticalStrut);
		
		JButton btnNewButton_1 = new JButton("Cargar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargaralquiler();
				recuperarFichero();
			}
		});
		btnNewButton_1.setBounds(123, 214, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Guardar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					   precio.setPrecionormalvent(Float.valueOf(textonunorventa.getText()));
			           precio.setPrecioofertavent(Float.valueOf(textonueoferven.getText()));
			           textoantinorvent.setText(String.valueOf(precio.getPrecionormalvent()));
			           textoantoferventa.setText(String.valueOf(precio.getPrecioofertavent()));
			           guardarventa();
			           guardarEnFichero();
					}
	                catch (NumberFormatException nfe)
					{
	            
	              JOptionPane.showMessageDialog(null, "El Precio No Es Correcto", "Error", JOptionPane.INFORMATION_MESSAGE); 	
					}
	                
				}
			
		});
		btnNewButton_2.setBounds(246, 214, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cargar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarventa();
				recuperarFichero();
			}
		});
		btnNewButton_3.setBounds(363, 214, 89, 23);
		contentPane.add(btnNewButton_3);
	}
	
	private void guardaralquiler(){
		precio.setPrecionormal(Float.valueOf(textoprenuevnorm.getText()));
	    precio.setPreciooferta(Float.valueOf(textoprenuevofer.getText()));
	}
	
	private void guardarventa(){
		precio.setPrecionormalvent(Float.valueOf(textonunorventa.getText()));
        precio.setPrecioofertavent(Float.valueOf(textonueoferven.getText()));
	}
	private void cargaralquiler(){
		textopreantigunor.setText(String.valueOf(precio.getPrecionormal()));
        textopreantiguofer.setText(String.valueOf(precio.getPreciooferta()));
	}
	private void cargarventa(){
		textoantinorvent.setText(String.valueOf(precio.getPrecionormalvent()));
        textoantoferventa.setText(String.valueOf(precio.getPrecioofertavent()));
	}
	 //metodo Guardar En Fichero
	private void guardarEnFichero(){
		try
		{
			salida = new ObjectOutputStream ( new FileOutputStream("precio.ser"));
			salida.writeObject( precio );
			if (salida !=null)
				salida.close();
		}
		catch(IOException ioException)
		{
			System.err.println("Error al abrir el archivo");
		}
	}
	
	//metodo Recuperar Fichero
	private void recuperarFichero(){
		try
		{
			entrada = new ObjectInputStream (new FileInputStream("precio.ser"));
			precio=(Precioal)entrada.readObject();
				if (entrada !=null)
					entrada.close();
		}
		catch(IOException ioException)
		{
			System.err.println("Error al abrir el archivo");
		}
		catch(ClassNotFoundException clException){
			System.err.println("Error al crear la Clase");
		}
	
	}
	
}

