import java.util.ArrayList;

public class Artist {
  private String name;
  private ArrayList<Artwork>artworks;

 public static void main(String[]args){


}



// constructor

public Artist (String name) {
    this.name = name;
    this.artworks = new ArrayList<>();}



public String getName(){
    return this.name;
}
public ArrayList<Artwork>getArtworks() {
    return this.artworks;
}
}
