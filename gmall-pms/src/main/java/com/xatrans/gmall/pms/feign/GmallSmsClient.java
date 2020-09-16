package com.xatrans.gmall.pms.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("sms-service")
public interface GmallSmsClient {//extends GmallSmsApi {


}
