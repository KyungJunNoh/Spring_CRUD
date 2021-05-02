package Repository;

import member.Member;

public interface MoneyRepository {
    void save(Long idx,Integer money);
    void find(Long idx);
}
