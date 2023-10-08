public class Main {
    public static void main(String[] args) {
        System.out.println("ООП");
        Hogwarts[] students = {
                new Hogwarts("Гарри", "Поттер",98, 74);
                new Hogwarts("Гермиона", "Грейнджер",98, 74);
                new Hogwarts("Рон", "Уизли",98, 74);
                new Hogwarts("Драко", "Малфой",98, 74);
                new Hogwarts("Грэхэм", "Монтегю",98, 74);
                new Hogwarts("Грегори", "Гойл",98, 74);
                new Hogwarts("Захария", "Смит",98, 74);
                new Hogwarts("Седрик", "Диггори",98, 74);
                new Hogwarts("Джастин", "Финч-Флетчли",98, 74);
                new Hogwarts("Чжоу", "Чанг",98, 74);
                new Hogwarts("Падма", "Патил",98, 74);
                new Hogwarts("Маркус", "Белби",98, 74);
        }

        Gryffindor[] students = {
                new Gryffindor("Гарри", "Поттер",98, 74, 82, 65, 100);
                new Gryffindor("Гермиона", "Грейнджер",98, 74);
                new Gryffindor("Рон", "Уизли",98, 74);
        }
    }
}