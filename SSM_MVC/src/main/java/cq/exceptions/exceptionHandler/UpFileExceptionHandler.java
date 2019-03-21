package cq.exceptions.exceptionHandler;


import cq.exceptions.selfdefinedexception.UpFileException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpFileExceptionHandler implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if(ex instanceof UpFileException){
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.addObject("errormessage",ex.getMessage());
            modelAndView.setViewName("file/error");
            return modelAndView;
        }
        return null;
    }
}
