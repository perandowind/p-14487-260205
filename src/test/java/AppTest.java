import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**이전과 다르게 App이 아닌 AppTest부터 만들었음*/
public class AppTest {

    @Test
    @DisplayName("1 + 2 = 3") // 이 테스트가 어떤 테스트인지를 기재
    void t1() {
        App app = new App();
        int rst = app.plus(1, 2);

        assertThat(rst).isEqualTo(3);
    }

    @Test
    @DisplayName("10 + 20 = 30") // t2가 실패 -> 내가 제대로 구현하지 못했음을 확인 가능
    void t2() {
        App app = new App();
        int rst = app.plus(10, 20);

        assertThat(rst).isEqualTo(30);
    }
}
