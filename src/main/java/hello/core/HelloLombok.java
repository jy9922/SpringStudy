package hello.core;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

// Getter, Setter를 자동으로 만들어 줌
@Setter
@Getter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asdfe");
        
        String name = helloLombok.getName();
        System.out.println("name = " + name);
    }
}
