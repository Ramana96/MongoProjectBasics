//package com.modak;
//
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.util.JSON;
//import org.apache.commons.io.FileUtils;
//import org.bson.Document;
//import org.bson.json.JsonWriter;
//
//import java.io.File;
//import java.nio.charset.Charset;
//
//public class InsertDemo {
//
//    public static void main(String[] args) {
//        try {
//            MongoClient mongoClient = new MongoClient("192.168.233.151", 27017);
//            MongoDatabase mongoDatabase = mongoClient.getDatabase("ramana");
//            MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("demoInsert");
//            String demoString = FileUtils
//                .readFileToString(new File("C:\\Workarea\\Configs\\ChangedConfigs\\impala_bot_config.json"),
//                    Charset.defaultCharset());
//            Document d=new Document();
//            d=(Document) JSON.serialize(demoString)
////            mongoCollection.insertOne() ;
//
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//}
