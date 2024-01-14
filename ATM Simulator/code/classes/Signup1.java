package bank;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class Signup1 extends JFrame implements ActionListener{

    long random;
    JTextField namefield,fnamefield,dobfield,emailfield,addressfield,cityfield,statefield,pinfield;
    JButton next;
    JRadioButton male,female,others,married,unmarried;
    JDateChooser date;
    Signup1()
    {
        setLayout(null);
        
        
        Random rn=new Random();
        random=Math.abs(rn.nextLong()%9000L+1000L);
        
        
        JLabel form=new JLabel("Application FORM NO. "+random);
        form.setFont(new Font("Raleway",Font.BOLD,38));
        form.setBounds(140,20,600,40);
        add(form);
        
        JLabel personal=new JLabel("PAGE 1: Personal Details:");
        personal.setFont(new Font("Raleway",Font.BOLD,22));
        personal.setBounds(260,80,400,30);
        add(personal);
        
         JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
         namefield=new JTextField();
        namefield.setBounds(300,140,400,30);
        namefield.setFont(new Font("Arial",Font.BOLD,14));
        add(namefield);
        
        JLabel fname=new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         fnamefield=new JTextField();
        fnamefield.setBounds(300,190,400,30);
        fnamefield.setFont(new Font("Arial",Font.BOLD,14));
        add(fnamefield);
        
        JLabel dob=new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         date=new JDateChooser();
        date.setBounds(300,240,400,30);
        date.setForeground(new Color(105,105,105));
        add(date);
        
        JLabel gender=new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
         male=new JRadioButton("Male");
        male.setBounds(300,290,120,30);
        male.setBackground(Color.white);
        add(male);
        
         female=new JRadioButton("Female");
        female.setBounds(450,290,200,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergrp=new ButtonGroup();
        gendergrp.add(male);
        gendergrp.add(female);
        
        JLabel email=new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
         emailfield=new JTextField();
        emailfield.setBounds(300,340,400,30);
        emailfield.setFont(new Font("Arial",Font.BOLD,14));
        add(emailfield);
        
        JLabel marry=new JLabel("Marital Status: ");
        marry.setFont(new Font("Raleway",Font.BOLD,20));
        marry.setBounds(100,390,200,30);
        add(marry);
        
         married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
         unmarried=new JRadioButton("UnMarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
         others=new JRadioButton("Others");
        others.setBounds(600,390,100,30);
        others.setBackground(Color.white);
        add(others);
        
        ButtonGroup marrygrp=new ButtonGroup();
        marrygrp.add(married);
        marrygrp.add(unmarried);
        marrygrp.add(others);
        
        JLabel address=new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
         addressfield=new JTextField();
        addressfield.setBounds(300,440,400,30);
        addressfield.setFont(new Font("Arial",Font.BOLD,14));
        add(addressfield);
        
        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
         cityfield=new JTextField();
        cityfield.setBounds(300,490,400,30);
        cityfield.setFont(new Font("Arial",Font.BOLD,14));
        add(cityfield);
        
        JLabel state=new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
         statefield=new JTextField();
        statefield.setBounds(300,540,400,30);
        statefield.setFont(new Font("Arial",Font.BOLD,14));
        add(statefield);
        
        JLabel pincode=new JLabel("PinCode: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
         pinfield=new JTextField();
        pinfield.setBounds(300,590,400,30);
        pinfield.setFont(new Font("Arial",Font.BOLD,14));
        add(pinfield);
        
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
        String formno=""+random;
        String name=namefield.getText();
        String fname=fnamefield.getText();
        String dob=((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected())
        {
            gender="Male";
        }
        else if(female.isSelected())
        {
            gender="Female";
        }
        String email=emailfield.getText();
        String marry=null;
        if(married.isSelected())
        {
            marry="Married";
        }
        else if(unmarried.isSelected())
        {
            marry="Unmarried";
        }
        else if(others.isSelected())
        {
            marry="Others";
        }
        
        String address=addressfield.getText();
        String city=cityfield.getText();
        String state=statefield.getText();
        String pin=pinfield.getText();
        
        try{
            if(name.equals("") && ae.getSource()==next)
            {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            else if(ae.getSource()==next)
            {
                 setVisible(false);
                new Signup2(formno).setVisible(true);
                
                conn c=new conn();
                String query="insert into signup values('"+formno+"','"+name+"', '"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marry+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
                
//                setVisible(false);
//                new Signup2(formno).setVisible(true);
            }
//            else
//            {
//                conn c=new conn();
//                String query="insert into signup values('"+formno+"','"+name+"', '"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marry+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
//                c.s.executeUpdate(query);
//                
//                setVisible(false);
//                new Signup2(formno).setVisible(true);
//            }            

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new Signup1();
    }
    
}
