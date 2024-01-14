package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JRadioButton r1,r2,r3,r4;
    JButton submit,cancel;
    String formno;

   Signup3(String formno)
   {
       this.formno=formno;
       setLayout(null);
       
       JLabel l1=new JLabel("Page 3: ACCOUNT DETAILS");
       l1.setFont(new Font("Raleway",Font.BOLD,22));
       l1.setBounds(280,40,400,40);
       add(l1);
       
       JLabel type=new JLabel("Account Type");
       type.setFont(new Font("Raleway",Font.BOLD,22));
       type.setBounds(100,140,200,30);
       add(type);
       
       r1=new JRadioButton("Savings Account");
       r1.setFont(new Font("Raleway",Font.BOLD,16));
       r1.setBackground(Color.white );
       r1.setBounds(100,180,220,20);
       add(r1);
       
       r2=new JRadioButton("Fixed Deposit");
       r2.setFont(new Font("Raleway",Font.BOLD,16));
       r2.setBackground(Color.white );
       r2.setBounds(350,180,220,20);
       add(r2);
       
       r3=new JRadioButton("Current Account");
       r3.setFont(new Font("Raleway",Font.BOLD,16));
       r3.setBackground(Color.white );
       r3.setBounds(100,220,220,20);
       add(r3);
       
       r4=new JRadioButton("Recurring Deposit Account");
       r4.setFont(new Font("Raleway",Font.BOLD,16));
       r4.setBackground(Color.white );
       r4.setBounds(350,220,250,20);
       add(r4);
       
       ButtonGroup account =new ButtonGroup();
       account.add(r1);
       account.add(r2);
       account.add(r3);
       account.add(r4);
       
       JLabel card=new JLabel("CARD NO:");
       card.setFont(new Font("Raleway",Font.BOLD,22));
       card.setBounds(100,300,200,30);
       add(card);
       
       JLabel number=new JLabel("XXXX-XXXX-XXXX-1222");
       number.setFont(new Font("Raleway",Font.BOLD,22));
       number.setBounds(330,300,300,30);
       add(number);
       
       JLabel details=new JLabel("Your 16 Digit Card No:");
       details.setFont(new Font("Raleway",Font.BOLD,12));
       details.setBounds(100,330,300,20);
       add(details);
       
       JLabel pin=new JLabel("PIN NO:");
       pin.setFont(new Font("Raleway",Font.BOLD,22));
       pin.setBounds(100,370,200,30);
       add(pin);
       
       JLabel pnumber=new JLabel("XXXX");
       pnumber.setFont(new Font("Raleway",Font.BOLD,22));
       pnumber.setBounds(330,370,300,30);
       add(pnumber);
       
       JLabel pdetails=new JLabel("Your 4 Digit Pin No:");
       pdetails.setFont(new Font("Raleway",Font.BOLD,12));
       pdetails.setBounds(100,400,300,20);
       add(pdetails);
       
       JLabel service=new JLabel("Services Required:");
       service.setFont(new Font("Raleway",Font.BOLD,22));
       service.setBounds(100,450,400,30);
       add(service);
       
       c1 =new JCheckBox("ATM Card");
       c1.setBackground(Color.white);
       c1.setFont(new Font("Raleway",Font.BOLD,16));
       c1.setBounds(100,500,200,30);
       add(c1);
       
       c2 =new JCheckBox("Internet Banking");
       c2.setBackground(Color.white);
       c2.setFont(new Font("Raleway",Font.BOLD,16));
       c2.setBounds(350,500,200,30);
       add(c2);
       
       c3 =new JCheckBox("Mobile Banking");
       c3.setBackground(Color.white);
       c3.setFont(new Font("Raleway",Font.BOLD,16));
       c3.setBounds(100,550,200,30);
       add(c3);
       
       c4 =new JCheckBox("Email Alerts");
       c4.setBackground(Color.white);
       c4.setFont(new Font("Raleway",Font.BOLD,16));
       c4.setBounds(350,550,200,30);
       add(c4);
       
       c5 =new JCheckBox("Cheque Book");
       c5.setBackground(Color.white);
       c5.setFont(new Font("Raleway",Font.BOLD,16));
       c5.setBounds(100,600,200,30);
       add(c5);
       
       c6 =new JCheckBox("E-Statements");
       c6.setBackground(Color.white);
       c6.setFont(new Font("Raleway",Font.BOLD,16));
       c6.setBounds(350,600,200,30);
       add(c6);
       
       c7 =new JCheckBox("I,Hereby Declare that above details are correct");
       c7.setBackground(Color.white);
       c7.setFont(new Font("Raleway",Font.BOLD,12));
       c7.setBounds(100,680,600,30);
       add(c7);
       
       submit =new JButton("Submit");
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.BLUE);
       submit.setFont(new Font("Raleway",Font.BOLD,12));
       submit.setBounds(250,720,100,30);
       submit.addActionListener(this);
       add(submit);
       
       cancel =new JButton("Cancel");
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.BLUE);
       cancel.setFont(new Font("Raleway",Font.BOLD,12));
       cancel.setBounds(420,720,100,30);
       cancel.addActionListener(this);
       add(cancel);
       
       
       setSize(850,820);
       setLocation(350,0);
       setVisible(true);
   }
   
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()==submit)
       {
           String accounttype=null;
           if(r1.isSelected())
           {
               accounttype="Savings Account";
           }
           else if(r2.isSelected())
           {
               accounttype="Fixed Deposit";
           }
           else if(r3.isSelected())
           {
               accounttype="Current Account";
           }
           else if(r4.isSelected())
           {
               accounttype="Recurring Account";
           }
           
           Random random=new Random();
           String cardno=""+Math.abs((random.nextLong()%90000000L)+5040936000000000L);
           
           String pinno=""+Math.abs((random.nextLong()%9000L)+1000L);
           
           String facility="";
           if(c1.isSelected())
           {
               facility=facility +" ATM card";
           }
           else if(c2.isSelected())
           {
               facility=facility +" Internet Banking";
           }
           else if(c3.isSelected())
           {
               facility=facility +" Mobile Banking";
           }
           else if(c4.isSelected())
           {
               facility=facility +" EMAIL & SMS Alerts";
           }
           else if(c5.isSelected())
           {
               facility=facility +" Cheque Book";
           }
           else if(c6.isSelected())
           {
               facility=facility +" Estatement";
           }
           
           try
           {
               if(accounttype.equals(""))
               {
                   JOptionPane.showMessageDialog(null,"Account type is required");
               }
               else
               {
                   conn con=new conn();
                   String query1="insert into signup3 values('"+formno+"','"+accounttype+"','"+cardno+"','"+pinno+"','"+facility+"')";
                   String query2="insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";
                   
                   con.s.executeUpdate(query1);
                   con.s.executeUpdate(query2);
                   
                   JOptionPane.showMessageDialog(null,"Card Number: "+cardno+"Pin Number: "+pinno);
                   
                   setVisible(false);
                   new Deposit(pinno).setVisible(false);
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
       }
       else if(ae.getSource()==cancel)
       {
           setVisible(false);
           new Login().setVisible(true);
       }
   }
    public static void main(String[] args) {
        new Signup3("");
    }
    
}
