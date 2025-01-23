public class Author{
    private String name;
    private char gender;
    private String email;
    public Author(String name, String email, char gender){
        this.name=name;
        this.gender=gender;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String e){
        email=e;
    }
    public String toString(){
        return name+" ("+gender+")"+" at "+email;
    }
}
