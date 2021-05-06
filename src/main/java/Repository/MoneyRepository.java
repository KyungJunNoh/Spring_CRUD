package Repository;

import member.Member;
import org.springframework.stereotype.Repository;


public interface MoneyRepository {
    void save(Member member,Long money);
    void find(Member member);
    void modify(Member member,Long money);
}
