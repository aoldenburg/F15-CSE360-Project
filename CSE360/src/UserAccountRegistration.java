import javax.swing.JApplet;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
//test2
public class UserAccountRegistration extends JDialog{
	private JTextField userName;
	private JTextField password;
	private JTextField confirmPassword;
	private JTextField email;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField dobMonth;
	private JTextField dobDay;
	private JTextField dobYear;
	private JLabel lblGender;
	private JTextField currentAddress;
	private JTextField sSN;
	private JTextField emergencyContactName;
	private JTextField emergencyContactRelationship;
	private JTextField emergencyContactPhone;
	private JTextField insuranceName;
	private JTextField insuranceAddress;
	private JTextField policyNumber;
	private JTextField groupNumber;
	private JTextField effectiveMonth;
	private JTextField effectiveDay;
	private JTextField effectiveYear;
	private JTextField policyHolder;
	private JTextField cellPhone;
	private JTextField workPhone;
	private JTextField city;
	private JTextField state;
	private Border border;
	private String genderStr;
	private String maritalStatus;
	private boolean sms;
	String type;
	boolean once = true;
 
  
	public UserAccountRegistration() {
		setTitle("User Account Registration");
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("User Name");
		label.setBounds(10, 32, 70, 14);
		getContentPane().add(label);
		
		userName = new JTextField();
		userName.setColumns(10);
		userName.setBounds(135, 29, 148, 20);
		getContentPane().add(userName);
		border = userName.getBorder();
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(135, 60, 148, 20);
		getContentPane().add(password);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setBounds(10, 63, 106, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Confirm Password");
		label_2.setBounds(10, 94, 119, 14);
		getContentPane().add(label_2);
		
		confirmPassword = new JTextField();
		confirmPassword.setColumns(10);
		confirmPassword.setBounds(135, 91, 148, 20);
		getContentPane().add(confirmPassword);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(135, 122, 148, 20);
		getContentPane().add(email);
		
		JLabel label_3 = new JLabel("Email");
		label_3.setBounds(10, 125, 46, 14);
		getContentPane().add(label_3);
		
		JLabel lblNewLabel = new JLabel("Account Info");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 7, 106, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPersonalInformation.setBounds(10, 153, 148, 14);
		getContentPane().add(lblPersonalInformation);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 181, 70, 14);
		getContentPane().add(lblFirstName);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(135, 178, 148, 20);
		getContentPane().add(firstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 209, 70, 14);
		getContentPane().add(lblLastName);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(135, 206, 148, 20);
		getContentPane().add(lastName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(10, 237, 85, 14);
		getContentPane().add(lblDateOfBirth);
		
		dobMonth = new JTextField();
		dobMonth.setColumns(2);
		dobMonth.setBounds(135, 238, 30, 20);
		getContentPane().add(dobMonth);
		
		dobDay = new JTextField();
		dobDay.setColumns(2);
		dobDay.setBounds(182, 237, 30, 20);
		getContentPane().add(dobDay);
		
		dobYear = new JTextField();
		dobYear.setColumns(2);
		dobYear.setBounds(222, 237, 60, 20);
		getContentPane().add(dobYear);
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 262, 70, 14);
		getContentPane().add(lblGender);
		
		ButtonGroup gender = new ButtonGroup();
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(135, 264, 85, 23);
		getContentPane().add(rdbtnMale);
		gender.add(rdbtnMale);
		rdbtnMale.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				if(evt.getActionCommand() == "Male")
				{
					genderStr = "M";
				}				
			}
		});
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(135, 287, 109, 23);
		getContentPane().add(rdbtnFemale);
		gender.add(rdbtnFemale);
		rdbtnFemale.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				if(evt.getActionCommand() == "Female")
				{
					genderStr = "F";
				}		
			}
		});
		
		
		
		JLabel lblMaritalStatus = new JLabel("Account Type");
		lblMaritalStatus.setBounds(10, 321, 106, 14);
		getContentPane().add(lblMaritalStatus);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "PATIENT", "DOCTOR", "NURSE", "HSP", "LAB"}));
		comboBox.setBounds(135, 318, 148, 20);
		getContentPane().add(comboBox);
		comboBox.addItemListener(new ItemListener()
		{
	
		public void itemStateChanged(ItemEvent evt) 
		{
			if(evt.getStateChange() == ItemEvent.SELECTED)
			
				if(evt.getItem() == "PATIENT")
				{
					type = "PATIENT";
				}
				else if(evt.getItem() == "DOCTOR")
				{
					type = "DOCTOR";
				}
				else if(evt.getItem() == "NURSE")
				{
					type = "NURSE";
				}
				else if(evt.getItem() == "HSP")
				{
					type = "NSP";
				}
				else if(evt.getItem() == "LAB")
				{
					type = "LAB";
				}
			System.out.println(type);
		}
		});
		
		
		
	/*	JLabel lblCurrentAddress = new JLabel("Current Address");
		lblCurrentAddress.setBounds(10, 354, 106, 14);
		getContentPane().add(lblCurrentAddress);
		
		currentAddress = new JTextField();
		currentAddress.setBounds(135, 349, 148, 20);
		getContentPane().add(currentAddress);
		currentAddress.setColumns(10);
		*/
		
		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(10, 453, 46, 14);
		getContentPane().add(lblSsn);
		
		sSN = new JTextField();
		sSN.setBounds(135, 450, 148, 20);
		getContentPane().add(sSN);
		sSN.setColumns(10);
		
	/*	JLabel label_4 = new JLabel("Emergency Contact Information");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(312, 122, 226, 14);
		getContentPane().add(label_4);
		
		emergencyContactName = new JTextField();
		emergencyContactName.setColumns(10);
		emergencyContactName.setBounds(407, 144, 148, 20);
		getContentPane().add(emergencyContactName);
		
		JLabel label_5 = new JLabel("Name");
		label_5.setBounds(312, 147, 70, 14);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Relationship");
		label_6.setBounds(312, 178, 70, 14);
		getContentPane().add(label_6);
		
		emergencyContactRelationship = new JTextField();
		emergencyContactRelationship.setColumns(10);
		emergencyContactRelationship.setBounds(407, 175, 148, 20);
		getContentPane().add(emergencyContactRelationship);
		
		emergencyContactPhone = new JTextField();
		emergencyContactPhone.setColumns(10);
		emergencyContactPhone.setBounds(407, 209, 148, 20);
		getContentPane().add(emergencyContactPhone);
		
		JLabel label_7 = new JLabel("Phone");
		label_7.setBounds(312, 212, 70, 14);
		getContentPane().add(label_7);
		
		*/
		
		JLabel label_8 = new JLabel("Primary Insurance Information");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(312, 237, 226, 14);
		getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Name");
		label_9.setBounds(312, 268, 70, 14);
		getContentPane().add(label_9);
		
		insuranceName = new JTextField();
		insuranceName.setColumns(10);
		insuranceName.setBounds(407, 265, 148, 20);
		getContentPane().add(insuranceName);
		
		/*insuranceAddress = new JTextField();
		insuranceAddress.setColumns(10);
		insuranceAddress.setBounds(407, 296, 148, 20);
		getContentPane().add(insuranceAddress);
		
		JLabel label_10 = new JLabel("Address");
		label_10.setBounds(312, 299, 70, 14);
		getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Policy Number");
		label_11.setBounds(312, 327, 92, 14);
		getContentPane().add(label_11);
		
		policyNumber = new JTextField();
		policyNumber.setColumns(10);
		policyNumber.setBounds(407, 324, 148, 20);
		getContentPane().add(policyNumber);
		
		JLabel label_12 = new JLabel("Group Number");
		label_12.setBounds(312, 359, 92, 14);
		getContentPane().add(label_12);
		
		groupNumber = new JTextField();
		groupNumber.setColumns(10);
		groupNumber.setBounds(407, 356, 148, 20);
		getContentPane().add(groupNumber);
		
		JLabel label_13 = new JLabel("Effective Date");
		label_13.setBounds(312, 387, 92, 14);
		getContentPane().add(label_13);
		
		effectiveMonth = new JTextField();
		effectiveMonth.setColumns(2);
		effectiveMonth.setBounds(407, 384, 30, 20);
		getContentPane().add(effectiveMonth);
		
		effectiveDay = new JTextField();
		effectiveDay.setColumns(2);
		effectiveDay.setBounds(447, 384, 30, 20);
		getContentPane().add(effectiveDay);
		
		effectiveYear = new JTextField();
		effectiveYear.setColumns(2);
		effectiveYear.setBounds(495, 384, 60, 20);
		getContentPane().add(effectiveYear);
		
		policyHolder = new JTextField();
		policyHolder.setColumns(10);
		policyHolder.setBounds(407, 415, 148, 20);
		getContentPane().add(policyHolder);
		
		JLabel label_14 = new JLabel("Policy Holder");
		label_14.setBounds(312, 418, 92, 14);
		getContentPane().add(label_14);*/
		
		cellPhone = new JTextField();
		cellPhone.setColumns(10);
		cellPhone.setBounds(410, 55, 148, 20);
		getContentPane().add(cellPhone);
		
	/*	workPhone = new JTextField();
		workPhone.setColumns(10);
		workPhone.setBounds(410, 24, 148, 20);
		getContentPane().add(workPhone);
		
		JLabel label_15 = new JLabel("Work Phone");
		label_15.setBounds(313, 27, 78, 14);
		getContentPane().add(label_15);
		*/
		
		JLabel label_16 = new JLabel("Cell Phone");
		label_16.setBounds(313, 58, 85, 14);
		getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("Allow SMS");
		label_17.setBounds(312, 92, 70, 14);
		getContentPane().add(label_17);
		
		JRadioButton radioButton = new JRadioButton("Yes");
		radioButton.setBounds(410, 88, 60, 23);
		getContentPane().add(radioButton);
		radioButton.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent evt)
				{
					if(evt.getActionCommand() == "Yes")
					{
						sms = true;
					}
				}
			});
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBounds(463, 88, 56, 23);
		getContentPane().add(radioButton_1);
		radioButton_1.addActionListener( new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				if(evt.getActionCommand() == "No")
				{
					sms = false;
				}
			}
		});
		
	/*	JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 385, 92, 14);
		getContentPane().add(lblCity);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(135, 380, 148, 20);
		getContentPane().add(city);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(10, 418, 92, 14);
		getContentPane().add(lblState);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(135, 419, 148, 20);
		getContentPane().add(state);
		*/
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(466, 449, 89, 23);
		getContentPane().add(btnSubmit);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{userName, password, confirmPassword, email, firstName, lastName, dobMonth, dobDay, dobYear, rdbtnMale, rdbtnFemale, comboBox, currentAddress, city, state, sSN, workPhone, cellPhone, radioButton, radioButton_1, emergencyContactName, emergencyContactRelationship, emergencyContactPhone, insuranceName, insuranceAddress, policyNumber, groupNumber, effectiveMonth, effectiveDay, effectiveYear, policyHolder, btnSubmit}));
		btnSubmit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				boolean validInput = true;
				
				if(!validUserName())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Username must meet the following criteria:\n1. Must be at least 5 characters long\n2. Must contain only letters and numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
					userName.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				
				if(!validPassword())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Password must meet the following criteria:\n1. Must be at least 7 characters long\n2. Must contain only letters and numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
					password.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					password.setBorder(border);
				}
				
				if(!passwordCompare())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Passwords do not match.", "ERROR", JOptionPane.ERROR_MESSAGE);
					confirmPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					confirmPassword.setBorder(border);
				}
				
				if(!validEmail())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a valid email address.", "ERROR", JOptionPane.ERROR_MESSAGE);
					email.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					email.setBorder(border);
				}
				
		/*		if(!validBirthMonth())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a valid month. (1-12)", "ERROR", JOptionPane.ERROR_MESSAGE);
					dobMonth.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					dobMonth.setBorder(border);
				}
				
				if(!validBirthDay())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a valid day. (1-31)", "ERROR", JOptionPane.ERROR_MESSAGE);
					dobDay.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					dobDay.setBorder(border);
				}
				
				if(!validBirthYear())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a valid year.", "ERROR", JOptionPane.ERROR_MESSAGE);
					dobYear.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					dobYear.setBorder(border);
				}
				
				if(!validEffectiveMonth())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a valid month. (1-12)", "ERROR", JOptionPane.ERROR_MESSAGE);
					effectiveMonth.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					effectiveMonth.setBorder(border);
				}
				
				if(!validEffectiveDay())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a valid day. (1-31)", "ERROR", JOptionPane.ERROR_MESSAGE);
					effectiveDay.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					effectiveDay.setBorder(border);
				}
				
				if(!validEffectiveYear())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a valid year.", "ERROR", JOptionPane.ERROR_MESSAGE);
					effectiveYear.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					effectiveYear.setBorder(border);
				}
				//TODO: Fix Validation
				/*if(!validCellPhone())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a valid phone number. (4801222134)", "ERROR", JOptionPane.ERROR_MESSAGE);
					cellPhone.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					cellPhone.setBorder(border);
				}
				
				if(!validWorkPhone())
				{
					validInput = false;
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a valid phone number. (4801222134)", "ERROR", JOptionPane.ERROR_MESSAGE);
					workPhone.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					workPhone.setBorder(border);
				}*/
				//if all error checking is okay then create account
				if(validInput && type != null && once == true)
				{
					
					
					Account acct = new Account();
					
					
					int okay = 0;
					
					
					okay = acct.setUserName(userName.getText(), type);
					if(okay == 1)
					{
								
						acct.setPassword(password.getText(), type, userName.getText());
						acct.setFirstName(firstName.getText(), type, userName.getText());
						acct.setLastName(lastName.getText(), type, userName.getText());
						acct.setEmail(email.getText(), type, userName.getText());
						//acct.setCellNumber(cellPhone.getText());
						//acct.setWorkNumber(workPhone.getText());
				//		acct.setBirthDate(dobMonth.getText() +"/"+dobDay.getText()+"/"+dobYear.getText());
						acct.setGender(genderStr, type, userName.getText());
					//	acct.setStreetAddress(currentAddress.getText());
					//	acct.setCity(city.getText());
					//	acct.setState(state.getText());
						acct.setSSN(sSN.getText(), type, userName.getText());
						//acct.setEmergencyContactName(emergencyContactName.getText());
					//	acct.setEmergencyContactRelationship(emergencyContactRelationship.getText());
						//acct.setEmergencyContactPhone(Integer.parseInt(emergencyContactPhone.getText()));
						acct.setInsuranceName(insuranceName.getText(), type, userName.getText());
				/*		acct.setInsuranceAddress(insuranceAddress.getText());
						acct.setPolicyNumber(policyNumber.getText());
						acct.setGroupNumber(groupNumber.getText());
						acct.setEffectiveDate(
								effectiveMonth.getText() 
								+ "/"
								+ effectiveDay.getText()
								+ "/"
								+ effectiveYear.getText()
								);
						acct.setPolicyHolder(policyHolder.getText());
						DatabaseStub db = new DatabaseStub();
						db.createAccount(acct);			*/
						once = false; //so submit is only pressed once
						
						//========================================================
						//USERACCOUNTREGISTRATION.JAVA -> PARTICULAR USERMENU.JAVA
						//=========================================================
					
						switch(type)
						{
							case "PATIENT":
							{
								Frames.userMenu.setSize(580,580);
								Frames.userMenu.setLocationRelativeTo(null);
								Frames.userReg.setVisible(false); 
								Frames.userMenu.setVisible(true);
								break;
							}
							case "DOCTOR":
							{
								Frames.docMenu.setSize(580,580);
								Frames.docMenu.setLocationRelativeTo(null);
								Frames.userReg.setVisible(false); 
								Frames.docMenu.setVisible(true);
								break;
							}
							case "NURSE": 
							{
								Frames.nurseMenu.setSize(580,580);
								Frames.nurseMenu.setLocationRelativeTo(null);
								Frames.userReg.setVisible(false); 
								Frames.nurseMenu.setVisible(true);
								break;
							}
							case "LAB":
							{
								Frames.labMenu.setSize(580,580);
								Frames.labMenu.setLocationRelativeTo(null);
								Frames.userReg.setVisible(false); 
								Frames.labMenu.setVisible(true);
								break;
							}
							case "NSP":
							{
								Frames.nspMenu.setSize(580,580);
								Frames.nspMenu.setLocationRelativeTo(null);
								Frames.userReg.setVisible(false); 
								Frames.nspMenu.setVisible(true);
								break;
							}
						}
					}
				}
				else
				{
					JOptionPane.showConfirmDialog(null, "Please choose an account type.", "Alert Message", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		 
	}
	private boolean passwordCompare()
	{
		if(password.getText().equals(confirmPassword.getText()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private boolean validPassword()
	{
		String passwordText = password.getText();
		
		if(passwordText.length() >= 7)
		{
			if(passwordText.contains("!"))
			{
				return false;
			}
			else if(passwordText.contains("@"))
			{
				return false;
			}
			else if(passwordText.contains("#"))
			{
				return false;
			}
			else if(passwordText.contains("$"))
			{
				return false;
			}
			else if(passwordText.contains("%"))
			{
				return false;
			}
			else if(passwordText.contains("^"))
			{
				return false;
			}
			else if(passwordText.contains("&"))
			{
				return false;
			}
			else if(passwordText.contains("*"))
			{
				return false;
			}
			else if(passwordText.contains("("))
			{
				return false;
			}
			else if(passwordText.contains(")"))
			{
				return false;
			}
			else if(passwordText.contains("_"))
			{
				return false;
			}
			else if(passwordText.contains("-"))
			{
				return false;
			}
			else if(passwordText.contains("+"))
			{
				return false;
			}
			else if(passwordText.contains("="))
			{
				return false;
			}
			else if(passwordText.contains("["))
			{
				return false;
			}
			else if(passwordText.contains("]"))
			{
				return false;
			}
			else if(passwordText.contains("{"))
			{
				return false;
			}
			else if(passwordText.contains("}"))
			{
				return false;
			}
			else if(passwordText.contains("|"))
			{
				return false;
			}
			else if(passwordText.contains("\\"))
			{
				return false;
			}
			else if(passwordText.contains(";"))
			{
				return false;
			}
			else if(passwordText.contains(":"))
			{
				return false;
			}
			else if(passwordText.contains("\'"))
			{
				return false;
			}
			else if(passwordText.contains("\""))
			{
				return false;
			}
			else if(passwordText.contains("<"))
			{
				return false;
			}
			else if(passwordText.contains(">"))
			{
				return false;
			}
			else if(passwordText.contains("?"))
			{
				return false;
			}
			else if(passwordText.contains("/"))
			{
				return false;
			}
			else if(passwordText.contains(","))
			{
				return false;
			}
			else if(passwordText.contains("."))
			{
				return false;
			}
			else if(passwordText.contains("`"))
			{
				return false;
			}
			else if(passwordText.contains("~"))
			{
				return false;
			}
			else if(passwordText.contains(" "))
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}
	private boolean validUserName()
	{
		String userNameText = userName.getText();
		
		if(userNameText.length() >= 5)
		{
			if(userNameText.contains("!"))
			{
				return false;
			}
			else if(userNameText.contains("@"))
			{
				return false;
			}
			else if(userNameText.contains("#"))
			{
				return false;
			}
			else if(userNameText.contains("$"))
			{
				return false;
			}
			else if(userNameText.contains("%"))
			{
				return false;
			}
			else if(userNameText.contains("^"))
			{
				return false;
			}
			else if(userNameText.contains("&"))
			{
				return false;
			}
			else if(userNameText.contains("*"))
			{
				return false;
			}
			else if(userNameText.contains("("))
			{
				return false;
			}
			else if(userNameText.contains(")"))
			{
				return false;
			}
			else if(userNameText.contains("_"))
			{
				return false;
			}
			else if(userNameText.contains("-"))
			{
				return false;
			}
			else if(userNameText.contains("+"))
			{
				return false;
			}
			else if(userNameText.contains("="))
			{
				return false;
			}
			else if(userNameText.contains("["))
			{
				return false;
			}
			else if(userNameText.contains("]"))
			{
				return false;
			}
			else if(userNameText.contains("{"))
			{
				return false;
			}
			else if(userNameText.contains("}"))
			{
				return false;
			}
			else if(userNameText.contains("|"))
			{
				return false;
			}
			else if(userNameText.contains("\\"))
			{
				return false;
			}
			else if(userNameText.contains(";"))
			{
				return false;
			}
			else if(userNameText.contains(":"))
			{
				return false;
			}
			else if(userNameText.contains("\'"))
			{
				return false;
			}
			else if(userNameText.contains("\""))
			{
				return false;
			}
			else if(userNameText.contains("<"))
			{
				return false;
			}
			else if(userNameText.contains(">"))
			{
				return false;
			}
			else if(userNameText.contains("?"))
			{
				return false;
			}
			else if(userNameText.contains("/"))
			{
				return false;
			}
			else if(userNameText.contains(","))
			{
				return false;
			}
			else if(userNameText.contains("."))
			{
				return false;
			}
			else if(userNameText.contains("`"))
			{
				return false;
			}
			else if(userNameText.contains("~"))
			{
				return false;
			}
			else if(userNameText.contains(" "))
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}

	private boolean validEmail()
	{
		String emailString = email.getText();
		
		Pattern p = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
		
		Matcher m = p.matcher(emailString);
		
		if(m.matches())
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	private boolean validBirthMonth()
	{
		try
		{
			int i = Integer.parseInt(dobMonth.getText());
			if(i > 12 || i < 1)
			{
				return false;
			}
			else
			{
				return true;
			}
		}catch(NumberFormatException e)
		{
			return false;
		}
	}

	private boolean validBirthDay()
	{
		try{
			
			int i = Integer.parseInt(dobDay.getText());
			if(i > 31 || i < 1)
			{
				return false;
			}
			else
			{
				return true;
			}
		}catch(NumberFormatException e)
		{
			return false;
		}
	}
	private boolean validBirthYear()
	{
		try{
			int i = Integer.parseInt(dobYear.getText());

			if(i < 1800 || i > 2100)
			{
				return false;
			}
			else
			{
				return true;
			}
		}catch(NumberFormatException e)
		{
			return false;
		}
	}
	
	private boolean validEffectiveMonth()
	{
		try
		{
			int i = Integer.parseInt(effectiveMonth.getText());
			if(i > 12 || i < 1)
			{
				return false;
			}
			else
			{
				return true;
			}
		}catch(NumberFormatException e)
		{
			return false;
		}
	}

	private boolean validEffectiveDay()
	{
		try{
			
			int i = Integer.parseInt(effectiveDay.getText());
			if(i > 31 || i < 1)
			{
				return false;
			}
			else
			{
				return true;
			}
		}catch(NumberFormatException e)
		{
			return false;
		}
	}
	private boolean validEffectiveYear()
	{
		try{
			int i = Integer.parseInt(effectiveYear.getText());

			if(i < 1800 || i > 2100)
			{
				return false;
			}
			else
			{
				return true;
			}
		}catch(NumberFormatException e)
		{
			return false;
		}
	}

	private boolean validCellPhone()
	{
		try{
			int i = Integer.parseInt(cellPhone.getText());

			if(cellPhone.getText().length() != 10)
			{
				return false;
			}
			else
			{
				return true;
			}
		}catch(NumberFormatException e)
		{
			return false;
		}
	}
	
	private boolean validWorkPhone()
	{
		try{
			int i = Integer.parseInt(workPhone.getText());

			if(workPhone.getText().length() != 10)
			{
				return false;
			}
			else
			{
				return true;
			}
		}catch(NumberFormatException e)
		{
			return false;
		}
	}


}
