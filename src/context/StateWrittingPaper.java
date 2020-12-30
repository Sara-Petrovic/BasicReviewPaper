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
public class StateWrittingPaper implements PaperState {

    @Override
    public void printCurrentState() {
        System.out.println("StateWittingPaper");
    }

    @Override
    public void doSomething(Paper paper) {
        Scanner input = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("doWithPaper: I am still writting this paper");
        System.out.println("===========================================");

        System.out.println("1.I need to write paper more");
        System.out.println("2.I will cancel writting");
        System.out.println("3.I want to send paper to review");
        System.out.println("Your choise is:");
        int choise = input.nextInt();

        switch (choise) {
            case 1:
                return;
            case 2:
                paper.setState(new StateCanceledWritting());
                return;
            case 3:
                paper.setState(new StateReviewPaper());
        }
    }

}
