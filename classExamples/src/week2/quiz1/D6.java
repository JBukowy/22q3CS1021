package week2.quiz1;

public class D6 implements ObjectOfChance{

    int faceValue;
    private final int numberOfSides = 6;

    D6(){
        manipulate();
    }

    @Override
    public int observe() {
        return faceValue;
    }

    @Override
    public void manipulate() {
        faceValue = (int) ((Math.random() * numberOfSides) + 1) ;
    }
}
