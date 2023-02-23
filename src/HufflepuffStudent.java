public class HufflepuffStudent extends HogwartsStudent {
    private int industrious;
    private int loyalty;
    private int honesty;


    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int industrious, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
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

    private int calculateCompositePower() {
        return this.industrious + this.loyalty + this.honesty;

    }

    public void compare(HufflepuffStudent hufflepuffStudent) {
        if (this.calculateCompositePower() > hufflepuffStudent.calculateCompositePower()) {
            System.out.println(this.getName() + "is better Hufflepuff student than " + hufflepuffStudent.getName());
        } else {
            System.out.println(hufflepuffStudent.getName() + "is better Hufflepuff student than " + this.getName());
        }
    }

        @Override
        public String toString () {
            return "HufflepuffStudent{" +
                    "industrious=" + industrious +
                    ", loyalty=" + loyalty +
                    ", honesty=" + honesty +
                    "} " + super.toString();
        }
    }

