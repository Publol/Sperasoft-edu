package examples;

public class Example1 {
    
    
    public double getSum(Double x, Double y){
        return x + y;
    }
    
    public Integer getSum(Integer x, Integer y) {
        return x + y;
    }
    
    public String getSum(String x, String y) {
        return x.concat(y);
    }
    
    
    
    public <V> V getSum(V x, V y) {
        if (x instanceof String && y instanceof String) {
            return (V)((String)x).concat((String)y);
        }
        if (x instanceof Integer && y instanceof Integer) {
            return (V)(Integer)((Integer)x +(Integer)y);
        }
        if (x instanceof Double && y instanceof Double) {
            return (V)(Double)((Double)x +(Double)y);
        }
        if (x instanceof Float && y instanceof Float) {
            return (V)(Float)((Float)x +(Float)y);
        }
        return null;
    }
    
    
    
    
    
}
