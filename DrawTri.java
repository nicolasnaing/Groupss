import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawTri extends JPanel {
    int val1=1;
    int val2=2;
    int val3=3;
    public String retStr1() {
        if (val1==1) {
            return "1";
        }
        if (val1==2) {
            return "2";
        }
        if (val1==3) {
            return "3";
        }
        if (val1==4) {
            return "4";
        }
        return "0";
    }
    public String retStr2() {
        if (val2==1) {
            return "1";
        }
        if (val2==2) {
            return "2";
        }
        if (val2==3) {
            return "3";
        }
        if (val2==4) {
            return "4";
        }
        return "0";
    }
    public String retStr3() {
        if (val3==1) {
            return "1";
        }
        if (val3==2) {
            return "2";
        }
        if (val3==3) {
            return "3";
        }
        if (val3==4) {
            return "4";
        }
        return "0";
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.GRAY);
        g.drawLine(160,30,120,110);
        g.drawLine(120,110,200,110);
        g.drawLine(200,110,160,30);
    
        g.drawString(retStr1(), 155, 20);
        g.drawString(retStr2(), 100, 120);
        g.drawString(retStr3(), 210, 120);
    }
}


