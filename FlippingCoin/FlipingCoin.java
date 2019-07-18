public class FlipingCoin {

    public static void main(String[] args) {
        if (Math.random() < 0.5) {
            System.out.print("Head");
        } else {
            System.out.print("Tail");
        }
    }
}