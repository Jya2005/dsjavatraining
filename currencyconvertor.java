import javax.swing.*;
import java.awt.*;

public class currencyconvertor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("currency convertor");
        JLabel rupeeLabel = new JLabel("enter rupee");
        JLabel dollersLabel = new JLabel("enter dollers");

        JTextField rupeefield  = new JTextField();
        JTextField dollersfield= new JTextField();
        JButton currencyfield = new JButton("CONVERT");

        rupeeLabel.setBounds(30,30,150,40);
        dollersLabel.setBounds(30,80,150,40);
        rupeefield.setBounds(180,30,50,40);
        dollersfield.setBounds(180,40,100,100);

        //to attach the label to frame
        frame.add(rupeeLabel);
        frame.add(rupeefield);
        frame.add(dollersLabel);
        frame.add(dollersfield);
        frame.add(currencyfield);
        frame.add(currencyfield);



    }
}
