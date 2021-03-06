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

public class AddSoftwareApplicationInput implements Serializable {
    private String name;

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> applicationSuite = Input.undefined();

    private Input<String> downloadUrl = Input.undefined();

    private Input<String> featureList = Input.undefined();

    private Input<String> installUrl = Input.undefined();

    private Input<String> releaseNotes = Input.undefined();

    private Input<String> screenshot = Input.undefined();

    private Input<String> softwareVersion = Input.undefined();

    public AddSoftwareApplicationInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AddSoftwareApplicationInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddSoftwareApplicationInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddSoftwareApplicationInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public AddSoftwareApplicationInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddSoftwareApplicationInput setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public AddSoftwareApplicationInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddSoftwareApplicationInput setAlternateNameInput(Input<String> alternateName) {
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

    public AddSoftwareApplicationInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddSoftwareApplicationInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getApplicationSuite() {
        return applicationSuite.getValue();
    }

    public Input<String> getApplicationSuiteInput() {
        return applicationSuite;
    }

    public AddSoftwareApplicationInput setApplicationSuite(String applicationSuite) {
        this.applicationSuite = Input.optional(applicationSuite);
        return this;
    }

    public AddSoftwareApplicationInput setApplicationSuiteInput(Input<String> applicationSuite) {
        if (applicationSuite == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.applicationSuite = applicationSuite;
        return this;
    }

    public String getDownloadUrl() {
        return downloadUrl.getValue();
    }

    public Input<String> getDownloadUrlInput() {
        return downloadUrl;
    }

    public AddSoftwareApplicationInput setDownloadUrl(String downloadUrl) {
        this.downloadUrl = Input.optional(downloadUrl);
        return this;
    }

    public AddSoftwareApplicationInput setDownloadUrlInput(Input<String> downloadUrl) {
        if (downloadUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getFeatureList() {
        return featureList.getValue();
    }

    public Input<String> getFeatureListInput() {
        return featureList;
    }

    public AddSoftwareApplicationInput setFeatureList(String featureList) {
        this.featureList = Input.optional(featureList);
        return this;
    }

    public AddSoftwareApplicationInput setFeatureListInput(Input<String> featureList) {
        if (featureList == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.featureList = featureList;
        return this;
    }

    public String getInstallUrl() {
        return installUrl.getValue();
    }

    public Input<String> getInstallUrlInput() {
        return installUrl;
    }

    public AddSoftwareApplicationInput setInstallUrl(String installUrl) {
        this.installUrl = Input.optional(installUrl);
        return this;
    }

    public AddSoftwareApplicationInput setInstallUrlInput(Input<String> installUrl) {
        if (installUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.installUrl = installUrl;
        return this;
    }

    public String getReleaseNotes() {
        return releaseNotes.getValue();
    }

    public Input<String> getReleaseNotesInput() {
        return releaseNotes;
    }

    public AddSoftwareApplicationInput setReleaseNotes(String releaseNotes) {
        this.releaseNotes = Input.optional(releaseNotes);
        return this;
    }

    public AddSoftwareApplicationInput setReleaseNotesInput(Input<String> releaseNotes) {
        if (releaseNotes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.releaseNotes = releaseNotes;
        return this;
    }

    public String getScreenshot() {
        return screenshot.getValue();
    }

    public Input<String> getScreenshotInput() {
        return screenshot;
    }

    public AddSoftwareApplicationInput setScreenshot(String screenshot) {
        this.screenshot = Input.optional(screenshot);
        return this;
    }

    public AddSoftwareApplicationInput setScreenshotInput(Input<String> screenshot) {
        if (screenshot == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.screenshot = screenshot;
        return this;
    }

    public String getSoftwareVersion() {
        return softwareVersion.getValue();
    }

    public Input<String> getSoftwareVersionInput() {
        return softwareVersion;
    }

    public AddSoftwareApplicationInput setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = Input.optional(softwareVersion);
        return this;
    }

    public AddSoftwareApplicationInput setSoftwareVersionInput(Input<String> softwareVersion) {
        if (softwareVersion == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.softwareVersion = softwareVersion;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

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

        if (this.applicationSuite.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("applicationSuite:");
            if (applicationSuite.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, applicationSuite.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.downloadUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("downloadUrl:");
            if (downloadUrl.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, downloadUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.featureList.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("featureList:");
            if (featureList.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, featureList.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.installUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("installUrl:");
            if (installUrl.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, installUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.releaseNotes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("releaseNotes:");
            if (releaseNotes.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, releaseNotes.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.screenshot.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("screenshot:");
            if (screenshot.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, screenshot.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.softwareVersion.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("softwareVersion:");
            if (softwareVersion.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, softwareVersion.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
