public class Hufflepuff extends Hogwarts{
    private int hardWork;
    private int loyalty;
    private int honesty;

    @Override
    public String toString() {
        return getName() + " " + getSurname() +
                ", Магия: " + getMagic() +
                ", Трансгрессия: " + getTransgression() +
                ", Трудолюбие: " + hardWork +
                ", Верность: " + loyalty +
                ", Честность: " + honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Hufflepuff(String name, String surname, int magic, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    protected int getSpecsSum() {
        return hardWork + loyalty + honesty;
    }
}
