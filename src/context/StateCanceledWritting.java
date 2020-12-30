/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

/**
 *
 * @author Sara
 */
public class StateCanceledWritting implements PaperState{

    @Override
    public void printCurrentState() {
       System.out.println("StateCanceled");
    }

    @Override
    public void doSomething(Paper paper) {
       System.out.println("===========================================");
        System.out.println("doWithPaper: The paper is canceled!");
        System.out.println("===========================================");
    }
    
}
