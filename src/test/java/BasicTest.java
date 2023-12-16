import org.example.Basic;
import org.junit.Assert;
import org.junit.Test;

public class BasicTest {
    Basic basic = new Basic();

    @Test
    public void testAdd() {
        Assert.assertEquals(basic.add(1, 2), 3);

    }

}
