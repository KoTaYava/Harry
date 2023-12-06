public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String name,String surname, int transgression, int witchcraft, int nobility,
                      int honor, int bravery) {
        super(name, surname, transgression, witchcraft);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void compareHogwartsHouse(Gryffindor[] gryffindors, int first, int second) {

        int sum1 = gryffindors[first].getBravery() + gryffindors[first].getHonor() + gryffindors[first].getNobility();
        int sum2 = gryffindors[second].getBravery() + gryffindors[second].getHonor() + gryffindors[second].getNobility();
        System.out.println("Сравнение двух студентов Гриффиндора:");
        if (sum1>sum2) {
            System.out.println("Total "+sum1+ " (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " > " +
                    "Total "+sum2+ " (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (sum1<sum2) {
            System.out.println("Total "+sum1+ " (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " < " +
                    "Total "+sum2+ " (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (sum1==sum2) {
            System.out.println("Total "+sum1+ " (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " = " +
                    "Total "+sum2+ " (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        }
        System.out.println("________________");
    }

    @Override
    public String toString() {
        return "Грифиндор студент \n" + "Имя: " + getName() + " Фамилия: " + getSurname() + "\n" +
                "Трансгресия=" + getTransgression() + "\n" +
                "Колдоство=" + getWitchcraft() + "\n" +
                "Благородство=" + nobility + "\n" +
                "Честь=" + honor + "\n" +
                "Храбрость=" + bravery + "\n";
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}