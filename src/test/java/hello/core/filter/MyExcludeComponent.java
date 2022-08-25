package hello.core.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 어디에 붙는지? TYPE은 class 레벨에 붙는 것!
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {

}
