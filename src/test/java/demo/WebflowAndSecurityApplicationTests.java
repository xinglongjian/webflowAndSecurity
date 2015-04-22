package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinglongjian.WebflowAndSecurityApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebflowAndSecurityApplication.class)
@WebAppConfiguration
public class WebflowAndSecurityApplicationTests {

	@Test
	public void contextLoads() {
	}

}
