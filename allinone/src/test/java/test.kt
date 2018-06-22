import io.reactivex.Flowable
import org.junit.jupiter.api.Test

class AllTest {
    @Test
    fun `blank test`() {
        Flowable.just("Hello world","hi There").subscribe(System.out::println);
    }
}