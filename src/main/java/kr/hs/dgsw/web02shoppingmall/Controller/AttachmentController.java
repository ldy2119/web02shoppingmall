package kr.hs.dgsw.web02shoppingmall.Controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;

@RestController
public class AttachmentController {

    @GetMapping("/attachment/{id}")
    public void download(@PathVariable String id, HttpServletRequest request, HttpServletResponse response){
        try {
            String filepath = "C:\\Users\\Quote\\IdeaProjects\\web02shoppingmall\\src\\main\\resources\\Image\\" + id;
            File file = new File(filepath);
            if (file.exists() == false) return;
            String mimeType = URLConnection.guessContentTypeFromName(file.getName());
            if (mimeType == null) {
                mimeType = "application/octet-stream";
            }
            response.setContentType(mimeType);
            response.setHeader("Content-Desposition", "inline; filename=\""
            + id);

            response.setContentLength((int) file.length());
            InputStream is = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(is, response.getOutputStream());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
