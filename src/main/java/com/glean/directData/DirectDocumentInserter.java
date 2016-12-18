package com.glean.directData;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by justi on 12/17/2016.
 */
public class DirectDocumentInserter {

    @Value("${spring.datasource.url}")
    private String dataSourceURL;

    @Value("${spring.data.mongodb.database}")
    private String databaseName;

    public void insertJSON(String json){

        Mongo mongo = new Mongo(dataSourceURL);
        DB db = mongo.getDB(databaseName);
        DBCollection collection = db.getCollection("dummyColl");
        DBObject dbObject = (DBObject) JSON.parse(json);
        collection.insert(dbObject);

    }
}
