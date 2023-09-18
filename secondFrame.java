import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class secondFrame extends JFrame {
    public static String domainSelected;

    public String getDomain() {
        return domainSelected;
    }
secondFrame(int a)
{

}
    secondFrame() {

        {
            firstFrame f1 = new firstFrame(1);
            String educationSelected = f1.getEducation();
            ImageIcon img = new ImageIcon("job.png");
            JLabel label;
            JRadioButton r1;
            JRadioButton r2;
            JRadioButton r3;
            JRadioButton r4;
            JRadioButton r5;
            JRadioButton r6;
            JRadioButton r7;
            JButton btn3;

            if (educationSelected == "10th" || educationSelected == "12th") {
                label = new JLabel("Please select your choice!");
                label.setBounds(100, 80, 200, 50);
                label.setForeground(new Color(255, 20, 80));
                r1 = new JRadioButton("Govt. based Jobs.");
                r2 = new JRadioButton("Private Jobs.");
                r1.setBounds(100, 140, 200, 50);
                r2.setBounds(100, 180, 200, 50);
                ButtonGroup bg1 = new ButtonGroup();
                bg1.add(r1);
                bg1.add(r2);
                btn3 = new JButton("Submit");
                btn3.setBounds(100, 220, 200, 50);
                btn3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (r1.isSelected()) {
                            domainSelected = "Govt";
                        }

                        else {
                            domainSelected = "Private";
                        }
                        thirdFrame f3 = new thirdFrame();
                    }
                });
                this.add(label);
                this.add(r1);
                this.add(r2);
                this.add(btn3);

            } else {
                label = new JLabel("Please select your choice!");
                label.setBounds(100, 80, 200, 50);
                label.setForeground(new Color(255, 20, 80));
                r1 = new JRadioButton("Business administration");
                r2 = new JRadioButton("Computer science engineering");
                r3 = new JRadioButton("Arts");
                r4 = new JRadioButton("Commerce");
                r5 = new JRadioButton("Law");
                r6 = new JRadioButton("Chemistry");
                r7 = new JRadioButton("Medical");
                r1.setBounds(100, 140, 200, 50);
                r2.setBounds(100, 180, 200, 50);
                r3.setBounds(100, 220, 200, 50);
                r4.setBounds(100, 260, 200, 50);
                r5.setBounds(100, 300, 200, 50);
                r6.setBounds(100, 340, 200, 50);
                r7.setBounds(100, 380, 200, 50);

                ButtonGroup bg1 = new ButtonGroup();
                bg1.add(r1);
                bg1.add(r2);
                bg1.add(r3);
                bg1.add(r4);
                bg1.add(r5);
                bg1.add(r6);
                bg1.add(r7);

                btn3 = new JButton("Submit");
                btn3.setBounds(100, 440, 200, 50);
                btn3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (r1.isSelected()) {
                            domainSelected = "Business";
                        } else if (r2.isSelected()) {
                            domainSelected = "Computer";
                        } else if (r3.isSelected()) {
                            domainSelected = "Arts";
                        } else if (r4.isSelected()) {
                            domainSelected = "Commerce";
                        } else if (r5.isSelected()) {
                            domainSelected = "Law";
                        } else if (r6.isSelected()) {
                            domainSelected = "Chemistry";
                        } else {
                            domainSelected = "Medical";
                        }

                        thirdFrame f3 = new thirdFrame();
                    }
                });
                this.add(label);
                this.add(r1);
                this.add(r2);
                this.add(r3);
                this.add(r4);
                this.add(r5);
                this.add(r6);
                this.add(r7);
                this.add(btn3);
            }

            this.add(btn3);
            this.setTitle("Job Recommendation System");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(400, 600);
            this.getContentPane().setBackground(Color.BLACK);
            // this.setResizable(false);
            this.setIconImage(img.getImage());
            this.setVisible(true);
        }
    }
}
