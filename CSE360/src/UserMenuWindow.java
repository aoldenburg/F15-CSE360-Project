import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class UserMenuWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMenuWindow frame = new UserMenuWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public UserMenuWindow() {
		JDialog jd = new JDialog();
		setTitle("IPIMS Main Menu");
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
		
		JButton btnScheduleAppointment = new JButton("Schedule Appointment");
		btnScheduleAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorList sAppt = new DoctorList();
				sAppt.setVisible(true);
			}
		});
		panel_1.add(btnScheduleAppointment);
		
		JButton btnViewAppointments = new JButton("View Appointments");
		btnViewAppointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AppointmentList apptList = new AppointmentList();
				apptList.setVisible(true);
			}
		});
		panel_1.add(btnViewAppointments);
		
		JButton btnUpdateAppointment = new JButton("Update Appointment");
		btnUpdateAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnUpdateAppointment);
	//	btnUpdateAppointment.setEnabled(false);
		
		JButton btnCancelAppointment = new JButton("Cancel Appointment");
		btnUpdateAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelAppointment cApp = new CancelAppointment();
				cApp.setVisible(true);
			}
		});
		panel_1.add(btnCancelAppointment);
		//btnCancelAppointment.setEnabled(false);
		
		JButton btnUpdateHealthInformation = new JButton("Update Health Information");
		btnUpdateHealthInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateHealth updateHealth = new UpdateHealth();
				updateHealth.setVisible(true);
			}
		});
		panel_1.add(btnUpdateHealthInformation);
		
		JButton btnSendAlertconcernsconditions = new JButton("Send Alert/Concerns/Conditions");
		panel_1.add(btnSendAlertconcernsconditions);
		//btnSendAlertconcernsconditions.setEnabled(false);
		JButton btnLogOut = new JButton("Log Out");
	//	btnLogOut.setEnabled(false);
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
