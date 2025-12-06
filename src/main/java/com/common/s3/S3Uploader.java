package com.common.s3;

import org.springframework.web.multipart.MultipartFile;

public interface S3Uploader {

    String upload(MultipartFile file, String dirName);

    void delete(String fileUrl);
}
