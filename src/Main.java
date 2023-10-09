public class Main {
    public static void main(String[] args) {
        System.out.println("ООП");
        Hogwarts[] students = {
                new Hogwarts("Гарри", "Поттер",98, 74);
                new Hogwarts("Гермиона", "Грейнджер",76, 62);
                new Hogwarts("Рон", "Уизли",58, 31);
                new Hogwarts("Драко", "Малфой",45, 16);
                new Hogwarts("Грэхэм", "Монтегю",24, 48);
                new Hogwarts("Грегори", "Гойл",89, 63);
                new Hogwarts("Захария", "Смит",61, 33);
                new Hogwarts("Седрик", "Диггори",22, 12);
                new Hogwarts("Джастин", "Финч-Флетчли",71, 85);
                new Hogwarts("Чжоу", "Чанг",37, 28);
                new Hogwarts("Падма", "Патил",100, 1);
                new Hogwarts("Маркус", "Белби",12, 54);
        }

        Gryffindor[] students = {
                new Gryffindor("Гарри", "Поттер",98, 74, 35, 87,31);
                new Gryffindor("Гермиона", "Грейнджер",76, 62, 48,99,73);
                new Gryffindor("Рон", "Уизли",58, 31,9,11,65);
        }
        Hufflepuff[] students = {
                new Hufflepuff("Захария", "Смит",61, 33, 51,74,22);
                new Hufflepuff("Седрик", "Диггори",22, 12,46,98,31);
                new Hufflepuff("Джастин", "Финч-Флетчли",71, 85, 82,15,7);
        }
        Ravenclaw[] students = {
                new Ravenclaw("Чжоу", "Чанг",37, 28, 18,29,17,86);
                new Ravenclaw("Падма", "Патил",100, 1,68,24,35,77);
                new Ravenclaw("Маркус", "Белби",12, 54,99,61,13,5);
        }
        Slytherin[] students = {
                new Slytherin("Драко", "Малфой",45, 16,99,100,68,89,75);
                new Slytherin("Грэхэм", "Монтегю",24, 48,22,11,100,54,31);
                new Slytherin("Грегори", "Гойл",89, 63,92,89,57,12,6);
        }
    }
}