package net.codejava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootTest
class HelloSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}

}
