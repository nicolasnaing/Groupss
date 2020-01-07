import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Draw extends JPanel {
    int val1=1;
    int val2=2;
    int val3=3;
    int val4=4;
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
    public String retStr4() {
        if (val4==1) {
            return "1";
        }
        if (val4==2) {
            return "2";
        }
        if (val4==3) {
            return "3";
        }
        if (val4==4) {
            return "4";
        }
        return "0";
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.GRAY);
        g.drawLine(125,55,225,55);
        g.drawLine(225,55,225,155);
        g.drawLine(225,155,125,155);
        g.drawLine(125,155,125,55);
        
        g.drawString(retStr1(), 115, 60);
        g.drawString(retStr2(), 230, 60);
        g.drawString(retStr3(), 230, 160);
        g.drawString(retStr4(), 115, 160);
    }
}

