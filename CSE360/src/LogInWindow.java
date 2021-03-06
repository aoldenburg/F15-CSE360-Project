import java.awt.Color;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class LogInWindow extends JFrame {
	public JTextField username;
/*	public JTextField password;*/
	private JPasswordField password;
	
	public JButton btnNewPatient;
	public JButton btnLogin;
	private String acctType;
	String user, pass;
	
	public Account act = new Account();
	/**
	 * Create the applet.
	 */
	public LogInWindow() 
	{
		getContentPane().setLayout(null);
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(10, 11, 86, 14);
		getContentPane().add(lblUsername);
		
		username = new JTextField();
		username.setBounds(106, 8, 224, 20);
		getContentPane().add(username);
		username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 42, 86, 14);
		getContentPane().add(lblPassword);
		 
/*		password = new JTextField();
		password.setColumns(10);
		password.setBounds(106, 39, 224, 20);
		getContentPane().add(password);*/
		 
		password = new JPasswordField();
		password.setColumns(10);
		password.setBounds(106, 40, 224, 20);
		getContentPane().add(password);
		
		//Login Button
		btnLogin = new JButton("Login");
		btnLogin.setBounds(239, 70, 89, 29);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
			
				if(username.getText().equals(""))
				{
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a Username", "ERROR", JOptionPane.ERROR_MESSAGE);
					username.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else if(password.equals(""))
				{
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a Password", "ERROR", JOptionPane.ERROR_MESSAGE);
					password.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				else
				{
					
					user = username.getText();
					pass = String.valueOf(password.getPassword());
					act = SQLiteDB.accessAccount(user, pass);
					if(act != null)
					{
						switch(act.getAccountType())
						{
							case Patient:
							{	Frames.user = user;
								Frames.userMenu.setSize(580,580);
								Frames.userMenu.setLocationRelativeTo(null);
								Frames.login.setVisible(false); 
								Frames.userMenu.setVisible(true);
								break;
							}
							case Doctor:
							{	Frames.user = user;
								Frames.docMenu.setSize(580,580);
								Frames.docMenu.setLocationRelativeTo(null);
								Frames.login.setVisible(false); 
								Frames.docMenu.setVisible(true);
								break;
							}
							case Nurse: 
							{
								Frames.user = user;
								Frames.nurseMenu.setSize(580,580);
								Frames.nurseMenu.setLocationRelativeTo(null);
								Frames.login.setVisible(false); 
								Frames.nurseMenu.setVisible(true);
								break;
							}
							case LabStaff:
							{
								Frames.user = user;
								Frames.labMenu.setSize(580,580);
								Frames.labMenu.setLocationRelativeTo(null);
								Frames.login.setVisible(false); 
								Frames.labMenu.setVisible(true);
								break;
							}
							case HSPStaff:
							{
								Frames.user = user;
								Frames.nspMenu.setSize(580,580);
								Frames.nspMenu.setLocationRelativeTo(null);
								Frames.login.setVisible(false); 
								Frames.nspMenu.setVisible(true);
								break;
							}
						case Admin:
							break;
						default:
							break;
						}
					}	
					else
					{
						JOptionPane.showMessageDialog(getContentPane(), "Sorry, Username or Password not valid", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			
		});

		
		//New Patient Button
		btnNewPatient = new JButton("New User");
		btnNewPatient.setBounds(106, 70, 123, 29);
		getContentPane().add(btnNewPatient);
		
		btnNewPatient.addActionListener(new ActionListener()
		{
			//==================================
			//4.)LoginWindow->UserRegistration()
			//===================================
			public void actionPerformed(ActionEvent arg0) 
			{
				Frames.userReg.setModalityType(ModalityType.DOCUMENT_MODAL);
				Frames.userReg.setSize(580,580);
				Frames.userReg.setLocationRelativeTo(null);
				Frames.login.setVisible(false); 
				Frames.userReg.setVisible(true);
			}
		});
		//return returnValue;
	}
}
