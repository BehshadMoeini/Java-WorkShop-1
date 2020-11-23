import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.event.*;
import java.util.*;

public class Library {
    
    ArrayList<String> bookName_list = new ArrayList<String>();
    String[] book = {"The Power Of Habit" , "The Compound Efect" , "Rich Dad Poor Dad" , "The Mom Test" , "Money Master The Game" ,
                     "Good To Great" , "Way Of The Wolf" , "The Lean StartUp" , "The 80/20 Principle" , "Purple COW"};
    
    ArrayList<String> authorName_list = new ArrayList<String>();
    String[] author = {"Charles Duhigg","Darren Hardy","Robert Kiyosaki","Rob Fitzpatrik","Tony Robbins","Jim Collins",
                       "Jordan Belfort","Eric Ries","Richard Koch","Seth Godin"};
    
    ArrayList<Integer> bookPrice_list = new ArrayList<Integer>();
    int[] price = {37000,52000,64000,28000,42000,35000,54000,45000,60000,40000};
    
    ArrayList<Integer> bookDate_list = new ArrayList<Integer>();
    int[] date = {2012,2010,1997,2013,1985,2001,1975,2002,1999,1974};
    
    
    JFrame f;
    JMenuBar mb;
    JMenu menu;
    JMenuItem mi1;
    JMenuItem mi2;
    JMenuItem mi3;
    JTextArea text;
    JTextArea text2;
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    JRadioButton rb4;
    JRadioButton rb5;
    JRadioButton rb6;
    JRadioButton rb7;
    JRadioButton rb8;
    JRadioButton rb9;
    JRadioButton rb10;
    JButton b;
    JLabel l;

    
    Library(){
        f = new JFrame();
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem mi1 = new JMenuItem("Display Books");
        JMenuItem mi2 = new JMenuItem("Books Information");
        JMenuItem mi3 = new JMenuItem("Buying Book");
        menu.add(mi1);
        menu.add(mi2);
        menu.add(mi3);
        mb.add(menu);
        text = new JTextArea();
        text2 = new JTextArea();
        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        rb3 = new JRadioButton();
        rb4 = new JRadioButton();
        rb5 = new JRadioButton();
        rb6 = new JRadioButton();
        rb7 = new JRadioButton();
        rb8 = new JRadioButton();
        rb9 = new JRadioButton();
        rb10 = new JRadioButton();
        b = new JButton();
        l = new JLabel();
        
        for(int i=0; i<book.length; i++){
            bookName_list.add(book[i]);
            authorName_list.add(author[i]);
            bookPrice_list.add(price[i]);
            bookDate_list.add(date[i]);
        }
        
        mi1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                String data = "";
                for(int i=0; i<bookName_list.size(); i++){
                    
                    data += (i+1) + ") " + bookName_list.get(i) + "\n";
                    
                }
                text.setText(data);
                text.setBounds(120,120,200,160);
           
                rb1.setVisible(false);
                rb2.setVisible(false);
                rb3.setVisible(false);
                rb4.setVisible(false);
                rb5.setVisible(false);
                rb6.setVisible(false);
                rb7.setVisible(false);
                rb8.setVisible(false);
                rb9.setVisible(false);
                rb10.setVisible(false);
                text.setVisible(true);
                text2.setVisible(false);
                b.setVisible(false);
                l.setVisible(false);
            }
            
        });
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                String data = "";
                for(int i=0; i<bookName_list.size(); i++){
                    
                    data += (i+1) + ") " + bookName_list.get(i) + "   =   { Author : " + authorName_list.get(i) +  
                            " , Price : " + bookPrice_list.get(i) + " , Date : " + bookDate_list.get(i) + " }\n";
                    
                }
                text2.setText(data);
                text2.setBounds(10,100,465,160);
                
                rb1.setVisible(false);
                rb2.setVisible(false);
                rb3.setVisible(false);
                rb4.setVisible(false);
                rb5.setVisible(false);
                rb6.setVisible(false);
                rb7.setVisible(false);
                rb8.setVisible(false);
                rb9.setVisible(false);
                rb10.setVisible(false);
                text.setVisible(false);
                text2.setVisible(true);
                b.setVisible(false);
                l.setVisible(false);
            }
        });
        
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                rb1.setText(bookName_list.get(0));
                rb1.setBounds(150,40,200,20);
                rb2.setText(bookName_list.get(1));
                rb2.setBounds(150,60,200,20);
                rb3.setText(bookName_list.get(2));
                rb3.setBounds(150,80,200,20);
                rb4.setText(bookName_list.get(3));
                rb4.setBounds(150,100,200,20);
                rb5.setText(bookName_list.get(4));
                rb5.setBounds(150,120,200,20);
                rb6.setText(bookName_list.get(5));
                rb6.setBounds(150,140,200,20);
                rb7.setText(bookName_list.get(6));
                rb7.setBounds(150,160,200,20);
                rb8.setText(bookName_list.get(7));
                rb8.setBounds(150,180,200,20);
                rb9.setText(bookName_list.get(8));
                rb9.setBounds(150,200,200,20);
                rb10.setText(bookName_list.get(9));
                rb10.setBounds(150,220,200,20);
                b.setText("Buy");
                b.setBounds(165,250,100,30);
                b.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        l.setText("** your Buy is Seccessfull **");
                        l.setBounds(150,300,200,30);
                    }
                });
                rb1.setVisible(true);
                rb2.setVisible(true);
                rb3.setVisible(true);
                rb4.setVisible(true);
                rb5.setVisible(true);
                rb6.setVisible(true);
                rb7.setVisible(true);
                rb8.setVisible(true);
                rb9.setVisible(true);
                rb10.setVisible(true);
                text.setVisible(false);
                text2.setVisible(false);
                b.setVisible(true);
                l.setVisible(true);
            }
        });

        
        f.add(text);
        f.add(text2);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(rb4);
        f.add(rb5);
        f.add(rb6);
        f.add(rb7);
        f.add(rb8);
        f.add(rb9);
        f.add(rb10);
        f.add(b);
        f.add(l);
        f.setJMenuBar(mb);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    

}
