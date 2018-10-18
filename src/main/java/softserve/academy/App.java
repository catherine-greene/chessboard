package softserve.academy;

public class App {
    public static void main(String[] args) {
        if (args.length > 0 && args.length == 2) {
            try {
                Chessboard chessboard = new Chessboard(args[0], args[1]);
                System.out.println(chessboard.getPicture());
            } catch (NumberFormatException ex) {
                System.out.println("Usage: height width\nExample: 4 5");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Usage: height width\nExample: 4 5");
        }
    }
}
