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
* 【消息】由发送者发给一个或多个组织或个人的信息 A single message from a sender to one or more organizations or people.
*/
public class MessageQuery extends Query<MessageQuery> {
    MessageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class HasReadNotesArguments extends Arguments {
        HasReadNotesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasReadNotesArguments filter(ReadNoteFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments order(ReadNoteOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasReadNotesArgumentsDefinition {
        void define(HasReadNotesArguments args);
    }

    /**
    * 
    */
    public MessageQuery hasReadNotes(ReadNoteQueryDefinition queryDef) {
        return hasReadNotes(args -> {}, queryDef);
    }

    /**
    * 
    */
    public MessageQuery hasReadNotes(HasReadNotesArgumentsDefinition argsDef, ReadNoteQueryDefinition queryDef) {
        startField("hasReadNotes");

        HasReadNotesArguments args = new HasReadNotesArguments(_queryBuilder);
        argsDef.define(args);
        HasReadNotesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
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
    public MessageQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public MessageQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public MessageQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public MessageQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public MessageQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public MessageQuery description() {
        startField("description");

        return this;
    }

    public class IsMessageOfArguments extends Arguments {
        IsMessageOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsMessageOfArguments filter(ConversationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public IsMessageOfArguments order(ConversationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public IsMessageOfArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public IsMessageOfArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IsMessageOfArgumentsDefinition {
        void define(IsMessageOfArguments args);
    }

    /**
    * 参照isPartOf【从属于】 是它的一部分 Indicates an item or CreativeWork that this item, or CreativeWork (in some
    * sense), is part of.
    */
    public MessageQuery isMessageOf(ConversationQueryDefinition queryDef) {
        return isMessageOf(args -> {}, queryDef);
    }

    /**
    * 参照isPartOf【从属于】 是它的一部分 Indicates an item or CreativeWork that this item, or CreativeWork (in some
    * sense), is part of.
    */
    public MessageQuery isMessageOf(IsMessageOfArgumentsDefinition argsDef, ConversationQueryDefinition queryDef) {
        startField("isMessageOf");

        IsMessageOfArguments args = new IsMessageOfArguments(_queryBuilder);
        argsDef.define(args);
        IsMessageOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConversationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SenderArguments extends Arguments {
        SenderArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SenderArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SenderArgumentsDefinition {
        void define(SenderArguments args);
    }

    /**
    * 【发送者】 参与者的子属性。例如邮件的发送者。 A sub property of participant. The participant who is at the sending end of
    * the action.
    */
    public MessageQuery sender(UserQueryDefinition queryDef) {
        return sender(args -> {}, queryDef);
    }

    /**
    * 【发送者】 参与者的子属性。例如邮件的发送者。 A sub property of participant. The participant who is at the sending end of
    * the action.
    */
    public MessageQuery sender(SenderArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("sender");

        SenderArguments args = new SenderArguments(_queryBuilder);
        argsDef.define(args);
        SenderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 【发送日期】 消息被发送的日期/时间。 The date/time at which the message was sent.
    */
    public MessageQuery dateSent() {
        startField("dateSent");

        return this;
    }

    public class ToRecipientArguments extends Arguments {
        ToRecipientArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ToRecipientArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ToRecipientArgumentsDefinition {
        void define(ToRecipientArguments args);
    }

    /**
    * 【收件人】 消息的直接收件人 A sub property of recipient. The recipient who was directly sent the message.
    */
    public MessageQuery toRecipient(UserQueryDefinition queryDef) {
        return toRecipient(args -> {}, queryDef);
    }

    /**
    * 【收件人】 消息的直接收件人 A sub property of recipient. The recipient who was directly sent the message.
    */
    public MessageQuery toRecipient(ToRecipientArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("toRecipient");

        ToRecipientArguments args = new ToRecipientArguments(_queryBuilder);
        argsDef.define(args);
        ToRecipientArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 【阅读日期】 如果存在单个的收件人，就是消息被收件人读取的日期/时间。 The date/time at which the message has been read by the
    * recipient if a single recipient exists.
    */
    public MessageQuery dateRead() {
        startField("dateRead");

        return this;
    }

    /**
    * 【接收日期】 如果存在单个的收件人，就是消息被收件人接收的日期/时间。 The date/time the message was received if a single recipient
    * exists.
    */
    public MessageQuery dateReceived() {
        startField("dateReceived");

        return this;
    }

    public class RecipientArguments extends Arguments {
        RecipientArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RecipientArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RecipientArguments order(UserOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RecipientArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public RecipientArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RecipientArgumentsDefinition {
        void define(RecipientArguments args);
    }

    /**
    * 【接收者】 参与者的子属性。 在行动接收端的参与者。 A sub property of participant. The participant who is at the receiving
    * end of the action.
    */
    public MessageQuery recipient(UserQueryDefinition queryDef) {
        return recipient(args -> {}, queryDef);
    }

    /**
    * 【接收者】 参与者的子属性。 在行动接收端的参与者。 A sub property of participant. The participant who is at the receiving
    * end of the action.
    */
    public MessageQuery recipient(RecipientArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("recipient");

        RecipientArguments args = new RecipientArguments(_queryBuilder);
        argsDef.define(args);
        RecipientArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasReviewsArguments extends Arguments {
        HasReviewsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasReviewsArguments filter(ReviewFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReviewsArguments order(ReviewOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReviewsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasReviewsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasReviewsArgumentsDefinition {
        void define(HasReviewsArguments args);
    }

    /**
    * 【评论】 评论，一般是用户对CreativeWork的评论。
    */
    public MessageQuery hasReviews(ReviewQueryDefinition queryDef) {
        return hasReviews(args -> {}, queryDef);
    }

    /**
    * 【评论】 评论，一般是用户对CreativeWork的评论。
    */
    public MessageQuery hasReviews(HasReviewsArgumentsDefinition argsDef, ReviewQueryDefinition queryDef) {
        startField("hasReviews");

        HasReviewsArguments args = new HasReviewsArguments(_queryBuilder);
        argsDef.define(args);
        HasReviewsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReviewQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
