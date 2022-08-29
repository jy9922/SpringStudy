package hello.core.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    void singletonBeanFind() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SingletonBean.class);
        SingletonBean bean = ac.getBean(SingletonBean.class);
        SingletonBean bean2 = ac.getBean(SingletonBean.class);

        System.out.println("bean1 = " + bean);
        System.out.println("bean2 = " + bean2);

        assertThat(bean).isSameAs(bean2);
        ac.close();

    }



    @Scope("singleton")
    static class SingletonBean{
        @PostConstruct
        static void init(){
            System.out.println("SingletonBean.init");
        }
        @PreDestroy
        static void destroy(){
            System.out.println("SingletonBean.destroy");
        }
    }
}
