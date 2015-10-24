import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
//test
public class UpdateHealth extends JDialog {

	private JPanel contentPane;
	private JCheckBox chckbxChestPain;
	private JCheckBox chckbxNausea;
	private JCheckBox chckbxCough;
	private JCheckBox chckbxRash;
	private JCheckBox chckbxHeadache;
	private JCheckBox chckbxFever;
	private JCheckBox chckbxCongestion;
	private JCheckBox chckbxSoreThroat;
	private JCheckBox chckbxJointPain;
	private JCheckBox chckbxArmPain;
	private JCheckBox chckbxNeckPain;
	private JCheckBox chckbxBodyAches;
	private JCheckBox chckbxOther;
	private JList<String> list;
	private DefaultListModel<String> model;

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
		setBounds(100, 100, 523, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPatientHealthInformation = new JLabel("Patient Health Information");
		lblPatientHealthInformation.setBounds(10, 11, 209, 14);
		contentPane.add(lblPatientHealthInformation);
		
		JLabel lblAddNewHealth = new JLabel("Add new Health Info");
		lblAddNewHealth.setBounds(10, 320, 166, 14);
		contentPane.add(lblAddNewHealth);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(394, 423, 89, 23);
		btnSubmit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				addNewHealthInfo();
			}
			
		});
		contentPane.add(btnSubmit);
		
		chckbxChestPain = new JCheckBox("Chest Pain");
		chckbxChestPain.setBounds(10, 341, 97, 23);
		contentPane.add(chckbxChestPain);
		
		chckbxNausea = new JCheckBox("Nausea");
		chckbxNausea.setBounds(10, 367, 97, 23);
		contentPane.add(chckbxNausea);
		
		chckbxCough = new JCheckBox("Cough");
		chckbxCough.setBounds(10, 393, 97, 23);
		contentPane.add(chckbxCough);
		
		chckbxRash = new JCheckBox("Rash");
		chckbxRash.setBounds(109, 341, 97, 23);
		contentPane.add(chckbxRash);
		
		chckbxHeadache = new JCheckBox("Headache");
		chckbxHeadache.setBounds(109, 367, 97, 23);
		contentPane.add(chckbxHeadache);
		
		chckbxFever = new JCheckBox("Fever");
		chckbxFever.setBounds(109, 393, 97, 23);
		contentPane.add(chckbxFever);
		
		chckbxCongestion = new JCheckBox("Congestion");
		chckbxCongestion.setBounds(208, 341, 97, 23);
		contentPane.add(chckbxCongestion);
		
		chckbxSoreThroat = new JCheckBox("Sore Throat");
		chckbxSoreThroat.setBounds(208, 367, 97, 23);
		contentPane.add(chckbxSoreThroat);
		
		chckbxJointPain = new JCheckBox("Joint Pain");
		chckbxJointPain.setBounds(208, 393, 97, 23);
		contentPane.add(chckbxJointPain);
		
		chckbxArmPain = new JCheckBox("Arm Pain");
		chckbxArmPain.setBounds(307, 341, 89, 23);
		contentPane.add(chckbxArmPain);
		
		chckbxNeckPain = new JCheckBox("Neck Pain");
		chckbxNeckPain.setBounds(307, 367, 97, 23);
		contentPane.add(chckbxNeckPain);
		
		chckbxBodyAches = new JCheckBox("Body Aches");
		chckbxBodyAches.setBounds(307, 393, 97, 23);
		contentPane.add(chckbxBodyAches);
		
		chckbxOther = new JCheckBox("Other");
		chckbxOther.setBounds(394, 341, 97, 23);
		contentPane.add(chckbxOther);
		
		list = new JList<String>();
		model = new DefaultListModel<String>();
		list.setModel(model);
		list.setBounds(10, 36, 468, 273);
		contentPane.add(list);
	}
	
	public void addNewHealthInfo()
	{
		//TODO: Redo this with database
		String health = "";
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = new Date();
		health += dateFormat.format(date) + ": ";
		boolean alert = false;
		
		if(chckbxChestPain.isSelected())
		{
			health += "Chest Pain, ";
			alert = true;
			if(alert == true)
			{
				JOptionPane.showConfirmDialog(null, "Alert will be sent to your Doctor", "Alert Message", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
			}
			alert = false;
		}
		if(chckbxNausea.isSelected())
		{
			health += "Nausea, ";
		}
		if(chckbxCough.isSelected())
		{
			health += "Cough, ";
		}
		if(chckbxRash.isSelected())
		{
			health += "Rash, ";
		}
		if(chckbxHeadache.isSelected())
		{
			health += "Headache, ";
		}
		if(chckbxFever.isSelected())
		{
			health += "Fever, ";
			alert = true;
			if(alert == true)
			{
				JOptionPane.showConfirmDialog(null, "Alert will be sent to your Doctor", "Alert Message", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
			}
			alert = false;  //test
		}
		if(chckbxCongestion.isSelected())
		{
			health += "Congestion, ";
		}
		if(chckbxSoreThroat.isSelected())
		{
			health += "Sore Throat, ";
		}
		if(chckbxJointPain.isSelected())
		{
			health += "Joint Pain, ";
		}
		if(chckbxArmPain.isSelected())
		{
			health += "Arm Pain, ";
		}
		if(chckbxNeckPain.isSelected())
		{
			health += "Neck Pain, ";
		}
		if(chckbxBodyAches.isSelected())
		{
			health += "Body Aches, ";
		}
		if(chckbxOther.isSelected())
		{
			health += "Other. ";
		}
		
		model.addElement(health);
		list.setModel(model);
		this.repaint();
		this.revalidate();
		
		
	}
}
