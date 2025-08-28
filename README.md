# 🧊 SOLID
### SOLID : 객체 지향 설계에서 지켜야할 5개의 개발 원칙

**S**RP(Single Responsibility Principle) : 단일 책임 원칙 🎯   
**O**CP(Open Close Principle) : 개방 폐쇄 원칙 🔓   
**L**SP(Liskov Substitution Principle) : 리스코프 치환 원칙 🔄  
**I**SP(Interface Segreation Principle) : 인터페이스 분리 원칙 🧩    
**D**IP(Dependency Inversion Principle) : 의존성 역전 원칙 🤝 

> SOLID 원칙을 적용하면 코드의 **확장성**과 유지보수성이 향상되고, **불필요한 복잡성**을 줄여 리팩토링에 드는 시간을 절약할 수 있어
프로젝트 **개발 생산성**을 높일 수 있다. 

 
> ⚠️ SOLID 원칙은 순서대로 적용해야 하는 것이 아니며,
각각은 **특정 문제 상황을 해결하기 위한 독립적인 설계 지침**이다.  
따라서 모든 프로젝트나 코드에 **모든 원칙을 반드시 적용할 필요는 없다.**  
현재 코드에서 유지보수성이나 확장성에 문제가 있거나 그럴 가능성이 있을 때,
**필요한 원칙만 선택적으로 적용**하면 된다.

### 🔍 SOLID 원칙 적용 판단 가이드
| 상황 또는 문제점                                                   | 적용해야 할 원칙                | 설명                                                        |
|-------------------------------------------------------------| ------------------------ | --------------------------------------------------------- |
| 클래스에 **여러 기능**이 혼합되어 있고, **하나만 변경해도 다른 기능이 영향받는 경우**        | **SRP**<br>(단일 책임 원칙)    | 기능별로 클래스를 나누어 책임을 분리해야 함                                  |
| **기능을 확장할 때** 기존 코드를 **수정해야만** 하는 구조일 때                     | **OCP**<br>(개방-폐쇄 원칙)    | 기존 코드는 그대로 두고, 새로운 기능을 **추가만** 할 수 있도록 인터페이스나 추상화를 이용해야 함 |
| **상위 타입(부모)** 를 하위 타입(자식)으로 바꿨을 때 **예상치 못한 오류**가 발생함        | **LSP**<br>(리스코프 치환 원칙)  | 자식 클래스는 부모 클래스를 **완벽히 대체**할 수 있어야 함                       |
| 어떤 클래스가 너무 많은 **불필요한 메서드**를 구현하고 있는 경우                      | **ISP**<br>(인터페이스 분리 원칙) | 인터페이스를 **기능 단위로 쪼개서** 필요한 기능만 구현하도록 해야 함                  |
| 어떤 클래스가 하위 모듈(구체 클래스)에 **강하게 의존**하고 있어, **테스트나 교체가 어려운 경우** | **DIP**<br>(의존 역전 원칙)    | 구현이 아닌 **추상(인터페이스, 추상 클래스)** 에 의존하도록 변경해야 함               |


---
## SRP(Single Responsibility Principle) - 단일 책임 원칙 🎯  

- 클래스(객체)는 **_하나의 책임(기능)만_** 가져야 한다.
- 즉, 하나의 클래스는 하나의 기능만 담당하여 하나의 책임을 수행하는데 집중되도록 클래스를 따로따로 여러개 설계하라는 원칙
- SRP 원칙을 따름으로써 한 책임(기능)의 변경으로부터 다른 책임(기능) 변경의 연쇄작용을 극복할수 있다.
- SRP의 목적은 프로그램의 유지보수성을 높이기 위한 설계 기법  

>✂️ 예를 들어, 가위는 '자르는 기능'만 잘 수행하면 된다.
'붙이기'나 '부수기' 같은 기능은 가위의 책임이 아니다.

---
## OCP(Open Close Principle) - 개방 폐쇄 원칙 🔓
- **확장에는 열려 있어야 하고, 변경에는 닫혀있어야 한다**
- [확장에는 열려 있어야 한다.]
    - 기존의 클래스를 확장(extend) 해서 **새로운기능을 추가** 할 수 있어야 한다라는 의미.
    - 즉, 새로운 요구사항이 생겼을때 기존 클래스를 상속하거나, 구현체를 새로 만들어 기능을 늘릴 수 있어야한다.
    - **기존 기능은 그대로 두고, 새로운 기능만 따로 넣을 수 있어야 한다.**
- [변경에는 닫혀 있어야 한다.]
    - 새로운 기능을 추가한다고 해서 **기존에 존재하던 코드(로직)를 직접 고치지 말아야 한다**는 뜻
    - 기존 코드 수정은 오류 발생 가능성을 높이고 유지보수 비용이 크다.
    - **가능하면 기존 코드는 건드리지 않고, 기능만 확장하자!**
  
