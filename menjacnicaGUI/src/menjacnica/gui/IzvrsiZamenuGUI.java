package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	
	private JLabel label;
	private JLabel label_1;
	private JButton button;
	private JLabel lblNewLabel;
	private JLabel lblIznos;
	private JLabel lblVrstaTranzakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JComboBox comboBox;
	private JSlider slider;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextField textField_1;
	private JTextField textField_2;
	private MenjacnicaGUI gp;
	private final ButtonGroup buttonGroup = new ButtonGroup();
//	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI gp) {
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getButton());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblIznos());
		contentPane.add(getLblVrstaTranzakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getComboBox());
		contentPane.add(getSlider());
		contentPane.add(getTextField());
		contentPane.add(getBtnNewButton());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		this.gp = gp;
		
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Prodajni kurs");
			label.setPreferredSize(new Dimension(100, 23));
			label.setBounds(297, 11, 100, 23);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Kupovni kurs");
			label_1.setPreferredSize(new Dimension(100, 23));
			label_1.setBounds(22, 11, 100, 23);
		}
		return label_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Odustani");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			button.setPreferredSize(new Dimension(100, 23));
			button.setBounds(284, 237, 150, 23);
		}
		return button;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Valuta");
			lblNewLabel.setMaximumSize(new Dimension(100, 23));
			lblNewLabel.setPreferredSize(new Dimension(100, 23));
			lblNewLabel.setBounds(158, 11, 100, 23);
		}
		return lblNewLabel;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(22, 79, 100, 23);
		}
		return lblIznos;
	}
	private JLabel getLblVrstaTranzakcije() {
		if (lblVrstaTranzakcije == null) {
			lblVrstaTranzakcije = new JLabel("Vrsta transakcije");
			lblVrstaTranzakcije.setBounds(264, 79, 100, 23);
		}
		return lblVrstaTranzakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
		//	buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(264, 109, 109, 23);
		}
	//	if(rdbtnProdaja.isSelected() == true) {
	//		rdbtnKupovina.setSelected(false); 
	//	}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
		//	buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(264, 135, 109, 23);
		}
/*		if(rdbtnProdaja.isSelected() == true) {
			rdbtnKupovina.setSelected(false); 
		}
		
		if(rdbtnKupovina.isSelected() == true) {
			rdbtnProdaja.setSelected(false); 
		}
		*/
		return rdbtnProdaja;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(158, 45, 100, 23);
		}
		return comboBox;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					int broj = slider.getValue();
					textField.setText("" + broj);
				}
			});
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setMajorTickSpacing(10);
			slider.setBounds(22, 178, 412, 53);
		}
		return slider;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(20, 110, 182, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Izvrsi zamenu");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String vrsta = "Kupovina";
					if(rdbtnProdaja.isSelected() == true) {
						vrsta = "Prodaja";
					}
					
					String tekst = "Zamenjen je kurs: \n Valuta: " + comboBox.getSelectedItem() + 
									", Iznos: " + textField.getText() + ", Vrsta transakcije: " + vrsta;
					
					gp.upisiNaTextArea(tekst);
					dispose();
				}
			});
			btnNewButton.setBounds(22, 237, 150, 23);
		}
		return btnNewButton;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(22, 45, 100, 23);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setBounds(297, 45, 100, 23);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
}
