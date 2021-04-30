
import Service.MoneyService;
import Service.MoneyServiceImpl;
import member.Member;
import Service.MemberService;
import Service.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args){
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L,"NGJ","1234");

        // JOIN (회원 가입) C
        memberService.join(member);

        //회원 찾기(find) R
        memberService.findMember(1L);

        //U
        member.setName("hello");
        memberService.UpdateMember(1L, member);

        memberService.findMember(1L);

        //D
        memberService.DeleteMember(1L);
    }
}
