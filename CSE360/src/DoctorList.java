import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class DoctorList extends JDialog {
	private static final long serialVersionUID = -3168483869283270295L;
	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	public int numberOfDoctors = 55; //whereverTheDoctorsAreStored.length(); 55 was arbitrarily chosen for testing 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorList frame = new DoctorList();			
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DoctorList() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 484, 540); //window size
		setMinimumSize(new Dimension(384, 200)); //prevents the user from shrinking the window to silly sizes
		setTitle("IPIMS"); //window title
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(3, 6, 0, 6)); //distance the plane is from the edges of the window
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		String[] columnNames = {"Name",
							 "Location",
							 "Category",
							 "Insurace"};
		
		Object[][] data = {
				{"George Martin", "Phoenix", "Heart Surgeon", "All Types"}
		};
							 
		table = new JTable(new DefaultTableModel(data,columnNames)) {
			private static final long serialVersionUID = -8187053556158357139L; //gets rid of some warning; something to do with serialization
			public boolean isCellEditable(int row, int column){ //prevents user from editing cells; there apparently is not a cleaner way of doing this
		        return false;
		   }
		};
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		table.setShowGrid(false);
		table.getTableHeader().setReorderingAllowed(false); //prevent user from swapping columns
		table.getTableHeader().setResizingAllowed(false); //prevent user from resizing columns
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //prevent user from selecting multiple doctors
		table.setAutoCreateColumnsFromModel(false); //forgot why I have this here; it's probably important
		scrollPane.setViewportView(table); //lets table be scrollable
		System.out.println("Displaying list of doctors in Database");
		btnNewButton = new JButton("Request Appointment");
		contentPane.add(btnNewButton, BorderLayout.SOUTH); 
		getRootPane().setDefaultButton(btnNewButton); //makes button highlightable
		btnNewButton.requestFocus(); //highlights button
	}

}
