import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {

    Artist artist;
     @BeforeEach
    public void setUp(){
         artist = new Artist("John");
     }

    @Test
    public void artistHasName(){
         assertThat(artist.getName()).isEqualTo("John");
    }
    @Test
    public void artistHasCollectionofArtwork(){
         assertThat(artist.getArtworks()).isEqualTo("Portugal, england, France");
    }



}
