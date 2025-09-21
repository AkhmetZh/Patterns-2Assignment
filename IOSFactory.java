public class IOSFactory implements Factory{
    @Override
    public MobileApp create() {
        System.out.println("Creating IOS App");
        return new IOSApp();
    }
}
