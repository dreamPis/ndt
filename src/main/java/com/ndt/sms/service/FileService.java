package com.ndt.sms.service;

import org.csource.fastdfs.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author ser7en
 * @Date 2018-10-15 17:13
 * @version：
 * @Desc：
 */
public interface FileService {

    public String saveFile(MultipartFile multipartFile) throws IOException;

    public FileInfo getFile(String groupName, String remoteFileName);

    public InputStream downFile(String groupName, String remoteFileName);

}
