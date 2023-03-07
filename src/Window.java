import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    //attrib
    //costr
    public Window() {
        this.setTitle("A Clicker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new Bakgrund());

        this.pack();
        this.setVisible(true);


        //creat a layout

        JPanel multiPanel = new JPanel();
        GridLayout layout = new GridLayout(2, 2);
        multiPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
        multiPanel.setLayout(layout);

        multiPanel.add(new Bakgrund());
        multiPanel.add(new Bakgrund());
        multiPanel.add(new Bakgrund());
        multiPanel.add(new Bakgrund());

        this.getContentPane().add(multiPanel);

        this.pack();
        this.setVisible(true);
    }

    //method

    //getset
}
