public class Square {

    private int posx;
    private int posy;

    public static int sqr_width = 10;
    public static int sqr_height = 10;

    public Square(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }
    
    public boolean intersect() {

    }

    public int getPosx() {
        return this.posx;
    }
    public int getPosy() {
        return this.posy;
    }

    public int setPosx() {
       this.posx = this.posx ++;
    }
    public int setPosy() {
        this.posy = this.posy ++;
    }
}

