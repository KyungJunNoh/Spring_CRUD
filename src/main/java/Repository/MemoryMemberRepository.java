package Repository;

import member.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MemoryMemberRepository implements MemberRepository {
    HashMap<Long, Member> hashMember = new HashMap<Long, Member>();

    @Override
    public Member save(Member member) {
        return hashMember.put(member.getIdx(), member);
    }

    @Override
    public Member findById(Long memberIdx) {
        return hashMember.get(memberIdx);
    }

    @Override
    public Member UpdateMember(Long memberIdx, Member updateMamber) {
        return hashMember.replace(memberIdx,updateMamber);
    }

    @Override
    public Member DeleteMember(Long memberIdx) {
        return hashMember.remove(memberIdx);
    }
}
