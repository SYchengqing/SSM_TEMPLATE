package cq.service;

import cq.pojo.Account;

import java.util.List;

public interface AccountService {
    //转钱
    void transfer(int from, int to, double money);
    //更新账户信息
    void updateAcocunt(int id, double money);

    //获取账户信息
    List<Account> getAccount();

    //获取单个账户信息
    Account getAccount(int id,String name);
}
