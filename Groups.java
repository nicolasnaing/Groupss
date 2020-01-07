import cs1.Keyboard;
import javax.swing.*;
public class Groups {
    int[] triangle = new int[3];
    int[] square = new int[4];
    int[] tetrahedron = new int[4];
    
    // triangle functions
    void shift3 () {
    int temp= triangle[2];
    triangle[2]=triangle[1];
    triangle[1]=triangle[0];
    triangle[0]=temp;
    }
    void ref3() {
    int temp= triangle[0];
    triangle[0]=triangle[1];
    triangle[1]=temp;
    }
    void printTri() {
        System.out.println(" " + triangle[0]);
        System.out.println(triangle[1] + " " + triangle[2]);
    }
    // square functions
    void shift4() {
    int temp= square[3];
    square[3]=square[2];
    square[2]=square[1];
    square[1]=square[0];
    square[0]=temp;
    }
    void ref4() {
    int temp= square[0];
    square[0]=square[2];
    square[2]=temp;
    }
    void printSqu() {
        System.out.println(square[0] + " " + square[1]);
        System.out.println(square[3] + " " + square[2]);
    }
    //tetrahedron functions
    void shiftT() {
    int temp= tetrahedron[3];
    tetrahedron[3]=tetrahedron[2];
    tetrahedron[2]=tetrahedron[1];
    tetrahedron[1]=temp;
    }
    void refT() {
    int temp= tetrahedron[0];
    tetrahedron[0]=tetrahedron[2];
    tetrahedron[2]=temp;
    }
    void printTet() {
        System.out.println("  " + tetrahedron[0]);
        System.out.println(tetrahedron[1] + " " + tetrahedron[2] + " " + tetrahedron[3]);
    }
    public static void main (String[] args) {
        Groups test = new Groups();
        test.triangle[0]=1;
        test.triangle[1]=2;
        test.triangle[2]=3;
        test.square[0]=1;
        test.square[1]=2;
        test.square[2]=3;
        test.square[3]=4;
        test.tetrahedron[0]=1;
        test.tetrahedron[1]=2;
        test.tetrahedron[2]=3;
        test.tetrahedron[3]=4;
        
        //groups done
        
        // finished initialization
        
        System.out.println("tri, squ, or tet");
        String read = Keyboard.readWord();
        if (read.equals("tri")) {
            JFrame f = new JFrame("Title");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            DrawTri d = new DrawTri();
            f.add(d);
            f.setSize(400,250);
            f.setVisible(true);
            test.printTri();
            String read2 = Keyboard.readWord();
            while (!read2.equals("stop")) {
                if (read2.equals("ref")) {
                    test.ref3();
                    d.val1=test.triangle[0];
                    d.val2=test.triangle[1];
                    d.val3=test.triangle[2];
                    JFrame g = new JFrame("Title");
                    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    g.add(d);
                    g.setSize(400,250);
                    g.setVisible(true);
                    test.printTri();
                    read2=Keyboard.readWord();
                    
                }
                if (read2.equals("shift")) {
                    test.shift3();
                    d.val1=test.triangle[0];
                    d.val2=test.triangle[1];
                    d.val3=test.triangle[2];
                    JFrame g = new JFrame("Title");
                    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    g.add(d);
                    g.setSize(400,250);
                    g.setVisible(true);
                    test.printTri();
                    read2=Keyboard.readWord();
                }
            }
        }
        else if (read.equals("squ")) {
            JFrame f = new JFrame("Title");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Draw d = new Draw();
            f.add(d);
            f.setSize(400,250);
            f.setVisible(true);
            test.printSqu();
            String read2 = Keyboard.readWord();
            while (!read2.equals("stop")) {
                if (read2.equals("ref")) {
                    test.ref4();
                    d.val1=test.square[0];
                    d.val2=test.square[1];
                    d.val3=test.square[2];
                    d.val4=test.square[3];
                    JFrame g = new JFrame("Title");
                    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    g.add(d);
                    g.setSize(400,250);
                    g.setVisible(true);
                    test.printSqu();
                    read2=Keyboard.readWord();
                }
                if (read2.equals("shift")) {
                    test.shift4();
                    d.val1=test.square[0];
                    d.val2=test.square[1];
                    d.val3=test.square[2];
                    d.val4=test.square[3];
                    JFrame g = new JFrame("Title");
                    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    g.add(d);
                    g.setSize(400,250);
                    g.setVisible(true);
                    test.printSqu();
                    read2=Keyboard.readWord();
                }
            }
        }
        else if (read.equals("tet")) {
            JFrame f = new JFrame("Title");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            DrawTet d = new DrawTet();
            f.add(d);
            f.setSize(400,250);
            f.setVisible(true);
            test.printTet();
            String read2 = Keyboard.readWord();
            while (!read2.equals("stop")) {
                if (read2.equals("ref")) {
                    test.refT();
                    d.val1=test.tetrahedron[0];
                    d.val2=test.tetrahedron[1];
                    d.val3=test.tetrahedron[2];
                    d.val4=test.tetrahedron[3];
                    JFrame g = new JFrame("Title");
                    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    g.add(d);
                    g.setSize(400,250);
                    g.setVisible(true);
                    test.printTet();
                    read2=Keyboard.readWord();
                }
                if (read2.equals("shift")) {
                    test.shiftT();
                    d.val1=test.tetrahedron[0];
                    d.val2=test.tetrahedron[1];
                    d.val3=test.tetrahedron[2];
                    d.val4=test.tetrahedron[3];
                    JFrame g = new JFrame("Title");
                    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    g.add(d);
                    g.setSize(400,250);
                    g.setVisible(true);
                    test.printTet();
                    read2=Keyboard.readWord();
                }
            }
        }
        else {
            System.out.println("no");
        }
        
    }
}
