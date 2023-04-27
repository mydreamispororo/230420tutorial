package tut01;

public class tut01_ifStatement {

	public static void main(String[] args) {
		//조건문
		
		
		//if
		
		//if ~ else
		//성적 : score 변수에 점수 85점을 입력
		//90점 이상이면 최고 아니면 보통
//		최고 아니면 보통이라는 글자를 출력
//		if(조건) 참이면 중괄호 안에 내용을 실행
//		else 아니면 중괄호 안에 내용을 실행
		
		int score = 85;
		if(score >= 90) {
			System.out.println("최고등급");
		} else {
			System.out.println("보통");
		}
		
		
		//다중 if ~ else if ~ else
		
		//삼항연산자(조건문을 짧게 표현한 것)
		//System.out.println(조건 ? "최고" : "보통");
		
		System.out.println(score >= 90 ? "최고" : "보통");
		System.out.println("----------------------------------");
		
		//회원등급이 80이상이면 우수 -> if(조건)
		//회원등급이 50이상이면 보통 -> else if(조건)
		//회원등급이 50미만이면 미가입 -> else (조건x)
		//회원등급 변수명은 grade
		
		int grade = 90;
		if(grade >= 80) {
			System.out.println("우수");
		}else if(grade >= 50) {
			System.out.println("보통");
		}else {
			System.out.println("미가입");
		}
		
		System.out.println("----------------------------------");
		
		//System.out.println(); 가 한 줄일 때만 사용해야 함
		if(grade >= 80)
			System.out.println("골드");
		
		else if(grade >= 50)
			System.out.println("실버");
		
		else
			System.out.println("브론즈");
		
		System.out.println("----------------------------------");
		//나머지가 0이면 짝수, 아니면 홀수
		//숫자 연산 후 같다는 ==
		//두 변수의 글자가 같은지 확인하는 것은 equals
		//if else 구문을 사용하는데 if는 한 번만
		//변수명은 num
		
		int num;
		num = 10;
		
		if(num % 2 == 0) {
			System.out.println("Even(짝수) Number");
		}else {
			System.out.println("Odd(홀수) Number");
		}
		
		System.out.println((num % 2 == 0) ? "짝수" : "홀수");
		System.out.println("----------------------------------");
		
		//회사 시스템에 접속한다고 가정하고
		//비밀번호를 비교
		//sysPwd
		//priPwd
		//일치하면 로그인
		//아니면 접근 거부
		String sysPwd = "12345678";
		String priPwd = "12345678";
		
		if(sysPwd.equals(priPwd))
			System.out.println("로그인 성공!!");
		else
			System.out.println("접근 거부");
		
		System.out.println((sysPwd.equals(priPwd)) ? "성공" : "실패");
		
		
		
		
	}

}









