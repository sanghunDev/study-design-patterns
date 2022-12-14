# 싱글톤 (Singleton) 패턴
인스턴스를 오직 한개만 제공하는 클래스

* 시스템 런타임, 환경 세팅에 대한 정보 등, 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있다
  * 이런 경우 인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요하다


* 싱글톤 사용시 권장하는 두가지 방법
  * enum을 사용해서 구현
  * static inner 클래스를 사용해서 구현하는 방법


* 싱글톤 패턴을 깨뜨리는 방법
  * 리플렉션을 사용해서 새로운 인스턴스를 생성 가능
  * 직렬화 및 역직렬화를 사용해서 새로운 인스턴스 생성 가능


* 자바에서 enum을 사용하지 않고 싱글톤 패턴을 구현하는 방법은?
  * static inner 클래스를 사용해서 구현


* private 생성자와 static 메소드를 사용하는 방법의 단점은?
  * 멀티 쓰레드 환경에서 동시에 많은 요청이 일어날 경우 다른 스레드가 침범할 수 있어서 안전하지 않다 


* enum을 사용해 싱글톤 패턴을 구현하는 방법의 장점과 단점은?
  * enum의 장점
    * enum은 리플렉션으로 인스턴스를 만드는걸 방지해준다
    * 직렬화와 역직렬화에도 안전한 방법이다
    
  * enum의 단점
    * 클래스 로딩시 인스턴스가 미리 생성된다 (자원의 낭비)
    * enum은 enum만 상속이 가능해 특정 클래스를 상속 받아서 구현이 불가능하다

### 실무에서 어떤식으로 사용되는가?
* 스프링에서의 빈 스코프 중에 하나로 싱글톤 스코프
* 자바 java.lang.Runtime
* 다른 디자인 패턴(빌더, 퍼사드, 추상 팩토리 등) 구현체의 일부로 쓰이기도 한다