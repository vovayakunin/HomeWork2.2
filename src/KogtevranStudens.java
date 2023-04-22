public class KogtevranStudens extends HogwartsStudent {
    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public KogtevranStudens(String name, int transgretion, int magicPower, int smart, int wise, int witty, int creativity) {
        super(name, transgretion, magicPower);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void compare(KogtevranStudens student) {
        if (student.pointsSum() < this.pointsSum()) {
            System.out.println("Сильнее в когтевране " + this.getName());
        } else if (student.pointsSum() > this.pointsSum()) {
            System.out.println("Сильнее в когтевране " + this.pointsSum());
        } else {
            System.out.println("Ученики в когтевране равны");

        }
    }
    private int pointsSum(){
        return smart + wise + witty + creativity;
    }

    @Override
    public String toString() {
        return String.format("smart = %s, wise = %s, witty = %s, creativity = %s", smart, wise, witty, creativity);
    }
}
