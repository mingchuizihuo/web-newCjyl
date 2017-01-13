package com.idea.cjyl.core.util;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.CustomSerializerFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 返回JSON 数据时 时间类型格式化
 */
public class CustomObjectMapper extends ObjectMapper {
  
    public CustomObjectMapper(){  
        CustomSerializerFactory factory = new CustomSerializerFactory();
        factory.addGenericMapping(Date.class, new JsonSerializer<Date>(){
            @Override  
            public void serialize(Date value,   
                    JsonGenerator jsonGenerator,
                    SerializerProvider provider)
                    throws IOException, JsonProcessingException {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                jsonGenerator.writeString(sdf.format(value));  
            }  
        });  
        this.setSerializerFactory(factory);  
    }  
}  