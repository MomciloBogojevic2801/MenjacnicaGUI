package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_Sifra;
	private JLabel lblNewLabel_Naziv;
	private JTextField textField_Sifra;
	private JTextField textField_Naziv;
	private JLabel lblNewLabel_ProdajniKurs;
	private JLabel lblNewLabel_KupovniKurs;
	private JTextField textField_ProdajniKurs;
	private JTextField textField_KupovniKurs;
	private JLabel lblNewLabel_SrednjiKurs;
	private JLabel lblNewLabel_SkraceniNaziv;
	private JTextField textField_SrednjiKurs;
	private JTextField textField_SkraceniNaziv;
	private JButton btnNewDodaj;
	private JButton btnNewOdustani;

	
	private MenjacnicaGUI gp;

	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI gp) {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel_Sifra());
		contentPane.add(getLblNewLabel_Naziv());
		contentPane.add(getTextField_Sifra());
		contentPane.add(getTextField_Naziv());
		contentPane.add(getLblNewLabel_ProdajniKurs());
		contentPane.add(getLblNewLabel_KupovniKurs());
		contentPane.add(getTextField_ProdajniKurs());
		contentPane.add(getTextField_KupovniKurs());
		contentPane.add(getLblNewLabel_SrednjiKurs());
		contentPane.add(getLblNewLabel_SkraceniNaziv());
		contentPane.add(getTextField_SrednjiKurs());
		contentPane.add(getTextField_SkraceniNaziv());
		contentPane.add(getBtnNewDodaj());
		contentPane.add(getBtnNewOdustani());
		this.gp = gp;
	}

	private JLabel getLblNewLabel_Sifra() {
		if (lblNewLabel_Sifra == null) {
			lblNewLabel_Sifra = new JLabel("Sifra");
			lblNewLabel_Sifra.setBounds(23, 11, 191, 23);
			lblNewLabel_Sifra.setPreferredSize(new Dimension(100, 23));
		}
		return lblNewLabel_Sifra;
	}
	private JLabel getLblNewLabel_Naziv() {
		if (lblNewLabel_Naziv == null) {
			lblNewLabel_Naziv = new JLabel("Naziv");
			lblNewLabel_Naziv.setBounds(233, 11, 191, 23);
			lblNewLabel_Naziv.setPreferredSize(new Dimension(100, 23));
		}
		return lblNewLabel_Naziv;
	}
	private JTextField getTextField_Sifra() {
		if (textField_Sifra == null) {
			textField_Sifra = new JTextField();
			textField_Sifra.setBounds(23, 45, 191, 23);
			textField_Sifra.setPreferredSize(new Dimension(100, 23));
			textField_Sifra.setColumns(10);
		}
		return textField_Sifra;
	}
	private JTextField getTextField_Naziv() {
		if (textField_Naziv == null) {
			textField_Naziv = new JTextField();
			textField_Naziv.setBounds(233, 45, 191, 23);
			textField_Naziv.setPreferredSize(new Dimension(100, 23));
			textField_Naziv.setColumns(10);
		}
		return textField_Naziv;
	}
	private JLabel getLblNewLabel_ProdajniKurs() {
		if (lblNewLabel_ProdajniKurs == null) {
			lblNewLabel_ProdajniKurs = new JLabel("Prodajni kurs");
			lblNewLabel_ProdajniKurs.setBounds(23, 79, 191, 23);
			lblNewLabel_ProdajniKurs.setPreferredSize(new Dimension(100, 23));
		}
		return lblNewLabel_ProdajniKurs;
	}
	private JLabel getLblNewLabel_KupovniKurs() {
		if (lblNewLabel_KupovniKurs == null) {
			lblNewLabel_KupovniKurs = new JLabel("Kupovni kurs");
			lblNewLabel_KupovniKurs.setBounds(233, 79, 100, 23);
			lblNewLabel_KupovniKurs.setPreferredSize(new Dimension(100, 23));
		}
		return lblNewLabel_KupovniKurs;
	}
	private JTextField getTextField_ProdajniKurs() {
		if (textField_ProdajniKurs == null) {
			textField_ProdajniKurs = new JTextField();
			textField_ProdajniKurs.setBounds(23, 113, 191, 23);
			textField_ProdajniKurs.setPreferredSize(new Dimension(100, 23));
			textField_ProdajniKurs.setColumns(10);
		}
		return textField_ProdajniKurs;
	}
	private JTextField getTextField_KupovniKurs() {
		if (textField_KupovniKurs == null) {
			textField_KupovniKurs = new JTextField();
			textField_KupovniKurs.setBounds(233, 113, 191, 23);
			textField_KupovniKurs.setPreferredSize(new Dimension(100, 23));
			textField_KupovniKurs.setColumns(10);
		}
		return textField_KupovniKurs;
	}
	private JLabel getLblNewLabel_SrednjiKurs() {
		if (lblNewLabel_SrednjiKurs == null) {
			lblNewLabel_SrednjiKurs = new JLabel("Srednji kurs");
			lblNewLabel_SrednjiKurs.setBounds(22, 147, 192, 23);
			lblNewLabel_SrednjiKurs.setPreferredSize(new Dimension(100, 23));
		}
		return lblNewLabel_SrednjiKurs;
	}
	private JLabel getLblNewLabel_SkraceniNaziv() {
		if (lblNewLabel_SkraceniNaziv == null) {
			lblNewLabel_SkraceniNaziv = new JLabel("Skraceni naziv");
			lblNewLabel_SkraceniNaziv.setBounds(233, 147, 191, 23);
			lblNewLabel_SkraceniNaziv.setPreferredSize(new Dimension(100, 23));
		}
		return lblNewLabel_SkraceniNaziv;
	}
	private JTextField getTextField_SrednjiKurs() {
		if (textField_SrednjiKurs == null) {
			textField_SrednjiKurs = new JTextField();
			textField_SrednjiKurs.setBounds(23, 181, 191, 23);
			textField_SrednjiKurs.setPreferredSize(new Dimension(100, 23));
			textField_SrednjiKurs.setColumns(10);
		}
		return textField_SrednjiKurs;
	}
	private JTextField getTextField_SkraceniNaziv() {
		if (textField_SkraceniNaziv == null) {
			textField_SkraceniNaziv = new JTextField();
			textField_SkraceniNaziv.setBounds(233, 181, 191, 23);
			textField_SkraceniNaziv.setPreferredSize(new Dimension(100, 23));
			textField_SkraceniNaziv.setColumns(10);
		}
		return textField_SkraceniNaziv;
	}
	private JButton getBtnNewDodaj() {
		if (btnNewDodaj == null) {
			btnNewDodaj = new JButton("Dodaj");
			btnNewDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sifra = textField_Sifra.getText();
					String naziv = textField_Naziv.getText();
					String prodajniKurs = textField_ProdajniKurs.getText();
					String kupovniKurs = textField_KupovniKurs.getText();
					String srednjiKurs = textField_SrednjiKurs.getText();
					String skraceniNaziv = textField_SkraceniNaziv.getText();
					
					String tekst = "Sifra: " + sifra + 
									", Naziv: " + naziv +
									", Prodajni kurs: "+ prodajniKurs +
									", Kupovni kurs: " + kupovniKurs + 
									", Srednji kurs: " + srednjiKurs +
									", Skraceni naziv: " + skraceniNaziv ;
					
					gp.upisiNaTextArea(tekst);
					dispose();
				}
			});
			btnNewDodaj.setBounds(233, 227, 191, 23);
			btnNewDodaj.setPreferredSize(new Dimension(100, 23));
		}
		return btnNewDodaj;
	}
	private JButton getBtnNewOdustani() {
		if (btnNewOdustani == null) {
			btnNewOdustani = new JButton("Odustani");
			btnNewOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewOdustani.setBounds(23, 227, 191, 23);
			btnNewOdustani.setPreferredSize(new Dimension(100, 23));
		}
		return btnNewOdustani;
	}
}
