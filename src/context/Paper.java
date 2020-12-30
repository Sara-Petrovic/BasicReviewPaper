/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;


/**
 *
 * @author Dusan
 */
public class Paper {
    
    private PaperState state;
    
    public Paper() {
        state = new StateWrittingPaper();
    }

    public void printCurrentState() {
        state.printCurrentState();
    }

    public void doSomething() {
        state.doSomething(this);
    }

    public void setState(PaperState state) {
        this.state = state;
    }

    
}
