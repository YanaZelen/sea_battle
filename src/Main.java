public class Main {
    public static void main(String[] args) {
        Ship Queen_Annes_Revenge = new Ship("Queen_Annes_Revenge", 4);
        Ship Black_Pearl = new Ship("Black_Pearl", 3);

        Player Yana = new Player("Яна", 10);
        Player Artem = new Player("Артем", 10);

        System.out.println("У игрока " + Artem.players_name + " " + Artem.players_points + " очков");
        System.out.println("У игрока " + Yana.players_name + " " + Yana.players_points + " очков");
        Artem.change_name("Artem");
        System.out.println("Смена игрока. Новые игроки " + Artem.players_name + " и " + Yana.players_name);

        System.out.println("У игрока " + Yana.players_name + " в наличии корабли " + Queen_Annes_Revenge.ships_name + " размер " + Queen_Annes_Revenge.ships_size + " и " + Black_Pearl.ships_name + " размер " + Black_Pearl.ships_size);
        Queen_Annes_Revenge.getShips_name();
        Queen_Annes_Revenge.getShips_size();
    }
}