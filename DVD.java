package BuatBaru;
public class DVD extends Produk {
    // variable
    private int length;
    private String studio;
    private String rating;

    
    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    
    public DVD() {
        length = 0;
        studio = "null";
        rating = "null";
        super.setNumber(0);
        super.setName("null");
        super.setQuantity(0);
        super.setPrice(0);

    }
    public DVD(int number, String name, int quantity, double price, int length, String studio, String rating) {
        super(number, name, quantity, price);
        this.length = length;
        this.studio = studio;
        this.rating = rating;
    }

    //Override
    public void print() {
        super.print();
        System.out.println("Length\t :" + length);
        System.out.println("Studio\t :" + studio);
        System.out.println("Rating\t :" + rating);
    }



    
}
