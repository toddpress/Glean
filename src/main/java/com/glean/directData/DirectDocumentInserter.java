package com.glean.directData;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;

/**
 * Created by justi on 12/17/2016.
 */
public class DirectDocumentInserter {


    private String dataSourceURL = "127.0.0.1:27017";

    private String databaseName = "Glean";

    public void insertJSON(String json){

        Mongo mongo = new Mongo(dataSourceURL);
        DB db = mongo.getDB(databaseName);
        DBCollection collection = db.getCollection("dummyColl");
        DBObject dbObject = (DBObject) JSON.parse(json);
        collection.insert(dbObject);

    }
}
