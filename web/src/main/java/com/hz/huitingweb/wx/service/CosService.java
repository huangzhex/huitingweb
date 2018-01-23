package com.hz.huitingweb.wx.service;

import com.hz.huitingweb.common.util.DateUtils;
import com.hz.huitingweb.common.util.StringUtils;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.model.COSObject;
import com.qcloud.cos.model.ObjectMetadata;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

/**
 * 腾讯云存储
 * Created by huangzhe on 2018/1/17.
 */
@Service
public class CosService {
    private static final Logger logger = LoggerFactory.getLogger(CosService.class);
    @Value("${tencent.bucketFile}")
    private String bucketFile;//存储文件
    @Value("${tencent.bucketImage}")
    private String bucketImage;//存储图片
    @Value("${tencent.secretId}")
    private String secretId;
    @Value("${tencent.secretKey}")
    private String secretKey;
    @Value("${tencent.appid}")
    private String appid;

    public String updateImageUrl(String urlStr) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(3 * 1000);
        InputStream inputStream = conn.getInputStream();
        String tag = updateImageFile(inputStream, conn.getContentLengthLong(), DateUtils.formatDate(new Date(), "yyyyMMddHHmmss") + ".jpg");
        inputStream.close();
        return tag;
    }

    private String baseUpdateFile(String bucketName, InputStream inputStream, long contentLength, String type, String filePath) {
        COSCredentials crd = new BasicCOSCredentials(secretId, secretKey);
        ClientConfig config = new ClientConfig(new Region("ap-shanghai"));
        COSClient cosClient = new COSClient(crd, config);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentType(type);
        objectMetadata.setContentLength(contentLength);
        String bucketNames = bucketName + "-" + appid;
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketNames, filePath, inputStream, objectMetadata);
        PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
        cosClient.shutdown();
        return putObjectResult.getETag();
    }

    /**
     * 上传图片
     *
     * @param inputStream
     * @param filePath
     */
    private String updateImageFile(InputStream inputStream, long contentLength, String filePath) {
        return baseUpdateFile(bucketImage, inputStream, contentLength, "image/jpeg", filePath);
    }

}
