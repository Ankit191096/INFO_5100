package Question1;

public class Main {
    public static void main(String[] args) {
        MoodyObject happyObject = new HappyObject();
        MoodyObject sadObject = new SadObject();
        PsychiatristObject psychiatrist = new PsychiatristObject();

        psychiatrist.examine(happyObject);
        happyObject.queryMood();
        System.out.println("");

        happyObject.ExpressFeelings();
        psychiatrist.observe(happyObject);
        System.out.println("");

        psychiatrist.examine(sadObject);
        sadObject.queryMood();
        System.out.println("");

        sadObject.ExpressFeelings();
        psychiatrist.observe(sadObject);
    }
}
