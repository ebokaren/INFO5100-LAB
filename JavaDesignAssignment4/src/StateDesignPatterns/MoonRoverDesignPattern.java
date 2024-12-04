/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StateDesignPatterns;

/**
 *
 * @author eboka
 * @version 1.0
 * Moon Rover State Pattern Implementation
 * Demonstrates the use of State Pattern to manage Moon Rover's behavior.
 *
 */
interface RoverState {
     // Got help online
    void executeAction();
}

class IdleState implements RoverState {
    @Override
    public void executeAction() {
        System.out.println("Rover is idle.");
    }
}

class MovingState implements RoverState {
    @Override
    public void executeAction() {
        System.out.println("Rover is moving.");
    }
}

class ErrorState implements RoverState {
    @Override
    public void executeAction() {
        System.out.println("Rover is in an error state!");
    }
}

class MoonRover {
    private RoverState currentState;

    public MoonRover() {
        this.currentState = new IdleState(); // Default state
    }

    public void setState(RoverState state) {
        this.currentState = state;
    }

    public void performAction() {
        currentState.executeAction();
    }
}

