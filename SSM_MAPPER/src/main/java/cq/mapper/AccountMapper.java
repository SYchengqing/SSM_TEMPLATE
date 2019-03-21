package cq.mapper;


import cq.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {

     void updateAccount(int id, double money);

     List<Account> seletAccount();

     Account  selectOneAccount(@Param("id") int id, @Param("name") String name);
}
