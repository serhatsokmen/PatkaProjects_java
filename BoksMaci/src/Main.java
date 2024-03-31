public class Main {
    public static void main(String[] args) {
        Fighter scorpion = new Fighter("Scorpion",15,100,85,50);
        Fighter sub_zero = new Fighter("Sub Zero",13,100,85,50);

        Match match = new Match(scorpion,sub_zero,80,110);
        match.run();
    }
}