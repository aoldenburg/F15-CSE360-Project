import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

public class NSPStaffMenuWindow extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NSPStaffMenuWindow frame = new NSPStaffMenuWindow();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public NSPStaffMenuWindow(){
		
		setTitle("NSP Staff Main Menu");
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
		
		JButton btnUpdateMedicalReports = new JButton("Update Medical Reports");
		btnUpdateMedicalReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnUpdateMedicalReports);
		btnUpdateMedicalReports.setEnabled(false);
		
		JButton btnUploadMedicalHistory = new JButton("Upload Medical History");
		btnUploadMedicalHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnUploadMedicalHistory);
		btnUploadMedicalHistory.setEnabled(false);
		
		JButton btnUpdateMedicalHistory = new JButton("Update Medical History");
		btnUpdateMedicalHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnUpdateMedicalHistory);
		btnUpdateMedicalHistory.setEnabled(false);
		
		JButton btnAlert = new JButton("Issue Emergency Alert to HSP Staff");
		btnAlert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnAlert);
		btnAlert.setEnabled(false);
		
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
