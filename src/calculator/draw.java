package calculator;
import javax.swing.*;
import java.awt.*;
public class draw extends JPanel{
    protected void paintComponent(Graphics g){
           super.paintComponent(g);
           g.setColor(Color.BLACK);
           g.drawString("SHIFT", 30,110);
           g.drawString("ALPHA", 105,116);
           g.drawString("REPLAY", 187,110);
           g.drawString("MOOE", 280,116);
           g.drawString("NO", 357,110);
           g.setColor(Color.pink);
           g.fillOval(20,114 ,60 ,30);
           g.fillOval(95,124 ,60 ,30);
           g.fillOval(175,114 ,75 ,81);
           g.fillOval(260,124 ,60 ,30);
           g.fillOval(333,114 ,60 ,30);
        }
    public draw(){
        this.setBackground(Color.white);
        this.setLayout(null);
        JTextField t=new JTextField();
        t.setBounds(20,20,380,70);
        this.add(t);
        
        JButton b1=new JButton("CA");
        b1.setBounds(20,179 ,55,30);
        this.add(b1);
        b1.setForeground(Color.white);
        b1.setBackground(Color.gray);
        
        JButton b2=new JButton("x^2");
        b2.setBounds(85,179 ,55,30);
        this.add(b2);
        b2.setForeground(Color.white);
        b2.setBackground(Color.gray);
        
        JButton b3=new JButton("x");
        b3.setBounds(280,179,55,30);
        this.add(b3);
        b3.setForeground(Color.white);
        b3.setBackground(Color.gray);
        
        JButton b4=new JButton("log0");
        b4.setBounds(345,179 ,55,30);
        this.add(b4);
        b4.setForeground(Color.white);
        b4.setBackground(Color.gray);
        
        
         JButton b6=new JButton("/");
        b6.setBounds(20,224 ,55,30);
        this.add(b6);
        b6.setForeground(Color.white);
        b6.setBackground(Color.gray);
        
        JButton b7=new JButton("√");
        b7.setBounds(85,224 ,55,30);
        this.add(b7);
        b7.setForeground(Color.white);
        b7.setBackground(Color.gray);
        
        JButton b8=new JButton("π");
        b8.setBounds(150,224 ,55,30);
        this.add(b8);
        b8.setForeground(Color.white);
        b8.setBackground(Color.gray);
        
        JButton b9=new JButton("x^");
        b9.setBounds(215,224 ,55,30);
        this.add(b9);
        b9.setForeground(Color.white);
        b9.setBackground(Color.gray);
        
        JButton b10=new JButton("log");
        b10.setBounds(280,224 ,55,30);
        this.add(b10);
        b10.setForeground(Color.white);
        b10.setBackground(Color.gray);
        
        JButton b11=new JButton("In");
        b11.setBounds(345,224 ,55,30);
        this.add(b11);
        b11.setForeground(Color.white);
        b11.setBackground(Color.gray);
        
        
        JButton b12=new JButton("(-)");
        b12.setBounds(20,269,55,30);
        this.add(b12);
        b12.setForeground(Color.white);
        b12.setBackground(Color.gray);
        
        JButton b13=new JButton(".,,,");
        b13.setBounds(85,269 ,55,30);
        this.add(b13);
        b13.setForeground(Color.white);
        b13.setBackground(Color.gray);
        
        JButton b14=new JButton("hyp");
        b14.setBounds(150,269 ,55,30);
        this.add(b14);
        b14.setForeground(Color.white);
        b14.setBackground(Color.gray);
        
        JButton b15 =new JButton("sin");
        b15.setBounds(215,269 ,55,30);
        this.add(b15);
        b15.setForeground(Color.white);
        b15.setBackground(Color.gray);
        
        JButton b16=new JButton("cos");
        b16.setBounds(280,269 ,55,30);
        this.add(b16);
        b16.setForeground(Color.white);
        b16.setBackground(Color.gray);
        
        JButton b17=new JButton("tan");
        b17.setBounds(345,269 ,55,30);
        this.add(b17);
        b17.setForeground(Color.white);
        b17.setBackground(Color.gray);
        
        
        JButton b18=new JButton("RC");
        b18.setBounds(20,319 ,55,30);
        this.add(b18);
        b18.setForeground(Color.white);
        b18.setBackground(Color.gray);
        
        JButton b19=new JButton("EN");
        b19.setBounds(85,319 ,55,30);
        this.add(b19);
        b19.setForeground(Color.white);
        b19.setBackground(Color.gray);
        
        JButton b20=new JButton("(");
        b20.setBounds(150,319 ,55,30);
        this.add(b20);
        b20.setForeground(Color.white);
        b20.setBackground(Color.gray);
        
        JButton b21 =new JButton(")");
        b21.setBounds(215,319,55,30);
        this.add(b21);
        b21.setForeground(Color.white);
        b21.setBackground(Color.gray);
        
        JButton b22=new JButton("SD");
        b22.setBounds(280,319 ,55,30);
        this.add(b22);
        b22.setForeground(Color.white);
        b22.setBackground(Color.gray);
        
        JButton b23=new JButton("M+");
        b23.setBounds(345,319 ,55,30);
        this.add(b23);
        b23.setForeground(Color.white);
        b23.setBackground(Color.gray);
        
        
         JButton b24=new JButton("7");
        b24.setBounds(20,369,64,30);
        this.add(b24);
        b24.setForeground(Color.black);
        b24.setBackground(Color.white);
        
        JButton b25=new JButton("8");
        b25.setBounds(99,369 ,64,30);
        this.add(b25);
        b25.setForeground(Color.black);
        b25.setBackground(Color.white);
        
        JButton b26=new JButton("9");
        b26.setBounds(178,369 ,64,30);
        this.add(b26);
        b26.setForeground(Color.black);
        b26.setBackground(Color.white);
        
        JButton b27=new JButton("DEL");
        b27.setBounds(257,369 ,64,30);
        this.add(b27);
        b27.setForeground(Color.black);
        b27.setBackground(Color.pink);
        
        JButton b28=new JButton("AC");
        b28.setBounds(336,369 ,64,30);
        this.add(b28);
        b28.setForeground(Color.black);
        b28.setBackground(Color.pink);
        
        JButton b29=new JButton("4");
        b29.setBounds(20,414,64,30);
        this.add(b29);
        b29.setForeground(Color.black);
        b29.setBackground(Color.white);
        
        JButton b30=new JButton("5");
        b30.setBounds(99,414 ,64,30);
        this.add(b30);
        b30.setForeground(Color.black);
        b30.setBackground(Color.white);
        
        JButton b31=new JButton("6");
        b31.setBounds(178,414 ,64,30);
        this.add(b31);
        b31.setForeground(Color.black);
        b31.setBackground(Color.white);
        
        JButton b32=new JButton("x");
        b32.setBounds(257,414 ,64,30);
        this.add(b32);
        b32.setForeground(Color.black);
        b32.setBackground(Color.white);
        
        JButton b34=new JButton("/");
        b34.setBounds(336,414 ,64,30);
        this.add(b34);
        b34.setForeground(Color.black);
        b34.setBackground(Color.white);
        
        
        
        JButton b35=new JButton("1");
        b35.setBounds(20,459,64,30);
        this.add(b35);
        b35.setForeground(Color.black);
        b35.setBackground(Color.white);
        
        JButton b36=new JButton("2");
        b36.setBounds(99,459 ,64,30);
        this.add(b36);
        b36.setForeground(Color.black);
        b36.setBackground(Color.white);
        
        JButton b37=new JButton("3");
        b37.setBounds(178,459 ,64,30);
        this.add(b37);
        b37.setForeground(Color.black);
        b37.setBackground(Color.white);
        
        JButton b38=new JButton("+");
        b38.setBounds(257,459 ,64,30);
        this.add(b38);
        b38.setForeground(Color.black);
        b38.setBackground(Color.white);
        
        JButton b39=new JButton("-");
        b39.setBounds(336,459 ,64,30);
        this.add(b39);
        b39.setForeground(Color.black);
        b39.setBackground(Color.white);
        
        
        JButton b40=new JButton("0");
        b40.setBounds(20,504 ,64,30);
        this.add(b40);
        b40.setForeground(Color.black);
        b40.setBackground(Color.white);
        
        JButton b41=new JButton(".");
        b41.setBounds(99,504 ,64,30);
        this.add(b41);
        b41.setForeground(Color.black);
        b41.setBackground(Color.white);
        
        JButton b42=new JButton("x10");
        b42.setBounds(178,504 ,64,30);
        this.add(b42);
        b42.setForeground(Color.black);
        b42.setBackground(Color.white);
        
        JButton b43=new JButton("Ans");
        b43.setBounds(257,504 ,64,30);
        this.add(b43);
        b43.setForeground(Color.black);
        b43.setBackground(Color.white);
        
        JButton b44=new JButton("=");
        b44.setBounds(336,504 ,64,30);
        this.add(b44);
        b44.setForeground(Color.white);
        b44.setBackground(Color.red);
        
    }
    
}
