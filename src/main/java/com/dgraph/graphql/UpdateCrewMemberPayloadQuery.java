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
public class UpdateCrewMemberPayloadQuery extends Query<UpdateCrewMemberPayloadQuery> {
    UpdateCrewMemberPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CrewmemberArguments extends Arguments {
        CrewmemberArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CrewmemberArguments filter(CrewMemberFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CrewmemberArguments order(CrewMemberOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CrewmemberArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CrewmemberArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CrewmemberArgumentsDefinition {
        void define(CrewmemberArguments args);
    }

    /**
    * 
    */
    public UpdateCrewMemberPayloadQuery crewmember(CrewMemberQueryDefinition queryDef) {
        return crewmember(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCrewMemberPayloadQuery crewmember(CrewmemberArgumentsDefinition argsDef, CrewMemberQueryDefinition queryDef) {
        startField("crewmember");

        CrewmemberArguments args = new CrewmemberArguments(_queryBuilder);
        argsDef.define(args);
        CrewmemberArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CrewMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
