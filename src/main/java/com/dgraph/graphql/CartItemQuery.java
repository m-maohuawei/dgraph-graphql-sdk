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
* 购物车内物品、服务、优惠券等
*/
public class CartItemQuery extends Query<CartItemQuery> {
    CartItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public CartItemQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CartItemQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public CartItemQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public CartItemQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public CartItemQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public CartItemQuery description() {
        startField("description");

        return this;
    }

    public class IsItemOfArguments extends Arguments {
        IsItemOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsItemOfArguments filter(CartFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IsItemOfArgumentsDefinition {
        void define(IsItemOfArguments args);
    }

    /**
    * 所属购物车,
    */
    public CartItemQuery isItemOf(CartQueryDefinition queryDef) {
        return isItemOf(args -> {}, queryDef);
    }

    /**
    * 所属购物车,
    */
    public CartItemQuery isItemOf(IsItemOfArgumentsDefinition argsDef, CartQueryDefinition queryDef) {
        startField("isItemOf");

        IsItemOfArguments args = new IsItemOfArguments(_queryBuilder);
        argsDef.define(args);
        IsItemOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public CartItemQuery type() {
        startField("type");

        return this;
    }

    /**
    * 
    */
    public CartItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * 
    */
    public CartItemQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * 
    */
    public CartItemQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
