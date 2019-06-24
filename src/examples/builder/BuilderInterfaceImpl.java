package examples.builder;

public class BuilderInterfaceImpl implements BuilderInterface<String> {

    
    private String wishList = "";
    
    @Override
    public void addToWishList(String someone) {
        wishList = wishList.concat(someone + " - ");
    }

    @Override
    public void addSign(String sigh) {
        wishList = wishList.concat(sigh);
    }
}
