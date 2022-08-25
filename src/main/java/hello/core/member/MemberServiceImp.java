package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImp implements MemberService{

    private final MemberRepository memberRepository;

    // 생성자를 통해서 MeberRepository 구현체가 무엇이 들어갈지 설정해준다.
    // MemberServiceImp 코드에 MemoryMemberRepository가 없는 것을 확인할 수 있다.
    // 추상화에 의존하면서 DIP를 지킬 수 있게 된다.
    // 이를 생성자 주입이라고 한다.
    @Autowired
    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

}
