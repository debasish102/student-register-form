/*JOptionPane
 * showMessageDialog(Parent window,String Message , messageType)
 * messageType JOptionPane.PLAIN_MESSAGE
 *             JOptionPane.WARNING_MESSAGE
 *             JOptionPane.ERROR_MESSAGE
 * showConfirmDialog(Parent Window, String Message)
 * String d = showInputDialog(Parent window , String Message)   
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegForm extends JFrame implements ActionListener,ItemListener
{
    Container cn;
    JLabel t1 , t2 ,t3,t4,t5,t6 ,t7, t8,t9,t10;
    JTextField jf1,jf2,jf3,jf4;
    JComboBox cb , cb2;
    JCheckBox b1,b2,b3;
    JRadioButton m , f;
    JPasswordField pf;
    JButton jb1 , jb2;
    String hob="";
    String gen,stm,sem,nm,regd,eml;
    public RegForm() 
    {
        cn = getContentPane();
        setTitle("Welcome");
        setLayout(null);
        cn.setBackground(Color.WHITE);

        t1 = new JLabel("Register Yourself");
        t1.setBounds(400,30,200,30);
        cn.add(t1);
        t2 = new JLabel("________________");
        t2.setBounds(400,40,200,20);
        cn.add(t2);
        t3 = new JLabel("Name");
        t3.setBounds(50,120,150,30);
        cn.add(t3);
        jf1 = new JTextField();
        jf1.setBounds(120,120,200,30);
        cn.add(jf1);
        t4 = new JLabel("Reg. No");
        t4.setBounds(50,160,150,30);
        cn.add(t4);
        jf2 = new JTextField();
        jf2.setBounds(120,160,200,30);
        cn.add(jf2);
        t5 = new JLabel("Stream");
        t5.setBounds(50,200,150,30);
        cn.add(t5);
        
        cb = new JComboBox();
        cb.setBounds(120,200,100,30);
        cb.addItem("Diploma");
        cb.addItem("BTech");
        cb.addItem("MCA");
        cb.addItem("Msc");
        cb.addItemListener(this);
        cn.add(cb);

        t6 = new JLabel("Semester");
        t6.setBounds(50,240,150,30);
        cn.add(t6);

        cb2 = new JComboBox();
        cb2.setBounds(120,240,100,30);
        cb2.addItem("1st");
        cb2.addItem("2nd");
        cb2.addItem("3rd");
        cb2.addItem("4th");
        cb2.addItemListener(this);
        cn.add(cb2);

        t7 = new JLabel("Gender");
        t7.setBounds(50,280,150,30);
        cn.add(t7);
        m = new JRadioButton("Male");
        m.setBounds(120,280,100,30);
        m.addActionListener(this);
        f = new JRadioButton("Female");
        f.setBounds(230,280,100,30);
        f.addActionListener(this);
        cn.add(m);
        cn.add(f);

        t8 = new JLabel("Hobbies");
        t8.setBounds(50,320,150,30);
        cn.add(t8);
        b1 = new JCheckBox("Playing");
        b1.setBounds(120,320,100,30);
        b1.addItemListener(this);
        b2 = new JCheckBox("Cooking");
        b2.setBounds(220,320,100,30);
        b2.addItemListener(this);
        b3 = new JCheckBox("Painting");
        b3.setBounds(320,320,100,30);
        b3.addItemListener(this);
        cn.add(b1);
        cn.add(b2);
        cn.add(b3);
        t9 = new JLabel("Email");
        t9.setBounds(50,360,100,30);
        cn.add(t9);
        jf3 = new JTextField();
        jf3.setBounds(120,360,150,30);
        cn.add(jf3);
        t10 = new JLabel("Password");
        t10.setBounds(50,400,100,30);
        cn.add(t10);
        pf = new JPasswordField();
        pf.setBounds(120,400,150,30);
        cn.add(pf);

        jb1 = new JButton("Submit");
        jb1.setBounds(400,450,100,30);
        jb1.addActionListener(this);
        jb2 = new JButton("Reset");
        jb2.setBounds(530,450,100,30);
        jb2.addActionListener(this);
        cn.add(jb1);
        cn.add(jb2);

        setVisible(true);
        setSize(1000 , 1000);

    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==b1)
        {
            String t=b1.getText();
            hob= hob+t+"/";
        }
        if(ie.getSource()==b2)
        {
            String t=b2.getText();
            hob=hob+t+"/";
        }
        if(ie.getSource()==b3)
        {
            String t=b3.getText();
            hob=hob+t+"/";
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==m)
        {
            gen=m.getText();
        }
        if(ae.getSource()==f)
        {
            gen=f.getText();
        }
        stm=(String)cb.getSelectedItem();
        
        sem=(String)cb2.getSelectedItem();
        if(ae.getSource()==jb2)
        {
            jf1.setText("");
            jf2.setText("");
            jf3.setText("");
        }
        if(ae.getSource()==jb1)
        {
            nm=jf1.getText();
            regd=jf2.getText();
            eml=jf3.getText();
            System.out.println("Name : "+nm+"\nRegd No :"+regd+"\nEmail "+eml+"\nGender :"+gen+"\nHobby "+hob+"\nBranch : "+stm+"\nSemister : "+sem);
            setVisible(false); //Close this file
            new Display(this); //Show Display file
        }
    }
}
class RegistrationForm
{
    public static void main(String args[])
    {
        new RegForm();
    }
}