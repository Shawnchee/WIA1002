import java.util.HashMap;
import java.util.Map;


public class TowersOfHanoi {
        //let n...3,2,1 etc ... be the disk sizes with n being the biggest
        //let A,B,C be the 3 towers
        private int totalDisks;
        private Map<Character,MyStack<Integer>> pegs;


        public TowersOfHanoi(int disks){
            totalDisks = disks;
            pegs = new HashMap<Character,MyStack<Integer>>();
            pegs.put('A', new MyStack<Integer>());
            pegs.put('B', new MyStack<Integer>());
            pegs.put('C', new MyStack<Integer>());
            for (int i = disks ; i > 0 ; i--){
                pegs.get('A').push(i);                  //Move all the disks into A in ascending order first (initial move)
            }                                               //Have to move all to peg 'C'
        }

        public void solve(){
            printTowers();
            moveTower(totalDisks, 'A','C','B'); 
        }

         void moveTower(int disks, Character start, Character end, Character temp){
            MyStack<Integer> startPeg = pegs.get(start);
            MyStack<Integer> endPeg = pegs.get(end);

            if (disks == 1){
                endPeg.push(startPeg.pop());
                printTowers();
            }

            else {
                moveTower(disks-1, start, temp, end);
                endPeg.push(startPeg.pop());
                printTowers();
                moveTower(disks-1, temp,end,start);
            }
            }

            public void printTowers(){
                System.out.println();
                for (Character c : pegs.keySet()){
                    System.out.println("Peg " + c + ": " + pegs.get(c));
                }
            
        } 

    }
    

