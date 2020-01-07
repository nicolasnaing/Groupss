import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawTet extends JPanel {
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
        
        g.setColor(Color.GRAY); // coordinates: (80,200), (160, 200), (120,150), and (120,90)
        g.drawLine(150,170,250,170); //bottom line
        g.drawLine(150,170,200,140); // to top right bottom
        g.drawLine(250,170,200,140); // to top left bottom
        g.drawLine(200,140,200,80); // mid to tip
        g.drawLine(200,80,150,170); // to top right top
        g.drawLine(200,80,250,170); // to top left top
        
        g.drawString(retStr1(), 195, 75); //top (200,80)
        g.drawString(retStr4(), 255, 175); // right (250,170)
        g.drawString(retStr2(), 140, 175); // left (150,170)
        g.drawString(retStr3(), 195, 155); // back (200,150)
    }
}


