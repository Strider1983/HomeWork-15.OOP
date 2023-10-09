public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, String surname, int magic, int transgression, int nobility, int honour, int bravery) {
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() +
                ", Магия: " + getMagic() +
                ", Трансгрессия: " + getTransgression() +
                ", Благородство: " + nobility +
                ", Честь: " + honour +
                ", Харбрость: " + bravery;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }
}
