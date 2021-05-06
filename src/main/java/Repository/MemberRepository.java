package Repository;

import member.Member;
import org.springframework.stereotype.Repository;


public interface MemberRepository {
    Member save(Member member);

    Member findById(Long memberIdx);

    Member UpdateMember(Long memberIdx, Member updateMamber);

    Member DeleteMember(Long memberIdx);
}
