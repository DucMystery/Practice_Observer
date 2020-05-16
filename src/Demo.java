import Observer.BinObserver;
import Observer.HexObserver;
import Observer.OctObserver;
import Observer.Subject;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Subject subject = new Subject();
        Scanner sc = new Scanner(System.in);
        new HexObserver(subject);
        new OctObserver(subject);
        new BinObserver(subject);
        for (int  i=0;i<5;i++){
            System.out.println("\nEnter a number :");
            subject.setState(sc.nextInt());
        }
    }
}
