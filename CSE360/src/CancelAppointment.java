import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

public class CancelAppointment extends JFrame{
	
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelAppointment frame = new CancelAppointment();
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
	public CancelAppointment() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 75, 418, 352);
		contentPane.add(table);
		
		JLabel lblDoctorsName = new JLabel("Doctors Name");
		lblDoctorsName.setBounds(10, 30, 150, 25);
		lblDoctorsName.setFont(new Font("Serif", Font.PLAIN, 24));
		contentPane.add(lblDoctorsName);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(122, 30, 100, 14);
		lblLocation.setFont(new Font("Serif", Font.PLAIN, 24));
		contentPane.add(lblLocation);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(217, 30, 46, 14);
		lblDay.setFont(new Font("Serif", Font.PLAIN, 24));
		contentPane.add(lblDay);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(297, 30, 46, 14);
		lblTime.setFont(new Font("Serif", Font.PLAIN, 24));
		contentPane.add(lblTime);
		
		JButton btnCancelApp = new JButton("Cancel Appointment");
		btnCancelApp.setBounds(250, 426, 150, 23);
		contentPane.add(btnCancelApp);
	}

}
