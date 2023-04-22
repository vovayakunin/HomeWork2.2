import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        GriffindorStudent harry = new GriffindorStudent ("Гарри Поттер",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        GriffindorStudent germiona = new GriffindorStudent("Гермиона Грейнджер",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        GriffindorStudent ron = new GriffindorStudent("Рон Уизли",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        harry.compare(germiona);
        System.out.println(harry);

        PuffenduiStudent smit = new PuffenduiStudent("Захария Смит",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        PuffenduiStudent diggory = new PuffenduiStudent("Седрик Диггори",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        PuffenduiStudent finch = new PuffenduiStudent("Джастин Финч-Флетчли",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        System.out.println(finch);
        System.out.println("Седрик Диггори = " + diggory);

        KogtevranStudens chang = new KogtevranStudens("Чжоу Чанг",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        KogtevranStudens patil = new KogtevranStudens("Падма Патил",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        KogtevranStudens belbi = new KogtevranStudens("Маркус Белби",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));

        System.out.println(belbi);
        System.out.println(harry);
        System.out.println(smit);

        SlytherinStudent malfoy = new SlytherinStudent("Драко Малфой",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        SlytherinStudent montegy = new SlytherinStudent("Грэхэм Монтегю",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        SlytherinStudent goil = new SlytherinStudent("Грегори Гойл",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));

        harry.compare(malfoy);
        System.out.println(ron);
        System.out.println(smit);
        System.out.println(germiona);
    }
}
