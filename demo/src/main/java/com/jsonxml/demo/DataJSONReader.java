package com.jsonxml.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import com.jsonxml.demo.entity.*;

public class DataJSONReader {

    public static final String JSON_FILE="data.xml";

    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream(JSON_FILE);

        JsonReader jsonReader = Json.createReader(fis);

        JsonObject jsonObject = jsonReader.readObject();

        jsonReader.close();
        fis.close();

        Method method = new Method();
        method.setName(jsonObject.getString("name"));
        method.setType(jsonObject.getString("type"));

        //reading arrays from json
        JsonArray jsonArray = jsonObject.getJsonArray("assembly");
        char[] test = new char[jsonArray.size()];
        int index = 0;
        for(JsonValue value : jsonArray){
           test[index++] = (char) Long.parseLong(value.toString());
        }
        method.setAssembly(Arrays.toString(test));


        Process1 process = new Process1();
        process.setName(jsonObject.getString("name"));
        process.setId(jsonObject.getInt("id"));


        //reading inner object from json object
        JsonObject innerJsonObject = jsonObject.getJsonObject("start");
        Start start = new Start();
        start.setEpoch(innerJsonObject.getInt("epoch"));
        start.setData(innerJsonObject.getString("data"));
        process.setStart(start);

        //print employee bean information
        System.out.println(process);

        Layer layer = new Layer();
        layer.setDailyScheduler(jsonObject.getString("dailyScheduler"));

        Creation creation = new Creation();
        creation.setEpoch(innerJsonObject.getInt("epoch"));
        creation.setData(innerJsonObject.getString("data"));

        Type type = new Type();
        type.setInformation(jsonObject.getString("information"));

    }
}