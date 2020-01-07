import cs1.Keyboard;
import java.lang.Math;
import java.util.ArrayList;

public class Game {
    int[] current = new int[9];
    int[] goal= new int[9];
    ArrayList<String> sol = new ArrayList<String>();
    public Game() {
        for (int i=0; i<9; i++) {
            if (i==1) {
                current[i]=1;
                goal[i]=1;
            }
            else {
                current[i]=0;
                goal[i]=1;
            }
        }
    }
        
    
    public void printCurrent() {
        String result = "";
        for (int i=0; i<9; i++) {
            result+=current[i] + " ";
        }
        System.out.println("Curr: " + result);
    }
    
    public void printGoal() {
        String result = "";
        for (int i=0; i<9; i++) {
            result+=goal[i] + " ";
        }
        System.out.println("Goal: " + result);
    }
    
    void e1Move() {
        if (current[1]>=1) {
            current[0]++;
            current[2]++;
            current[1]--;
        }
    }
    void e2Move() {
        if (current[2]>=1) {
            current[1]++;
            current[3]++;
            current[2]--;
        }
    }
    void e3Move() {
        if (current[3]>=1) {
            current[2]++;
            current[4]++;
            current[3]--;
        }
    }
    void e4Move() {
        if (current[4]>=1) {
            current[3]++;
            current[5]++;
            current[4]--;
        }
    }
    void e5Move() {
        if (current[5]>=1) {
            current[4]++;
            current[6]++;
            current[5]--;
        }
    }
    void e6Move() {
        if (current[6]>=1) {
            current[5]++;
            current[7]++;
            current[6]--;
        }
    }
    void e7Move() {
        if (current[7]>=1) {
            current[6]++;
            current[8]++;
            current[7]--;
        }
    }
    void c1Move() {
        if (current[0]>=1 && current[2]>=1) {
            current[0]--;
            current[2]--;
            current[1]++;
        }
    }
    void c2Move() {
        if (current[1]>=1 && current[3]>=1) {
            current[1]--;
            current[3]--;
            current[2]++;
        }
    }
    void c3Move() {
        if (current[2]>=1 && current[4]>=1) {
            current[2]--;
            current[4]--;
            current[3]++;
        }
    }
    void c4Move() {
        if (current[3]>=1 && current[5]>=1) {
            current[3]--;
            current[5]--;
            current[4]++;
        }
    }
    void c5Move() {
        if (current[4]>=1 && current[6]>=1) {
            current[4]--;
            current[6]--;
            current[5]++;
        }
    }
    void c6Move() {
        if (current[5]>=1 && current[7]>=1) {
            current[5]--;
            current[7]--;
            current[6]++;
        }
    }
    void c7Move() {
        if (current[6]>=1 && current[8]>=1) {
            current[6]--;
            current[8]--;
            current[7]++;
        }
    }
    
    public void takeCommand(String command) {
        if (command.equals("e1")) {
            e1Move();
        }
        if (command.equals("e2")) {
            e2Move();
        }
        if (command.equals("e3")) {
            e3Move();
        }
        if (command.equals("e4")) {
            e4Move();
        }
        if (command.equals("e5")) {
            e5Move();
        }
        if (command.equals("e6")) {
            e6Move();
        }
        if (command.equals("e7")) {
            e7Move();
        }
        if (command.equals("c1")) {
            c1Move();
        }
        if (command.equals("c2")) {
            c2Move();
        }
        if (command.equals("c3")) {
            c3Move();
        }
        if (command.equals("c4")) {
            c4Move();
        }
        if (command.equals("c5")) {
            c5Move();
        }
        if (command.equals("c6")) {
            c6Move();
        }
        if (command.equals("c7")) {
            c7Move();
        }
        if (command.equals("g")) {
            printGoal();
        }
        printCurrent();
    }
    
    void shuffle() {
        int n = 0;
        while (n<100) {
            int r= (int) (Math.random()*14);
            if (r==0) {
                e1Move();
                sol.add("e1");
            }
            if (r==1) {
                e2Move();
                sol.add("e2");
            }
            if (r==2) {
                e3Move();
                sol.add("e3");
            }
            if (r==3) {
                e4Move();
                sol.add("e4");
            }
            if (r==4) {
                e5Move();
                sol.add("e5");
            }
            if (r==5) {
                e6Move();
                sol.add("e6");
            }
            if (r==6) {
                e7Move();
                sol.add("e7");
            }
            if (r==7) {
                c1Move();
                sol.add("c1");
            }
            if (r==8) {
                c2Move();
                sol.add("c2");
            }
            if (r==9) {
                c3Move();
                sol.add("c3");
            }
            if (r==10) {
                c4Move();
                sol.add("c4");
            }
            if (r==11) {
                c5Move();
                sol.add("c5");
            }
            if (r==12) {
                c6Move();
                sol.add("c6");
            }
            if (r==13) {
                c7Move();
                sol.add("c7");
            }
            n++;
        }//set random values for current
        for (int i=0; i<9; i++) { //shift over
            goal[i]=current[i];
            if (i==1) {
                current[i]=1;
            }
            else {
                current[i]=0;
            }
        }
    }
    void printSol() {
        for (int i=0; i<sol.size(); i++) {
            System.out.print(sol.get(i) + " ");
        }
    }
    boolean finished() {
        boolean result=true;
        for (int i=0; i<9; i++) {
            if (current[i]!=goal[i]) {
                result=false;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Game a = new Game();
        a.shuffle();
        a.printCurrent();
        a.printGoal();
        while (!a.finished()) {
            String read = Keyboard.readWord();
            a.takeCommand(read);
        }
        a.printSol();
        
        
    }




}
