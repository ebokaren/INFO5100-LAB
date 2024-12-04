/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicDesignPattern;

/**
 *
 * @author eboka
 * @version 2.0
 * @since 1.0
 * Facade Pattern Example
 * Simplifies interactions with a complex system of subsystems.

 */
class SubsystemA {
     // Got help online
    public String operationA() {
        return "Subsystem A: Operation A";
    }
}

class SubsystemB {
    public String operationB() {
        return "Subsystem B: Operation B";
    }
}

class SubsystemC {
    public String operationC() {
        return "Subsystem C: Operation C";
    }
}

public class FacadePattern {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public FacadePattern() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }

    public String performOperations() {
        return subsystemA.operationA() + ", " + subsystemB.operationB() + ", " + subsystemC.operationC();
    }
}
