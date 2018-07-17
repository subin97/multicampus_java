# Day 9
***
### 스마트폰 vs. 피처폰
-  스마트폰은 운영체제를 가지고 있어 응용프로그램(application)을 자유롭게 설치 가능
- 알람의 경우 일정 초마다 시간 확인
- 저전력모드일 경우 체크하는 시간 간격이 커지므로 정확한 시간에 알람이 울리지 않을 수도 있다.
~~~java
public class CheckingExceptionTest {
	public static void main(String[] args) {
		for(int i=10;i>0;i--) {
			try {
				Thread.sleep(1000);
				// 1000ms=1s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==3)
				System.out.println(i);
		}
	}
}
~~~

### 스레드(Thread)
> 명령처리흐름  
예외가 Exception이라는 객체로 표현되듯이 Thread라는 객체로 표현됌

- 프로세스 : 프로그램의 실행 단위
- 프로세스는 최소 하나의 스레드(메인 스레드)를 가짐
- 프로세스가 동시에 두 가지 이상의 작업(병렬처리)을 하려면 스레드가 두 개 이상이어야 함.

### 병렬처리
1. 멀티프로세스
  - 프로세스 단위로 메모리 할당받음
  - 각 프로세스가 별도의 메모리를 가짐  
  -> 어떻게 데이터를 공유할 것인가?
  - IPC
2. 멀티스레드
  - 여러 개의 명령 흐름이 하나의 메모리 공간을 공유  
  -> 어떻게 흐름을 정리할 것인가?
