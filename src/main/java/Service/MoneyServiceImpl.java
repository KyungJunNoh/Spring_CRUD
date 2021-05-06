package Service;

import Repository.MemoryMoneyRepository;
import Repository.MoneyRepository;
import lombok.RequiredArgsConstructor;
import member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor  //@RequiredArgsConstructor 이 어노테이션은 초기화되지 않은 final 필드나, @NotNull이 붙은 필에 대해 생성자를 주입
@Service
public class MoneyServiceImpl implements MoneyService {

    private final MoneyRepository moneyRepository; // @RequiredArgsConstructor 어노테이션에 의해 생성를 주입

    @Override
    public void pay(Member member,Long money) {
        moneyRepository.save(member,money);
    }

    @Override
    public void find(Member member){
        moneyRepository.find(member);
    }

    @Override
    public void modify(Member member, Long money) {
        moneyRepository.modify(member,money);
    }
}
