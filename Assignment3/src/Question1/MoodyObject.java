package Question1;

public abstract class MoodyObject {
    abstract String getMood();
    abstract void ExpressFeelings();
    public void queryMood(){
        System.out.println("I feel " + getMood() + " today.");
    }


    abstract String tostring();
}
