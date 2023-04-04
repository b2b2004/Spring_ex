package com.example.springex1;

import com.example.springex1.discount.DiscountPolicy;
import com.example.springex1.discount.FixDiscountPolicy;
import com.example.springex1.discount.RateDiscountPolicy;
import com.example.springex1.member.MemberRepository;
import com.example.springex1.member.MemberService;
import com.example.springex1.member.MemberServiceImpl;
import com.example.springex1.member.MemoryMemberRepository;
import com.example.springex1.order.OrderService;
import com.example.springex1.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // 생성자 주입
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
       //  return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
