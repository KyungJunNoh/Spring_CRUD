import Repository.MemberRepository;
import Repository.MemoryMemberRepository;
import Repository.MemoryMoneyRepository;
import Repository.MoneyRepository;
import Service.MemberService;
import Service.MemberServiceImpl;
import Service.MoneyService;
import Service.MoneyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration : 빈 팩토리를 위한 오브젝트 설정을 담당하는 클래스
//@Bean : 오브젝트를 만들어 주는 메소드

@Configuration //MemberApp , MoneyApp
public class AppConfig {
    @Bean
    public MemberService memberService(){
        System.out.println("Call Appconfig");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        System.out.println("Call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public MoneyService moneyService(){
        System.out.println("Call Appconfig.moneyService");
        return new MoneyServiceImpl(moneyRepository());
    }

    @Bean
    public MoneyRepository moneyRepository(){
        System.out.println("Call Appconfig.moneyRepository");
        return new MemoryMoneyRepository();
    }
}
