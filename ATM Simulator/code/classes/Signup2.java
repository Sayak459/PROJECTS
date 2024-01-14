package bank;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Signup2 extends JFrame implements ActionListener{

    
    JTextField aadharfield,panfield;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    
    Signup2(String formno)
    {
        this.formno=formno;
        setLayout(null);
        
       
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
        
        
        JLabel additional=new JLabel("PAGE 2: Additional Details:");
        additional.setFont(new Font("Raleway",Font.BOLD,22));
        additional.setBounds(260,80,400,30);
        add(additional);
        
         JLabel name=new JLabel("Religion: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valreligion[]={"Hindu","Muslim","Christian","Jain","Others"};
         religion=new JComboBox(valreligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.white);
        add(religion);
        
        JLabel fname=new JLabel("Category: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,100,30);
        add(fname);
        
        String valcategory[]={"General","Sc","St","Obc"};
         category=new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        add(category);
        
        JLabel inc=new JLabel("Income: ");
        inc.setFont(new Font("Raleway",Font.BOLD,20));
        inc.setBounds(100,240,100,30);
        add(inc);
        
        String valincome[]={"Null","<150000","<250000","<500000","Upto 1000000"};
         income=new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.white);
        add(income);
        
        JLabel edu=new JLabel("Education: ");
        edu.setFont(new Font("Raleway",Font.BOLD,20));
        edu.setBounds(100,290,200,30);
        add(edu);
        
        JLabel email=new JLabel("Qualification: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
         String valedu[]={"Graduate","Non-Graduate","Post-Graduate","Doctorate","Others"};
         education=new JComboBox(valedu);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.white);
        add(education);
        
        
        JLabel marry=new JLabel("Occupation: ");
        marry.setFont(new Font("Raleway",Font.BOLD,20));
        marry.setBounds(100,390,200,30);
        add(marry);
        
        String valoccu[]={"Service","Business","Unemployed","Student","Retired","Others"};
         occupation=new JComboBox(valoccu);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        
        JLabel pan=new JLabel("PAN NO: ");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);
        
         panfield=new JTextField();
        panfield.setBounds(300,440,400,30);
        panfield.setFont(new Font("Arial",Font.BOLD,14));
        add(panfield);
        
        JLabel aadhar=new JLabel("AADHAR NO: ");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        
         aadharfield=new JTextField();
        aadharfield.setBounds(300,490,400,30);
        aadharfield.setFont(new Font("Arial",Font.BOLD,14));
        add(aadharfield);
        
        JLabel senior=new JLabel("Senior Citizen: ");
        senior.setFont(new Font("Raleway",Font.BOLD,20));
        senior.setBounds(100,540,200,30);
        add(senior);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.white);
        add(syes);
         
        sno=new JRadioButton("No");
        sno.setBounds(400,540,100,30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup seniorc=new ButtonGroup();
        seniorc.add(syes);
        seniorc.add(sno);
        
        JLabel pincode=new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
         
        eno=new JRadioButton("No");
        eno.setBounds(400,590,100,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup exist=new ButtonGroup();
        exist.add(eyes);
        exist.add(eno);
       
        
         next=new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String sedu=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String ssenior=null;
        if(syes.isSelected())
        {
            ssenior="Yes";
        }
        else if(sno.isSelected())
        {
            ssenior="No";
        }
        
        String sexist=null;
        if(eyes.isSelected())
        {
            sexist="Yes";
        }
        else if(eno.isSelected())
        {
            sexist="No";
        }
        
        String span=panfield.getText();
        String saadhar=aadharfield.getText();
        
        try{
            if(ae.getSource()==next)
            {
                setVisible(false);
                new Signup3(formno).setVisible(true);
            }
            else
                {
                conn c=new conn();
                String query="insert into signup2 values('"+formno+"','"+sreligion+"', '"+scategory+"','"+sincome+"','"+sedu+"','"+soccupation+"','"+span+"','"+saadhar+"','"+ssenior+"','"+sexist+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new Signup3(formno).setVisible(true);
                }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new Signup2("");
    }
    
}
