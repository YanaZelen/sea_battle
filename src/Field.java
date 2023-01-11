/* Комментарии по коду.
        3)В поле Экземпляр класса игрок, а не его имя
        5) Очень важно называть переменные с маленькой первой буквы, иначе они путаются с классами */

import java.util.Arrays;

public class Field {

    int[][] playingField = new int[10][10];
    Player player;
    static int[] rules = new int[] {4, 3, 2, 1};


    public Field(Player player) {
        this.player = player;
    }


    void occupied(int vCoordinates, int  hCoordinates) {
        playingField[vCoordinates][hCoordinates] = 1;
    }

    void missed(int vCoordinates, int  hCoordinates) {
        playingField[vCoordinates][hCoordinates] = 2;
    }

    void hit(int vCoordinates, int  hCoordinates) {
        playingField[vCoordinates][hCoordinates] = 3;
    }

    void killed(int vCoordinates, int  hCoordinates) {
        playingField[vCoordinates][hCoordinates] = 4;
    }

    void statusOfGame() {
        for (int[] row: playingField) {
            System.out.println(Arrays.toString(row));
        }
    }

}
