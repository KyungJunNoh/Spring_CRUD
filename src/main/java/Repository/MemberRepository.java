package Repository;

import member.Member;

public interface MemberRepository {
    void save(Member member);

    void findById(Long memberIdx);

    void UpdateMember(Long memberIdx, Member updateMamber);

    void DeleteMember(Long memberIdx);
}
