import Service.MemberService;
import Service.MoneyService;
import member.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MoneyApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); // @Configuration 어노테이션이 붙은 클래스를 설정 정보로 사용 , Appconfig를 사용하기위한 생성자(?) 생성
        MoneyService moneyService = applicationContext.getBean("moneyService",MoneyService.class);
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);

        Long idx = 1L;
        Member member = new Member(idx,"NGJ","1234");
        memberService.join(member);

        //======================================//

        moneyService.pay(member,10000L);

        moneyService.find(member);

        moneyService.modify(member,20000L);

        moneyService.find(member);

    }
}
