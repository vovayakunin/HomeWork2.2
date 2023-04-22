public class PuffenduiStudent extends HogwartsStudent {
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public PuffenduiStudent(String name, int transgretion, int magicPower, int hardworking, int loyal, int honest) {
        super(name, transgretion, magicPower);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void compare(PuffenduiStudent student) {
        if (student.pointsSum() < this.pointsSum()) {
            System.out.println("Сильнее в пуффендоре " + this.getName());
        } else if (student.pointsSum() > this.pointsSum()) {
            System.out.println("Сильнее в пуффендоре " + this.pointsSum());
        } else {
            System.out.println("Ученики в пуффендоре равны");

        }
    }
    private int pointsSum(){
        return hardworking + loyal + honest;
    }

    @Override
    public String toString() {
        return String.format("hardworking = %s, loyal = %s, honest = %s", hardworking, loyal, honest);
    }


}
