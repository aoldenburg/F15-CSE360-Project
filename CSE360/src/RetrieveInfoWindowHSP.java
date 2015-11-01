

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class RetrieveInfoWindowHSP extends JDialog {
	private static final long serialVersionUID = 5025721258742123338L;
	public String
//	patientName = "Larry Smith",
//	gender = "Male",
//	birthday = "6/4/1966",
//	phoneNumber = "4808675309",
//	email = "larry@larryshouse.com",
//	address = "1111 West Riverside Lane",
//	socialSecurity = "31323",
//	insuranceName = "Quality Insurance",
//	patientCondition = "Healthy",
//	medications = "Advil";
		patientName,
		gender,
		birthday,
		phoneNumber,
		email,
		address,
		socialSecurity,
		insuranceName,
		patientCondition,
		medications;
	private Object[][] data = {
			{"Patient Name:", patientName},
	        {"Gender:", gender},
	        {"Birthdate:", birthday},
	        {"Phone Number:", phoneNumber},
	        {"E-mail:", email},
	        {"Address:", address},
	        {"SSN:", socialSecurity},
	        {"Insurance:", insuranceName},
	        {"Current Condition:", patientCondition},
	        {"Medications:", medications}
	};
	private static final int patientNameField = 0;
	private static final int genderField = 1;
	private static final int birthdayField = 2;
	private static final int phoneNumberField = 3;
	private static final int emailField = 4;
	private static final int addressField = 5;
	private static final int socialSecurityField = 6;
	private static final int insuranceNameField = 7;
	private static final int patientConditionField = 8;
	private static final int medicationsField = 9;
	private String getField(int row) {return (String) table.getModel().getValueAt(row, 1);}
	private void whine(String message) {
		JOptionPane.showMessageDialog(getContentPane(), message, "ERROR", JOptionPane.ERROR_MESSAGE);
	}
	private void check() {
		try {
			if(!validEmail()) {whine("Please enter a valid email address.");}
			else if(!validBirthday(getField(birthdayField), 0, "", new ArrayList<String>())) {whine("Please enter a valid birthday.");}
			else if(!validCellPhone()) {whine("Please enter a valid phone number.");}
		}
		catch(Exception e) {whine("Please fill all entries.");}
	}
	private boolean validEmail() {
		Pattern p = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
		Matcher m = p.matcher(getField(emailField));
		if(m.matches()) {return true;}
		else {return false;}
	}
	private boolean validBirthday(String parsing, int index, String nextToken, ArrayList<String> results) {
		try {
			if(index == parsing.length()) {
				results.add(nextToken);
				return validBirthMonth(results.get(0)) && validBirthDay(results.get(1)) && validBirthYear(results.get(2));
			}
			else if(parsing.charAt(index) == '/' || parsing.charAt(index) == '-') {
				results.add(nextToken);
				return validBirthday(parsing, index+1, "", results);
			}
			else if(Character.isDigit(parsing.charAt(index))) {
				return validBirthday(parsing, index+1, nextToken+parsing.charAt(index), results);
			}
		}
		catch (Exception e) {return false;}
		return false;
	}
	private boolean validBirthMonth(String month) {
		try {
			int i = Integer.parseInt(month);
			if(i > 12 || i < 1 || (month.length() != 1 && month.length() != 2)) {return false;}
			else {return true;}
		}
		catch(NumberFormatException e) {return false;}
	}
	private boolean validBirthDay(String day) {
		try {
			int i = Integer.parseInt(day);
			if(i > 31 || i < 1 || (day.length() != 1 && day.length() != 2)) {return false;}
			else {return true;}
		}
		catch(NumberFormatException e) {return false;}
	}
	private boolean validBirthYear(String year) {
		try {
			int i = Integer.parseInt(year);
			if(i < 1800 || i > 2100 || year.length() != 4) {return false;}
			else {return true;}
		}
		catch(NumberFormatException e) {return false;}
	}
	private boolean validCellPhone() {
		try {
			String cellPhone = getField(phoneNumberField);
			if(cellPhone.length() != 10) {return false;}
			else {return true;}
		}
		catch(NumberFormatException e) {return false;}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetrieveInfoWindowHSP frame = new RetrieveInfoWindowHSP();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel contentPane;
	private JTable table;
	private String[] columnNames = {"", ""}; //having two columns doesn't work without the nonexistent column names
    private DefaultTableModel model = new DefaultTableModel(data, columnNames) {
		private static final long serialVersionUID = -8187053556158357139L; //gets rid of some warning; something to do with serialization
		public boolean isCellEditable(int row, int column) { //prevents user from editing the "Patient Name", but allows editting patientName
		if (column == 1) {return true;}
	    return false;
	   }
	};

	private JToolBar toolBar;
	private JButton btnUpdate;
	private JButton btnEditLabRecords;
	private JButton btnEditMedicalHistory;
	private JButton btnSendAlert;
	private JButton btnViewAppointments;
	
	public RetrieveInfoWindowHSP() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(300, 300, 484, 240); //window size
		setMinimumSize(new Dimension(484, 200)); //prevents the user from shrinking the window to silly sizes
		setTitle("IPIMS");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(3, 6, 0, 6)); //distance the plane is from the edges of the window
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		table = new JTable(model);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		table.setShowGrid(false);
		table.getTableHeader().setReorderingAllowed(false); //prevent user from swapping columns
		table.getTableHeader().setResizingAllowed(false); //prevent user from resizing columns
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //prevent user from selecting multiple doctors
		table.getColumnModel().getColumn(0).setPreferredWidth(2);
		table.setTableHeader(null);
		table.setAutoCreateColumnsFromModel(false); //forgot why I have this here; it's probably important
		scrollPane.setViewportView(table); //lets table be scrollable
		
		toolBar = new JToolBar();
		toolBar.setFloatable(false);
		contentPane.add(toolBar, BorderLayout.SOUTH);
		btnEditLabRecords = new JButton("Lab Reports");
		toolBar.add(btnEditLabRecords);
		btnEditMedicalHistory = new JButton("Medical History");
		toolBar.add(btnEditMedicalHistory);
		btnViewAppointments = new JButton("View Appointments");
		toolBar.add(btnViewAppointments);
		btnSendAlert = new JButton("Send Alert");
		toolBar.add(btnSendAlert);
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {check();}
		});
		toolBar.add(btnUpdate);
		
		
		
		
//		btnNewButton = new JButton("Update");
//		contentPane.add(btnNewButton, BorderLayout.SOUTH); 
//		getRootPane().setDefaultButton(btnNewButton); //makes button highlightable
//		btnNewButton.requestFocus(); //highlights button
		
		
	}
}








