// Generated from graphql_java_gen gem

package com.dgraph.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 
*/
public class AddSoftwareApplicationPayload extends AbstractResponse<AddSoftwareApplicationPayload> {
    public AddSoftwareApplicationPayload() {
    }

    public AddSoftwareApplicationPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "softwareapplication": {
                    List<SoftwareApplication> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SoftwareApplication> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SoftwareApplication optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SoftwareApplication(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "numUids": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "AddSoftwareApplicationPayload";
    }

    /**
    * 
    */

    public List<SoftwareApplication> getSoftwareapplication() {
        return (List<SoftwareApplication>) get("softwareapplication");
    }

    public AddSoftwareApplicationPayload setSoftwareapplication(List<SoftwareApplication> arg) {
        optimisticData.put(getKey("softwareapplication"), arg);
        return this;
    }

    /**
    * 
    */

    public Integer getNumUids() {
        return (Integer) get("numUids");
    }

    public AddSoftwareApplicationPayload setNumUids(Integer arg) {
        optimisticData.put(getKey("numUids"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "softwareapplication": return true;

            case "numUids": return false;

            default: return false;
        }
    }
}

