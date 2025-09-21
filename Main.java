class main{
    public static void main(String[] args) {
        Factory androidFactory = new AndroidFactory();
        Factory iosFactory = new IOSFactory();

        MobileApp android = androidFactory.create();
        MobileApp ios = iosFactory.create();

        android.run();
        ios.run();
        android.update();
        ios.update();
    }
}