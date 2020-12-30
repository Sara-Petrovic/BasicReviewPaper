/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class StateReviewPaper implements PaperState{

    @Override
    public void printCurrentState() {
        System.out.println("StateSendToReview");
    }

    @Override
    public void doSomething(Paper paper) {
       Scanner input = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("paper is under review");
        System.out.println("===========================================");

        System.out.println("1.I need to review paper more");
        System.out.println("2.I want to reject paper");
        System.out.println("3.I want to accept paper");
        System.out.println("4.I want to send paper for revision");
        System.out.println("Your choise is:");
        int choise = input.nextInt();

        switch (choise) {
            case 1:
                break;
            case 2:
                paper.setState(new StateRejectedPaper());
                break;
            case 3:
                paper.setState(new StateAcceptedPaper());
                break;
            case 4:
                paper.setState(new StateWrittingPaper());
                break;
        }
    }
    
}
