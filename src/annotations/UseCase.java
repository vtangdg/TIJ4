package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * Created by degang on 16/12/22.
 */
@Target(ElementType.METHOD) // 表示注解用在什么地方
@Retention(RetentionPolicy.RUNTIME) // 需要在什么级别保存改注解信息
public @interface UseCase {
    public int id();

    public String description() default "no descriptsion";
}
