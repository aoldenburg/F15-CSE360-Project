import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
public class AppointmentGUI extends JFrame{
	
	private JPanel contentPane, btnPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnViewAppointment, btnCancelAppointment, btnUpdateAppointment, btnGoBack;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppointmentGUI frame = new AppointmentGUI();			
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public AppointmentGUI() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 600); //window size
		setTitle("Appointment List"); //window title
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(3, 6, 3, 6)); //distance the plane is from the edges of the window
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(new DefaultTableModel(new Object[]{"Doctor's Name", "Location", "Date", "Time"},60)) {
			public boolean isCellEditable(int row, int column){ //prevents user from editing cells; there apparently is not a cleaner way of doing this
		        return false;
		   }
		};
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		table.setShowGrid(false);
		table.getTableHeader().setReorderingAllowed(false); //prevent user from swapping columns
		table.getTableHeader().setResizingAllowed(false); //prevent user from resizing columns
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); //prevent user from selecting multiple doctors
		table.setAutoCreateColumnsFromModel(false); //forgot why I have this here; it's probably important
		
		
		scrollPane.setViewportView(table); //lets table be scroll able
		
		btnPane = new JPanel();
		btnPane.setLayout(new GridLayout(0,2,0,0));
		contentPane.add(btnPane, BorderLayout.SOUTH);
		
		btnViewAppointment = new JButton("View Appointment");
		btnPane.add(btnViewAppointment);
		
		btnCancelAppointment = new JButton("Cancel Appointment");
		btnPane.add(btnCancelAppointment);
		
	    btnUpdateAppointment = new JButton("Update Appointment");
		btnPane.add(btnUpdateAppointment);
		
		btnGoBack = new JButton("Go Back");
		btnPane.add(btnGoBack);	
		
		
	}
	

}
