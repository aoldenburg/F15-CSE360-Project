import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JLabel;

public class DoctorList extends JDialog {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorList frame = new DoctorList();
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
	public DoctorList() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 484, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRequestAppointment = new JButton("Request Appointment");
		btnRequestAppointment.setBounds(277, 467, 181, 23);
		contentPane.add(btnRequestAppointment);
		
		table = new JTable();
		table.setBounds(10, 70, 448, 386);
		contentPane.add(table);
		
		JLabel lblDoctorName = new JLabel("Doctor Name");
		lblDoctorName.setBounds(10, 45, 116, 14);
		contentPane.add(lblDoctorName);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(136, 45, 88, 14);
		contentPane.add(lblLocation);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(234, 45, 88, 14);
		contentPane.add(lblCategory);
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setBounds(346, 45, 94, 14);
		contentPane.add(lblInsurance);
	}

}
