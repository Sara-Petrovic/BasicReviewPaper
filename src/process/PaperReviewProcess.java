/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import context.Paper;
import java.util.Scanner;

/**
 *
 * @author Dusan
 */
public class PaperReviewProcess {
    private final Paper paper;
    public PaperReviewProcess() {
        paper=new Paper();
    }
    
            
     public void reviewPaperProcess() {
        Scanner input = new Scanner(System.in);
        int choise;
        do {
            System.out.println("1.Get current state");
            System.out.println("2.Do something with paper in curent state");
            System.out.println("3.Exit application");
            System.out.println("Your choise is:");
            choise = input.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("Paper current state: ");
                    paper.printCurrentState();
                    break;
                case 2:
                    paper.doSomething();
                    break;
                case 3:
            }
        } while (choise != 3);

        input.close();
    }
}
