package softserve.academy;

class Chessboard {
    private int height;
    private int width;

    Chessboard(String height, String width) throws NumberFormatException {
        this.height = Integer.parseInt(height);
        this.width = Integer.parseInt(width);
        if (this.height <= 0 || this.width <= 0) {
            throw new IllegalArgumentException("Arguments must be larger than zero");
        }
    }

    String getPicture() {
        String result;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        stringBuilder.append("*");
                    } else {
                        stringBuilder.append("   ");
                    }
                } else {
                    if (j % 2 == 0) {
                        stringBuilder.append("  ");
                    } else {
                        if (j == 1) {
                            stringBuilder.append("*");
                        } else {
                            stringBuilder.append(" *");
                        }
                    }
                }
            }
            if (i < height - 1) {
                stringBuilder.append("\n");
            }
        }
        result = stringBuilder.toString();
        return result;
    }
}
