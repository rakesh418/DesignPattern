package singleton;

public class EagerLazyRegistryClient {
    public static void main(String[] args) {
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
        System.out.println(eagerRegistry1==eagerRegistry2);

        LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
        LazyRegistry lazyRegistry2 = LazyRegistry.getInstance();
        System.out.println(lazyRegistry1==lazyRegistry2);

        //2nd Lay initliazation static inner class
        LazyInitialization2 lazyInitialization1 = LazyInitialization2.getInstance();
        LazyInitialization2 lazyInitialization2 = LazyInitialization2.getInstance();
        System.out.println(lazyInitialization1==lazyInitialization2);
    }
}
