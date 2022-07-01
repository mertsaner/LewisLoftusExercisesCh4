public class PairOfDice {

   // Die.roll();
    private int facevalue;
    private final int MAX = 6;

    public PairOfDice (int facevalue){
        this.facevalue = facevalue;
    }

    public int getFacevalue() {
        return facevalue;
    }

    public void setFacevalue(int facevalue) {
        this.facevalue = facevalue;
    }

    public int roll(){
        facevalue = (int)(Math.random() * MAX) + 1;
        return facevalue;
    }

    public String toString(){
        String result = "FaceValue: " + getFacevalue();
        return result;
    }
}