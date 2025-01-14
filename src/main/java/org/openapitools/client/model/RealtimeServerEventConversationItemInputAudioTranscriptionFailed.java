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
import org.openapitools.client.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item. 
 */
@JsonPropertyOrder({
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed.JSON_PROPERTY_EVENT_ID,
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed.JSON_PROPERTY_TYPE,
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed.JSON_PROPERTY_ITEM_ID,
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed.JSON_PROPERTY_CONTENT_INDEX,
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed.JSON_PROPERTY_ERROR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailed {
  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  @javax.annotation.Nonnull
  private String eventId;

  /**
   * The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;. 
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED(String.valueOf("conversation.item.input_audio_transcription.failed"));

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String JSON_PROPERTY_ITEM_ID = "item_id";
  @javax.annotation.Nonnull
  private String itemId;

  public static final String JSON_PROPERTY_CONTENT_INDEX = "content_index";
  @javax.annotation.Nonnull
  private Integer contentIndex;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nonnull
  private RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error;

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed() {
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed eventId(@javax.annotation.Nonnull String eventId) {
    
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventId() {
    return eventId;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventId(@javax.annotation.Nonnull String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed type(@javax.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;. 
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed itemId(@javax.annotation.Nonnull String itemId) {
    
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the user message item.
   * @return itemId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemId() {
    return itemId;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItemId(@javax.annotation.Nonnull String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed contentIndex(@javax.annotation.Nonnull Integer contentIndex) {
    
    this.contentIndex = contentIndex;
    return this;
  }

  /**
   * The index of the content part containing the audio.
   * @return contentIndex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getContentIndex() {
    return contentIndex;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContentIndex(@javax.annotation.Nonnull Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed error(@javax.annotation.Nonnull RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
    
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(@javax.annotation.Nonnull RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventConversationItemInputAudioTranscriptionFailed realtimeServerEventConversationItemInputAudioTranscriptionFailed = (RealtimeServerEventConversationItemInputAudioTranscriptionFailed) o;
    return Objects.equals(this.eventId, realtimeServerEventConversationItemInputAudioTranscriptionFailed.eventId) &&
        Objects.equals(this.type, realtimeServerEventConversationItemInputAudioTranscriptionFailed.type) &&
        Objects.equals(this.itemId, realtimeServerEventConversationItemInputAudioTranscriptionFailed.itemId) &&
        Objects.equals(this.contentIndex, realtimeServerEventConversationItemInputAudioTranscriptionFailed.contentIndex) &&
        Objects.equals(this.error, realtimeServerEventConversationItemInputAudioTranscriptionFailed.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, itemId, contentIndex, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationItemInputAudioTranscriptionFailed {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

    // add `event_id` to the URL query string
    if (getEventId() != null) {
      try {
        joiner.add(String.format("%sevent_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `item_id` to the URL query string
    if (getItemId() != null) {
      try {
        joiner.add(String.format("%sitem_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getItemId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content_index` to the URL query string
    if (getContentIndex() != null) {
      try {
        joiner.add(String.format("%scontent_index%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContentIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(getError().toUrlQueryString(prefix + "error" + suffix));
    }

    return joiner.toString();
  }

}

