package com.example.springex1.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
