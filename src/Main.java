import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player Yana = new Player("Yana", 0);
        Player Artem = new Player("Artem", 0);

        Ship QueenAnnesRevenge = new Ship(Ship.tender, 1, Yana);
        Ship BlackPearl = new Ship(Ship.schooner, 2, Yana);
        Ship QueenAnnesRevenge2 = new Ship(Ship.brig, 3, Yana);
        Ship BlackPearl2 = new Ship(Ship.frigate, 4, Yana);

        Field YanasField = new Field(Yana);

        System.out.println(Yana.shipList.length);
        YanasField.occupied(5, 5);
        YanasField.occupied(5, 6);

        System.out.println(QueenAnnesRevenge.getPlayersName());

        YanasField.statusOfGame();
    }
}