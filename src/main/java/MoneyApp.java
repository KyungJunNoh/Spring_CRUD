import Service.MemberService;
import Service.MemberServiceImpl;
import Service.MoneyService;
import Service.MoneyServiceImpl;
import member.Member;

public class MoneyApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        MoneyService moneyService = new MoneyServiceImpl();

        Long idx = 1L;
        Member member = new Member(idx,"NGJ","1234");
        memberService.join(member);

        moneyService.pay(idx,10000);

    }
}
