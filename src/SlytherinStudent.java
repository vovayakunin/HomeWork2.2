public class SlytherinStudent extends HogwartsStudent {
    private final int cunning;
    private final int intdetermination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public SlytherinStudent(String name, int transgretion, int magicPower, int cunning, int intdetermination,
                            int ambition, int resourcefulness, int lustForPower) {
        super(name, transgretion, magicPower);
        this.cunning = cunning;
        this.intdetermination = intdetermination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getIntdetermination() {
        return intdetermination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void compare(SlytherinStudent student) {
        if (student.pointsSum() < this.pointsSum()) {
            System.out.println("Сильнее в слизерин " + this.getName());
        } else if (student.pointsSum() > this.pointsSum()) {
            System.out.println("Сильнее в слизерин " + this.pointsSum());
        } else {
            System.out.println("Ученики в слизерин равны");

        }
    }
    private int pointsSum(){
        return cunning + intdetermination + ambition + resourcefulness + lustForPower;
    }

    @Override
    public String toString() {
        return String.format("cunning = %s, intdetermination = %s, ambition = %s, resourcefulness = %s, lustForPower = %s",
                cunning, intdetermination, ambition, resourcefulness, lustForPower);
    }
}
