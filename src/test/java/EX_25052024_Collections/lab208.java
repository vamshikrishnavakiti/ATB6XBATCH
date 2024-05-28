package EX_25052024_Collections;

public class lab208 {
    public static void main(String[] args) {
 for(Size size:Size.values()){
     System.out.println("Size "+size+", Abbrevation : "+size.getSize());
 }

    }
}
enum  Size{
    Small("S"),
    Mideum("M"),
    Large("L");
    private String Size;

    Size(String s) {
        this.Size=s;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
}