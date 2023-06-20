import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Share {
    public static void main(String[] args) {
        MyQueue <Integer> share = new MyQueue<>();
        MyQueue <Integer> price = new MyQueue<>();
        String inputString = "inputString";
        int nett = 0 ;
        Scanner sc = new Scanner(System.in);
        while (!inputString.isEmpty()){ 
        System.out.print("Enter your query (In format 'Buy/Sell x shares at $y each'): ");
        inputString = sc.nextLine();
        String pattern = "(Buy|Sell) (\\d+) shares at \\$(\\d+) each";
        Pattern combo = Pattern.compile(pattern);
        Matcher matcher = combo.matcher(inputString);

        if (matcher.find()){
            String buyOrSell = matcher.group(1);
            int amount = Integer.parseInt(matcher.group(2));
            int money = Integer.parseInt(matcher.group(3));

            if (buyOrSell.equalsIgnoreCase("buy")){
                System.out.println("Buying now...");
                share.enqueue(amount);
                price.enqueue(money);
                System.out.println("Queue for share: Queue: " +share.toString());
                System.out.println("Queue for price: Queue: " +price.toString());
            }
            else if (buyOrSell.equalsIgnoreCase("sell")){
                System.out.println("Selling the shares now...");

            while (amount>0){
                if (amount == share.peek()){
                    nett = nett + share.peek()*(money - price.dequeue());
                    amount = 0 ;

                }
                else if (amount > share.peek()){
                    nett = nett + share.peek()*(money - price.dequeue());
                    amount = amount - share.dequeue();
                }
                else {
                    nett = nett+ amount*(money - price.peek());
                    share.updateFirst(share.peek()-amount);
                    amount = 0 ;
                    if (share.peek()<0){
                        share.dequeue();
                    }
                }
            
            if (share.isEmpty()){
                System.out.println("No shares to sell");

            }
            System.out.println("Total Capital Gain/Loss: " + nett);
            if (share.isEmpty()) break;
        }
            System.out.println("Queue for Share: Queue:  " + share.toString());
            System.out.println("Queue for Price: Queue: " + price.toString());
            }

        }

}
        

System.out.println("Final Capital Gain/Loss: "+nett);
}
}
