package cq.service;

import cq.pojo.Account;

public interface AccountService {
    //转钱
    void transfer(Account from, Account to, double money);
    //更新账户信息
    void updateAcocunt(int id, double money);
}
