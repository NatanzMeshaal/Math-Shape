package bangun_ruang;

public class cube extends rectangle {
    private int height;

    public cube(int h, int l, int w, String n, String c) {
        super(l, w, n, c);
        this.height = h;
    }

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

    public void print() {
        super.print();
        System.out.println("Height : "+this.height);
    }
    public void volume(int width, int length, int height) {
        System.out.println("volume : " + (width * length*height));
    }
    public void luas(int width, int length, int height) {
        System.out.println("luas permukaan : " + (2 * (width * length+ width*height+ length*height) ));
    }
}
