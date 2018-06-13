//package com.modak.JsonParsing;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.commons.io.FileUtils;
//import org.bson.Document;
//import org.json.JSONObject;
//import org.json.XML;
//
//import java.io.File;
//import java.nio.charset.Charset;
//import java.util.HashMap;
//
//public class Parsingjson {
//
//    public static void main(String[] args) throws Exception {
//        String demoString = FileUtils
//                .readFileToString(new File("C:\\Workarea\\Notes\\TextNotes\\retaurants\\retaurants.json"),
//                    Charset.defaultCharset());
//        HashMap<Object,Object> result =
//            new ObjectMapper().readValue(demoString, HashMap.class);
//        System.out.println(result);
////        Document document=new Document(result);
////        System.out.println(result);
////        String json=new ObjectMapper().writeValueAsString(result);
////        JSONObject JJ=new JSONObject(json);
////        System.out.println("json object  "+JJ);
//////        System.out.println(result.get("messagebus_config") instanceof HashMap);
//
//
////      building json  ------------------------------------------
//        JSONObject jsonObject=new JSONObject();
//        JSONObject outerJson =new JSONObject();
//        jsonObject.append("name","key");
//        jsonObject.put("inte",13);
//        jsonObject.append("name",166);
//        outerJson.put("inner_json",jsonObject);
////        System.out.println(outerJson );
//
//
//        String xmlSt=FileUtils.readFileToString(new File("C:\\Workarea\\workspace\\Java Practice\\MongoPractice\\src\\main\\resources\\sample.xml"),Charset.defaultCharset());
//        jsonObject= XML.toJSONObject(xmlSt);
////        System.out.println("xml to json  "+jsonObject);
//
//    }
//}
