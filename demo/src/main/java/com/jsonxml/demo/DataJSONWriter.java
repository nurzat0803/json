package com.jsonxml.demo;

import com.jsonxml.demo.entity.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.json.*;

public class DataJSONWriter {
    public static void main(String[] args) throws FileNotFoundException {

        Creation creation = createCreation();
        Method method = createMethod();
        Process1 process = createProcess1();
        Layer layer = createLayer();
        Type type = createType();


        JsonObjectBuilder creationBuilder = Json.createObjectBuilder();
        JsonObjectBuilder processBuilder = Json.createObjectBuilder();
        JsonObjectBuilder startBuilder = Json.createObjectBuilder();
        JsonObjectBuilder methodBuilder = Json.createObjectBuilder();
        JsonObjectBuilder layerBuilder = Json.createObjectBuilder();
        JsonObjectBuilder typeBuilder = Json.createObjectBuilder();


        JsonArrayBuilder assemblyBuilder = Json.createArrayBuilder();

//        for (String assembly : method.getAssembly()) {
//            assemblyBuilder.add(assembly);
//        }

        processBuilder.add("data", process.getStart().getData())
                .add("epoch", process.getStart().getData());

        methodBuilder.add("id", process.getName())
                .add("name", process.getId());

        processBuilder.add("start", startBuilder);

        JsonObject methodJsonObject = methodBuilder.build();

        System.out.println("Data JSON String\n"+methodJsonObject);

        //write to file
        OutputStream os = new FileOutputStream("data.xml");
        JsonWriter jsonWriter = Json.createWriter(os);
       
        jsonWriter.writeObject(methodJsonObject);
        jsonWriter.close();
    }

    private static Method createMethod() {
        Method method = new Method();
        method.setName("001");
        method.setType("Test_method");
        method.setAssembly("assembly_test");

        return method;
    }

    private static Layer createLayer() {
        Layer layer = new Layer();
        layer.setDailyScheduler("dailyScheduler_test");

        return layer;
    }

    public static Process1 createProcess1() {

        Process1 process1 = new Process1();
        process1.setName("Test_process");
        process1.setId(10);

        Start add = new Start();
        add.setData("Bangalore");
        add.setEpoch(01);

        return process1;
    }

    public static Creation createCreation() {
        Creation creation= new Creation();
        creation.setEpoch(001);
        creation.setData("Test_creation");

        return creation;
    }

    private static Type createType() {
        Type type = new Type();
        type.setInformation("information_test");

        return type;
    }
}