>"기존 코드는 믿고 쓸 수 있는 안정된 기반으로 두고,
새로운 기능은 외부에 추가로 쌓아가는 방식으로 개발하라."🏗️  

> 💡 OCP는 "조건문이 많아지는 상황"에서 특히 강력하게 빛나는 원칙이다.  
> 조건문이 늘어날수록 코드 복잡도와 유지보수 리스크가 커지기 때문에,
그 시점이 **OCP(개방-폐쇄 원칙)** 를 적용해야 할 타이밍이다.

---
## LSP(Liskov Substitution Principle) - 리스코프 치환 원칙 🔄
- **서브 타입은 언제나 자신의 기반 타입으로 치환할 수 있어야 한다**는 원칙
- 즉, 부모 클래스(또는 인터페이스)를 사용하는 모든 곳에서 자식 클래스로 대체해도 문제없이 작동해야 한다.
>예를들어 어떤 클래스 **P**가 있을 때, **P**를 상속받은 **C1, C2**가 있다면 **P 타입 변수에 C1 객체를 넣어도, 
> C2 객체를 넣어도 프로그램은 오류 없이 제대로 동작해야 한다**는 뜻이다. 

### 다형성과 LSP의 관계
- 다형성(Polymorphism)은 객체지향의 핵심 개념 중 하나로, 부모 타입 변수로 자식 타입 객체를 참조해서 실행 시점에 자식의 메서드가 호출되는 성질이다.
- LSP는 다형성이 제대로 동작하려면 반드시 지켜야 하는 원칙이다.
- 즉, 다형성을 활용하는 코드가 부모 타입을 기대하고 작성되었을 때, 자식 타입이 부모 타입을 완벽히 대체하지 못하면 예기치 않은 오류가 발생한다. 

#### LSP 위반 예시
```java
class Bird{
  void fly(){
    System.out.println("하늘을 난다.");
  }
}

class Sparrow extends Bird{
  @Override
  void fly(){
    System.out.println("참새가 난다.");
  }
}

class Ostrich extends Bird {
  @Override
  void fly() {
    throw new UnsupportedOperationException("타조는 날지 못한다");
  }
}

public class LSP {
  public static void birdFly(Bird bird){
    bird.fly();
  }

  public static void main(String[]args){
    Bird sparrow = new Sparrow();
    Bird ostrich = new Ostrich();

    birdFly(sparrow); // 정상작동
    birdFly(ostrich); //예외 발생 ->LSP위반
  }
}

```
- 이 경우 flyable 인터페이스를 생성하여 LSP를 만족 시킬 수 있다.
```java
class Bird{
    // 공통 속성
}

interface Flyablbe{
    void fly();
}
class Sparrow extends Bird implements Flyablbe{
    @Override
    public void fly(){
        System.out.println("참새가 난다.");
    }
}

class Ostrich extends Bird {
    void run() {
        System.out.println("타조는 달린다.");
    }
}
```
> #### **🔁 다형성(Polymorphism)과 LSP는 함께 동작해야 하며, LSP가 지켜지지 않으면 다형성도 무너진다.**

---
## ISP(Interface Segreation Principle) - 인터페이스 분리 원칙 🧩
- **클라이언트는 자신이 사용하지 않는 인터페이스에 의존하지 않아야 한다**는 원칙
- 즉, 여러가지 기능들이 있는 하나의 거대한 인터페이스를 만들기보단, **작고 목적이 분명한 인터페이스들로 분리**해서, 
**각 클래스가 자신이 실제로 필요로 하는 기능만 구현**하게 하라는 원칙이다.
> 📘 ISP는 마치 "과목별로 나눠진 참고서"와 같다.  
> 영어만 공부하고 싶은데 국영수사과가 한 권에 다 들어있다면 낭비다.  
→ 필요한 기능만 따로 구현할 수 있게 인터페이스도 쪼개자. ✂️

#### ISP위반 예시 : 너무 많은 기능이 한 인터페이스에 몰린 경우
```java
// 문서 장비 기능 인터페이스
interface Machine {
    void print(Document d);
    void scan(Document d);
    void fax(Document d);
}

// 오래된 프린터는 프린트만 가능함
class OldPrinter implements Machine {
    public void print(Document d) {
        System.out.println("Printed: " + d.getText());
    }

    public void scan(Document d) {
        // 쓸 수 없음
        throw new UnsupportedOperationException("Scan not supported");
    }

    public void fax(Document d) {
        // 쓸 수 없음
        throw new UnsupportedOperationException("Fax not supported");
    }
}

```
- OldPrinter는 프린트만 할 수 있는데, 스캔과 팩스도 구현을 해야한다.
- 클래스가 사용하지도 않을 기능을 가진 인터페이스를 구현하면, 메서드만 억지로 오버라이딩한 뒤 내부를 비워두거나 예외를 던지는 방식으로 처리하게 된다.   
- 이는 ISP 위반의 대표적인 사례다

