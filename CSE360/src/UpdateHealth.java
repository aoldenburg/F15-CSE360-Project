import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class UpdateHealth extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateHealth frame = new UpdateHealth();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateHealth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPatientHealthInformation = new JLabel("Patient Health Information");
		lblPatientHealthInformation.setBounds(10, 11, 135, 14);
		contentPane.add(lblPatientHealthInformation);
		
		JLabel lblAddNewHealth = new JLabel("Add new Health Info");
		lblAddNewHealth.setBounds(10, 331, 113, 14);
		contentPane.add(lblAddNewHealth);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 355, 354, 144);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(394, 476, 89, 23);
		contentPane.add(btnSubmit);
		
		table = new JTable();
		table.setBounds(20, 36, 463, 273);
		contentPane.add(table);
	}
}
