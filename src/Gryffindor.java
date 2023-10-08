public class Gryffindor extends Hogwarts{
    private String name;
    private String surname;
    private int magic;
    private int transgression;
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, String surname, String magic, String transgression, String nobility, String honour, String bravery) {
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }
}
