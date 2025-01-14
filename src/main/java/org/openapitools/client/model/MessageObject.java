/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CreateMessageRequestAttachmentsInner;
import org.openapitools.client.model.MessageObjectContentInner;
import org.openapitools.client.model.MessageObjectIncompleteDetails;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 */
@JsonPropertyOrder({
  MessageObject.JSON_PROPERTY_ID,
  MessageObject.JSON_PROPERTY_OBJECT,
  MessageObject.JSON_PROPERTY_CREATED_AT,
  MessageObject.JSON_PROPERTY_THREAD_ID,
  MessageObject.JSON_PROPERTY_STATUS,
  MessageObject.JSON_PROPERTY_INCOMPLETE_DETAILS,
  MessageObject.JSON_PROPERTY_COMPLETED_AT,
  MessageObject.JSON_PROPERTY_INCOMPLETE_AT,
  MessageObject.JSON_PROPERTY_ROLE,
  MessageObject.JSON_PROPERTY_CONTENT,
  MessageObject.JSON_PROPERTY_ASSISTANT_ID,
  MessageObject.JSON_PROPERTY_RUN_ID,
  MessageObject.JSON_PROPERTY_ATTACHMENTS,
  MessageObject.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class MessageObject {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  /**
   * The object type, which is always &#x60;thread.message&#x60;.
   */
  public enum ObjectEnum {
    THREAD_MESSAGE(String.valueOf("thread.message"));

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OBJECT = "object";
  @javax.annotation.Nonnull
  private ObjectEnum _object;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @javax.annotation.Nonnull
  private Integer createdAt;

  public static final String JSON_PROPERTY_THREAD_ID = "thread_id";
  @javax.annotation.Nonnull
  private String threadId;

  /**
   * The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
   */
  public enum StatusEnum {
    IN_PROGRESS(String.valueOf("in_progress")),
    
    INCOMPLETE(String.valueOf("incomplete")),
    
    COMPLETED(String.valueOf("completed"));

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private StatusEnum status;

  public static final String JSON_PROPERTY_INCOMPLETE_DETAILS = "incomplete_details";
  @javax.annotation.Nullable
  private MessageObjectIncompleteDetails incompleteDetails;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  @javax.annotation.Nullable
  private Integer completedAt;

  public static final String JSON_PROPERTY_INCOMPLETE_AT = "incomplete_at";
  @javax.annotation.Nullable
  private Integer incompleteAt;

  /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   */
  public enum RoleEnum {
    USER(String.valueOf("user")),
    
    ASSISTANT(String.valueOf("assistant"));

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  @javax.annotation.Nonnull
  private RoleEnum role;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nonnull
  private List<MessageObjectContentInner> content = new ArrayList<>();

  public static final String JSON_PROPERTY_ASSISTANT_ID = "assistant_id";
  @javax.annotation.Nullable
  private String assistantId;

  public static final String JSON_PROPERTY_RUN_ID = "run_id";
  @javax.annotation.Nullable
  private String runId;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  @javax.annotation.Nullable
  private List<CreateMessageRequestAttachmentsInner> attachments;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable
  private Object metadata;

  public MessageObject() {
  }

  public MessageObject id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }

  public MessageObject _object(@javax.annotation.Nonnull ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always &#x60;thread.message&#x60;.
   * @return _object
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ObjectEnum getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(@javax.annotation.Nonnull ObjectEnum _object) {
    this._object = _object;
  }

  public MessageObject createdAt(@javax.annotation.Nonnull Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the message was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(@javax.annotation.Nonnull Integer createdAt) {
    this.createdAt = createdAt;
  }

  public MessageObject threadId(@javax.annotation.Nonnull String threadId) {
    
    this.threadId = threadId;
    return this;
  }

  /**
   * The [thread](/docs/api-reference/threads) ID that this message belongs to.
   * @return threadId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreadId(@javax.annotation.Nonnull String threadId) {
    this.threadId = threadId;
  }

  public MessageObject status(@javax.annotation.Nonnull StatusEnum status) {
    
    this.status = status;
    return this;
  }

  /**
   * The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }

  public MessageObject incompleteDetails(@javax.annotation.Nullable MessageObjectIncompleteDetails incompleteDetails) {
    
    this.incompleteDetails = incompleteDetails;
    return this;
  }

  /**
   * Get incompleteDetails
   * @return incompleteDetails
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCOMPLETE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MessageObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }


  @JsonProperty(JSON_PROPERTY_INCOMPLETE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncompleteDetails(@javax.annotation.Nullable MessageObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  public MessageObject completedAt(@javax.annotation.Nullable Integer completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the message was completed.
   * @return completedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCompletedAt() {
    return completedAt;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompletedAt(@javax.annotation.Nullable Integer completedAt) {
    this.completedAt = completedAt;
  }

  public MessageObject incompleteAt(@javax.annotation.Nullable Integer incompleteAt) {
    
    this.incompleteAt = incompleteAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the message was marked as incomplete.
   * @return incompleteAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCOMPLETE_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIncompleteAt() {
    return incompleteAt;
  }


  @JsonProperty(JSON_PROPERTY_INCOMPLETE_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncompleteAt(@javax.annotation.Nullable Integer incompleteAt) {
    this.incompleteAt = incompleteAt;
  }

  public MessageObject role(@javax.annotation.Nonnull RoleEnum role) {
    
    this.role = role;
    return this;
  }

  /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   * @return role
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(@javax.annotation.Nonnull RoleEnum role) {
    this.role = role;
  }

  public MessageObject content(@javax.annotation.Nonnull List<MessageObjectContentInner> content) {
    
    this.content = content;
    return this;
  }

  public MessageObject addContentItem(MessageObjectContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * The content of the message in array of text and/or images.
   * @return content
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MessageObjectContentInner> getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(@javax.annotation.Nonnull List<MessageObjectContentInner> content) {
    this.content = content;
  }

  public MessageObject assistantId(@javax.annotation.Nullable String assistantId) {
    
    this.assistantId = assistantId;
    return this;
  }

  /**
   * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
   * @return assistantId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSISTANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAssistantId() {
    return assistantId;
  }


  @JsonProperty(JSON_PROPERTY_ASSISTANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssistantId(@javax.annotation.Nullable String assistantId) {
    this.assistantId = assistantId;
  }

  public MessageObject runId(@javax.annotation.Nullable String runId) {
    
    this.runId = runId;
    return this;
  }

  /**
   * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.
   * @return runId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRunId() {
    return runId;
  }


  @JsonProperty(JSON_PROPERTY_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRunId(@javax.annotation.Nullable String runId) {
    this.runId = runId;
  }

  public MessageObject attachments(@javax.annotation.Nullable List<CreateMessageRequestAttachmentsInner> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public MessageObject addAttachmentsItem(CreateMessageRequestAttachmentsInner attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * A list of files attached to the message, and the tools they were added to.
   * @return attachments
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CreateMessageRequestAttachmentsInner> getAttachments() {
    return attachments;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttachments(@javax.annotation.Nullable List<CreateMessageRequestAttachmentsInner> attachments) {
    this.attachments = attachments;
  }

  public MessageObject metadata(@javax.annotation.Nullable Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageObject messageObject = (MessageObject) o;
    return Objects.equals(this.id, messageObject.id) &&
        Objects.equals(this._object, messageObject._object) &&
        Objects.equals(this.createdAt, messageObject.createdAt) &&
        Objects.equals(this.threadId, messageObject.threadId) &&
        Objects.equals(this.status, messageObject.status) &&
        Objects.equals(this.incompleteDetails, messageObject.incompleteDetails) &&
        Objects.equals(this.completedAt, messageObject.completedAt) &&
        Objects.equals(this.incompleteAt, messageObject.incompleteAt) &&
        Objects.equals(this.role, messageObject.role) &&
        Objects.equals(this.content, messageObject.content) &&
        Objects.equals(this.assistantId, messageObject.assistantId) &&
        Objects.equals(this.runId, messageObject.runId) &&
        Objects.equals(this.attachments, messageObject.attachments) &&
        Objects.equals(this.metadata, messageObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, status, incompleteDetails, completedAt, incompleteAt, role, content, assistantId, runId, attachments, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    incompleteDetails: ").append(toIndentedString(incompleteDetails)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    incompleteAt: ").append(toIndentedString(incompleteAt)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `object` to the URL query string
    if (getObject() != null) {
      try {
        joiner.add(String.format("%sobject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObject()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `created_at` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screated_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `thread_id` to the URL query string
    if (getThreadId() != null) {
      try {
        joiner.add(String.format("%sthread_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `incomplete_details` to the URL query string
    if (getIncompleteDetails() != null) {
      joiner.add(getIncompleteDetails().toUrlQueryString(prefix + "incomplete_details" + suffix));
    }

    // add `completed_at` to the URL query string
    if (getCompletedAt() != null) {
      try {
        joiner.add(String.format("%scompleted_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `incomplete_at` to the URL query string
    if (getIncompleteAt() != null) {
      try {
        joiner.add(String.format("%sincomplete_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIncompleteAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `role` to the URL query string
    if (getRole() != null) {
      try {
        joiner.add(String.format("%srole%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRole()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      for (int i = 0; i < getContent().size(); i++) {
        if (getContent().get(i) != null) {
          joiner.add(getContent().get(i).toUrlQueryString(String.format("%scontent%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `assistant_id` to the URL query string
    if (getAssistantId() != null) {
      try {
        joiner.add(String.format("%sassistant_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAssistantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `run_id` to the URL query string
    if (getRunId() != null) {
      try {
        joiner.add(String.format("%srun_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRunId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `attachments` to the URL query string
    if (getAttachments() != null) {
      for (int i = 0; i < getAttachments().size(); i++) {
        if (getAttachments().get(i) != null) {
          joiner.add(getAttachments().get(i).toUrlQueryString(String.format("%sattachments%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      try {
        joiner.add(String.format("%smetadata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetadata()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

