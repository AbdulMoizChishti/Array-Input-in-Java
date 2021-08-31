/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinput;

/**
 *
 * @author Abdul Moiz Chishti
 */
import java.lang.reflect.Array;
import java.util.*;
import javafx.scene.effect.Light;
public class Arrayinput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner obj=new Scanner(System.in);
    
    int Arr[]=new int[5];
    int i=0;
    for(i=0;i<4;i++){
        System.out.println("Enter any Int");
        Arr[i]=obj.nextInt();  
    System.out.println("sorted array"+Arr[i]);
    }
        
        
    



    }
    
}
