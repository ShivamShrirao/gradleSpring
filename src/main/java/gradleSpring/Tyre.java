package gradleSpring;

public class Tyre {
    private String Brand;

    public Tyre(String brand) {
        Brand = brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "Brand='" + Brand + '\'' +
                '}';
    }
}