#### 인터페이스를 역할별로 분리하여 ISP를 만족시킨다.
```java
interface Printer {
    void print(Document d);
}

interface Scanner {
    void scan(Document d);
}

interface Fax {
    void fax(Document d);
}

// 프린트만 되는 프린터
class OldPrinter implements Printer {
    public void print(Document d) {
        System.out.println("Printed: " + d.getText());
    }
}

// 복합기
class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void print(Document d) {
        System.out.println("Printed: " + d.getText());
    }

    public void scan(Document d) {
        System.out.println("Scanned: " + d.getText());
    }

    public void fax(Document d) {
        System.out.println("Faxed: " + d.getText());
    }
}

```
- OldPrinter는 프린터 기능만 구현, 나머지는 몰라도 된다
- MultiFunctionPrinter는 필요한 인터페이스만 선택적으로 조합가능하다.
- 나중에 기능이 늘어나도 인터페이스를 독립적으로 관리 가능하다.

>결국 ISP는 **“인터페이스에 있어서 단일 책임 원칙을 지키자”** 는 의미라고 볼 수 있다.  
즉, 하나의 클래스처럼, 인터페이스도 하나의 목적에만 집중하도록 설계해야 한다.

---
## DIP(Dependency Inversion Principle) - 의존성 역전 원칙 🤝 
- **상위 모듈(비지니스 로직)은 하위 모듈(구체 구현)에 의존하면 안되고**, 둘 다 추상화(인터페이스, 추상 클래스)에 의존해야 한다는 원칙
>예를들어 사장(상위 모듈)이 특정 직원 한 명(하위 모듈)의 역량에 의존하면, 그 직원이 퇴사하게 되었을때 업무 전체가 마비될 수 있다.  
그래서 사장은 ‘직원 유형’이나 ‘업무 매뉴얼’(인터페이스) 같은 추상적인 기준에만 의존하고, 어떤 직원이 오더라도 그 기준에 맞게 일만 잘하면 되도록 유연하게 구조를 짜는 것이 바로 DIP의 개념이다.
- **즉, 클래스가 어떤 것에 의존해야 할 때는, 구체적인 것이 아니라 추상적인 것에 의존하라** 💡

### DIP 위반 예시
```java
class Light {
    public void turnOn() {
        System.out.println("Light on");
    }
}

class Switch {
    private Light light;

    public Switch() {
        this.light = new Light(); 
    }

    public void operate() {
        light.turnOn(); 
    }
}

```
- Switch(상위모듈)이 Light(하위모듈)에 직접 의존하고 있다.
- 이 경우 Switch는 Light만 켤 수 있다.
- 나중에 선풍기, 히터, 에어컨 같은 걸 스위치로 켜고 싶다면 Switch의 클래스 코드를 수정해야하는데 그러면 OCP도 위반하게 된다.
- 즉, Switch는 Light라는 특정 구현에 묶여 있어 재사용성이 떨어지고, 테스트도 어려워진다.

### DIP 만족 예시
```java
interface Switchable{
    void turnOn();
}

class Light2 implements Switchable{
    public void turnOn(){
        System.out.println("Light On");
    }
}

class Switch2{
    private Switchable device;

    public Switch2(Switchable device){
        this.device = device;
    }

    public void operate(){
        device.turnOn();
    }
}
```
- DIP 원칙을 적용해서 **상위 모듈(Switch)** 이 **하위 모듈(Light)** 에 **직접 의존하지 않도록** 바꾼다.
- 둘 다 **추상화(인터페이스)** 에 의존하게 하면 됨.

>변하기 쉬운 구체 클래스에 직접 의존하지 말고, 변하지 않을 추상화(인터페이스 등)에 의존하라

---

> ### 📃 참고 문헌  
> https://inpa.tistory.com/entry/OOP-💠-객체-지향-설계의-5가지-원칙-SOLID#리스코프_치환_원칙_-_lsp_liskov_substitution_principle [Inpa Dev 👨‍💻:티스토리]  
> https://inpa.tistory.com/entry/OOP-💠-아주-쉽게-이해하는-SRP-단일-책임-원칙 [Inpa Dev 👨‍💻:티스토리]  
> https://inpa.tistory.com/entry/OOP-💠-아주-쉽게-이해하는-OCP-개방-폐쇄-원칙 [Inpa Dev 👨‍💻:티스토리]  
> https://inpa.tistory.com/entry/OOP-💠-아주-쉽게-이해하는-LSP-리스코프-치환-원칙 [Inpa Dev 👨‍💻:티스토리]  
> https://inpa.tistory.com/entry/OOP-💠-아주-쉽게-이해하는-ISP-인터페이스-분리-원칙 [Inpa Dev 👨‍💻:티스토리]  
> https://inpa.tistory.com/entry/OOP-💠-아주-쉽게-이해하는-DIP-의존-역전-원칙 [Inpa Dev 👨‍💻:티스토리]
