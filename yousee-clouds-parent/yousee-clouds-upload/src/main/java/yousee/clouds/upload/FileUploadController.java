package yousee.clouds.upload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import yousee.clouds.common.core.bean.R;

import java.io.IOException;

@RestController
public class FileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public R handleFileUpload(@RequestParam(value = "file", required = true) MultipartFile file) throws IOException {


        byte[] bytes = file.getBytes();


        return R.ok().data(bytes.length).remark(file.getOriginalFilename());

    }
}
