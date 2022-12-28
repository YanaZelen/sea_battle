public class Ship {
    int ships_size;
    String ships_name;

    String getShips_name() {
        return ships_name;
    }
    int getShips_size() {
        return ships_size;
    }

    public Ship(String ships_name, int ships_size) {
        this.ships_name = ships_name;
        this.ships_size = ships_size;
    }
    public Ship(String ships_name) {
        this.ships_name = ships_name;
    }
    public Ship(int ships_size) {
        this.ships_size = ships_size;
    }
}
