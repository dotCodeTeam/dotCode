
# extends 활용해 클래스 단일 상속받기

Title : 즐거운 Java 수업

1. 수업을 받는 학생(Student), 수업과 관련된 멤버(필드/메소드)
2. 수업을 받는 주체인 나(Chanwool), 학생클래스에서 메소드를 상속받아(IS-A) 재정의(= Overriding) + 나만의 특수한행위 메소드(snack()) 추가
3. 수업을 받는 주체인 다른학생(Others), 또한 학생클래스에서 메소드를 상속받아(IS-A) 재정의 + 다른학생만의 특수한행위 메소드(lookAtScreen()) 추가

목적 : 실제로 동적바인딩이 잘 이루어지고있는지 확인/ 클래스타입 형변환이 잘 이루어지는지 확인 / instanceof 연산자(boolean)로 타입 확인

====================================================================================================================

# interface / implements / abstract 활용해 다중 상속 받기

Title : 결제 방식을 입력받아 해당 방식에 맞는 실행문 출력

1. 결제하는 행위와 관련된 interface파일 'Pay'와 다음 메소드 생성
    A.결제방식 : public abstract payment()   // 명시적선언
    B.결제완료 : complete()                  // 묵시적선언

2. 비지니스모델에 따른 결제방식과 관련된 클래스 추가 및 Overriding
    A.현금 : CashPay
    B.카드 : CardPay

3. 전체적인 결제서비스를 다룰 클래스 'PaymentService' 추가
   # field
   1. Pay pay : private                     // 다형성을 위한 클래스 참조변수(reference variable) 선언
   2. String CASH = "현금" : private final
   3. String CARD = "카드" : private final   // 결제방식은 정해져 있기때문에 final로 상수필드 선언 및 초기화

   # method
   1.PaymentService(){} : public              // 필드를 초기화하는 기본생성자
   2.process(String option){} : public void   // 어떻게 입력받았는지 조건을 검사해 해당 조건에 맞는 인스턴스 객체로 초기화
   3.answer(Scanner sc){} : public String     // nextLine() 기능으로 문자열을 받아 return

4. Application 예시

    public class Application {
        public static void main(String[] args) {

            PaymentService paymentService = new PaymentService();
            Scanner sc = new Scanner(System.in);

            paymentService.process(paymentService.answer(sc));

        }
    }


