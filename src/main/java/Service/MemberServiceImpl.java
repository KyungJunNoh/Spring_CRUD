package Service;

import member.Member;
import Repository.MemberRepository;
import Repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member){
        memberRepository.save(member);
    }

    @Override
    public void findMember(Long memberIdx) {
         memberRepository.findById(memberIdx);
    }

    @Override
    public void UpdateMember(Long memberIdx, Member updateMamber) {
        memberRepository.UpdateMember(memberIdx,updateMamber);
    }

    @Override
    public void DeleteMember(Long memberIdx) {
        memberRepository.DeleteMember(memberIdx);
    }

}
