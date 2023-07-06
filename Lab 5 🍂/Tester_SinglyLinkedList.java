

import java.util.Scanner;

/**
 *
 * @author aykay
 */
public class Tester_SinglyLinkedList  {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    SinglyLinkedList<String> ls = new SinglyLinkedList<>();
        System.out.println("Enter your student name list . Enter \'n\' to end...");
        while (true){
            String input = sc.nextLine();
            if (input.equals("n")) break ;
            
            ls.add(input);
        }
        System.out.println("You have entered the following students' name : ");
        ls.printList();
        
        System.out.println("The number of students entered is: " + ls.getSize());
        
        System.out.println("All the names entered are correct? Enter \'r\' to rename the student name, \'n\' to proceed. ");
        char ch = sc.next().charAt(0);
        sc.nextLine();
            if (ch == 'r'){
                System.out.println("Enter the existing student name that you want to rename: ");

                String oldName = sc.nextLine();
                System.out.println("Enter the new name: ");
                String newName = sc.nextLine();
                ls.replace(oldName, newName);
            }
            else if (ch == 'n') {System.out.println("All names are correct."); 
            }
            
            else {System.out.println("Wrong character input");
            }
            
            System.out.println("The new student list is: ");
            ls.printList();
            System.out.println("Enter a student name to remove: ");
            String removeName = sc.nextLine();
            ls.removeElement(removeName);
            System.out.println("The number of updated students is: " + ls.getSize());
            System.out.println("The updated student list is : ");
            ls.printList();
            
            System.out.println("\nAll student data captured complete. Thank you");
            
            
    }


}
