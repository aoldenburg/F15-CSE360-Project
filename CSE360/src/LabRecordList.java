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

public class LabRecordList extends JDialog {
	private static final long serialVersionUID = -3168483869283270295L;
	private JPanel contentPane;
	private JButton btnNewButton;
	public int numberOfLabRecords = 10; //whereverTheDoctorsAreStored.length(); 55 was arbitrarily chosen for testing 
	private JTable table;
	
	public LabRecordList() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 484, 253); //window size
		setMinimumSize(new Dimension(384, 200)); //prevents the user from shrinking the window to silly sizes
		setTitle("IPIMS"); //window title
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(3, 6, 0, 6)); //distance the plane is from the edges of the window
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Test Type", "Date Conducted", "Lab Technician", "Requested by"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(125);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		scrollPane.setViewportView(table);
		btnNewButton = new JButton("Open Report");
		//LabButtonListener listener = new LabButtonListener();
		//btnNewButton.addActionListener(listener);
		contentPane.add(btnNewButton, BorderLayout.SOUTH); 
		getRootPane().setDefaultButton(btnNewButton);
		btnNewButton.requestFocus(); //highlights button
		

		/*public class LabButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				//fetch lab report from database
			}
		}*/

		
	}

}


