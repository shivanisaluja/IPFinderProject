package ipfinder;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;


public class IPFinder extends JFrame implements ActionListener{
  
    JLabel l;  
    JTextField tf;
    JButton b;
    
    IPFinder(){
        super("IP Finder Tool - javatpoint");
       l= new JLabel ("Enter URL"); 
       l.setBounds(50,70,150,20);   //setBounds(x, y, width, height)
       tf=new JTextField(); // creates a new text field
       tf.setBounds(50,100,200,20);  
       
       
       b=new JButton("Find IP");
       b.setBounds(50,150,80,30);
       b.addActionListener(this);
       
       add(l); //adding label in JFrame  
       add(tf); // adding text field in JFrame  
       add(b); //adding button in JFrame  
       setSize(300,300); //changes the size of the frame
       setLayout(null);
       setVisible(true); // makes the frame appear on the screen.
       
    }
   
    public void actionPerformed(ActionEvent e){
        String url = tf.getText();  // url that was entered in text field
        try{
            InetAddress ia = InetAddress.getByName(url); 
            
            String ip = ia.getHostAddress(); //get ip address of any url in string format
            
            JOptionPane.showMessageDialog(this,ip);
        } catch (UnknownHostException e1){
            JOptionPane.showMessageDialog(this, e1.toString());
        }
    }
 
    public static void main(String[] args) {
       new IPFinder();
    }
    
}




