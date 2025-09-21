public class AndroidFactory implements Factory{
    @Override
    public MobileApp create() {
        System.out.println("Creating Android App");
        return new AndroidApp();
    }
}
