package cq.mvc;

import cq.pojo.Account;
import cq.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class MVCtest {

    @Resource
    AccountService accountService;

//    @RequestMapping("/Hello")
//    public ModelAndView Hello(){
//
//        ModelAndView modelAndView = new ModelAndView();
//        List<Account> account = accountService.getAccount();
//        modelAndView.addObject("account",account);
//        return modelAndView;
//    }
    @RequestMapping("hello")
    public String Hello(Model model,ModelAndView mv){


        List<Account> account = accountService.getAccount();
        model.addAttribute("message",account);
        mv.setViewName("HHHH");
        return "restModel";
    }

    @RequestMapping("restModel")
    @ResponseBody
    public List<Account> t(){
        List<Account> account = accountService.getAccount();
        System.out.println("!!!!!!!!!!!!!!!!"+account);
        return account;
    }

    @RequestMapping(value = "restModel1",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String t1(){

        return "撒阿萨";
    }



}
