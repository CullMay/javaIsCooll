/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;
import java.util.*;
/**
 *
 * @author cm0850068
 */
public class Poly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        Lion lion = new Lion(6,"brown");
        Fish fish= new Fish(2,"golden");
        Dog dog= new Dog(7,"black");
        
        ArrayList<Animal> aryAnimal=new ArrayList<Animal>();
        aryAnimal.add(dog);
        aryAnimal.add(lion);
        aryAnimal.add(fish);
        for (int i=0; i<aryAnimal.size(); i++){
            allSpeak(aryAnimal.get(i));
        }
        
    }
    public static void allSpeak(Animal animal){
        animal.speak();
    }
    
    
}
