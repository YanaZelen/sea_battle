/*
В приложении “Морской бой” добавьте enam - Типы кораблей

Где будут указаны следующие параметры: Название корабля, краткое описание, размер корабля, кол-во этих кораблей на игровом поле.
Подумайте как можно переписать наше приложение под данный enam. Попробуйте это реализовать.
 */

public enum TypeOfShips {
    TENDER("Тендер", "Корабль тендер", 1, 4),
    SCHOONER("Шхуна", "Корабль шхуна", 2, 3),
    BRIG("Бриг", "Корабль бриг", 3, 2),
    FRIGATE("Фригат", "Корабль фригат", 4, 1);

    String name;
    String discrip;
    int size;
    int count;

    TypeOfShips(String name, String discrip, int size, int count) {
        this.name = name;
        this.discrip = discrip;
        this.size = size;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getDiscrip() {
        return discrip;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

}
