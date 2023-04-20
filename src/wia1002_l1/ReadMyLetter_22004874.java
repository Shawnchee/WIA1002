/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wia1002_l1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author aykay
 */
public class ReadMyLetter_22004874 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
      PrintWriter output = new PrintWriter (new FileOutputStream("C:/Users/aykay/Desktop/WIA1002/Files/ShawnChee_22004874.txt", true));
       Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(new FileInputStream("C:/Users/aykay/Desktop/WIA1002/Files/ShawnChee_22004874.txt"));

            System.out.println("Describe the course [Second Part], enter \"quit\" to finish writing.");
            
                            output.append("\nThursday, 19 March 2021 \n");
        while(true){
            String line = scanner.nextLine();
            if (line.equals("quit"))
                break ;
            else
            output.append("\n" +line);
            
        }
        output.close();
        
                
            while (input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
            scanner.close();
    }
}



/* input from keyboard :

Thursday , 18 June 2021

It's me again. Finally, it's the end of the term and the DS class has finished! I think I did
great in this course. 
I am very happy with my performance and this subject has teach me many different ways to solve questions! 
I also obtained my targeted grade and i worked really hard during this course. Maybe i could've procrastinate
less and work more! */
    
/* Thursday, 19 March 2021.

My name is Shawn with matrix number,22004874. I am
majoring in Artificial Intellingence. This is my first time taking the
Data Structure subject. At the moment, I am feeling nervous about taking this
subject. This is because this subject is very hard.

I acquired A for my previous Programming 1 course. It’s not too bad. So, I
think I can manage to get A for this DS subject this term. In order
to do well in the subject, I will do my best. Wish me luck */