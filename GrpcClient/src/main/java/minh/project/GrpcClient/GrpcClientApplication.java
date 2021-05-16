package minh.project.GrpcClient;

import minh.project.GrpcClient.Service.GrpcService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class GrpcClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcClientApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	void test(){
		GrpcService service=new GrpcService();
		service.run();
	}
}
