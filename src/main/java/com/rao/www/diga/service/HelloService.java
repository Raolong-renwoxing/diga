package com.rao.www.diga.service;

import com.rao.www.diga.exception.BusinessException;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


/**
 * @author Rao QingLong
 */
@Service
public class HelloService {

    public String sayHello(String call) {
        return call;
    }

}
