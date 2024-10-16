package bangun_ruang;

public class circle extends shape {
    private int radius;

    public circle(int r, String n, String c) {
        super(n, c);
        this.radius = r;
    }

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

    public void print() {
        super.print();
        System.out.println("Radius : "+this.radius);
    }
    public void luas() {
        System.out.println("Luas : " + (3.14  *radius * radius));
    }
    public void keliling() {
        System.out.println("keliling : "  + (2 * 3.14 * radius));
    }
}
