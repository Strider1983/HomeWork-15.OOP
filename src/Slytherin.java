public class Slytherin extends Hogwarts{
    private String name;
    private String surname;
    private int magic;
    private int transgression;
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, String magic, String transgression, String cunning, String resoluteness, String ambition, String resourcefulness, String lustForPower) {
        super(name, surname, magic, transgression);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
}
