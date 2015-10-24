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

public class LogInWindow extends JDialog {
	public JTextField username;
	public JTextField password;
	
	public JButton btnNewPatient;
	public JButton btnLogin;

	/**
	 * Create the applet.
	 */
	public LogInWindow() {
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
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(106, 39, 224, 20);
		getContentPane().add(password);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				if(username.getText().equals(""))
						{
							JOptionPane.showMessageDialog(getContentPane(), "Please enter a Username", "ERROR", JOptionPane.ERROR_MESSAGE);
							username.setBorder(BorderFactory.createLineBorder(Color.RED));
						}
				if(password.getText().equals(""))
				{
					JOptionPane.showMessageDialog(getContentPane(), "Please enter a Password", "ERROR", JOptionPane.ERROR_MESSAGE);
					password.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				DatabaseStub stub = new DatabaseStub();
				
				Account a = stub.accessAccount(username.getText(), password.getText());
				
				if(a.equals(null))
				{
					JOptionPane.showMessageDialog(null, "Error Invalid Username and/or password");
				}
			}
		});
		btnLogin.setBounds(239, 70, 89, 23);
		getContentPane().add(btnLogin);
		
		btnNewPatient = new JButton("New Patient");
		btnNewPatient.setBounds(106, 70, 123, 23);
		getContentPane().add(btnNewPatient);
		btnNewPatient.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				UserAccountRegistration newUser = new UserAccountRegistration();
				newUser.setModalityType(ModalityType.DOCUMENT_MODAL);
				newUser.setSize(580,580);
				newUser.setLocationRelativeTo(null);
				newUser.setVisible(true);
				
			}
			
		});
		
		

	}
	
}
