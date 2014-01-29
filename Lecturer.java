/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Lecturer extends Teacher{
    
    // Lecturer.java
    /**
* A lecturer has both teaching and research responsibilities
*/
    public Lecturer(String name1){
        super(name1);

    }

public void doResearch(String topic) { 
    System.out.println("Doing research on: " + topic);
} 

}
    
