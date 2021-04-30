package Repository;

import member.Member;

import java.util.HashMap;

public class MemoryMemberRepository implements MemberRepository {
    HashMap<Long, Member> hashMember = new HashMap<Long, Member>();

    @Override
    public void save(Member member) {
        hashMember.put(member.getId(), member);
    }

    @Override
    public void findById(Long memberIdx) {
        hashMember.get(memberIdx);
        System.out.println("hashMember.get(memberId) = " + hashMember.get(memberIdx));
    }

    @Override
    public void UpdateMember(Long memberIdx, Member updateMamber) {
        hashMember.replace(memberIdx,updateMamber);
    }

    @Override
    public void DeleteMember(Long memberIdx) {
        hashMember.remove(memberIdx);
    }


}
