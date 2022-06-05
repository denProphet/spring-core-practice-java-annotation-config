import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("cpu.properties")
@ComponentScan("phoneBeans")
public class Config {

}
