import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class EPrescribeWindow extends JFrame{
	
	private JPanel contentPane;
	
	/*public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EPrescribeWindow frame = new EPrescribeWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	*/
	public EPrescribeWindow(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("E-Prescription");
		
		JLabel lblMedicationName = new JLabel("Medication Name:");
		lblMedicationName.setBounds(20, 50, 200, 50);
		lblMedicationName.setFont(new Font("Serif", Font.PLAIN, 24));
		contentPane.add(lblMedicationName);
		
		JLabel lblAmount = new JLabel("Amount Prescribed:");
		lblAmount.setBounds(10, 150, 200, 50);
		lblAmount.setFont(new Font("Serif", Font.PLAIN, 24));
		contentPane.add(lblAmount);
		
		JTextField tfMedication = new JTextField();
		tfMedication.setBounds(220, 50, 200, 50);
		tfMedication.setFont(new Font("Serif", Font.PLAIN, 24));
		contentPane.add(tfMedication);
		
		JTextField tfAmount = new JTextField();
		tfAmount.setBounds(220, 150, 200, 50);
		tfAmount.setFont(new Font("Serif", Font.PLAIN, 24));
		contentPane.add(tfAmount);
		
		JButton btnPrescribe = new JButton("Prescribe");
		btnPrescribe.setBounds(50, 250, 150, 50);
		btnPrescribe.setFont(new Font("Serif", Font.PLAIN, 24));
		btnPrescribe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getContentPane(), "Perscription Placed for: "+ tfAmount.getText() + " mgs of " + tfMedication.getText() , "Perscription Placed Sucessfully", JOptionPane.PLAIN_MESSAGE);
				Frames.prescribe.setVisible(false);
				Frames.docMenu.setVisible(true);
			}
		});
		contentPane.add(btnPrescribe);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(250, 250, 150, 50);
		btnCancel.setFont(new Font("Serif", Font.PLAIN, 24));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.prescribe.setVisible(false);
				Frames.docMenu.setVisible(true);
			}
		});
		contentPane.add(btnCancel);
		
	}
	
}

