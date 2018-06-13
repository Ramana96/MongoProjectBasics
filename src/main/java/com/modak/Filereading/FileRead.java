//package com.modak.Filereading;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.mongodb.DBObject;
//import com.mongodb.util.JSON;
//import org.bson.Document;
//import org.json.JSONObject;
//
//import java.io.*;
//import java.nio.Buffer;
//import java.util.HashMap;
//import java.util.Map;
//
//public class FileRead {
//
//    public static void main(String[] args) {
//
//        try {
//            File file = new File("C:\\Workarea\\Notes\\TextNotes\\retaurants\\retaurants.json");
//
//            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
//            String lineData;
//            HashMap hashMap;
//            while ((lineData=bufferedReader.readLine())!=null){
////                System.out.println(lineData);
//
//
////                JSONObject jsonObject=new JSONObject(lineData);
//////                System.out.println(jsonObject instanceof JSONObject);
//////                System.out.println(jsonObject);
//                hashMap=new ObjectMapper().readValue(lineData, new TypeReference<Map<Object,Object>>(){});
//                Document document=new Document();
//                System.out.println(hashMap);
//                System.out.println(document);
//
//            }
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
