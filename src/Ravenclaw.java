public class Ravenclaw extends Hogwarts{
    private String name;
    private String surname;
    private int magic;
    private int transgression;
    private int cleverness;
    private int wisdom;
    private int wittiness;
    private int creation;

    public Ravenclaw(String name, String surname, String magic, String transgression, String cleverness, String wisdom, String wittiness, String creation) {
        super(name, surname, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creation = creation;
    }
}
