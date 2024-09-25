package BuatBaru;
public class Cd extends Produk {
    // variable
    private String artist;
    private int numSongs;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSongs() {
        return this.numSongs;
    }

    public void setNumSongs(int numSongs) {
        this.numSongs = numSongs;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    // constructor
    public Cd() {
        artist = "null";
        numSongs = 0;
        label = "null";
        super.setNumber(0);
        super.setName("null");
        super.setQuantity(0);
        super.setPrice(0);
    }

    // constructor parameter
    public Cd(String artist, int numSongs, String label, int number, String name, int quantity, double price) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.numSongs = numSongs;
        this.label = label;
    }

    //Override
    public void print() {
        super.print();
        System.out.println("Artist\t" + artist);
        System.out.println("NumSongs\t" + numSongs);
        System.out.println("Label\t" + label);
    }



    
}