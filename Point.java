package segment;


public class Point {
    private double abscisse;
    private double ordonnee;
    public Point(){
        this.abscisse= 0.0;
        this.ordonnee= 0.0;
    }
    public Point(double x){
        this.abscisse=x;
        this.ordonnee=x;
    }
    public Point(double x,double y){
        this.abscisse=x;
        this.ordonnee=y;
    }
    double abscisse(){
        return this.abscisse;
    }
    double ordonnee(){
        return this.ordonnee;
    }
    Point symetrie(){
        Point p=new Point(-this.abscisse,this.ordonnee);
        return p;
    
    }
    
    
}
