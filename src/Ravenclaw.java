public class Ravenclaw extends Hogwarts {
    private int cleverness;
    private int wisdom;
    private int wittiness;
    private int creation;

    @Override
    public String toString() {
        return getName() + " " + getSurname() +
                ", Магия: " + getMagic() +
                ", Трансгрессия: " + getTransgression() +
                ", Благородство: " + cleverness +
                ", Честь: " + wisdom +
                ", Харбрость: " + wittiness +
                ", Творчество: " + creation;
    }

    public Ravenclaw(String name, String surname, int magic, int transgression, int cleverness, int wisdom, int wittiness, int creation) {
        super(name, surname, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creation = creation;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
