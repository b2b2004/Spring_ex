package com.example.springex1.member;

import com.example.springex1.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {
//    MemberService memberService = new MemberServiceImpl(memberRepository);

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given (이런 환경이 주어지면)
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when (이렇게 했을때)
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then (이렇게 된다)
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}

