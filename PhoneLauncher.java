/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class PhoneLauncher {
 
    public static void main(String[] args){
        PhoneLauncher myPhone = new PhoneLauncher();
        myPhone.launch();
    }
    
    public void launch(){
        SmartPhone iPhone = new SmartPhone("apple");
        
        System.out.println("THESE ARE METHODS FROM SMARTPHONE WHICH EXTENDED MOBILEPHONE");
        iPhone.browseWeb("You are now ready to browse...");
        System.out.println(iPhone.findPosition());
        System.out.println(iPhone.getBrand());
        
        System.out.println("THESE ARE METHODS FROM MOBILEPHONE WHICH IMPLEMENTED PHONE AND EXTENDED OLDPHONE");
        iPhone.printLastNumbers();
        iPhone.ringAlarm("You said you wanted me to ring at this time!");
        iPhone.playGame("GTA 7!");
        
        System.out.println("THESE ARE METHODS FROM OLDPHONE");
        iPhone.call("07857837541");
        iPhone.call("00857837541");
  
    }


}
