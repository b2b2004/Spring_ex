package com.example.springex1;

import com.example.springex1.discount.FixDiscountPolicy;
import com.example.springex1.member.MemberService;
import com.example.springex1.member.MemberServiceImpl;
import com.example.springex1.member.MemoryMemberRepository;
import com.example.springex1.order.OrderService;
import com.example.springex1.order.OrderServiceImpl;

public class AppConfig {

    // 생성자 주입
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }

}
