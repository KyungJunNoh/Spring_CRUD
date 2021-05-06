
import Service.MoneyService;
import Service.MoneyServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import member.Member;
import Service.MemberService;
import Service.MemberServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MemberApp {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);  // @Configuration 어노테이션이 붙은 클래스를 설정 정보로 사용 , Appconfig를 사용하기위한 생성자(?) 생성
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);  // MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L,"NGJ","1234");
        //C
        memberService.join(member);

        //R
        Member findmember = memberService.findMember(1L); // 얻고싶은 Value의 Key값을 전송하여 그 Key에 맞는 Value(멤버)를 findmember 변수에 저장
        System.out.println("findmember.getName() = " + findmember.getName()); // memberIdx 가 1L에 해당하는 value의 Name을 불러옴

        //U
        member.setName("hello"); // member의 Name을 "hello"로 변경
        memberService.UpdateMember(1L, member); // memberIdx값과 멤버를 파라미터에 담아서 UpdateMember함수에 전송

        //D
        memberService.DeleteMember(1L); // memberIdx값을 보내어 DeleteMember 함수를 실행
    }
}
