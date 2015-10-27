import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ScheduleAppointment extends JDialog {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScheduleAppointment frame = new ScheduleAppointment();
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
	public ScheduleAppointment() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 493, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);//<<<<<<< HEAD//=======
		contentPane.setLayout(null); //>>>>>>> branch 'master' of https://github.com/aoldenburg/F15-CSE360-Project.git
		
		JLabel lblHaveYouSeen = new JLabel("Have you seen this doctor before?*");
		lblHaveYouSeen.setBounds(10, 11, 225, 14);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBounds(10, 32, 64, 23);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(75, 32, 95, 23);
		
		JLabel lblDoYouPrefer = new JLabel("Do you Prefer a Male or Female Physician?*");
		lblDoYouPrefer.setBounds(10, 86, 250, 14);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(6, 107, 70, 23);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(75, 107, 109, 23);
		
		JLabel lblWhatDaysOf = new JLabel("What days of the week are you available?*");
		lblWhatDaysOf.setBounds(10, 162, 247, 14);
		
		JCheckBox chckbxMonday = new JCheckBox("Monday");
		chckbxMonday.setBounds(10, 184, 85, 23);
		
		JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setBounds(100, 184, 85, 23);
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setBounds(195, 184, 100, 23);
		
		JCheckBox chckbxThurday = new JCheckBox("Thursday");
		chckbxThurday.setBounds(305, 184, 85, 23);
		
		JCheckBox chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setBounds(10, 210, 85, 23);
		
		JCheckBox chckbxSaturday = new JCheckBox("Saturday");
		chckbxSaturday.setBounds(100, 210, 85, 23);
		
		JCheckBox chckbxSunday = new JCheckBox("Sunday");
		chckbxSunday.setBounds(195, 210, 85, 23);
		
		JLabel lblWhatTimesOf = new JLabel("What times of the day are you available?*");
		lblWhatTimesOf.setBounds(10, 266, 240, 14);
		
		JLabel lblReasonForAppointment = new JLabel("Reason for Appointment:*");
		lblReasonForAppointment.setBounds(10, 355, 213, 14);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(378, 488, 89, 23);
		
		JCheckBox chckbxAm = new JCheckBox("8 am");
		chckbxAm.setBounds(10, 287, 65, 23);
		
		JCheckBox chckbxAm_1 = new JCheckBox("9 am");//<<<<<<< HEAD
		chckbxAm_1.setBounds(78, 287, 65, 23);
//=======
		chckbxAm_1.setBounds(78, 287, 56, 23);
		contentPane.add(chckbxAm_1);
//>>>>>>> branch 'master' of https://github.com/aoldenburg/F15-CSE360-Project.git
		
		JCheckBox chckbxAm_2 = new JCheckBox("10 am");
		chckbxAm_2.setBounds(153, 287, 65, 23);
		
		JCheckBox chckbxAm_3 = new JCheckBox("11 am");
		chckbxAm_3.setBounds(224, 287, 65, 23);
		
		JCheckBox chckbxPm = new JCheckBox("12 pm");
		chckbxPm.setBounds(10, 313, 65, 23);
		
		JCheckBox chckbxPm_1 = new JCheckBox("1 pm");
		chckbxPm_1.setBounds(78, 313, 65, 23);
		
		JCheckBox chckbxPm_2 = new JCheckBox("2 pm");
		chckbxPm_2.setBounds(153, 313, 65, 23);
		
		JCheckBox chckbxPm_3 = new JCheckBox("3 pm");
		chckbxPm_3.setBounds(224, 313, 65, 23);
		contentPane.setLayout(null);
		contentPane.add(lblHaveYouSeen);
		contentPane.add(rdbtnYes);
		contentPane.add(rdbtnNo);
		contentPane.add(lblDoYouPrefer);
		contentPane.add(rdbtnMale);
		contentPane.add(rdbtnFemale);
		contentPane.add(lblWhatDaysOf);
		contentPane.add(chckbxMonday);
		contentPane.add(chckbxTuesday);
		contentPane.add(chckbxWednesday);
		contentPane.add(chckbxThurday);
		contentPane.add(chckbxFriday);
		contentPane.add(chckbxSaturday);
		contentPane.add(chckbxSunday);
		contentPane.add(lblWhatTimesOf);
		contentPane.add(lblReasonForAppointment);
		contentPane.add(btnSubmit);
		contentPane.add(chckbxAm);
		contentPane.add(chckbxAm_1);
		contentPane.add(chckbxAm_2);
		contentPane.add(chckbxAm_3);
		contentPane.add(chckbxPm);
		contentPane.add(chckbxPm_1);
		contentPane.add(chckbxPm_2);
		contentPane.add(chckbxPm_3);
		
		JScrollPane scrollPane = new JScrollPane();// added a Scroll Pane
		scrollPane.setBounds(10, 380, 457, 100);
		contentPane.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea(); //changed TextField to TextArea
		textArea_1.setLineWrap(true);
		scrollPane.setViewportView(textArea_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 12));
		textArea.setLineWrap(true);
		textArea.setBounds(10, 380, 440, 95);
		
	}
}