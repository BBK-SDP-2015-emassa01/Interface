/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Teacher {
    
    // Teacher.java 
private String name;

public Teacher(String name) {
    this.name = name; 
}

public String getName() { 
    return name;
}

public void teach(String lessonName) {
    System.out.println("Teaching lesson: " + lessonName); 

}
}
