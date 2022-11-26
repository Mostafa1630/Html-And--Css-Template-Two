package calculator;
import javax.swing.*;
import java.awt.*;
public class fr extends JFrame {
    public fr(){
        this.setTitle("Calculator");
        this.setSize(420,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(40,40);
        this.add(new draw());
    }
    
}
