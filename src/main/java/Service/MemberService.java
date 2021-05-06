package Service;

import member.Member;
import org.springframework.stereotype.Service;

@Service // @Service 어노테이션을 붙이는 이유는 일종의 가독성을 위하여 붙임
public interface MemberService {
    Member join(Member member);

    Member findMember(Long memberIdx);

    Member UpdateMember(Long memberIdx, Member updateMember);

    Member DeleteMember(Long memberIdx);
}
