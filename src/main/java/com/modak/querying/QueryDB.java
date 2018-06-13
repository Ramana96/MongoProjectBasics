package com.modak.querying;

import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;

public class QueryDB {

    public static void main(String[] args) {
        MongoClient mongoClient = null;
        try {
            mongoClient = new MongoClient("192.168.174.128", 27017);
            MongoDatabase mongoDatabase = mongoClient.getDatabase("database");
            MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("collection");
            Document qDoc=new Document();
            qDoc.append("first",1);
            FindIterable<Document> cursor = mongoCollection.find().showRecordId(true);
            System.out.println("query doc count  "+mongoCollection.count(qDoc));

            System.out.println("count in collection-- "+mongoCollection.count());
            Iterator<Document> iterator = cursor.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }

        }
        catch (Exception e) {

        }
        finally {
            mongoClient.close();
        }
    }

}
