import java.awt.Dialog.ModalityType;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
//tester
public class MainWindow {

	private JFrame frmIpims;
	private MainWindow window;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmIpims.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		LogInWindow logIn = new LogInWindow();
		logIn.setModalityType(ModalityType.DOCUMENT_MODAL);
		logIn.setSize(360, 145);
		logIn.setLocationRelativeTo(null);
		logIn.setVisible(true);
		
		logIn.btnNewPatient.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Add Database Check username and password into here
				if(true)
				{
					
				}
				
			}
			
		});
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIpims = new UserMenuWindow();
		
	}

}
