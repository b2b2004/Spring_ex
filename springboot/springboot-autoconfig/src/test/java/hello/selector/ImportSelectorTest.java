package hello.selector;

import jdk.dynalink.linker.support.Guards;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

public class ImportSelectorTest {

    @Test
    void staticConfig(){
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(StaticConfig.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        assertThat(bean).isNotNull();
    }

    @Test
    void selectorConfig(){
        // HelloImportSelector에 return값 인식
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SelectImports.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        assertThat(bean).isNotNull();
    }

    @Configuration
    @Import(HelloConfig.class)
    public static class StaticConfig{
    }

    @Configuration
    @Import(HelloImportSelector.class)
    public static class SelectImports{
    }
}
