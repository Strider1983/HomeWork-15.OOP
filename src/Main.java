import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер",98, 74, 35, 100,31),
                new Gryffindor("Гермиона", "Грейнджер",76, 62, 35,31,87),
                new Gryffindor("Рон", "Уизли",58, 31,9,11,65),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит",61, 33, 51,74,22),
                new Hufflepuff("Седрик", "Диггори",22, 12,46,98,31),
                new Hufflepuff("Джастин", "Финч-Флетчли",71, 85, 82,15,7),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг",37, 28, 18,29,17,86),
                new Ravenclaw("Падма", "Патил",100, 1,68,24,35,77),
                new Ravenclaw("Маркус", "Белби",12, 54,99,61,13,5),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой",45, 16,99,100,68,89,75),
                new Slytherin("Грэхэм", "Монтегю",24, 48,22,11,100,54,31),
                new Slytherin("Грегори", "Гойл",89, 63,92,89,57,12,6),
        };
        Tasks printService = new Tasks();
        printService.print(gryffindors);
        Tasks.compareGryffindors(gryffindors);
        printService.print(hufflepuffs);
        Tasks.compareНufflepuffs(hufflepuffs);
        printService.print(ravenclaws);
        Tasks.compareRavenclaws(ravenclaws);
        printService.print(slytherins);
        Tasks.compareSlytherins(slytherins);
    }
}