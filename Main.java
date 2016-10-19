package segment;


public class Main {
    public static void main(String[] args) {
        Point A=new Point();
        Point B=new Point(5);
        Point C=new Point(3,8);
        segment AB=new segment(A,B);
        segment BC=new segment(B,C);
        System.out.println("le segment AB= "+AB.distance());
        System.out.println("le segment BC= "+BC.distance());
        System.out.println("l image de BC est CB("+BC.symetrie().p1().abscisse()+","+BC.symetrie().p1().ordonnee()+") ("+BC.symetrie().p2().abscisse()+","+BC.symetrie().p2().ordonnee()+")");
        
    }
}
