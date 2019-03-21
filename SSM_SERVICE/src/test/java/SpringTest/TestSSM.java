package SpringTest;


import cq.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-service.xml"})
public class TestSSM {
   @Resource
  private AccountService updateAcocunt;


    @Test
    public void run(){
        updateAcocunt.transfer(1,2,100);
    }


    }
