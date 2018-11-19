package com.xhe.cloud.order.utils;

import com.xhe.cloud.order.vo.ResultVo;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:44
 * @Description:
 */
public class ResultVoUtil {

    public static ResultVo ok(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(obj);
        return resultVo;
    }
}
