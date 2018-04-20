package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JTextField textField_Sifra;
	private JTextField textField_Naziv;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField textField_ProdajniKurs;
	private JTextField textField_KupovniKurs;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField textField_SrednjiKurs;
	private JTextField textField_SkraceniNaziv;
	private JButton button;
	private JButton btnNewButton_Obrisi;
	private JCheckBox chckbxNewCheckBox;

	private MenjacnicaGUI gp;
	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI gp) {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getTextField_Sifra());
		contentPane.add(getTextField_Naziv());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getTextField_ProdajniKurs());
		contentPane.add(getTextField_KupovniKurs());
		contentPane.add(getLabel_4());
		contentPane.add(getLabel_5());
		contentPane.add(getTextField_SrednjiKurs());
		contentPane.add(getTextField_SkraceniNaziv());
		contentPane.add(getButton());
		contentPane.add(getBtnNewButton_Obrisi());
		contentPane.add(getChckbxNewCheckBox());
		this.gp = gp;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Sifra");
			label.setPreferredSize(new Dimension(100, 23));
			label.setBounds(11, 11, 191, 23);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Naziv");
			label_1.setPreferredSize(new Dimension(100, 23));
			label_1.setBounds(221, 11, 191, 23);
		}
		return label_1;
	}
	private JTextField getTextField_Sifra() {
		if (textField_Sifra == null) {
			textField_Sifra = new JTextField();
			textField_Sifra.setPreferredSize(new Dimension(100, 23));
			textField_Sifra.setColumns(10);
			textField_Sifra.setBounds(11, 45, 191, 23);
		}
		return textField_Sifra;
	}
	private JTextField getTextField_Naziv() {
		if (textField_Naziv == null) {
			textField_Naziv = new JTextField();
			textField_Naziv.setPreferredSize(new Dimension(100, 23));
			textField_Naziv.setColumns(10);
			textField_Naziv.setBounds(221, 45, 191, 23);
		}
		return textField_Naziv;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Prodajni kurs");
			label_2.setPreferredSize(new Dimension(100, 23));
			label_2.setBounds(11, 79, 191, 23);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Kupovni kurs");
			label_3.setPreferredSize(new Dimension(100, 23));
			label_3.setBounds(221, 79, 100, 23);
		}
		return label_3;
	}
	private JTextField getTextField_ProdajniKurs() {
		if (textField_ProdajniKurs == null) {
			textField_ProdajniKurs = new JTextField();
			textField_ProdajniKurs.setPreferredSize(new Dimension(100, 23));
			textField_ProdajniKurs.setColumns(10);
			textField_ProdajniKurs.setBounds(11, 113, 191, 23);
		}
		return textField_ProdajniKurs;
	}
	private JTextField getTextField_KupovniKurs() {
		if (textField_KupovniKurs == null) {
			textField_KupovniKurs = new JTextField();
			textField_KupovniKurs.setPreferredSize(new Dimension(100, 23));
			textField_KupovniKurs.setColumns(10);
			textField_KupovniKurs.setBounds(221, 113, 191, 23);
		}
		return textField_KupovniKurs;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Srednji kurs");
			label_4.setPreferredSize(new Dimension(100, 23));
			label_4.setBounds(10, 147, 192, 23);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Skraceni naziv");
			label_5.setPreferredSize(new Dimension(100, 23));
			label_5.setBounds(221, 147, 191, 23);
		}
		return label_5;
	}
	private JTextField getTextField_SrednjiKurs() {
		if (textField_SrednjiKurs == null) {
			textField_SrednjiKurs = new JTextField();
			textField_SrednjiKurs.setPreferredSize(new Dimension(100, 23));
			textField_SrednjiKurs.setColumns(10);
			textField_SrednjiKurs.setBounds(11, 170, 191, 23);
		}
		return textField_SrednjiKurs;
	}
	private JTextField getTextField_SkraceniNaziv() {
		if (textField_SkraceniNaziv == null) {
			textField_SkraceniNaziv = new JTextField();
			textField_SkraceniNaziv.setPreferredSize(new Dimension(100, 23));
			textField_SkraceniNaziv.setColumns(10);
			textField_SkraceniNaziv.setBounds(221, 170, 191, 23);
		}
		return textField_SkraceniNaziv;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Odustani");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			button.setPreferredSize(new Dimension(100, 23));
			button.setBounds(221, 221, 191, 23);
		}
		return button;
	}
	private JButton getBtnNewButton_Obrisi() {
		if (btnNewButton_Obrisi == null) {
			btnNewButton_Obrisi = new JButton("Obrisi");
			btnNewButton_Obrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sifra = textField_Sifra.getText();
					String naziv = textField_Naziv.getText();
					String prodajniKurs = textField_ProdajniKurs.getText();
					String kupovniKurs = textField_KupovniKurs.getText();
					String srednjiKurs = textField_SrednjiKurs.getText();
					String skraceniNaziv = textField_SkraceniNaziv.getText();
					
					String tekst = "Obrisan je kurs: \n Sifra: " + sifra + 
									", Naziv: " + naziv +
									", Prodajni kurs: "+ prodajniKurs +
									", Kupovni kurs: " + kupovniKurs + 
									", Srednji kurs: " + srednjiKurs +
									", Skraceni naziv: " + skraceniNaziv ;
					
					gp.upisiNaTextArea(tekst);
					dispose();
				}
			});
			btnNewButton_Obrisi.setEnabled(false);
			btnNewButton_Obrisi.setBounds(11, 221, 191, 23);
		}
		return btnNewButton_Obrisi;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Zaista obrisi kurs");
			chckbxNewCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxNewCheckBox.isSelected() == true) {
						btnNewButton_Obrisi.setEnabled(true);
					} else {
						btnNewButton_Obrisi.setEnabled(false);
					}
				}
			});
			chckbxNewCheckBox.setBounds(11, 200, 157, 14);
		}
		return chckbxNewCheckBox;
	}
}
