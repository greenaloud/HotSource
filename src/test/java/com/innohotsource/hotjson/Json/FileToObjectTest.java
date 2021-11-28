package com.innohotsource.hotjson.Json;

import com.innohotsource.hotjson.Json.sample.Sample;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

public class FileToObjectTest {
    @Test
    void fromFile() throws IllegalAccessException {
        String pwd = "./src/test/java/com/innohotsource/hotjson/Json/samplefile/Sample.json";
        FileToObject file = new FileToObject(pwd);

        Sample sample = new Sample();
        sample = (Sample) file.getFile(sample);
        System.out.println("sample = " + sample);

    }
}
