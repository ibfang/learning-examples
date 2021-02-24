package org.example;

import org.ex.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 针对下面这段代码的举例说明:
     * 如果Application引用的jar包maven-common中，有一个文件夹和application不在同一级目录中，
     * 如org.ex，这个包里的TestService，和application（org.example）不在一个包下，
     * 那么当我们要使用TestService时就要用下面这种方法注入，否则会因为application无法扫描org.example以外的包，
     * 而导致org.ex包中的内容没有被扫描到，继而在@Autowired自动注入TestService时会出问题。
     * 另一种解决办法就是，在@SpringBootApplication时声明要扫描的包，默认是扫描和和application同级的包，
     * 如果要扫另外的包就要进行声明，声明方法就是在@SpringBootApplication后加上(scanBasePackages ={ "org.example","org.ex"})
     * 即@SpringBootApplication(scanBasePackages ={ "org.example","org.ex"})
     * @return
     */
    @Bean
    public TestService testService(){
        return new TestService();
    }
}

