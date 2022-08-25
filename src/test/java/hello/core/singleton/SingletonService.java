package hello.core.singleton;

public class SingletonService {

    // 자바의 static 영역 공부해보세요!
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 private으로 설정해서 밖에서 못 만들게 설정
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
