import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test1 {

    @Test
    void test1() {
        assertThat(new Foo().fun()).isEqualTo("Hello world");
    }
}
