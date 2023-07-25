package frametut;

import java.awt.Color;
import javax.swing.JFrame;

public class myFrame extends JFrame {
    
    ///Constructor method
    public void create() {
        setTitle("My First Java Frame"); //The Frame title
        setSize(500,300); //Frame width and height
        setDefaultLookAndFeelDecorated(true); //Takes int the look and feel of Windows(current OS)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //What happens when you click 'close' on the frame
        setForeground(Color.red); //Gives color to assigned omponrents
        setResizable(true); //Allows user to resize frame
        setVisible(false);
        
    }
    
}
