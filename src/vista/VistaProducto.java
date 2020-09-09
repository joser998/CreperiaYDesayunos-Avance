package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VistaProducto extends JFrame {

	public JPanel contentPane;
	public JButton btnRegistrar;
	public JLabel lblTituloGral;
	public JLabel lblMenu;
	public JLabel lblRegistroMenu;
	public JLabel lblIconRegisto;
	public JLabel lblPlatillo;
	public JTextField txtPlatillo;
	public JLabel lblCodigo;
	public JTextField txtCodigo;
	public JLabel lblPrecio;
	public JTextField txtPrecio;
	public JLabel lblCantidad;
	public JLabel lblIngredientes;
	public JLabel lblPerfilPlatillo;
	public TextArea textAreaIngredientes;
	public TextArea textAreaPerfilPlatillo;
	public JComboBox comboBoxCantidad;
	public JLabel lblExit;
	public JLabel lblBackToMenu;
	public JButton btnLimpiar;
	public JLabel lblBuscarMenu;
	public JLabel lblBuscar;
	public JButton btnBuscar;
	public JButton btnModificar;
	public JTextField txtidProducto;
	public JLabel lblVentasMenu;
	public JLabel lblVentas;
	public JLabel lblEliminarMenu;
	public JLabel lblEliminar;
	public JLabel lblProveedoresMenu;
	public JLabel lblProveedores;
	public JButton btnEliminar;
	public JLabel lblCategoriaImg;
	public JLabel lblCategoria;
	public JLabel lblDesayunoImg;
	public JLabel lblDesayuno;
	public JLabel lblCategoriaNombre;
	public JTextField txtCategoria;
	public JLabel lblDescripcion;
	public TextArea textAreaDescripcionCategoria;
	public JButton btnGuardarCategoria;
	public JTextField txtidCategoria;
	public JLabel lblidCategoria;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaProducto frame = new VistaProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VistaProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		((JPanel)getContentPane()).setOpaque(false); 
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		lblTituloGral = new JLabel("Creperia y Desayunos Luisito");
		lblTituloGral.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 16));
		lblTituloGral.setForeground(Color.WHITE);
		lblTituloGral.setBounds(411, 0, 281, 28);
		layeredPane.add(lblTituloGral);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setVisible(false);
		btnRegistrar.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setBounds(651, 605, 110, 35);
		layeredPane.add(btnRegistrar);
		
		lblMenu = new JLabel("Menu Principal");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblMenu.setBounds(42, 11, 148, 28);
		layeredPane.add(lblMenu);
		
		lblRegistroMenu = new JLabel("Registro");
		lblRegistroMenu.setForeground(Color.WHITE);
		lblRegistroMenu.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblRegistroMenu.setBounds(66, 136, 85, 28);
		layeredPane.add(lblRegistroMenu);
		
		lblIconRegisto = new JLabel("");
		lblIconRegisto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//De esta manera al ser presionado no muestra lo que estaba en el Menu principal
				/*
				lblPlatillo.setVisible(true);
				txtPlatillo.setVisible(true);
				lblCodigo.setVisible(true);
				txtCodigo.setVisible(true);
				lblPrecio.setVisible(true);
				txtPrecio.setVisible(true);
				lblCantidad.setVisible(true);
				comboBoxCantidad.setVisible(true);
				lblIngredientes.setVisible(true);
				textAreaIngredientes.setVisible(true);
				btnRegistrar.setVisible(true);
				*/
				
				
				lblBackToMenu.setVisible(true);
				
				
				lblIconRegisto.setVisible(false);
				lblRegistroMenu.setVisible(false);
				btnLimpiar.setVisible(false);
				
				lblBuscarMenu.setVisible(false);
				lblBuscar.setVisible(false);
				
				
				lblVentasMenu.setVisible(false);
				lblVentas.setVisible(false);
				lblEliminarMenu.setVisible(false);
				lblEliminar.setVisible(false);
				
				lblProveedoresMenu.setVisible(false);
				lblProveedores.setVisible(false);
				
				
				lblCategoriaImg.setVisible(true);
				lblCategoria.setVisible(true);
				
				lblCategoriaImg.setVisible(true);
				lblCategoria.setVisible(true);
				
				lblDesayunoImg.setVisible(true);
				lblDesayuno.setVisible(true);
				
			}
		});
		lblIconRegisto.setIcon(new ImageIcon(VistaProducto.class.getResource("/vista/img/Registry.jpg")));
		lblIconRegisto.setBounds(36, 44, 123, 94);
		layeredPane.add(lblIconRegisto);
		
		lblPlatillo = new JLabel("Platillo:");
		lblPlatillo.setVisible(false);
		lblPlatillo.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblPlatillo.setForeground(Color.WHITE);
		lblPlatillo.setBounds(567, 51, 85, 28);
		layeredPane.add(lblPlatillo);
		
		txtPlatillo = new JTextField();
		txtPlatillo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c<'a' || c>'z') && (c<'A' | c> 'Z') && (c != ' ')) e.consume(); //RESTRICCION ACEPTA LETRAS Y ESPACIOS UNICAMENTE...
			}
		});
		txtPlatillo.setVisible(false);
		txtPlatillo.setBounds(662, 56, 110, 20);
		layeredPane.add(txtPlatillo);
		txtPlatillo.setColumns(10);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setVisible(false);
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblCodigo.setBounds(577, 98, 67, 28);
		layeredPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c<'0' || c>'9' ) e.consume();  // SI EL CARACTER NO ESTA ENTRE CERO Y NUEVE SE DESECHA
			}
		});
		txtCodigo.setVisible(false);
		txtCodigo.setBounds(662, 103, 110, 20);
		layeredPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblPrecio = new JLabel("Precio:");
		lblPrecio.setVisible(false);
		lblPrecio.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setBounds(581, 150, 63, 22);
		layeredPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.') ) 
                    e.consume();
			}
		});
		txtPrecio.setVisible(false);
		txtPrecio.setBounds(662, 152, 110, 20);
		layeredPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setVisible(false);
		lblCantidad.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBounds(567, 195, 85, 28);
		layeredPane.add(lblCantidad);
		
		lblIngredientes = new JLabel("Ingredientes:");
		lblIngredientes.setVisible(false);
		lblIngredientes.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblIngredientes.setForeground(Color.WHITE);
		lblIngredientes.setBounds(508, 439, 110, 35);
		
		
		layeredPane.add(lblIngredientes);
		textAreaIngredientes = new TextArea();
		textAreaIngredientes.setVisible(false);
		textAreaIngredientes.setBounds(624, 447, 148, 134);
		layeredPane.add(textAreaIngredientes);
		
		textAreaPerfilPlatillo = new TextArea();
		textAreaPerfilPlatillo.setVisible(false);
		textAreaPerfilPlatillo.setEditable(false);
		textAreaPerfilPlatillo.setBounds(839, 78, 225, 285);
		layeredPane.add(textAreaPerfilPlatillo);
		
		lblPerfilPlatillo = new JLabel("Perfil Platillo:");
		lblPerfilPlatillo.setVisible(false);
		lblPerfilPlatillo.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblPerfilPlatillo.setForeground(Color.WHITE);
		lblPerfilPlatillo.setBounds(883, 44, 133, 35);
		layeredPane.add(lblPerfilPlatillo);
		
		comboBoxCantidad = new JComboBox();
		comboBoxCantidad.setVisible(false);
		comboBoxCantidad.setBounds(662, 199, 110, 22);
		comboBoxCantidad.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		layeredPane.add(comboBoxCantidad);
		
		lblExit = new JLabel("");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int exit = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres Salir?",
						"Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if (exit == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Gracias por su Visita");
					System.exit(WIDTH);
				}
			}
		});
		lblExit.setIcon(new ImageIcon(VistaProducto.class.getResource("/vista/img/Exit.jpg")));
		lblExit.setBounds(979, 605, 85, 35);
		layeredPane.add(lblExit);
		
		lblBackToMenu = new JLabel("");
		lblBackToMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPlatillo.setText("");
				txtCodigo.setText("");
				txtPrecio.setText("");
				comboBoxCantidad.setSelectedIndex(0);
				textAreaIngredientes.setText("");
				textAreaPerfilPlatillo.setText("");
				
				
				lblBackToMenu.setVisible(false);
				lblPlatillo.setVisible(false);
				txtPlatillo.setVisible(false);
				lblCodigo.setVisible(false);
				txtCodigo.setVisible(false);
				lblPrecio.setVisible(false);
				txtPrecio.setVisible(false);
				lblCantidad.setVisible(false);
				comboBoxCantidad.setVisible(false);
				lblIngredientes.setVisible(false);
				textAreaIngredientes.setVisible(false);
				btnRegistrar.setVisible(false);
				lblPerfilPlatillo.setVisible(false);
				textAreaPerfilPlatillo.setVisible(false);
				
				lblMenu.setVisible(true);
				lblIconRegisto.setVisible(true);
				lblRegistroMenu.setVisible(true);
				btnLimpiar.setVisible(false);
				
				lblBuscarMenu.setVisible(true);
				lblBuscar.setVisible(true);
				
				btnBuscar.setVisible(false);
				
				btnModificar.setVisible(false);
				
				lblVentasMenu.setVisible(true);
				lblVentas.setVisible(true);
				
				lblEliminarMenu.setVisible(true);
				lblEliminar.setVisible(true);
				
				lblProveedoresMenu.setVisible(true);
				lblProveedores.setVisible(true);
				
				btnEliminar.setVisible(false);
				
				
				
				lblCategoriaImg.setVisible(false);
				lblCategoria.setVisible(false);
				
				lblDesayunoImg.setVisible(false);
				lblDesayuno.setVisible(false);
				
				
				
				
				
				lblCategoriaNombre.setVisible(false);
				txtCategoria.setVisible(false);
				lblDescripcion.setVisible(false);
				textAreaDescripcionCategoria.setVisible(false);
				btnGuardarCategoria.setVisible(false);
				
				
				
				lblidCategoria.setVisible(false);
				txtidCategoria.setVisible(false);
				
				txtidCategoria.setEditable(true);
				
			}
		});
		lblBackToMenu.setIcon(new ImageIcon(VistaProducto.class.getResource("/vista/img/backToMenu.jpg")));
		lblBackToMenu.setVisible(false);
		lblBackToMenu.setBounds(169, 262, 69, 44);
		layeredPane.add(lblBackToMenu);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setVisible(false);
		btnLimpiar.setForeground(Color.BLACK);
		btnLimpiar.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		btnLimpiar.setBounds(927, 378, 89, 23);
		layeredPane.add(btnLimpiar);
		
		lblBuscarMenu = new JLabel("");
		lblBuscarMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblIconRegisto.setVisible(false);
				lblRegistroMenu.setVisible(false);
				lblBuscarMenu.setVisible(false);
				lblBuscar.setVisible(false);
				
				
				lblBackToMenu.setVisible(true);
				
				lblCodigo.setVisible(true);
				txtCodigo.setVisible(true);
				
				btnBuscar.setVisible(true);
				
				lblVentasMenu.setVisible(false);
				lblVentas.setVisible(false);
				lblEliminarMenu.setVisible(false);
				lblEliminar.setVisible(false);
				lblProveedoresMenu.setVisible(false);
				lblProveedores.setVisible(false);
			}
		});
		lblBuscarMenu.setIcon(new ImageIcon(VistaProducto.class.getResource("/vista/img/Find.jpg")));
		lblBuscarMenu.setBounds(36, 169, 123, 96);
		layeredPane.add(lblBuscarMenu);
		
		lblBuscar = new JLabel("Buscar/Modificar");
		lblBuscar.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblBuscar.setForeground(Color.WHITE);
		lblBuscar.setBounds(30, 260, 148, 28);
		layeredPane.add(lblBuscar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setVisible(false);
		btnBuscar.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setBounds(661, 242, 89, 23);
		layeredPane.add(btnBuscar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setVisible(false);
		btnModificar.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		btnModificar.setBounds(651, 611, 110, 23);
		layeredPane.add(btnModificar);
		
		txtidProducto = new JTextField();
		txtidProducto.setVisible(false);
		txtidProducto.setBounds(769, 16, 86, 20);
		layeredPane.add(txtidProducto);
		txtidProducto.setColumns(10);
		
		lblVentasMenu = new JLabel("");
		lblVentasMenu.setIcon(new ImageIcon(VistaProducto.class.getResource("/vista/img/Sale.jpg")));
		lblVentasMenu.setBounds(41, 299, 110, 71);
		layeredPane.add(lblVentasMenu);
		
		lblVentas = new JLabel("Ventas");
		lblVentas.setForeground(Color.WHITE);
		lblVentas.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblVentas.setBounds(66, 371, 85, 20);
		layeredPane.add(lblVentas);
		
		lblEliminarMenu = new JLabel("");
		lblEliminarMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblIconRegisto.setVisible(false);
				lblRegistroMenu.setVisible(false);
				lblBuscarMenu.setVisible(false);
				lblBuscar.setVisible(false);
				lblVentasMenu.setVisible(false);
				lblEliminar.setVisible(false);
				lblVentas.setVisible(false);
				lblEliminarMenu.setVisible(false);
				lblProveedoresMenu.setVisible(false);
				lblProveedores.setVisible(false);
				
				
				lblBackToMenu.setVisible(true);
				
				lblCodigo.setVisible(true);
				txtCodigo.setVisible(true);
				btnEliminar.setVisible(true);
				
			}
		});
		lblEliminarMenu.setIcon(new ImageIcon(VistaProducto.class.getResource("/vista/img/Delete.jpg")));
		lblEliminarMenu.setBounds(42, 403, 109, 82);
		layeredPane.add(lblEliminarMenu);
		
		lblEliminar = new JLabel("Eliminar");
		lblEliminar.setForeground(Color.WHITE);
		lblEliminar.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblEliminar.setBounds(66, 482, 85, 28);
		layeredPane.add(lblEliminar);
		
		lblProveedoresMenu = new JLabel("");
		lblProveedoresMenu.setIcon(new ImageIcon(VistaProducto.class.getResource("/vista/img/Providers.jpg")));
		lblProveedoresMenu.setBounds(35, 515, 124, 94);
		layeredPane.add(lblProveedoresMenu);
		
		lblProveedores = new JLabel("Proveedores");
		lblProveedores.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblProveedores.setForeground(Color.WHITE);
		lblProveedores.setBounds(45, 605, 114, 29);
		layeredPane.add(lblProveedores);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setVisible(false);
		btnEliminar.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		btnEliminar.setBounds(662, 280, 110, 26);
		layeredPane.add(btnEliminar);
		
		lblCategoriaImg = new JLabel("");
		lblCategoriaImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCategoriaNombre.setVisible(true);
				txtCategoria.setVisible(true);
				lblDescripcion.setVisible(true);
				textAreaDescripcionCategoria.setVisible(true);
				
				
				lblCategoriaImg.setVisible(false);
				lblCategoria.setVisible(false);
				lblDesayunoImg.setVisible(false);
				lblDesayuno.setVisible(false);
				
				
				btnGuardarCategoria.setVisible(true);
				
				
				
				
				
			}
		});
		lblCategoriaImg.setVisible(false);
		lblCategoriaImg.setIcon(new ImageIcon(VistaProducto.class.getResource("/vista/img/Category.jpg")));
		lblCategoriaImg.setBounds(449, 98, 133, 88);
		layeredPane.add(lblCategoriaImg);
		
		lblCategoria = new JLabel("Categoria ");
		lblCategoria.setVisible(false);
		lblCategoria.setForeground(Color.WHITE);
		lblCategoria.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblCategoria.setBounds(480, 189, 102, 28);
		layeredPane.add(lblCategoria);
		
		lblDesayunoImg = new JLabel("");
		lblDesayunoImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPlatillo.setVisible(true);
				txtPlatillo.setVisible(true);
				lblCodigo.setVisible(true);
				txtCodigo.setVisible(true);
				lblPrecio.setVisible(true);
				txtPrecio.setVisible(true);
				lblCantidad.setVisible(true);
				comboBoxCantidad.setVisible(true);
				lblIngredientes.setVisible(true);
				textAreaIngredientes.setVisible(true);
				
				btnRegistrar.setVisible(true);
				
				
				
				lblCategoriaImg.setVisible(false);
				lblCategoria.setVisible(false);
				lblDesayunoImg.setVisible(false);
				lblDesayuno.setVisible(false);
				
				
				lblidCategoria.setVisible(true);
				txtidCategoria.setVisible(true);
				
				
			}
		});
		lblDesayunoImg.setVisible(false);
		lblDesayunoImg.setIcon(new ImageIcon(VistaProducto.class.getResource("/vista/img/BreakFast.jpg")));
		lblDesayunoImg.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblDesayunoImg.setBounds(468, 403, 114, 150);
		layeredPane.add(lblDesayunoImg);
		
		lblDesayuno = new JLabel("Desayuno");
		lblDesayuno.setVisible(false);
		lblDesayuno.setForeground(Color.WHITE);
		lblDesayuno.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblDesayuno.setBounds(480, 553, 85, 28);
		layeredPane.add(lblDesayuno);
		
		lblCategoriaNombre = new JLabel("Categoria:");
		lblCategoriaNombre.setVisible(false);
		lblCategoriaNombre.setForeground(Color.WHITE);
		lblCategoriaNombre.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblCategoriaNombre.setBounds(345, 55, 85, 20);
		layeredPane.add(lblCategoriaNombre);
		
		txtCategoria = new JTextField();
		txtCategoria.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c<'a' || c>'z') && (c<'A' | c> 'Z') && (c != ' ')) e.consume();
			}
		});
		txtCategoria.setVisible(false);
		txtCategoria.setBounds(345, 81, 110, 20);
		layeredPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setVisible(false);
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblDescripcion.setBounds(345, 136, 94, 28);
		layeredPane.add(lblDescripcion);
		
		textAreaDescripcionCategoria = new TextArea();
		textAreaDescripcionCategoria.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c<'a' || c>'z') && (c<'A' | c> 'Z') && (c != ' ')) e.consume();
			}
		});
		textAreaDescripcionCategoria.setVisible(false);
		textAreaDescripcionCategoria.setBounds(345, 169, 277, 142);
		layeredPane.add(textAreaDescripcionCategoria);
		
		btnGuardarCategoria = new JButton("Guardar");
		btnGuardarCategoria.setVisible(false);
		btnGuardarCategoria.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		btnGuardarCategoria.setBounds(424, 333, 116, 28);
		layeredPane.add(btnGuardarCategoria);
		
		txtidCategoria = new JTextField();
		txtidCategoria.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c<'0' || c>'9' ) e.consume();
			}
		});
		txtidCategoria.setVisible(false);
		txtidCategoria.setBounds(662, 413, 110, 20);
		layeredPane.add(txtidCategoria);
		txtidCategoria.setColumns(10);
		
		lblidCategoria = new JLabel("Id Categoria:");
		lblidCategoria.setVisible(false);
		lblidCategoria.setForeground(Color.WHITE);
		lblidCategoria.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		lblidCategoria.setBounds(542, 413, 110, 20);
		layeredPane.add(lblidCategoria);
		ImageIcon uno=new ImageIcon(this.getClass().getResource("/vista/img/Wall.jpg")); 
		JLabel fondo= new JLabel(); 
		fondo.setIcon(uno); 
		getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
		fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
	}
}