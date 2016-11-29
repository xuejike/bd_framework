package com.bidanet.bdcms.controller;

import com.bidanet.bdcms.core.bean.ApiResult;
import com.bidanet.bdcms.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xuejike on 2016/11/29.
 */
@Controller
public class HomeController extends BaseController {

    @RequestMapping("/login")
    public ApiResult<String> login(){
        return ApiResult.error("-->");
    }
}
