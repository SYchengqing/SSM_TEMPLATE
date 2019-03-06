package cq.service;

import cq.mapper.AccountMapper;
import cq.pojo.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;


    public void transfer(Account from, Account to, double money) {

    }

    public void updateAcocunt(int id,double money) {

        accountMapper.updateAccount(id, money);
        System.out.println("haha");

    }
}
