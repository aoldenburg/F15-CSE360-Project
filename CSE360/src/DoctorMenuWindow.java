import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DoctorMenuWindow extends JFrame{
	
	private JPanel contentPane;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorMenuWindow frame = new DoctorMenuWindow();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DoctorMenuWindow(){
		
		setTitle("Doctor Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblpleaseSelectAn = new JLabel("<html><b>Please Select an Option</b></html>");
		panel.add(lblpleaseSelectAn);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnAccessPatientRecords = new JButton("Access Patient Records");
		btnAccessPatientRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnAccessPatientRecords);
		btnAccessPatientRecords.setEnabled(false);
		
		JButton btnAccessLabRecords = new JButton("Access Lab Records");
		btnAccessLabRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnAccessLabRecords);
		btnAccessLabRecords.setEnabled(false);
		
		JButton btnUpdateHealthCondition = new JButton("Update Health Condition");
		btnUpdateHealthCondition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnUpdateHealthCondition);
		btnUpdateHealthCondition.setEnabled(false);
		
		JButton btnEPrescribe = new JButton("E-Prescribe Medication");
		btnEPrescribe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnEPrescribe);
		btnEPrescribe.setEnabled(false);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setEnabled(false);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnLogOut);
		
		JButton btnExitProgram = new JButton("Exit Program");
		btnExitProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel_1.add(btnExitProgram);
	}
}
