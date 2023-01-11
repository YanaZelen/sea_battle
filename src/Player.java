/* Комментарии по коду. 1) Интересное решение вывода в консоль массива. Мне понравилось. Не типично. Но есть ещё короче способ через Arrays :) (можешь если интересно заморочиться, но в целом и так ок)
        3)В поле Экземпляр класса игрок, а не его имя
        5) Очень важно называть переменные с маленькой первой буквы, иначе они путаются с классами */
public class Player {
    Ship[] shipList;
    String name;
    int points;
    Field field;

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
        this.shipList = new Ship[ShipsCounter()];
    }
    public Player(String name) {
        this.name = name;
        this.shipList = new Ship[ShipsCounter()];
    }
    public Player(int points) {
        this.points = points;
        this.shipList = new Ship[ShipsCounter()];
    }

    int ShipsCounter() {
        int count = 0;
        for (int i = 0; i < Field.rules.length; i++) {
            count = count + Field.rules[i];
        }
        return count;
    }

    void changeName(String newName) {
        name = newName;
    }

    String shot(int vCoordinates, int  hCoordinates) {
        return ("Игрок " + name + " решил ударить по ячейке " + "{" + vCoordinates + ":" + hCoordinates + "}");
    }

    public void setField(Field field){
        this.field = field;
    }

    void changePoints() {
        points++;
    }
}
