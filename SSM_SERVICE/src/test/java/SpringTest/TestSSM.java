package SpringTest;


import cq.service.AccountService;
import cq.service.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:spring-tx.xml"})
public class TestSSM {
   @Resource
  private AccountService updateAcocunt;


    @Test
    public void run(){
        updateAcocunt.transfer(1,2,100);
    }
}
