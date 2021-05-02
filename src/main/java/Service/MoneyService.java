package Service;

import member.Member;

public interface MoneyService {
    void pay(Long idx,Integer money);
    void findList(Long idx);
}
