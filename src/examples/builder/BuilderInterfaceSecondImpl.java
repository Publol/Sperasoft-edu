package examples.builder;

public class BuilderInterfaceSecondImpl implements BuilderInterface<Integer> {

    private Integer value = 1;
    
    @Override
    public void addToWishList(Integer someValue) {
        value += someValue;
    }

    @Override
    public void addSign(Integer sigh) {
        value *= sigh;
    }
}
