package singleton;

public class LazyInitialization2 {
    private LazyInitialization2(){

    }

    private static class LazyHOLD{
        static LazyInitialization2 INSTANCE = new LazyInitialization2();
    }

    public static LazyInitialization2 getInstance(){
        return LazyHOLD.INSTANCE;
    }
}
