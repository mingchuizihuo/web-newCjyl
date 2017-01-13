package com.idea.cjyl.core.generic;

import com.idea.cjyl.core.common.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 10238 on 2016/10/13.
 */
public class GenericController{




    public ResultData returnResult(boolean flag, ResultData... result) {
        ResultData re = null;
        if (result.length > 0) {
            re = result[0];
        } else {
            re = ResultData.build();
        }
        if (flag) {
            return re;
        } else {
            return re.failure();
        }
    }



}
