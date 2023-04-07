package dio.spring.security;
//aplication properties para um único user
//spring.security.user.name=esdras
//spring.security.user.password=dio123
//spring.security.user.roles= USERS
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DioSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringSecurityApplication.class, args);
	}

}
