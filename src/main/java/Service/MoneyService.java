package Service;

import member.Member;

public interface MoneyService {
    void pay(Member member,Long money);

    void find(Member member);

    void modify(Member member,Long money);

}
