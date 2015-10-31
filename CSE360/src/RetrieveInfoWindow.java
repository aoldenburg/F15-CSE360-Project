

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;

public class RetrieveInfoWindow extends JDialog {
	private static final long serialVersionUID = 5025721258742123338L;
	public String
		patientName,
		gender,
		birthday,
		phoneNumber,
		address,
		zipCode,
		socialSecurity,
		insuranceName,
		patientCondition,
		medications;
	private Object[][] data = { //I don't know what fields patient still has. If there are any I missed, you should just have to add a string field above, and a pair below
			{"Patient Name:", patientName},
	        {"Gender:", gender},
	        {"Birthdate:", birthday},
	        {"Phone Number:", phoneNumber},
	        {"Address:", address},
	        {"Zip Code:", zipCode},
	        {"Social Security:", socialSecurity},
	        {"Insurance:", insuranceName},
	        {"Current Condition:", patientCondition},
	        {"Medications:", medications}
	        
	};
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetrieveInfoWindow frame = new RetrieveInfoWindow();
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
	
	public RetrieveInfoWindow() {
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
		
		//I think they're supposed to be able to access this stuff, but if not, comment the below, and uncomment the very bottom
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
		toolBar.add(btnUpdate);
		
		//Uncomment the below if they're not supposed to be able to view appointments, medical history, lab records, or send alerts here
//		btnNewButton = new JButton("Update");
//		contentPane.add(btnNewButton, BorderLayout.SOUTH); 
//		getRootPane().setDefaultButton(btnNewButton); //makes button highlightable
//		btnNewButton.requestFocus(); //highlights button
		
		
	}
}








