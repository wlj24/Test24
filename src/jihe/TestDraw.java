package jihe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class TestDraw implements ActionListener {
     
    private JButton b1,b2,b3;
    JFrame frame;
    MyPanel panel;
     
    public void init() {
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 300);
        frame.setTitle("ª≠");
        frame.setLayout(new GridLayout(2, 1));
        JPanel p1 = new JPanel();
        b1 = new JButton("÷±œﬂ");
        b2 = new JButton("æÿ–Œ");
        b3 = new JButton("Õ÷‘≤");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        panel = new MyPanel();
        frame.add(p1);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            panel.setFlag(0);
            panel.repaint();
        }else if(e.getSource() == b2) {
            panel.setFlag(1);
            panel.repaint();
        }else if(e.getSource() == b3) {
            panel.setFlag(2);
            panel.repaint();
        }
    }
     
    public static void main(String[] args) {
        new TestDraw().init();
    }
     
    class MyPanel extends JPanel {
        int flag = -1;
        public MyPanel() {
            this.setSize(400, 400);
            this.setBackground(Color.white);
            this.setVisible(true);
        }
        //ª≠÷±œﬂ
        public void drawL(Graphics g) {
            g.drawLine(100, 20, 200, 20);
        }
        //ª≠æÿ–Œ
        public void drawR(Graphics g) {
            g.drawRect(100, 20, 200, 100);
        }
        //ª≠Õ÷‘≤
        public void drawO(Graphics g) {
            g.drawOval(100, 20, 200, 100);
        }
 
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            if(flag == 0) {
                drawL(g);
            }else if(flag == 1) {
                drawR(g);
            }else if(flag == 2) {
                drawO(g);
            }
        }
 
        public int getFlag() {
            return flag;
        }
 
        public void setFlag(int flag) {
            this.flag = flag;
        }
         
    }
 
}