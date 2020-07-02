package idv.maxy.f2e_order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * B2E主程式
 * @author Max Chen
 *
 */
@SpringBootApplication
public class F2EMain {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(F2EMain.class);
		app.run(args);
	}
}
