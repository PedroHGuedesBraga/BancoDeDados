package org.example;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import model.Filme;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.function.Consumer;

import static com.mongodb.client.model.Updates.set;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


public class Main {
    public static void main(String[] args) {

        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClient mongoClient = new MongoClient("localhost:27017",
                MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        MongoDatabase database = mongoClient.getDatabase("admin").withCodecRegistry(pojoCodecRegistry);
        MongoCollection <Filme> collection = database.getCollection("filme",Filme.class);
        //collection.insertOne(new Filme(1,"Filme","ação","1HR"));
        //collection.updateOne(new Document("_id",1),set("nome","Filme update"));
        //collection.deleteOne(new Document("nome","Filme update"));
    }
}