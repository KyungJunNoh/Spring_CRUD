package Service;

import member.Member;

public interface MemberService {
    void join(Member member);

    void findMember(Long memberIdx);

    void UpdateMember(Long memberIdx, Member updateMember);

    void DeleteMember(Long memberIdx);
}
