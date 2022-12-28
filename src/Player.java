public class Player {
    String players_name;
    int players_points;

    void change_name(String new_name) {
        players_name = new_name;
    }

    String shot(float v_coordinates, float h_coordinates) {
        return ("Игрок " + players_name + " решил ударить по ячейке " + "{" + v_coordinates + "}:{" + h_coordinates + "}");
    }

    void change_points() {
        players_points++;
    }

    public Player(String players_name, int players_points) {
        this.players_name = players_name;
        this.players_points = players_points;
    }
    public Player(String players_name) {
        this.players_name = players_name;
    }
    public Player(int players_points) {
        this.players_points = players_points;
    }
}
