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
public class UpdateRatingSystemPayloadQuery extends Query<UpdateRatingSystemPayloadQuery> {
    UpdateRatingSystemPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class RatingsystemArguments extends Arguments {
        RatingsystemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RatingsystemArguments filter(RatingSystemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingsystemArguments order(RatingSystemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingsystemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public RatingsystemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RatingsystemArgumentsDefinition {
        void define(RatingsystemArguments args);
    }

    /**
    * 
    */
    public UpdateRatingSystemPayloadQuery ratingsystem(RatingSystemQueryDefinition queryDef) {
        return ratingsystem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateRatingSystemPayloadQuery ratingsystem(RatingsystemArgumentsDefinition argsDef, RatingSystemQueryDefinition queryDef) {
        startField("ratingsystem");

        RatingsystemArguments args = new RatingsystemArguments(_queryBuilder);
        argsDef.define(args);
        RatingsystemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RatingSystemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
