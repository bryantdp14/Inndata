public class Circulo implements Figura {
    int x, y;
    double radio;

    public Circulo(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public double calcularArea() {
        System.out.println(Math.PI * radio * radio);
    }

    public double calcularPerimetro() {
        System.out.println(2 * Math.PI * radio);
    }
}