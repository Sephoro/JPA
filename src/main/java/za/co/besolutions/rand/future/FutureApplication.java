package za.co.besolutions.rand.future;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import za.co.besolutions.rand.future.entity.User;

@SpringBootApplication // spring context, autoconfiguration, component scan
public class FutureApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FutureApplication.class, args);

		int counter = 0;

		for (String bean: context.getBeanDefinitionNames()) {
			System.out.println(counter + " --->  " + bean);
		}
	}

}
