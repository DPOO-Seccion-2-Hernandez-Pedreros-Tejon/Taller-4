package uniandes.dpoo.taller4.consola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Interfaz {

	private JFrame frmLightsout;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JComboBox Tamanio;
	private JLabel lblNewLabel_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JPanel panel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frmLightsout.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLightsout = new JFrame();
		
		frmLightsout.setResizable(false);
		frmLightsout.setTitle("LightsOut");
		frmLightsout.setBounds(100, 100, 700, 612);
		frmLightsout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLightsout.getContentPane().setLayout(new BorderLayout(0, 0));
		
		frmLightsout.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 204));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setAlignOnBaseline(true);
		frmLightsout.getContentPane().add(panel, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("Tama\u00F1o:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblNewLabel);
		
		Tamanio = new JComboBox();
		Tamanio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = Tamanio.getSelectedIndex();
				String tam = (String) Tamanio.getModel().getElementAt(indice);
				JOptionPane.showMessageDialog(null, "El tamaño será "+ tam);
			}
		});
		Tamanio.setModel(new DefaultComboBoxModel(new String[] {"2x2", "3x3", "4x4", "5x5", "6x6", "7x7"}));
		panel.add(Tamanio);
		
		lblNewLabel_1 = new JLabel("Dificultad: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblNewLabel_1);
		
		rdbtnNewRadioButton = new JRadioButton("F\u00E1cil");
		rdbtnNewRadioButton.setBackground(new Color(51, 102, 153));
		panel.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Medio");
		rdbtnNewRadioButton_1.setBackground(new Color(51, 102, 153));
		panel.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("D\u00EDficil");
		rdbtnNewRadioButton_2.setBackground(new Color(51, 102, 153));
		panel.add(rdbtnNewRadioButton_2);
		
		panel_1 = new JPanel();
		frmLightsout.getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Jugadas: ");
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("0");
		panel_1.add(textField);
		textField.setColumns(5);
		
		JLabel lblNewLabel_3 = new JLabel("Jugador: ");
		panel_1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		panel_2 = new JPanel();
		frmLightsout.getContentPane().add(panel_2, BorderLayout.EAST);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{115, 0};
		gbl_panel_2.rowHeights = new int[]{127, 127, 127, 127, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnNewButton_3 = new JButton("Cambiar Jugador");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(102, 204, 255));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel_2.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reniciar");
		btnNewButton_1.setBackground(new Color(102, 204, 255));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel_2.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Top 10");
		btnNewButton_2.setBackground(new Color(102, 204, 255));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		panel_2.add(btnNewButton_2, gbc_btnNewButton_2);
		btnNewButton_3.setBackground(new Color(102, 204, 255));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 3;
		panel_2.add(btnNewButton_3, gbc_btnNewButton_3);
		
		panel_3 = new JPanel();
		frmLightsout.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		
	}
	
	public static String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
}
