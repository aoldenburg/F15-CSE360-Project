import java.awt.EventQueue;
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
		setBounds(100, 100, 454, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 63, 418, 352);
		contentPane.add(table);
		
		JLabel lblDoctorsName = new JLabel("Doctors Name");
		lblDoctorsName.setBounds(10, 39, 100, 14);
		contentPane.add(lblDoctorsName);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(122, 38, 100, 14);
		contentPane.add(lblLocation);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(217, 39, 46, 14);
		contentPane.add(lblDay);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(297, 38, 46, 14);
		contentPane.add(lblTime);
		
		JButton btnCancelApp = new JButton("Cancel Appointment");
		btnCancelApp.setBounds(250, 426, 150, 23);
		contentPane.add(btnCancelApp);
	}

}
