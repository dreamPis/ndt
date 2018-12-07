package com.ndt.sms.controller;

import com.ndt.sms.service.FileService;
import com.ndt.sms.service.PublisherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @Author ser7en
 * @Date 2018-10-09 15:10
 * @version：
 * @Desc：
 */
@Slf4j
@RestController
public class SmSController {

    @Autowired
    private PublisherService publisherService;
    @Autowired
    private FileService fileService;

    /**
     * push 消息
     * @return
     */
    @PostMapping("/recv")
    public String pushMsg(String data){
        return publisherService.pushMsg("你好啊");
    }

    @PostMapping("/upload")
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "error";
        }
        try {
            // Get the file and save it somewhere
            String path=fileService.saveFile(file);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
            redirectAttributes.addFlashAttribute("path",
                    "file path url '" + path + "'");
        } catch (Exception e) {
            log.error("upload file failed",e);
        }
        return "suss";
    }

    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadFile(HttpServletRequest request, HttpServletResponse response) {
        try {
            String group = "group1";
            String rem = "M00/00/02/wKgPDFvEXmGASNyOAEMFS5R27-M470.png";
            InputStream inputStream = fileService.downFile(group, rem);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = inputStream.read(buffer)) != -1){
                out.write(buffer, 0, len);
            }
            out.close();
            inputStream.close();
            ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.ok();
            bodyBuilder.contentType(MediaType.IMAGE_JPEG);
            bodyBuilder.contentLength(out.toByteArray().length);
            return bodyBuilder.body(out.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
