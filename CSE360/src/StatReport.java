import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class StatReport extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatReport frame = new StatReport();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 */
	public StatReport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Health Outcomes");
		lblNewLabel.setBounds(52, 69, 109, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblAdmissionRates = new JLabel("Admission Rates");
		lblAdmissionRates.setBounds(52, 95, 109, 16);
		contentPane.add(lblAdmissionRates);
		
		JLabel lblPatientDemographics = new JLabel("Patient Demographics");
		lblPatientDemographics.setBounds(52, 123, 138, 16);
		contentPane.add(lblPatientDemographics);
		
		JLabel lblPatientPopulations = new JLabel("Patient Populations");
		lblPatientPopulations.setBounds(52, 151, 121, 16);
		contentPane.add(lblPatientPopulations);
		
		JLabel lblStatisticalReports = new JLabel("Statistical Reports");
		lblStatisticalReports.setBounds(169, 24, 121, 16);
		contentPane.add(lblStatisticalReports);
		
		JButton btnGenerateReport = new JButton("Generate Report");
		btnGenerateReport.setBounds(129, 217, 164, 29);
		contentPane.add(btnGenerateReport);
		
		JTextArea txtrTest = new JTextArea();
		txtrTest.setEditable(false);
		txtrTest.setBounds(260, 69, 130, 105);
		contentPane.add(txtrTest);
		
		btnGenerateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtrTest.setText("23 terminal patients\n" + "10 per day\n" + "NULL patients\n" +"NULL females and NULL males\n");
				JOptionPane.showMessageDialog(getContentPane(), "Error, one of the variables is NULL", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		});
	}
}
