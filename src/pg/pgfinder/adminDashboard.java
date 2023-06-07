package pg.pgfinder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.*;

public class adminDashboard extends JFrame  {

    JTable table;
    JLabel slogan,name,phn,AdhaarCard,Occupation,anywords,contPeople;

    adminDashboard() {
         setLayout(null);
         setBounds(350, 200, 800, 570);
         getContentPane().setBackground(Color.WHITE);

//        JButton mumbai = new JButton("Mumbai");
//        mumbai.setBounds(20, 50, 120, 30);
//        mumbai.setBackground(Color.black);
//        mumbai.setForeground(Color.white);
//        mumbai.setFont(new Font("tahoma",Font.PLAIN, 12));
//        add(mumbai);
//
//        JButton kolkata = new JButton("kolkata");
//        kolkata.setBounds(20, 100, 120, 30);
//        kolkata.setBackground(Color.black);
//        kolkata.setForeground(Color.white);
//        kolkata.setFont(new Font("tahoma",Font.PLAIN, 12));
//        add(kolkata);
//
//        JButton hyderabad = new JButton("Hyderabad");
//        hyderabad.setBounds(20, 150, 120, 30);
//        hyderabad.setBackground(Color.black);
//        hyderabad.setForeground(Color.white);
//        hyderabad.setFont(new Font("tahoma",Font.PLAIN, 12));
//        add(hyderabad);
//
//        JButton  delhi= new JButton("Hyderabad");
//        delhi.setBounds(20, 200, 120, 30);
//        delhi.setBackground(Color.black);
//        delhi.setForeground(Color.white);
//        delhi.setFont(new Font("tahoma",Font.PLAIN, 12));
//        add(delhi);
        slogan = new JLabel("We'll get higher with SUPPORT.");
        slogan.setBounds(150,0,500,100);
        slogan.setFont(new Font("tahoma", Font.BOLD, 30));
        add(slogan);

        name = new JLabel("Name");
        name.setBounds(20,250,200,100);
        name.setFont(new Font("tahoma", Font.BOLD, 14));
        add(name);

        phn = new JLabel("Phone");
        phn.setBounds(180,250,200,100);
        phn.setFont(new Font("tahoma", Font.BOLD, 14));
        add(phn);

        AdhaarCard = new JLabel("Adhaar Card");
        AdhaarCard.setBounds(340,250,200,100);
        AdhaarCard.setFont(new Font("tahoma", Font.BOLD, 14));
        add(AdhaarCard);

        Occupation = new JLabel("Occupation");
        Occupation.setBounds(495,250,200,100);
        Occupation.setFont(new Font("tahoma", Font.BOLD, 14));
        add(Occupation);

        anywords = new JLabel("Thoughts");
        anywords.setBounds(658,250,200,100);
        anywords.setFont(new Font("tahoma", Font.BOLD, 14));
        add(anywords);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("proimg/4207.jpg"));
        Image img2 = im.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);

        image.setBounds(230,75,300,200);
        add(image);

        contPeople = new JLabel("People who Contacted");
        contPeople.setBounds(18,210,260,100);
        contPeople.setFont(new Font("tahoma", Font.BOLD, 17));
        add(contPeople);

        table = new JTable();
        table.setBounds(20,310,800,400);
//        table.setBackground(Color.black);
        add(table);



        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from contact");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception e){
            e.printStackTrace();
        }

        setVisible(true);

    }


    public static void main(String[] args) {

        new adminDashboard();
    }

}
