package Question1;

public class HappyObject extends MoodyObject{
    @Override
    String getMood() {
        return "Happy";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("heeehee…hahahah…HAHAHA!!");
    }
    @Override
    public String tostring(){
        return "Subject laughs a lot";
    }
}
