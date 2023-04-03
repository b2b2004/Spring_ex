package com.example.springex1.discount;

import com.example.springex1.member.Member;

public interface DiscountPolicy {
    // @return 할인 대상 금액
    int discount(Member member, int price);
}
