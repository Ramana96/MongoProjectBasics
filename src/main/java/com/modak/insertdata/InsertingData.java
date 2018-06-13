package com.modak.insertdata;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.beans.binding.ObjectExpression;
import org.bson.Document;

import javax.print.Doc;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InsertingData {

    public static void main(String[] args) {
        InsertingData insertingData=new InsertingData();
        String filePathToInsert=args[0];
        String dbName=args[1];
        String collection=args[2];
        ArrayList<Document> docArray=insertingData.getArrayBson(filePathToInsert);
        boolean isInserted=insertingData.insertDB(docArray,dbName,collection);
        System.out.println("Data Inserted "+isInserted);


    }

    public ArrayList<Document> getArrayBson(String filePath) {
        BufferedReader bufferedReader = null;
        ArrayList<Document> documentArrayList = new ArrayList<Document>();
        try {
            Map<String, Object> map;
            ObjectMapper objectMapper = new ObjectMapper();

            bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
            String line;
            String replacedLine;
            while ((line = bufferedReader.readLine()) != null) {
                replacedLine = remove$(line);

                map = objectMapper.readValue(replacedLine, new TypeReference<HashMap<String, Object>>() {
                });
                documentArrayList.add(new Document(map));
            }
            System.out.println(documentArrayList.size());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        catch (JsonParseException e) {
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {

                bufferedReader.close();

            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        return documentArrayList;

    }


    public String remove$(String line) {
        System.out.println(line);
        Pattern pattern = Pattern.compile("\\$");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            line = matcher.replaceAll("");
            System.out.println(line);
        }

        return line;

    }


    public boolean insertDB(ArrayList<Document> alDocument,String dbName,String collection) {
        MongoClient mongoClient = null;
        MongoDatabase mongoDatabase = null;
        boolean b = false;
        try {
            mongoClient = new MongoClient("192.168.174.128", 27017);
            mongoDatabase = mongoClient.getDatabase(dbName);
            MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(collection);
            mongoCollection.insertMany(alDocument);
            b = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            mongoClient.close();
            return b;
        }


    }

}
