package softserve.academy;

class Chessboard {
    private int height;
    private int width;

    Chessboard(String height, String width) {
        this.height = convertArgumentToInt(height);
        this.width = convertArgumentToInt(width);
    }

    void draw() {
        if (height <= 0 || width <= 0) {
            System.out.println("Usage: height width\nExample: 4 5");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("   ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("  ");
                    } else {
                        if (j == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" *");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    private int convertArgumentToInt(String argument) {
        try {
            return Integer.parseInt(argument);
        } catch (NumberFormatException ex) {
            return -1;
        }
    }
}
