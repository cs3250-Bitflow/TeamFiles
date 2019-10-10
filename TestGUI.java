import javax.swing.*;
import java.awt.*;

/*
 * A popup window to test the BlueJ extension
 */

public class TestGUI
{
  public static void main(String[] args)
  {
    new TestGUI();
  }
  
  public TestGUI()
  {
    JFrame frame = new JFrame();
    frame.setTitle("Test Box");
    frame.setSize(600, 400);
    
    frame.add(new MyPanel());
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  class MyPanel extends JComponent
  {
    public MyPanel()
    {
      //TODO do stuff
    }
  }
}
