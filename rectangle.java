package bangun_ruang;

public class rectangle extends shape {
    private int length;
    private int width;

    public rectangle(int l, int w, String n, String c) {
        super(n, c);
        this.length = l;
        this.width = w;
    }
    
	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

    public void print () {
        super.print();
        System.out.println("Length : "+this.length);
        System.out.println("Width : "+this.width);
    }
    public void luas() {
        System.out.println("Luas : " + (width * length));
    }
    public void keliling() {
        System.out.println("keliling :"  + (width + length + width + length));
    }
}
