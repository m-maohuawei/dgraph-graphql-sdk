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
public class AddUserPayloadQuery extends Query<AddUserPayloadQuery> {
    AddUserPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class UserArguments extends Arguments {
        UserArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public UserArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public UserArguments order(UserOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public UserArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public UserArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UserArgumentsDefinition {
        void define(UserArguments args);
    }

    /**
    * 
    */
    public AddUserPayloadQuery user(UserQueryDefinition queryDef) {
        return user(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddUserPayloadQuery user(UserArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("user");

        UserArguments args = new UserArguments(_queryBuilder);
        argsDef.define(args);
        UserArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddUserPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
