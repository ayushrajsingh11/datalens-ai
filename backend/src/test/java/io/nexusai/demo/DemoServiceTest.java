package io.nexusai.demo;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DemoServiceTest {
 private final DemoService service=new DemoService();
 @Test void sampleWorkflow(){assertEquals(List.of("A: 5"),service.execute("A,2\nA,3","aggregate"));}
 @Test void rejectsNull(){assertThrows(IllegalArgumentException.class,()->service.execute(null,"test"));}
}
