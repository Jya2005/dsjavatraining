
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeGUIjavaprograme {
    public static void main(String[] args) {
                //to create a frame using swing in java
                JFrame frame = new JFrame("BMI calculator");
                JLabel heightLabel = new JLabel("enter your hight");
                JLabel weightLabel = new JLabel("enter your weight");
                JLabel BMILabel = new JLabel();

                JTextField weightfield = new JTextField();
                JTextField hightfield = new JTextField();
                JTextField BMIButton = new JTextField();

                //to attach the label to frame
                frame.add( heightLabel);
                frame.add(hightfield);
                frame.add(weightLabel);
                frame.add(weightfield);
                frame.add(BMIButton);
                frame.add(BMILabel);

                //to build the frame layout frame.setLayout(null);
                  //to set the size for frame
                    frame.setSize(300, 250);
                    //to visible the frame on screen
                   frame.setVisible(true);
                   //to click on the bmi calculator button

                 BMIButton.addActionListener(new ActionListener() {
                          @Override
                       public void actionPerformed(ActionEvent e) {


                        //to apply the BMI formula
                        float weight = Float.parseFloat(weightfield.getText().toString());
                        float hight = Float.parseFloat(weightfield.getText().toString());

                        float output = weight/(hight*hight);
                        //18.5 < under weight , 18.5 to 24.9 = normal,24.9 to 29.9 overweight

                        if (output < 18.5)
                        {
                            BMILabel.setText("Im under weight");
                        }else if (output > 18.5 && output < 24.9){
                            BMILabel.setText("I am normal");
                        } else if (output > 24.9 && output < 29.9) {
                            BMILabel.setText("Im over weight");
                        }else {
                            BMILabel.setText("I am obesity");

                        }


                    }
                });
            }
        }

