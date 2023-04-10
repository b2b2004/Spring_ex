package com.example.springex1.discount;

import com.example.springex1.member.Grade;
import com.example.springex1.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {

        if(member.getGrade() == Grade.VIP)
        {
            return discountFixAmount;
        }else{
            return 0;
        }
    }
}
