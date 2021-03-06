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
public class UpdateCartItemPayloadQuery extends Query<UpdateCartItemPayloadQuery> {
    UpdateCartItemPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CartitemArguments extends Arguments {
        CartitemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CartitemArguments filter(CartItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CartitemArguments order(CartItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CartitemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CartitemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CartitemArgumentsDefinition {
        void define(CartitemArguments args);
    }

    /**
    * 
    */
    public UpdateCartItemPayloadQuery cartitem(CartItemQueryDefinition queryDef) {
        return cartitem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCartItemPayloadQuery cartitem(CartitemArgumentsDefinition argsDef, CartItemQueryDefinition queryDef) {
        startField("cartitem");

        CartitemArguments args = new CartitemArguments(_queryBuilder);
        argsDef.define(args);
        CartitemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateCartItemPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
