package SpringTest;


import cq.service.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSSM {
   @Resource
  private AccountServiceImpl updateAcocunt;


    @Test
    public void run(){
        updateAcocunt.updateAcocunt(1,100);
    }
}
