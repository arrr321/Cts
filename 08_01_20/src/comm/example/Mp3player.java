package comm.example;


public class Mp3player extends Electronics{
    
    private String color;
    
    public Mp3player(double regularPrice, 
                String manufacturer,
                String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }
    
  
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.9;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
