import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import phoneBeans.Cpu;
import phoneBeans.Phone;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Cpu cpu = context.getBean("cpu",Cpu.class);
        System.out.println(cpu.getCountOfEfficiencyCores());
    }
}
