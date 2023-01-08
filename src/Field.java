import java.util.Arrays;

public class Field {

    int[][] playingField = new int[10][10];
    String playersName;
    static int[] rules = new int[] {4, 3, 2, 1};

    void newCoordinates(int vCoordinates, int  hCoordinates, int method) {
        playingField[vCoordinates][hCoordinates] = method;
    }

    void statusOfGame() {
        for (int[] row: playingField) {
            System.out.println(Arrays.toString(row));
        }
    }

    public Field(String playersName) {
        this.playersName = playersName;
    }
}
