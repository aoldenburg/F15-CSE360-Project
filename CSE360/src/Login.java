import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection=null;
	private JTextField textFieldUN;
	private JPasswordField passwordField;
	
	/**
	 * Create the application.
	 */
	public Login() 
	{
		initialize();
		connection=sqliteConnection.dbConnector();
	}

	
	JButton btnSave = new JButton("Save");
	btnSave.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent argO) {
		
				//StaffAccount is the name of the database
				String query="insert into StaffAccount (UserName,Password) " + "values (?,?)";
				PreparedStatement pst=connection.prepareStatement(query);
				pst.setString(1, textFieldUN.getText() );
				pst.setString(2, passwordField.getText() );
				
				pst.execute();
				
				JOptionPane.showMessageDialog(null, "Data Saved");
				
				pst.close ();
		}
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 845, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName:");
		lblNewLabel.setBounds(238, 202, 68, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(238, 227, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldUN = new JTextField();
		textFieldUN.setBounds(316, 199, 164, 20);
		frame.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(316, 227, 164, 17);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query="select * from EmployeeInfo where username=? and password=? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldUN.getText() );
					pst.setString(2, passwordField.getText() );
					
					ResultSet rs=pst.executeQuery();
					int count =0;
					while(rs.next()){
						count = count+1;
					}
					if(count ==1)
					{
						JOptionPane.showMessageDialog(null, "UserName and password is correct");
						frame.dispose();
						EmployeeInfo emplInfo=new EmployeeInfo();
						emplInfo.setVisible(true);
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate UserName and password");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "UserName and password is not correct");
					}
					
					rs.close();
					pst.close();
					
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
					
				}
				
			}
				
			
		});
		btnLogin.setBounds(316, 255, 164, 23);
		frame.getContentPane().add(btnLogin);
	}

}
