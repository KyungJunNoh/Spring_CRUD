package Service;

import Repository.MemoryMoneyRepository;
import Repository.MoneyRepository;
import member.Member;

public class MoneyServiceImpl implements MoneyService {

    final private MoneyRepository MoneyRepository = new MemoryMoneyRepository();
    @Override
    public void pay(Long idx,Integer money) {
        MoneyRepository.save(idx,money);
    }
}
