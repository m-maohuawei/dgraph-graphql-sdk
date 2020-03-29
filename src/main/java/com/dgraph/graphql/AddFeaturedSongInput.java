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

public class AddFeaturedSongInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<FilmRef>> featuredInFilm = Input.undefined();

    private Input<List<FilmRef>> performedBy = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public AddFeaturedSongInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public AddFeaturedSongInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<FilmRef> getFeaturedInFilm() {
        return featuredInFilm.getValue();
    }

    public Input<List<FilmRef>> getFeaturedInFilmInput() {
        return featuredInFilm;
    }

    public AddFeaturedSongInput setFeaturedInFilm(List<FilmRef> featuredInFilm) {
        this.featuredInFilm = Input.optional(featuredInFilm);
        return this;
    }

    public AddFeaturedSongInput setFeaturedInFilmInput(Input<List<FilmRef>> featuredInFilm) {
        if (featuredInFilm == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.featuredInFilm = featuredInFilm;
        return this;
    }

    public List<FilmRef> getPerformedBy() {
        return performedBy.getValue();
    }

    public Input<List<FilmRef>> getPerformedByInput() {
        return performedBy;
    }

    public AddFeaturedSongInput setPerformedBy(List<FilmRef> performedBy) {
        this.performedBy = Input.optional(performedBy);
        return this;
    }

    public AddFeaturedSongInput setPerformedByInput(Input<List<FilmRef>> performedBy) {
        if (performedBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.performedBy = performedBy;
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

        if (this.featuredInFilm.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("featured_in_film:");
            if (featuredInFilm.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : featuredInFilm.getValue()) {
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

        if (this.performedBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("performed_by:");
            if (performedBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : performedBy.getValue()) {
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