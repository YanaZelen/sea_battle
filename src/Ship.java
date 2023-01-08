public class Ship {
    int shipsSize;
    String shipsName;
    String playersName;
    static String tender = "Тендер";
    static String schooner = "Шхуна";
    static String brig = "Бриг";
    static String frigate = "Фрегат";

    String getPlayersName() {
        return playersName;
    }
    int getShipsSize() {
        return shipsSize;
    }

    public Ship(String shipsName, int shipsSize, String playersName) {
        this.shipsName = shipsName;
        this.shipsSize = shipsSize;
    }
    public Ship(String shipsName, String playersName) {
        this.shipsName = shipsName;
    }
    public Ship(int shipsSize, String playersName) {
        this.shipsSize = shipsSize;
    }
}
