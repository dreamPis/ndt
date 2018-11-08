package com.ndt.sms.service.impl;

import com.ndt.sms.common.FastDFSClient;
import com.ndt.sms.common.bean.FastDFSFile;
import com.ndt.sms.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.csource.fastdfs.FileInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author ser7en
 * @Date 2018-10-15 17:13
 * @version：
 * @Desc：
 */
@Slf4j
@Service
public class FileServiceImpl implements FileService {
    @Override
    public FileInfo getFile(String groupName, String remoteFileName) {
        return FastDFSClient.getFile(groupName, remoteFileName);
    }

    public String saveFile(MultipartFile multipartFile) throws IOException {
        String[] fileAbsolutePath={};
        String fileName=multipartFile.getOriginalFilename();
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
        byte[] file_buff = null;
        InputStream inputStream=multipartFile.getInputStream();
        if(inputStream!=null){
            int len1 = inputStream.available();
            file_buff = new byte[len1];
            inputStream.read(file_buff);
        }
        inputStream.close();
        FastDFSFile file = new FastDFSFile(fileName, file_buff, ext);
        try {
            fileAbsolutePath = FastDFSClient.upload(file);  //upload to fastdfs
        } catch (Exception e) {
            log.error("upload file Exception!",e);
        }
        if (fileAbsolutePath==null) {
            log.error("upload file failed,please upload again!");
        }
        String path=fileAbsolutePath[0]+ "/"+fileAbsolutePath[1];
        return path;
    }

    @Override
    public InputStream downFile(String groupName, String remoteFileName) {
        return FastDFSClient.downFile(groupName, remoteFileName);
    }
}
