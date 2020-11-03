package singleton;

public class EagerLazyRegistryClient {
    public static void main(String[] args) {
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
        System.out.println(eagerRegistry1==eagerRegistry2);

        LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
        LazyRegistry lazyRegistry2 = LazyRegistry.getInstance();
        System.out.println(lazyRegistry1==lazyRegistry2);
    }
}
