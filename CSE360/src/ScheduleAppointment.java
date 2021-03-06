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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ScheduleAppointment extends JDialog {

	private JPanel contentPane;
	private JTextField textFieldReason;
	private JCheckBox chckbxMonday, chckbxTuesday,chckbxWednesday,chckbxThurday,chckbxFriday,
						chckbxAm, chckbxAm_1, chckbxAm_2,chckbxAm_3, chckbxPm_1,chckbxPm_2,
						chckbxPm,chckbxPm_3;
	String day = "";
	String time = "";
	String id = "";
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	
	public ScheduleAppointment() 
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 493, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 
		
		JLabel lblWhatDaysOf = new JLabel("What Days of the week are you available?*");
		lblWhatDaysOf.setBounds(10, 162, 247, 14);
		contentPane.add(lblWhatDaysOf);
		
		 chckbxMonday = new JCheckBox("Monday");
		chckbxMonday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				day = "";
				day = arg0.getActionCommand();
			}
		});
		chckbxMonday.setBounds(6, 184, 64, 23);
		contentPane.add(chckbxMonday);
		
		 chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = "";
				day = e.getActionCommand();
			}
		});
		chckbxTuesday.setBounds(68, 184, 70, 23);
		contentPane.add(chckbxTuesday);
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = "";
				day = e.getActionCommand();
			}
		});
		chckbxWednesday.setBounds(140, 184, 83, 23);
		contentPane.add(chckbxWednesday);
		
		 chckbxThurday = new JCheckBox("Thurday");
		chckbxThurday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = "";
				day = e.getActionCommand();
			}
		});
		chckbxThurday.setBounds(224, 184, 83, 23);
		contentPane.add(chckbxThurday);
		
		 chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = "";
				day = e.getActionCommand();
			}
		});
		chckbxFriday.setBounds(6, 210, 64, 23);
		contentPane.add(chckbxFriday);
		
		JLabel lblWhatTimesOf = new JLabel("What times of the day are you available?*");
		lblWhatTimesOf.setBounds(10, 266, 209, 14);
		contentPane.add(lblWhatTimesOf);
		
		JLabel lblReasonForAppointment = new JLabel("Reason for Appointment:*");
		lblReasonForAppointment.setBounds(10, 355, 213, 14);
		contentPane.add(lblReasonForAppointment);
		
		textFieldReason = new JTextField();
		textFieldReason.setBounds(10, 380, 457, 97);
		contentPane.add(textFieldReason);
		textFieldReason.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				id = Frames.rand();
				Frames.insert("SCHEDULE", Frames.user, id);
				Frames.update("SCHEDULE","DAY", Frames.user, day, id);
				Frames.update("SCHEDULE","TIME", Frames.user, time, id);
			//	String = Frames.get(find, attr, table);
			//	Frames.update("SCHEDULE","TIME", Frames.user, )
				Frames.userMenu.setSize(580,580);
				
				
				chckbxMonday.setSelected(false);
				chckbxTuesday.setSelected(false);
				chckbxWednesday.setSelected(false);
				chckbxThurday.setSelected(false);
				chckbxFriday.setSelected(false);
				chckbxAm.setSelected(false);
				chckbxAm_1.setSelected(false);
				chckbxAm_2.setSelected(false);
				chckbxAm_3.setSelected(false);
				chckbxPm_1.setSelected(false);
				chckbxPm_2.setSelected(false);
				chckbxPm.setSelected(false);
				chckbxPm_3.setSelected(false);
				
				Frames.userMenu.setLocationRelativeTo(null);
				Frames.appt.setVisible(false); 
				Frames.userMenu.setVisible(true);
			}
		});
		btnSubmit.setBounds(378, 488, 89, 23);
		contentPane.add(btnSubmit);
		
		 chckbxAm = new JCheckBox("8 am");
		chckbxAm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = "";
				time = e.getActionCommand();
				
			}
		});
		chckbxAm.setBounds(10, 287, 49, 23);
		contentPane.add(chckbxAm);
		
		 chckbxAm_1 = new JCheckBox("9 am");
		chckbxAm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = "";
				time = e.getActionCommand();
			}
		});
		chckbxAm_1.setBounds(78, 287, 56, 23);
		contentPane.add(chckbxAm_1);
		
		 chckbxAm_2 = new JCheckBox("10 am");
		chckbxAm_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = "";
				time = e.getActionCommand();
			}
		});
		chckbxAm_2.setBounds(153, 287, 66, 23);
		contentPane.add(chckbxAm_2);
		
		 chckbxAm_3 = new JCheckBox("11 am");
		chckbxAm_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = "";
				time = e.getActionCommand();
			}
		});
		chckbxAm_3.setBounds(224, 287, 66, 23);
		contentPane.add(chckbxAm_3);
		
		 chckbxPm = new JCheckBox("12 pm");
		chckbxPm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = "";
				time = e.getActionCommand();
			}
		});
		chckbxPm.setBounds(10, 313, 66, 23);
		contentPane.add(chckbxPm);
		
		 chckbxPm_1 = new JCheckBox("1 pm");
		chckbxPm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = "";
				time = e.getActionCommand();
			}
		});
		chckbxPm_1.setBounds(78, 313, 66, 23);
		contentPane.add(chckbxPm_1);
		
		 chckbxPm_2 = new JCheckBox("2 pm");
		chckbxPm_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = "";
				time = e.getActionCommand();
			}
		});
		chckbxPm_2.setBounds(153, 313, 66, 23);
		contentPane.add(chckbxPm_2);
		
		 chckbxPm_3 = new JCheckBox("3 pm");
		chckbxPm_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time = "";
				time = e.getActionCommand();
			}
		});
		chckbxPm_3.setBounds(224, 313, 66, 23);
		contentPane.add(chckbxPm_3);
		
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(21, 50, 164, 20);
		contentPane.add(comboBox);
		
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			list = new ArrayList(Frames.list());
			for(int i = 0; i < list.size(); i++)
			{
				comboBox.addItem(list.get(i));
			}
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		comboBox.addItemListener(new ItemListener()
		{
	
			public void itemStateChanged(ItemEvent evt) 
			{
				
				
				
				
			}
		});
		
		JLabel lblDoctors = new JLabel("Doctors");
		lblDoctors.setBounds(21, 25, 46, 14);
		contentPane.add(lblDoctors);
	}
}
