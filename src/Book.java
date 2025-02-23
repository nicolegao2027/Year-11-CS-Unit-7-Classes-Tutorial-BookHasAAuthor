public class Book{
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String name, Author author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double p){
        price=p;
    }
    public void setQty(int q){
        qty=q;
    }
    public String toString(){
        return "'"+name+"'"+" by "+author;
    }
}
