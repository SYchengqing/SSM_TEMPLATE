package cq.mvc;

import cq.exceptions.selfdefinedexception.UpFileException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RequestMapping("file")
@Controller
public class FileController {
    @RequestMapping("upLoadFile")
    public ModelAndView upLoadFile(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("upFile");
        return mv;
    }
    @RequestMapping("fileHandler")
    public String getFile(Model model, MultipartFile file) throws Exception {

        if(file.getOriginalFilename()!=""){
            String base="H:\\Program Files\\code\\SSM_TEMPLATE\\SSM_MVC\\src\\main\\webapp\\WEB-INF\\jsp\\file\\fileResouce\\";
            File saveFilePath=new File(base);
            if(!saveFilePath.exists()){
                saveFilePath.mkdir();
            }
            int index=file.getOriginalFilename().lastIndexOf(".");
            String suffix=file.getOriginalFilename().substring(index);
            String newName= UUID.randomUUID().toString()+suffix;
            File saveFile = new File(base+newName);
            try {
                file.transferTo(saveFile);
            } catch (IOException e) {

                throw new UpFileException("transferTo fail"+ e.getMessage());
            }
            return "file/sucess";
        }
        throw new UpFileException("file is null");
    }
}
