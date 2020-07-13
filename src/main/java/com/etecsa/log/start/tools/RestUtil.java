package com.etecsa.log.start.tools;/**
 * @author xiey
 * @date 2020/7/13 15:42
 */

import com.etecsa.feign.log.message.RestResponse;
import com.etecsa.log.start.message.ErrorCodeAndMsg;

/**
 * @author xiey
 * @date 2020/7/13
 */
public class RestUtil {

    public static RestResponse fail(ErrorCodeAndMsg codeAndMsg){
        return new RestResponse(codeAndMsg.getCode(),codeAndMsg.getMsg());
    }
}
