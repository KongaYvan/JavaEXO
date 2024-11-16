public class Point{
    public float abscisse;
    public float ordonnée;

    public Point()
    {
    }

    public static void initialiser(int x,int y){
        this.abscisse = x;
        this.ordonnée = y;
    }
    public static void modifier(int x,int y){
        this.abscisse += x;
        this.ordonnée += y;
    }
    public static void afficher(){
        System.err.println("je suis un point de cordonnees"+ this.abscisse + " et " + this.ordonnée);
    }
}