public class Hufflepuff extends Hogwarts{
    private String name;
    private String surname;
    private int magic;
    private int transgression;
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, String magic, String transgression, String hardWork, String loyalty, String honesty) {
        super(name, surname, magic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
}
