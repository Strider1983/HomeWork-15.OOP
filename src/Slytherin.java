public class Slytherin extends Hogwarts{
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() +
                ", Магия: " + getMagic() +
                ", Трансгрессия: " + getTransgression() +
                ", Хитрость: " + cunning +
                ", Оешительность: " + resoluteness +
                ", Амбициозность: " + ambition +
                ", Находчивость: " + resourcefulness +
                ", Жажда власти: " + lustForPower;
    }

    public Slytherin(String name, String surname, int magic, int transgression, int cunning, int resoluteness, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magic, transgression);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    protected int getSpecsSum() {
        return cunning + resoluteness + resourcefulness + ambition + lustForPower;
    }
}
