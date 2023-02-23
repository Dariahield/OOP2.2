public class HogwartsStudent {
    private final String name;

    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void compareStudents(HogwartsStudent hogwartsStudent) {
        if (this.magicPower + this.transgressionDistance > hogwartsStudent.magicPower + hogwartsStudent.transgressionDistance) {
            System.out.println(this.getName() + "is better Hogwarts student than " + hogwartsStudent.getName());
        } else {
            System.out.println(hogwartsStudent.getName() + "is better Hogwarts student than " + this.getName());
        }
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
