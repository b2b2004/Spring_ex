package hello.config;

import hello.datasource.MyDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.time.Duration;
import java.util.List;

public class MyDataSourceEnvConfig {

    private final Environment env;


    public MyDataSourceEnvConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public MyDataSource myDataSource() {
        String url = env.getProperty("my.datasource.url");
        String username = env.getProperty("my.datasource.username");
        String password = env.getProperty("my.datasource.password");
        int maxConnection = env.getProperty("my.datasource.etc.max-connection", Integer.class); // 문자 -> 숫자
        Duration timeout = env.getProperty("my.datasource.etc.timeout", Duration.class); // 문자 -> 기간
        List<String> options = env.getProperty("my.datasource.etc.options", List.class); // List 변환 [A,B]
        return new MyDataSource(url, username, password, maxConnection, timeout, options);
    }
}
