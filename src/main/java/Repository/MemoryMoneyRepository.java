package Repository;

import member.Member;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MemoryMoneyRepository implements MoneyRepository {
    HashMap<Member, Long> hashMoney = new HashMap<Member, Long>();

    @Override
    public void save(Member member, Long money) {
        hashMoney.put(member,money); // hashMoney Hashmap<> 에 key,value를 대입
    }
    
    @Override
    public void find(Member member){
        hashMoney.get(member);
        System.out.println("hashMoney.get(member) = " + hashMoney.get(member));
    }

    @Override
    public void modify(Member member, Long money) {
        hashMoney.replace(member,money);
    }
}
