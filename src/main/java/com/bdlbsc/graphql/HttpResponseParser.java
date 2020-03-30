package com.bdlbsc.graphql;


import com.dgraph.graphql.*;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.shopify.graphql.support.InvalidGraphQLException;
import com.shopify.graphql.support.TopLevelResponse;

import okhttp3.Response;

public class HttpResponseParser {

    public QueryRoot parseQueryRoot(Response response) throws Exception {
        TopLevelResponse topLevelResponse = successResponse(response);
        QueryRoot root = new QueryRoot(topLevelResponse.getData());
        new GraphResponse(root, topLevelResponse.getErrors());
        return root;
    }

    public Mutation parseMutation(Response response) throws Exception {
        TopLevelResponse topLevelResponse = successResponse(response);
        Mutation mutation = new Mutation(topLevelResponse.getData());
        new GraphResponse(mutation, topLevelResponse.getErrors());
        return mutation;
    }

    private TopLevelResponse successResponse(Response response) throws Exception {
        if (response.isSuccessful()) {
            JsonReader reader = new JsonReader(response.body().charStream());
            JsonObject root = (JsonObject) new JsonParser().parse(reader);
            try {
                return new TopLevelResponse(root);
            } catch (InvalidGraphQLException e) {
                e.printStackTrace();
                throw new GraphError.ParseError("parse error", e);
            }
        } else {
            throw new GraphError.HttpError(response);
        }
    }
}