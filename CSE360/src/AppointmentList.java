import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;

public class AppointmentList extends JDialog {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppointmentList frame = new AppointmentList();
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
	public AppointmentList() {
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
		lblDoctorsName.setBounds(10, 39, 67, 14);
		contentPane.add(lblDoctorsName);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(122, 38, 46, 14);
		contentPane.add(lblLocation);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(217, 39, 46, 14);
		contentPane.add(lblDay);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(297, 38, 46, 14);
		contentPane.add(lblTime);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBounds(339, 426, 89, 23);
		contentPane.add(btnSelect);
	}
}
