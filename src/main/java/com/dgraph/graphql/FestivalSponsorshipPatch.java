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

public class FestivalSponsorshipPatch implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<FilmRef>> festivals = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public FestivalSponsorshipPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public FestivalSponsorshipPatch setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<FilmRef> getFestivals() {
        return festivals.getValue();
    }

    public Input<List<FilmRef>> getFestivalsInput() {
        return festivals;
    }

    public FestivalSponsorshipPatch setFestivals(List<FilmRef> festivals) {
        this.festivals = Input.optional(festivals);
        return this;
    }

    public FestivalSponsorshipPatch setFestivalsInput(Input<List<FilmRef>> festivals) {
        if (festivals == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.festivals = festivals;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.festivals.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("festivals:");
            if (festivals.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : festivals.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}