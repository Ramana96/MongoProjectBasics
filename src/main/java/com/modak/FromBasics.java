//package com.modak;
//
//import com.mongodb.BasicDBObject;
//import com.mongodb.DocumentToDBRefTransformer;
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//public class FromBasics {
//
//    public static void main(String[] args) {
//        MongoClient mongoClient = null;
//        try {
//            mongoClient = new MongoClient("192.168.174.128", 27017);
//            MongoDatabase mongoDatabase = mongoClient.getDatabase("database");
//            MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("collection");
//            Document document = new Document();
//            document.append("_id", 2);
//            document.append("thord", 3);
//            document.append("fourth", 4);
//            for (int i = 100; i < 200; i++) {
//                mongoCollection.insertOne(new Document("value", "name  "+i));
//            }
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//
//        }
//        finally {
//            mongoClient.close();
//        }
//    }
//
//}
