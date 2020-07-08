/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author USER
 */
public class StackApp {
    public static void main(String[] args) {
        Stack theStack=new Stack(10);
        System.out.println(">> push some items");
        
        theStack.push("Zaim");
        theStack.push("Rahim");
        theStack.push("Dayat");
        theStack.push("Alan");
       
        
        System.out.println("\n>> pop items in the stack");
        while(!theStack.isEmpty()){
            String value=theStack.pop();
            System.out.print(value+" ");
        }
    }
    
}
