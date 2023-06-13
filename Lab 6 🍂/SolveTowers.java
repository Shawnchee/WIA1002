public class SolveTowers {
    public static void main(String[] args) {
        System.out.println("Starting:");
        TowersOfHanoi towers = new TowersOfHanoi(4);
        System.out.println("Solving:");
        towers.solve();
        System.out.println("Done!");
    }
}
