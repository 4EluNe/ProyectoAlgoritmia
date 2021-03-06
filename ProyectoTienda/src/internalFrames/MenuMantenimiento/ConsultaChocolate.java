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
			
			txtPeso.setText("" + menu_Principal.getPesoTentacion());
			txtPrecio.setText("" + menu_Principal.getPrecioTentacion());
			txtUnidades.setText(""+ menu_Principal.getUnidadesTentacion());
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
			txtPeso.setText("" + menu_Principal.getPesoTentacion());
			txtPrecio.setText("" + menu_Principal.getPrecioTentacion());
			txtUnidades.setText(""+ menu_Principal.getUnidadesTentacion());break;
		case 1: //Delicia
			txtPeso.setText("" + menu_Principal.getPesoDelicia());
			txtPrecio.setText("" + menu_Principal.getPrecioDelicia());
			txtUnidades.setText(""+ menu_Principal.getUnidadesDelicia());break;
			
		case 2: //Explosion
			txtPeso.setText("" + menu_Principal.getPesoExplosion());
			txtPrecio.setText("" + menu_Principal.getPrecioExplosion());
			txtUnidades.setText(""+ menu_Principal.getUnidadesExplosion());break;
		
		case 3://ChokoLoko
			txtPeso.setText("" + menu_Principal.getPesoChokoLoko());
			txtPrecio.setText("" + menu_Principal.getPrecioChokoLoko());
			txtUnidades.setText(""+ menu_Principal.getUnidadesChokoLoko());break;
			
		default://ChokoBoom
			txtPeso.setText("" + menu_Principal.getPesoChokoBoom());
			txtPrecio.setText("" + menu_Principal.getPrecioChokoBoom());
			txtUnidades.setText(""+ menu_Principal.getUnidadesChokoBoom());break;
		}
	}
	

	
}
