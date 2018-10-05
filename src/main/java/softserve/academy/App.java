package softserve.academy;

public class App {
    public static void main(String[] args) {
        if (args.length > 0 && args.length == 2) {
            Chessboard chessboard = new Chessboard(args[0], args[1]);
            chessboard.draw();
        } else {
            System.out.println("Usage: height width\nExample: 4 5");
        }
    }
}
