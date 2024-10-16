package bangun_ruang;

public class shape {
        private String name;
        private String color;

    public shape(String n, String c) {
        this.name = n;
        this.color = c;
    }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void print() {
		System.out.println("Nama Bangun Ruang : "+this.name);
		System.out.println("Color (Warna): "+this.color);
	}
}

