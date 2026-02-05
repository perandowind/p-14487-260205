import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**이전과 다르게 App이 아닌 AppTest부터 만들었음*/
public class AppTest {

    @Test
    void t1() {
        App app = new App();
        int rst = app.plus(1, 2);

        assertThat(rst).isEqualTo(3);
    }
}
