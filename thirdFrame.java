import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class thirdFrame extends JFrame {
    public static String areaOfInterest;
    
    public static String mainLabel;

    public String getAreaOfInterest() {
        return areaOfInterest;
    }
    public String getMainLabel()
    {
        return mainLabel;
    }
    
thirdFrame(int a)
{
   
}
    thirdFrame() {
        ImageIcon img = new ImageIcon("job.png");
        secondFrame obj = new secondFrame(1);
        String domainSelected = obj.getDomain();

        JRadioButton r1;
        JRadioButton r2;
        JRadioButton r3;
        JRadioButton r4;
        JRadioButton r5;
        JRadioButton r6;
        JRadioButton r7;
        JRadioButton r8;
        JRadioButton r9;
        JRadioButton r10;
        JRadioButton r11;
        JButton btn3;
        JLabel mainLabel1;



        firstFrame f1 = new firstFrame(1);
        String educationSelected = f1.getEducation();

        JLabel l1, l2, l3;
        if (educationSelected == "10th") {
            if (domainSelected == "Private") {
                l1 = new JLabel(
                        "<html>Jobs recommended for you : <br>1. Travelling ticket executive<br>2. Customer care executive<br>3. Receptionist<br>4. Delivery person<br>5. Data entry operator<br>6. SalesPerson<br>7. Social media handler<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");

            } else {
                l1 = new JLabel(
                        "<html>Jobs recommended for you : <br>1. Bank peon<br>2. Postman<br>3. CRPF Constable<br>4. Driver(RBI)<br>5. ITBP Constable<br6. Anganbadi workder<br>7. Home Guard-Jharkhand home defence<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------</html>");
            }
            l1.setBounds(100, 100, 400, 600);
            l1.setForeground(new Color(255, 20, 80));
            this.add(l1);

        } else if (educationSelected == "12th") {
            if (domainSelected == "Private") {
                l1 = new JLabel(
                        "<html>1. Computer operator<br>2. Tele Sales Executive<br>3. Receptionist<br>4. Data-Entry Operators<br>5. Content Writer<br>6. Home tutor<br>7. Merchant Navy<br>8. Event manager<br>9. Social media manager<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");
                l1.setBounds(100, 100, 400, 600);
                l1.setForeground(new Color(255, 20, 80));
                this.add(l1);
            } else {
                l2 = new JLabel("Select your area of interest!");
                l2.setBounds(100, 100, 250, 40);
                l2.setForeground(new Color(255, 20, 80));
                this.add(l2);
                JRadioButton rb1 = new JRadioButton("Defence forces!");
                JRadioButton rb2 = new JRadioButton("Railway");
                JRadioButton rb3 = new JRadioButton("Administrative!");
                rb1.setBounds(100, 140, 200, 40);
                rb2.setBounds(100, 180, 200, 40);
                rb3.setBounds(100, 220, 200, 40);
                ButtonGroup bg1 = new ButtonGroup();
                bg1.add(rb1);
                bg1.add(rb2);
                bg1.add(rb3);
                this.add(rb1);
                this.add(rb2);
                this.add(rb3);
                JButton btn1 = new JButton("Submit");
                btn1.setBounds(100, 260, 200, 40);
                this.add(btn1);
                btn1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (rb1.isSelected()) {
                            areaOfInterest = "Defence";
                        }

                        else if (rb2.isSelected()) {
                            areaOfInterest = "Railway";
                        }

                        else {
                            areaOfInterest = "Admininstration";
                        }
                        fourthFrame obj=new fourthFrame();
                    }

                });
            }

        }
        else
        {
          
            if(domainSelected=="Business")
            {
                l1=new JLabel("<html> Jobs for Business graduates =><br>1. Branch manager of any bank, company, industry or school/colleges etc.<br>2. Human resource<br>3. Retail manager<br>4. Operations manager<br>5. Event manager<br>6. Project manager<br>7. Airlines manager<br>8. Sales executive<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");
                l1.setBounds(100, 100, 400 ,350);
l1.setForeground(new Color(255, 20, 80));
this.add(l1);
            }
            else if(domainSelected == "Computer")
            {
l1=new JLabel("Please select your field of study!");
l1.setBounds(100, 80, 200, 50);
l1.setForeground(new Color(255, 20, 80));
r1 = new JRadioButton("Python, R language, SKlearn, Anaconda, Pytorch, Tensorflow");
r2 = new JRadioButton("Amazon web services, Google cloud & microsoft azure,Github, Kubernets, Informatica");
r3 = new JRadioButton("Python, R language, Apache spark, Apache hadoop and Microsoft excel");
r4 = new JRadioButton("NodeJS, PHP, Python, Laravel, Linux");
r5 = new JRadioButton("HTML, CSS, JavaScript, Bootstrap and ReactJS");
r6 = new JRadioButton("Kali linux, Metasploit, Wireshark");
r7 = new JRadioButton("Databases : SQL, NoSQL, PostGreSQL, mongoDB");
r8=new JRadioButton("NodeJS, PHP, Python, Laravel, Linux, HTML, CSS, JavaScript, Bootstrap and ReactJS, and Databases : SQL, NoSQL, PostGreSQL, mongoDB");
r9=new JRadioButton("Snowflake,Amazon Redshift, Python, SQL, tableau");
r10=new JRadioButton("Git, Github, GitLAb, Docker, Kubernetes, Maven, AWS, Google cloud");
r11=new JRadioButton("Java, c, c++, databases, data structures and algorithms");

r1.setBounds(100, 140, 400, 50);
r2.setBounds(100, 180, 400, 50);
r3.setBounds(100, 220, 400, 50);
r4.setBounds(100, 260, 400, 50);
r5.setBounds(100, 300, 400, 50);
r6.setBounds(100, 340, 400, 50);
r7.setBounds(100, 380, 400, 50);
r8.setBounds(100, 420, 400, 50);
r9.setBounds(100, 460, 400, 50);
r10.setBounds(100, 500, 400, 50);
r11.setBounds(100, 540, 400, 50);

ButtonGroup bg1 = new ButtonGroup();
bg1.add(r1);
bg1.add(r2);
bg1.add(r3);
bg1.add(r4);
bg1.add(r5);
bg1.add(r6);
bg1.add(r7);
bg1.add(r8);
bg1.add(r9);
bg1.add(r10);
bg1.add(r11);


btn3 = new JButton("Submit");
btn3.setBounds(100, 600, 200, 50);
btn3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {

        if (r1.isSelected()) {

         mainLabel="You can become a machine learning engineer!";
        } else if (r2.isSelected()) {
            mainLabel="You can become a cloud computing engineer!";
        } else if (r3.isSelected()) {
            mainLabel="You can become a data analyst!";
        } else if (r4.isSelected()) {
            mainLabel="You can become a back-end developer!";
        } else if (r5.isSelected()) {
            mainLabel="You can become a front-end developer!";
        } else if (r6.isSelected()) {
            mainLabel="You can become a cyber security specialist!";
        } 
        else if (r7.isSelected()) {
            mainLabel="You can become a database enginner!";
        } 
        else if (r8.isSelected()) {
            mainLabel="You can become a full-stack developer!";
        } 
        else if (r9.isSelected()) {
            mainLabel="You can become a big-data enginner!";
        } 
        else if (r10.isSelected()) {
            mainLabel="You can become a dev-ops enginner!";
        }   
        else {
            mainLabel="You can become a software enginner!";
        }
 fifthFrame obj=new fifthFrame();
            }
        });
 
        this.add(l1);
        this.add(r1);
        this.add(r2);
        this.add(r3);
        this.add(r4);
        this.add(r5);
        this.add(r6);
        this.add(r7);
        this.add(r8);
        this.add(r9);
        this.add(r10);
        this.add(r11);
        this.add(btn3);

    }else if(domainSelected=="Arts")
    {
        l1=new JLabel("<html>Jobs for Arts graduates =><br>1. Fashion Designer<br>2. Law professional for llb graduates<br>3. Illustrator<br>4. Graphic Designer<br>5. Photography<br>6. Actor, theater, dancer, music creation<br>7. Civil services<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");
        l1.setBounds(100, 100, 400, 600);
        l1.setForeground(new Color(255, 20, 80));
        this.add(l1);
    }
    else if( domainSelected == "Commerce")
    {
        l1=new JLabel("<html>Jobs for Commerce graduates =><br>1. Chartered accountant<br>2. Marketing manager<br>3. Investment banker<br>4. Human resource manager<br>5. Cost accountant<br>6. Retail manager<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");
        l1.setBounds(100, 100, 400, 600);
        l1.setForeground(new Color(255, 20, 80));
        this.add(l1);
    }
    else if( domainSelected == "Law")
    {
        l1=new JLabel("<html>Jobs for law graduates =><br>1. Corporate lawyer<br>2. Judicial services<br>3. Legal journalist<br>4. Civil lawyer<br>5. Legal advisor<br>6. Criminal lawyer<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");
        l1.setBounds(100, 100, 400, 600);
        l1.setForeground(new Color(255, 20, 80));
        this.add(l1);
    }
    else if( domainSelected == "Chemistry")
    {
        l1=new JLabel("<html>Jobs for chemistry graduates =><br>1. Academic researcher<br>2. Analytical chemist<br>3. Biotechnologist<br>4. Chemical scientist<br>5. Crime scene investigator<br> 6. Forensic investigator<br>7. Medicinal chemist<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");
        l1.setBounds(100, 100, 400, 600);
        l1.setForeground(new Color(255, 20, 80));
        this.add(l1);
    }
    else 
    {
        l1=new JLabel("<html>Jobs for Medical graduates =><br>1. Cardiologist<br>2. Hospital doctor<br>3. Neurologist<br>4. General physician<br>5. Government jobs in health services department<br>6. Health administrations<br>7. Hospital management<br>For more jobs you can visit us at www.jobrecommendator.com!<br>------------------------Thank you!------------------------<br></html>");
        l1.setBounds(100, 100, 400, 600);
        l1.setForeground(new Color(255, 20, 80));
        this.add(l1);
    }

}
        this.setTitle("Job Recommendation System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setIconImage(img.getImage());
        this.setSize(600, 800);
        this.setVisible(true);
    }
}