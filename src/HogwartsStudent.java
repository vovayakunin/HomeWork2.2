public abstract class HogwartsStudent {
    private final String name;
    private final int transgretion;
    private final int magicPower;

    public HogwartsStudent(String name, int transgretion, int magicPower) {
        this.name = name;
        this.transgretion = transgretion;
        this.magicPower = magicPower;
    }

    public String getName() {
        return name;
    }

    public int getTransgretion() {
        return transgretion;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void compare(HogwartsStudent student) {
        if (student.pointsSum() < this.pointsSum()) {
            System.out.println("Сильнее " + this.getName());
        } else if (student.pointsSum() > this.pointsSum()) {
            System.out.println("Сильнее " + this.pointsSum());
        } else {
            System.out.println("Ученики равны");

        }
    }
    private int pointsSum() {
        return transgretion + magicPower;
    }

    @Override
    public String toString() {
        return String.format("name = %s, transgretion = %s, magicPower = %s", name, transgretion,magicPower);
    }
}

