package examples.builder;

public class GenericBuilder<V, T extends BuilderInterface<V>> {
    
    private T wishListInst;
    
    
    public GenericBuilder(T wishlist) {
        this.wishListInst = wishlist;
    }
    
    public GenericBuilder<V, T> addToWishlist(V wishlist){
        this.wishListInst.addToWishList(wishlist);
        return this;
    }
    
    public GenericBuilder<V, T> addSign(V sign){
        this.wishListInst.addSign(sign);
        return this;
    }
    
    public T build(){
        return wishListInst;
    }
    
    
}
