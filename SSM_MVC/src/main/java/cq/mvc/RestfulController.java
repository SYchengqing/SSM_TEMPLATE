package cq.mvc;

import cq.pojo.Account;
import cq.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;



@RequestMapping("account")
@Controller
public class RestfulController {

    @Resource
    private AccountService accountService;

    @RequestMapping("{id}/{name}")
    @ResponseBody
    public Account getAccount(@PathVariable int id,@PathVariable String name){
        Account account = accountService.getAccount(id, name);
        return account;
    }
}
