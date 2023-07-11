
public class Circle implements Comparable<Circle> {
    private double radius ;
    
    public Circle (double radius ){
        this.radius = radius ;
    }

    @Override
    public int compareTo(Circle o) {
       return Double.compare(this.radius, o.radius);
    }
    
    @Override
    public String toString(){
        return Double.toString(this.radius);
    }
}
