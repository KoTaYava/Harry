public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;
    public Ravenclaw(String name,String surname, int transgression, int witchcraft, int intelligence, int wisdom,
                     int wit, int creativity) {
        super(name, surname, transgression, witchcraft);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public static void compareHogwartsHouse(Ravenclaw[] ravenclaws,int first, int second){
        int sum1 = ravenclaws[first].getIntelligence()+ravenclaws[first].getWisdom()+ravenclaws[first].getWit()+ravenclaws[first].getCreativity();
        int sum2 = ravenclaws[second].getIntelligence()+ravenclaws[second].getWisdom()+ravenclaws[second].getWit()+ravenclaws[second].getCreativity();
        System.out.println("Сравнение двух учеников Когтеврана:");
        if (sum1>sum2) {
            System.out.println("Total "+sum1+ " (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Total "+sum2+ " (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (sum1<sum2) {
            System.out.println("Total "+sum1+ " (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Total "+sum2+ " (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (sum1==sum2) {
            System.out.println("Total "+sum1+ " (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Total "+sum2+ " (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        System.out.println("________________");
    }

    @Override
    public String toString() {
        return "Ravenclaw student \n" + "Имя: " + getName() + " Фамилия: " + getSurname() + "\n" +
                "Трансгресия=" + getTransgression() + "\n" +
                "Колдоство=" + getWitchcraft() + "\n" +
                "Интелект=" + intelligence + "\n" +
                "Мудрость=" + wisdom + "\n" +
                "Остроумие=" + wit + "\n" +
                "Креативность=" + creativity + "\n";
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}