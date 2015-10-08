import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class AdminStaffAccountCreation {

	private JFrame frame;
	private JTextField userName;
	private JTextField password;
	private JTextField confirmPassword;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField email;
	private JTextField workPhone;
	private JTextField cellPhone;
	private Border border;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminStaffAccountCreation window = new AdminStaffAccountCreation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminStaffAccountCreation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(15, 16, 96, 20);
		frame.getContentPane().add(lblUserName);
		
		userName = new JTextField();
		userName.setBounds(158, 13, 255, 26);
		frame.getContentPane().add(userName);
		userName.setColumns(10);
		
		border = userName.getBorder();
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(158, 55, 255, 26);
		frame.getContentPane().add(password);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(15, 58, 69, 20);
		frame.getContentPane().add(lblPassword);
		
		confirmPassword = new JTextField();
		confirmPassword.setColumns(10);
		confirmPassword.setBounds(158, 97, 255, 26);
		frame.getContentPane().add(confirmPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(15, 100, 129, 20);
		frame.getContentPane().add(lblConfirmPassword);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(158, 179, 255, 26);
		frame.getContentPane().add(firstName);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(158, 221, 255, 26);
		frame.getContentPane().add(lastName);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(158, 289, 255, 26);
		frame.getContentPane().add(email);
		
		workPhone = new JTextField();
		workPhone.setColumns(10);
		workPhone.setBounds(158, 331, 255, 26);
		frame.getContentPane().add(workPhone);
		
		cellPhone = new JTextField();
		cellPhone.setColumns(10);
		cellPhone.setBounds(158, 373, 255, 26);
		frame.getContentPane().add(cellPhone);
		
		JComboBox accountType = new JComboBox();
		accountType.setModel(new DefaultComboBoxModel(AccountType.values()));
		accountType.setBounds(158, 415, 255, 26);
		frame.getContentPane().add(accountType);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(15, 182, 96, 20);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(15, 224, 96, 20);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(15, 292, 69, 20);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblWorkPhone = new JLabel("Work Phone");
		lblWorkPhone.setBounds(15, 334, 96, 20);
		frame.getContentPane().add(lblWorkPhone);
		
		JLabel lblCellPhone = new JLabel("Cell Phone");
		lblCellPhone.setBounds(15, 376, 129, 20);
		frame.getContentPane().add(lblCellPhone);
		
		JLabel lblAccountType = new JLabel("Account Type");
		lblAccountType.setBounds(15, 418, 129, 20);
		frame.getContentPane().add(lblAccountType);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(298, 457, 115, 29);
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				boolean validInput = true;
				
				if(!validPassword())
				{
					validInput = false;
					JOptionPane.showMessageDialog(frame, "Password must meet the following criteria:\n1. Must be at least 7 characters long\n2. Must contain only letters and numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
					password.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					password.setBorder(border);
				}
				
				if(!passwordCompare())
				{
					validInput = false;
					JOptionPane.showMessageDialog(frame, "Passwords do not match.", "ERROR", JOptionPane.ERROR_MESSAGE);
					confirmPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					confirmPassword.setBorder(border);
				}
				
				if(!validEmail())
				{
					validInput = false;
					JOptionPane.showMessageDialog(frame, "Please enter a valid email address.", "ERROR", JOptionPane.ERROR_MESSAGE);
					email.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					email.setBorder(border);
				}			
			}
			
		});
		frame.getContentPane().add(btnSubmit);
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
	private boolean validWorkPhone()
	{
		String phone = workPhone.getText();
		
		phone = phone.replace("-", "");
		phone = phone.replace("(", "");
		phone = phone.replace(")", "");
		
		return true;
	}
}
		
		