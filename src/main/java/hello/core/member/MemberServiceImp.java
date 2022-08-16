package hello.core.member;

public class MemberServiceImp implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    // 구현 객체를 선택해서 MemberRepository 선언

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
