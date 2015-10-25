import java.io.IOException;

import javax.swing.UIManager;

public class IPIMS {
	
	public static void main(String [] args) throws IOException
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				UIManager.put("swing.boldMetal",  Boolean.FALSE);
				try
				{
					
				}
				catch(IOException event)
				{
					event.printStackTrace();
				}
			}
		});
		
	}

}
