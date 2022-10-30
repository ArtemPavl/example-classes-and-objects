public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку \"Классы и объекты\"\n");

        Aftors joanneRowling = new Aftors("Джоан", "Роулинг");
        Aftors stephenKing = new Aftors("Стивин", "Кинг");

        Books garryPotter = new Books("Гарри Поттер", joanneRowling, 2004);
        Books blackTower = new Books("Темная башня", stephenKing, 1998);

        System.out.println("Книга 1\nНазвание: " + garryPotter.getName() + "\n" +
                "Афтор: " + joanneRowling.getName() + " " + joanneRowling.getSurname() + "\n" +
                "Год публикации: " + garryPotter.getYearPublication() + "\n");

        System.out.println("Книга 2\nНазвание: " + blackTower.getName() + "\n" +
                "Афтор: " + stephenKing.getName() + " " + stephenKing.getSurname() + "\n" +
                "Год публикации: " + blackTower.getYearPublication() + "\n");

        garryPotter.setYearPublication(1997);

        System.out.println("Книга 1 (измененен год)\nНазвание: " + garryPotter.getName() + "\n" +
                "Афтор: " + joanneRowling.getName() + " " + joanneRowling.getSurname() + "\n" +
                "Год публикации: " + garryPotter.getYearPublication() + "\n");

    }
}