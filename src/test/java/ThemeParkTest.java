import org.junit.Before;
import org.junit.Test;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before(){

    }

    @Test
    public void canGetAllReviewed(){
        themePark.getAllReviewed();
        System.out.println(themePark.getAllReviewed());
    }
}
