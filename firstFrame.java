import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstFrame extends JFrame {

    public static String educationSelected;

    public String getEducation() {
        return educationSelected;
    }

    firstFrame(int a) {

    }

    firstFrame() {

        ImageIcon img = new ImageIcon("job.png");
        JLabel label = new JLabel("Please select your education!");
        label.setBounds(100, 80, 200, 50);
        label.setForeground(new Color(255, 20, 80));
        JRadioButton rb1 = new JRadioButton("10th");
        JRadioButton rb2 = new JRadioButton("12th");
        JRadioButton rb3 = new JRadioButton("Graduated");
        rb1.setBounds(100, 140, 200, 50);
        rb2.setBounds(100, 180, 200, 50);
        rb3.setBounds(100, 220, 200, 50);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
        bg1.add(rb3);
        JButton btn1 = new JButton("Submit");
        btn1.setBounds(100, 260, 200, 50);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected()) {
                    educationSelected = "10th";
                }

                else if (rb2.isSelected()) {
                    educationSelected = "12th";
                }

                else {
                    educationSelected = "Graduated";
                }

                secondFrame frame1 = new secondFrame();

            }
        });

        this.add(label);
        this.add(rb1);
        this.add(rb2);
        this.add(rb3);
        this.add(btn1);
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
