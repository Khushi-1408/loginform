package Database;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JButton bt1,bt2;
    JTextField tf;
    JPasswordField pf;
    JPanel p1,p2;
    Login(){
       super("Login");
       setSize(400,200);
       setLocation(10,10);
       l1=new JLabel("Login/register");
        l2=new JLabel("username");
        l3=new JLabel("password");
        bt1 =new JButton("login");
        bt2 =new JButton("cancel");
        tf = new JTextField();

        pf =new JPasswordField();
        p1 =new JPanel();
        p1.setLayout(new GridLayout(3,2));
        p1.add(l2);
        p1.add(tf);
        p1.add(l3);
        p1.add(pf);
        p1.add(bt1);
        p1.add(bt2);

        p2 =new JPanel();
        p2.setLayout(new GridLayout(1,1));
        p2.add(l1);
        setLayout(new BorderLayout(0,0));
        add(p1,"Center");
        add(p2,"North");

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
