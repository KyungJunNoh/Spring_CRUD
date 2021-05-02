package Service;

import Repository.MemoryMoneyRepository;
import Repository.MoneyRepository;
import member.Member;
import org.springframework.beans.factory.annotation.Autowired;

public class MoneyServiceImpl implements MoneyService {

    //final 붙이면 안되는이유?
    private MoneyRepository moneyRepository = new MemoryMoneyRepository();

    @Autowired
    public MoneyServiceImpl(MoneyRepository moneyRepository) {
        this.moneyRepository = moneyRepository;
    }

    @Override
    public void pay(Long idx,Integer money) {
        moneyRepository.save(idx,money);
    }

    @Override
    public void findList(Long idx){
        moneyRepository.find(idx);
    }
}
