
public class Ship {
    int shipsSize;
    String shipsName;
    Player player;
    static String tender = "Тендер";
    static String schooner = "Шхуна";
    static String brig = "Бриг";
    static String frigate = "Фрегат";


    public Ship(String shipsName, int shipsSize, Player player) {
        this.shipsName = shipsName;
        this.shipsSize = shipsSize;
        this.player = player;
    }
    public Ship(String shipsName, Player player) {
        this.shipsName = shipsName;
        this.player = player;
    }
    public Ship(int shipsSize, Player player) {
        this.shipsSize = shipsSize;
        this.player = player;
    }


    String getPlayersName() {
        return player.name;
    }
    int getShipsSize() {
        return shipsSize;
    }
}
