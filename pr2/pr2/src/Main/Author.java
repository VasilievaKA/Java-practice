package Main;
import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender = g;
    }

    public void setEmail(String email) {
        this.email = email;}
    public void setName(String name) {
        this.name = name;}
    public void setGender(char gender) {
        this.gender = gender;}
    public String getName(String name)
    {return name;}
    public String getEmail(String email)
    {return email;}
    public char getGender(char gender)
    {return gender;}

    public String toString()
    {return this.name + " (" +this.gender +") " + " at "+this.email;}
}
