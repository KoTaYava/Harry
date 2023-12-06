public class Main {
    public static int generateRandomNumber() {
        java.util.Random random = new java.util.Random();
        int randomNumber = random.nextInt(101);
        return randomNumber;
    }
    public static void main(String[] args) {
        System.out.println();
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Gryffindor("Гермиона", "Грейнджер", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Gryffindor("Рог", "Уизли", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber())};
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Slytherin(" Грэхэм ", "Монтегю", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Slytherin("Грегори", "Гойл", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber())};
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Ravenclaw("Падма", "Патил", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Ravenclaw("Маркус", "Белби", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber())};
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Hufflepuff("Седрик", "Дигори", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Hufflepuff("Джастин", "Финч-Флетчли", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber())};
        Hogwarts[] hogwarts = {
                gryffindors[0], gryffindors[1], gryffindors[2],
                slytherins[0], slytherins[1], slytherins[2],
                ravenclaws[0], ravenclaws[1], ravenclaws[2],
                hufflepuffs[0], hufflepuffs[1], hufflepuffs[2]};

        HogwartsServiceImpl hogwartsService = new HogwartsServiceImpl();
        hogwartsService.compareHogwartsImpl(hogwarts, 0, 10);
        hogwartsService.compareHogwartsHouseImpl(gryffindors, 1, 2);
        hogwartsService.compareHogwartsHouseImpl(slytherins, 1, 2);
        hogwartsService.compareHogwartsHouseImpl(ravenclaws, 1, 2);
        hogwartsService.compareHogwartsHouseImpl(hufflepuffs, 1, 2);
        System.out.println(gryffindors[0].toString());
        System.out.println(slytherins[0].toString());
        System.out.println(ravenclaws[0].toString());
        System.out.println(hufflepuffs[0].toString());
    }
}