public class GriffindorStudent extends HogwartsStudent {
    private final int nobility;
    private final int honor;
    private final int courage;

    public GriffindorStudent(String name, int transgretion, int magicPower, int nobility, int honor, int courage) {
        super(name, transgretion, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void compare(GriffindorStudent student) {
        if (student.pointsSum() < this.pointsSum()) {
            System.out.println("Сильнее в гриффиндоре " + this.getName());
        } else if (student.pointsSum() > this.pointsSum()) {
            System.out.println("Сильнее в гриффиндоре " + this.pointsSum());
        } else {
            System.out.println("Ученики в гриффиндоре равны");

        }
    }
    private int pointsSum(){
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return String.format("nobility = %s, honor = %s, courage = %s", nobility, honor, courage);
    }
}
