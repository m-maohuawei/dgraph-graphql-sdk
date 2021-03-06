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

public class ProductPatch implements Serializable {
    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<Boolean> isShoppingable = Input.undefined();

    private Input<List<ProductModelRef>> hasModels = Input.undefined();

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public ProductPatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public ProductPatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
        if (namespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespaces = namespaces;
        return this;
    }

    public String getIdentifier() {
        return identifier.getValue();
    }

    public Input<String> getIdentifierInput() {
        return identifier;
    }

    public ProductPatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public ProductPatch setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public ProductPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public ProductPatch setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public ProductPatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public ProductPatch setAlternateNameInput(Input<String> alternateName) {
        if (alternateName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alternateName = alternateName;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public ProductPatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public ProductPatch setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public Boolean getIsShoppingable() {
        return isShoppingable.getValue();
    }

    public Input<Boolean> getIsShoppingableInput() {
        return isShoppingable;
    }

    public ProductPatch setIsShoppingable(Boolean isShoppingable) {
        this.isShoppingable = Input.optional(isShoppingable);
        return this;
    }

    public ProductPatch setIsShoppingableInput(Input<Boolean> isShoppingable) {
        if (isShoppingable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isShoppingable = isShoppingable;
        return this;
    }

    public List<ProductModelRef> getHasModels() {
        return hasModels.getValue();
    }

    public Input<List<ProductModelRef>> getHasModelsInput() {
        return hasModels;
    }

    public ProductPatch setHasModels(List<ProductModelRef> hasModels) {
        this.hasModels = Input.optional(hasModels);
        return this;
    }

    public ProductPatch setHasModelsInput(Input<List<ProductModelRef>> hasModels) {
        if (hasModels == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasModels = hasModels;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.namespaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("namespaces:");
            if (namespaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (NamespaceRef item1 : namespaces.getValue()) {
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

        if (this.identifier.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("identifier:");
            if (identifier.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, identifier.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.alternateName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alternateName:");
            if (alternateName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, alternateName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isShoppingable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isShoppingable:");
            if (isShoppingable.getValue() != null) {
                _queryBuilder.append(isShoppingable.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hasModels.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasModels:");
            if (hasModels.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProductModelRef item1 : hasModels.getValue()) {
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
