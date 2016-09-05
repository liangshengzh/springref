package cn.devlab.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

/**
 * Created by zhong on 8/29/16.
 */
@Service
public class MyService {

    private ConversionService conversionService;

    @Autowired
    public MyService(ConversionService conversionService) {

        this.conversionService = conversionService;
    }

    public void doit(){
        //this.conversionService.convert()
    }

}
