import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach

    public void setUp() {
        gallery = new Gallery("UniqueVisuals");

    }

    @Test
    public void gallerHasName() {
        assertThat(gallery.getName()).isEqualTo("UniqueVisuals");
    }
}