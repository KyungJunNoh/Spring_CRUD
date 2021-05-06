package Service;

import lombok.RequiredArgsConstructor;
import member.Member;
import Repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service // @Service 어노테이션을 붙이는 이유는 일종의 가독성을 위하여 붙임
@RequiredArgsConstructor //@RequiredArgsConstructor 이 어노테이션은 초기화되지 않은 final 필드나, @NotNull이 붙은 필에 대해 생성자를 주입
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository; // @RequiredArgsConstructor 어노테이션에 의해 생성자를 주입

    @Override
    public Member join(Member member){
        return memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberIdx) {
         return memberRepository.findById(memberIdx);
    }

    @Override
    public Member UpdateMember(Long memberIdx, Member updateMamber) {
        memberRepository.UpdateMember(memberIdx,updateMamber);
        return updateMamber;
    }

    @Override
    public Member DeleteMember(Long memberIdx) {
        return memberRepository.DeleteMember(memberIdx);
    }

}
