import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){customer = new Customer ("Julio");}
    @Test
    public void customerHasName(){assertThat(customer.getName()).isEqualTo("Julio");}



}
