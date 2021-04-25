import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(300,300);
   
     
    Turtle yertle = new Turtle(world);
    
      yertle.setColor(Color.gray);

      // Use this variable in the loops
      int turnAmount = 30;
      
      for (int i = 1; i <= 13; i++) 
      {
         for(int sides = 1; sides <= 3; sides++) 
         {
             yertle.forward();
             yertle.turn(120);
         }
         yertle.turn(turnAmount);
         if(i % 2 == 0)
         {
             yertle.setColor(Color.gray);
         }
         else
         {
             yertle.setColor(Color.blue);
         }
      }
      // 1. Write a for loop that runs many times
      // 2. Change it to use turnAmount to figure out how many times to run

         // 1 & 2. Write an inner loop that draws a triangle (3 sides, 120 degree turns)
         // 3. Then change it to be any polygon with a variable n


         // turn turnAmount degrees before drawing the polygon again

         // 4. Add an if statement that changes the colors depending on the loop variables

  
    world.setVisible(true);
  }
}
