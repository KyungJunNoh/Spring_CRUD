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

@Configuration
public class AppConfig {
    @Bean
    public MemberService memeberService(){
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
