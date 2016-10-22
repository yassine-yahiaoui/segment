package segment;

import static java.lang.Math.sqrt;

public class segment {
    private Point p1;
    private Point p2;
    public segment(Point p){
    this.p1=p;
    this.p1=new Point();
    }
    public segment(Point p1,Point p2){
    this.p1=p1;
    this.p1=p2;
    }
    Point p1(){
        return this.p1;
    }
    Point p2(){
        return this.p2;
    }
    double distance(){
        return sqrt((p1.abscisse()-p2.abscisse())*(p1.abscisse()-p2.abscisse())+(p1.ordonnee()-p2.ordonnee())*(p1.ordonnee()-p2.ordonnee()));
    }// utilise pow c'est mieux 
     public double distance1() {
        return Math.sqrt(Math.pow((ext2.getX() - ext1.getX()), 2) + 
                Math.pow((ext2.getY() - ext1.getY()), 2));
    }
    
    segment symetrie(){
        segment s=new segment(this.p1.symetrie(),this.p2.symetrie());
        return s;
    }
    
    public String toString() {
        return "Segment{" + "[" + p1 + ", " + p2 + "]";
    }
}
