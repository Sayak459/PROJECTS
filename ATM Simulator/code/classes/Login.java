package bank;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardfield;
    JPasswordField pinfield;
    Login()
    {
        setTitle("ATM Machine");
        setLayout(null);
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpg"));
        Image i1=i.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);
        JLabel label=new JLabel(i2);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM MACHINE");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,800,40);
        add(text);
        
        JLabel cardno=new JLabel("CARD NO.");
        cardno.setFont(new Font("Raleway",Font.BOLD,30));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
         cardfield=new JTextField();
        cardfield.setBounds(300,150,230,30);
        cardfield.setFont(new Font("Arial",Font.BOLD,14));
        add(cardfield);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        pin.setBounds(200,230,250,30);
        add(pin);
        
         pinfield=new JPasswordField();
        pinfield.setBounds(300,230,230,30);
        pinfield.setFont(new Font("Arial",Font.BOLD,14));
        add(pinfield);
        
         login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
         signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setVisible(true);
        setLocation(300,200);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==clear)
        {
            cardfield.setText(" ");
            pinfield.setText(" ");
        }
        else if(ae.getSource()==login)
        {
            conn c=new conn();
            String cardno=cardfield.getText();
            String pinno=pinfield.getText();
            String query="select * from login where cardno='"+cardno+"' and pin='"+pinno+"'";
            try
            {
                ResultSet rs=c.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Transaction(pinno).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect Card No or Pin!!!");
                }
            }
            catch(Exception e)
                    {
                        System.out.println(e);
                    }
        }
        else if(ae.getSource()==signup)
        {
            setVisible(false);
            new Signup1().setVisible(true);
        }
        
    }
    
    public static void main(String args[])
    {
        new Login();
    }
}