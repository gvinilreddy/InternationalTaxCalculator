
// import java.awt.Color; 
import java.awt.Font;
import java.awt.event.*;  
import javax.swing.*;    
public class InternationalTaxCal {  
public static void main(String[] args) {  
    // creating a Jframe
    JFrame f=new JFrame("International Tax Calculator"); 

     // input tag to take Annual income
    JLabel label1 =new JLabel("Annual Income");
    label1.setBounds(50,50,150,30);
    label1.setFont(new Font("",Font.BOLD,15));

    // input tag to take country code
    JLabel label2=new JLabel("Country Code");
    label2.setBounds(50, 100, 150, 30);
    label2.setFont(new Font("",Font.BOLD,15));


    //calculated tax from country code and  
    JLabel label3=new JLabel("Payable tax");
    label3.setBounds(100, 200, 150, 30);

     JTextField tf1=new JTextField();  
    tf1.setBounds(250,50, 150,30);  
    tf1.setFont(new Font("",Font.BOLD,15));

     JTextField tf2=new JTextField();
    tf2.setBounds(250,100,150,30);
    tf2.setFont(new Font("",Font.BOLD,15));


    final JTextField tf3=new JTextField();
    tf3.setBounds(200, 200, 150, 30);
    tf3.setFont(new Font("",Font.BOLD,15));

    JButton b=new JButton("Calculate");  
    b.setBounds(50,150,95,30);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            String countryCode=tf2.getText();
            String sal=tf1.getText();
            long salary=Long.parseLong(sal);
            switch(countryCode)
            {
                case "91": india(salary,tf3);
                break;
                case "81" : japan(salary,tf3);
                break;
                default: tf3.setText("Invalid Country Code");
            }  
        }  
    });  
    f.add(b);
    f.add(tf1);  
    f.add(tf2);
    f.add(tf3);
    f.add(label1);
    f.add(label2);
    f.setSize(600,600);  
    f.setLayout(null);  
    f.setVisible(true);
    f.setResizable(false);  
    f.setLocationRelativeTo(null); 
}  
static void india(long salary,JTextField tf)
{
   if(salary<250000) { tf.setText("0");}
   else if(salary>=250000 && salary<500000)  { tf.setText(Double.toString(salary*0.05)); }
   else if(salary>=500000 && salary<750000)  { tf.setText(Double.toString(salary*0.1)); }
   else if(salary>=750000 && salary<1000000) { tf.setText(Double.toString(salary*0.15)); }
   else if(salary>=1000000 && salary<1250000){ tf.setText(Double.toString(salary*0.2)); }
   else if(salary>=1250000 && salary<1500000){ tf.setText(Double.toHexString(salary*0.25)); }
   else  { tf.setText(Double.toString(salary*0.3)); }
}
static void japan(long salary,JTextField tf)
{
    if(salary<1950000){ tf.setText(Double.toString(salary*0.05));}
    else if(salary>=1950000 && salary<3300000) { tf.setText(Double.toString(salary*0.1));}
    else if(salary>=3300000 && salary<6950000) { tf.setText(Double.toString(salary*0.2));}
    else if(salary>=6950000 && salary<9000000) { tf.setText(Double.toString(salary*0.23));}
    else if(salary>=9000000 && salary<18000000) { tf.setText(Double.toString(salary*0.33));}
    else if(salary>=18000000 && salary<40000000) { tf.setText(Double.toString(salary*0.4));}
    else { tf.setText(Double.toString(salary*0.45));}
    
}
}  