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
		setTitle("Statistical Report");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPatientDemographics = new JLabel("Patient Demographics");
		lblPatientDemographics.setBounds(161, 23, 138, 16);
		contentPane.add(lblPatientDemographics);
		
		JButton btnGenerateReport = new JButton("Generate Report");
		btnGenerateReport.setBounds(148, 221, 164, 29);
		contentPane.add(btnGenerateReport);
		
		JTextArea txtrTest = new JTextArea();
		txtrTest.setEditable(false);
		txtrTest.setBounds(161, 73, 138, 105);
		contentPane.add(txtrTest);
		
		btnGenerateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtrTest.setText("20 patients\n" +"14 females\n" + "6 males\n");
				//JOptionPane.showMessageDialog(getContentPane(), "Error, one of the variables is NULL", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		});
	}
}
