package internalFrames.MenuMantenimiento;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import Frames.menu_Principal;

public class ConsultaChocolate extends JInternalFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTipoDeChocolate;
	private JLabel lblUnidadesPorCaja;
	private JLabel lblPesoPorCajagramos;
	private JLabel lblPrecio;
	private JTextField txtPeso;
	private JTextField txtPrecio;
	private JTextField txtUnidades;
	private JComboBox cboTipo;
	private JButton btnCerrar;
	
	private static ConsultaChocolate instance = null;
	
	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaChocolate frame = new ConsultaChocolate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 */
	/**
	 * Create the frame.
	 */
	private ConsultaChocolate() {
		setFrameIcon(new ImageIcon(ConsultaChocolate.class.getResource("/imagenes/search10.png")));
		setTitle("Consulta de Chocolates");
		setBounds(100, 100, 435, 171);
		getContentPane().setLayout(null);
		{
			lblTipoDeChocolate = new JLabel("Tipo de Chocolate:");
			lblTipoDeChocolate.setBounds(10, 8, 112, 14);
			getContentPane().add(lblTipoDeChocolate);
		}
		{
			lblUnidadesPorCaja = new JLabel("Unidades por caja:");
			lblUnidadesPorCaja.setBounds(10, 42, 112, 14);
			getContentPane().add(lblUnidadesPorCaja);
		}
		{
			lblPesoPorCajagramos = new JLabel("Peso por caja(gramos):");
			lblPesoPorCajagramos.setBounds(10, 67, 163, 14);
			getContentPane().add(lblPesoPorCajagramos);
		}
		{
			lblPrecio = new JLabel("Precio (S/.):");
			lblPrecio.setBounds(10, 99, 89, 14);
			getContentPane().add(lblPrecio);
		}
		{
			txtPeso = new JTextField();
			txtPeso.setEditable(false);
			txtPeso.setBounds(183, 65, 118, 20);
			getContentPane().add(txtPeso);
			txtPeso.setColumns(10);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(183, 96, 118, 20);
			getContentPane().add(txtPrecio);
		}
		{
			txtUnidades = new JTextField();
			txtUnidades.setEditable(false);
			txtUnidades.setColumns(10);
			txtUnidades.setBounds(183, 36, 118, 20);
			getContentPane().add(txtUnidades);
		}
		{
			cboTipo = new JComboBox();
			cboTipo.addActionListener(this);
			cboTipo.setModel(new DefaultComboBoxModel(new String[] {menu_Principal.tipo0, 
							menu_Principal.tipo1,menu_Principal.tipo2, menu_Principal.tipo3, menu_Principal.tipo4}));
			cboTipo.setBounds(183, 5, 118, 20);
			getContentPane().add(cboTipo);
			
			getTipoTentacion();
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(311, 4, 89, 23);
			getContentPane().add(btnCerrar);
		}

	}
	
	public static ConsultaChocolate getInstance(){
		if (instance == null){
			instance = new ConsultaChocolate();

		}
		return instance;
	}
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource() == cboTipo) {
			do_cboTipo_actionPerformed(arg0);
		}
		
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
		
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
		
		dispose();
		
	}
	protected void do_cboTipo_actionPerformed(ActionEvent arg0) {
		
		switch(cboTipo.getSelectedIndex()){
		
		case 0 : //Tentación
			getTipoTentacion(); break;
			
		case 1: //Delicia
			getTipoDelicia(); break;
			
		case 2: //Explosion
			getTipoExplosion(); break;
		
		case 3://ChokoLoko
			getTipoChokoLoko(); break;
			
		default://ChokoBoom
			getTipoChokoBoom(); break;
		}
	}
	

	// Region Obtener Tipos de Chocolate
	
	private void getTipoTentacion(){
		
		txtPeso.setText("" + menu_Principal.peso0);
		txtPrecio.setText("" + menu_Principal.precio0);
		txtUnidades.setText("" + menu_Principal.unidades0);
		
	}
	
	private void getTipoDelicia(){
		
		txtPeso.setText("" + menu_Principal.peso1);
		txtPrecio.setText("" + menu_Principal.precio1);
		txtUnidades.setText("" + menu_Principal.unidades1);
		
	}
	
	private void getTipoExplosion() {
		
		txtPeso.setText("" + menu_Principal.peso2);
		txtPrecio.setText("" + menu_Principal.precio2);
		txtUnidades.setText("" + menu_Principal.unidades2);
		
	}
	
	private void getTipoChokoLoko() {
		
		txtPeso.setText("" + menu_Principal.peso3);
		txtPrecio.setText("" + menu_Principal.precio3);
		txtUnidades.setText("" + menu_Principal.unidades3);
		
	}
	
	private void getTipoChokoBoom() {
		
		txtPeso.setText("" + menu_Principal.peso4);
		txtPrecio.setText("" + menu_Principal.precio4);
		txtUnidades.setText("" + menu_Principal.unidades4);
		
	}
	
	// EndRegion
}
