import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test2 {
    @Test
    void test2() {

        assertThat(new Foo2().fun()).isEqualTo("Hello world");
    }
}
