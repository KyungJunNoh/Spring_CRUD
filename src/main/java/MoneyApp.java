import Service.MemberService;
import Service.MoneyService;
import member.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MoneyApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MoneyService moneyService = applicationContext.getBean("moneyService",MoneyService.class);
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);

        Long idx = 1L;
        Member member = new Member(idx,"NGJ","1234");
        memberService.join(member);

        moneyService.pay(idx,10000);
        moneyService.findList(1L);
    }
}
