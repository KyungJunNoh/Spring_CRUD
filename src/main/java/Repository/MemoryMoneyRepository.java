package Repository;

import member.Member;

import java.util.HashMap;

public class MemoryMoneyRepository implements MoneyRepository {
    HashMap<Long, Integer> hashMoney = new HashMap<Long, Integer>();

    @Override
    public void save(Long idx, Integer money) {
        hashMoney.put(idx,money);
    }
    
    @Override
    public void find(Long idx){
        hashMoney.get(idx);
        System.out.println("hashMoney.get(idx) = " + hashMoney.get(idx));
    }
}
