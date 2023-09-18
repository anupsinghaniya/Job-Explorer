import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fifthFrame extends JFrame{
   fifthFrame()
   {

    ImageIcon img = new ImageIcon("job.png");
    thirdFrame obj=new thirdFrame();
    String mainLabel=obj.getMainLabel();
    JLabel mainLabel1=new JLabel(mainLabel);
    mainLabel1.setBounds(100,100,400,600);
    mainLabel1.setForeground(new Color(255, 20, 80));
    this.add(mainLabel1);
    this.setTitle("Job Recommendation System");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.getContentPane().setBackground(Color.BLACK);
    this.setLayout(null);
    this.setIconImage(img.getImage());
    this.setSize(600, 800);
    this.setVisible(true);
}
}