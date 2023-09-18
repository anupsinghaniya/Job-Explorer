import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fourthFrame extends JFrame{
   fourthFrame()
   {
    ImageIcon img = new ImageIcon("job.png");
    thirdFrame obj=new thirdFrame();
    String areaOfInterest=obj.getAreaOfInterest();
    JLabel l1;
    if(areaOfInterest=="Defence")
    {
     l1=new JLabel("<html>1. Border Security Force (BSF)<br>2. Central Reserve Police Force (CRPF)<br>3. Sashastra Seema Bal (SSB)<br>4. Indo-Tibetan Border Police Force (ITBP)<br>5. Central Industrial Security Force (CISF)<br>6. Indian Air force(I.A.F.)<br>7. Indian navy<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");   
    }
    else if(areaOfInterest=="Railway")
    {
        l1=new JLabel("<html>1. Railway group D.<br>2. Assistant loco pilot<br>3. Railway clerk<br>4. Railway constable<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");
    }
    else
    {
        l1=new JLabel("<html>1. SSC Combined Higher Secondary Level (SSC CHSL)<br>2. Upper Division Clerk (UDC)<br>3. Lower Division Clerk (LDC)<br>4. Postal Assistant (PA)<br>5. Data Entry Operator (DEO)<br>6. Sorting Assistant (SA)<br>7. SSC Multi Tasking Staff (SSC MTS)<br>8. SSC General Duty Constable (SSC GD Exam)<br>9. SSC Grade C and Grade D Stenographer (SSC Stenographer)<br>10. Other than these you may also appear for most prestigious posts :<br>10 (a) : Indian Administrative Service(I.A.S.)<br>10 (b) : Indian Police Service(I.P.S.)<br>10 (c) : Indian Forest Service(I.F.S.)<br>Many other posts are there. For more info google UPSC Exam!<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");
    }
    l1.setBounds(100, 100, 500, 400);
    l1.setForeground(new Color(255, 20, 80));
    this.add(l1);
   this.setTitle("Job Recommendation System");
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.getContentPane().setBackground(Color.BLACK);
   this.setLayout(null);
   this.setIconImage(img.getImage());
   this.setSize(600, 800);
   this.setVisible(true);
}
}