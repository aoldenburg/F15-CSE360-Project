import java.awt.Dialog.ModalityType;
import java.io.IOException;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
//First class run
public class IPIMS extends JPanel
{
	//public static SwitchFrame switchFrame = new SwitchFrame();
	//*******************
	//Frames
	//*******************


	public static void startIPIMS() throws IOException
	{
		
		//============================
		//2.) startIPIMS()->LogInWindow()
		//============================
		Frames.login.setSize(360, 145);
		Frames.login.setLocationRelativeTo(null);
		Frames.login.setVisible(true);
	}
	public static void main(String [] args) throws IOException
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				UIManager.put("swing.boldMetal",  Boolean.FALSE);
				try
				{
					//===================================
					//1.) main()->startIPIMS()
					//===================================
					startIPIMS();
				}
				catch(IOException event)
				{
					event.printStackTrace();
				}
			}
		});
		
	}

}