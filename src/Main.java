public class Main {
    public static void main(String[] args) {
        Ship Queen_Annes_Revenge = new Ship("Queen Annes Revenge", 4);
        Ship Black_Pearl = new Ship("Black Pearl", 3);

        Player Yana = new Player("Яна", 0);
        Player Artem = new Player("Артем", 0);

        System.out.println("У игрока " + Artem.players_name + " " + Artem.players_points + " очков");
        System.out.println("У игрока " + Yana.players_name + " " + Yana.players_points + " очков");
        Artem.change_name("Artem");
        System.out.println("Смена игрока. Новые игроки " + Artem.players_name + " и " + Yana.players_name);

        System.out.println("У игрока " + Yana.players_name + " в наличии корабли " + Queen_Annes_Revenge.ships_name + " размер " + Queen_Annes_Revenge.ships_size + " и " + Black_Pearl.ships_name + " размер " + Black_Pearl.ships_size);

        System.out.println(Yana.shot(5, 7));
        System.out.println("Мимо");
        System.out.println(Artem.shot(1, 4));
        System.out.println("Игрок " + Artem.players_name + " попал по кораблю " + Black_Pearl.ships_name);
        Artem.change_points();
        System.out.println("У игрока " + Artem.players_name + " " + Artem.players_points + " очко(a/oв)");
        System.out.println("У игрока " + Yana.players_name + " " + Yana.players_points + " очко(a/oв)");

    }
}