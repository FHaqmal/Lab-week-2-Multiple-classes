import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArtworkTest {

    Artwork artwork;
    @BeforeEach
    public void setUp(){
        artwork = new Artwork ("Life");

    }
@Test
    public void artworkHasTitle(){
        assertThat(artwork.getName()).isEqualTo("Life");
}



}
