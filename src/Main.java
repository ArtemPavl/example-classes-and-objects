public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку \"Классы и объекты\"\n");

        Aftors joanneRowling = new Aftors("Джоан", "Роулинг");
        Aftors stephenKing = new Aftors("Стивин", "Кинг");

        Books garryPotter = new Books("Гарри Поттер", joanneRowling, 2004);
        Books blackTower = new Books("Темная башня", stephenKing, 1998);
        Books garryPotter2 = new Books("Гарри Поттер", joanneRowling, 2004);

        System.out.println(garryPotter.toString());
        System.out.println("garryPotter.equals(blackTower) = " + garryPotter.equals(blackTower));
        System.out.println("garryPotter.equals(garryPotter2) = " + garryPotter.equals(garryPotter2));
    }
}