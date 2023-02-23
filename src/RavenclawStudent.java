public class RavenclawStudent extends HogwartsStudent{
    private int mind;
    private int wisdom;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }


    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int calculateCompositePower() {
        return this.mind + this.wisdom + this.creativity;

    }

    public void compare(RavenclawStudent ravenclawStudent) {
        if (this.calculateCompositePower() > ravenclawStudent.calculateCompositePower()) {
            System.out.println(this.getName() + "is better Ravenclaw student than " + ravenclawStudent.getName());
        } else {
            System.out.println(ravenclawStudent.getName() + "is better Ravenclaw student than " + this.getName());
        }
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", creativity=" + creativity +
                '}';
    }
}
