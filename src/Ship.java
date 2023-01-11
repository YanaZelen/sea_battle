/* Комментарии по коду.
        3)В поле Экземпляр класса игрок, а не его имя
        5) Очень важно называть переменные с маленькой первой буквы, иначе они путаются с классами */

public class Ship {
    int shipsSize;
    String shipsName;
    String playersName;
    static String tender = "Тендер";
    static String schooner = "Шхуна";
    static String brig = "Бриг";
    static String frigate = "Фрегат";


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


    String getPlayersName() {
        return playersName;
    }
    int getShipsSize() {
        return shipsSize;
    }
}
