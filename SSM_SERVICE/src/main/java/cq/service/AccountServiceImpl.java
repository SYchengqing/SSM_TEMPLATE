package cq.service;

import cq.mapper.AccountMapper;
import cq.pojo.Account;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    public void transfer(int from, int to, double money) {
        updateAcocunt(from,money);
//        System.out.println(1/0);
        updateAcocunt(to,-money);
    }

    public List<Account> getAccount() {
        return accountMapper.seletAccount();
    }

    public Account getAccount(int id, String name) {
        return accountMapper.selectOneAccount(id,name);
    }

    public void updateAcocunt(int id, double money) {

        accountMapper.updateAccount(id, money);


    }
}
