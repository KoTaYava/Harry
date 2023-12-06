public class HogwartsServiceImpl {
    public void compareHogwartsImpl(Hogwarts[] hogwarts, int first, int second) {
        Hogwarts.compareHogwarts(hogwarts, first, second);
    }
    public void compareHogwartsHouseImpl(Gryffindor[] gryffindors, int first, int second) {
        Gryffindor.compareHogwartsHouse(gryffindors, first, second);
    }
    public void compareHogwartsHouseImpl(Slytherin[] slytherins, int first, int second) {
        Slytherin.compareHogwartsHouse(slytherins, first, second);
    }
    public void compareHogwartsHouseImpl(Ravenclaw[] ravenclaws, int first, int second) {
        Ravenclaw.compareHogwartsHouse(ravenclaws, first, second);
    }
    public void compareHogwartsHouseImpl(Hufflepuff[] hufflepuffs, int first, int second) {
        Hufflepuff.compareHogwartsHouse(hufflepuffs, first, second);
    }
}