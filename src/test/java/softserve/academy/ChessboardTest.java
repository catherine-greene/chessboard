package softserve.academy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChessboardTest {

    @Test
    @DisplayName("Should return a chessboard of height 3 and width 8 equal to the one defined in Constants.CHESSBOARD_3X8")
    void testGetPicture() {
        //GIVEN
        String height = "3";
        String width = "8";
        Chessboard chessboard = new Chessboard(height, width);
        String expected = Constants.CHESSBOARD_3X8;
        //WHEN
        String actual = chessboard.getPicture();
        //THEN
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("Should throw NumberFormatException when height or/and width are not numbers")
    @CsvSource({"a,5", "3,b", "s,%"})
    void testChessboardCreationWithNotNumberArgs(String height, String width) {
        assertThrows(NumberFormatException.class, () -> new Chessboard(height, width));
    }

    @ParameterizedTest
    @DisplayName("Should throw IllegalArgumentException when height or/and width are less than or equal to zero")
    @CsvSource({"-1,5", "3,0", "-1,0"})
    void testChessboardCreationWithArgsLessThanOrEqualToZero(String height, String width) {
        assertThrows(IllegalArgumentException.class, () -> new Chessboard(height, width));
    }
}