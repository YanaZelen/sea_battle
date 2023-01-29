
public class Ship {
    //int shipsSize;
    //String shipsName;
    Player player;
    TypeOfShips type;

    static TypeOfShips tender = TypeOfShips.TENDER;
    // final static String tender = "Тендер";
    static TypeOfShips schooner = TypeOfShips.SCHOONER;
    //final static String schooner = "Шхуна";
    static TypeOfShips brig = TypeOfShips.BRIG;
    //final static String brig = "Бриг";
    static TypeOfShips frigate = TypeOfShips.FRIGATE;
    //final static String frigate = "Фрегат";


    public Ship(TypeOfShips type, Player player) {
        this.player = player;
        this.type = type;
    }

    /*
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

    int getShipsSize() {
        return shipsSize;
    }

     */

    String getPlayersName() {
        return player.name;
    }

    String getTenderName() {
        return tender.name;
    }
    String getSchoonerName() {
        return schooner.name;
    }
    String getBrigName() {
        return brig.name;
    }
    String getFrigateName() {
        return frigate.name;
    }
}

