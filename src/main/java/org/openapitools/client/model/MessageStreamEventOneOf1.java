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
import org.openapitools.client.model.MessageObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.
 */
@JsonPropertyOrder({
  MessageStreamEventOneOf1.JSON_PROPERTY_EVENT,
  MessageStreamEventOneOf1.JSON_PROPERTY_DATA
})
@JsonTypeName("MessageStreamEvent_oneOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class MessageStreamEventOneOf1 {
  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_MESSAGE_IN_PROGRESS(String.valueOf("thread.message.in_progress"));

    private String value;

    EventEnum(String value) {
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
    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT = "event";
  @javax.annotation.Nonnull
  private EventEnum event;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nonnull
  private MessageObject data;

  public MessageStreamEventOneOf1() {
  }

  public MessageStreamEventOneOf1 event(@javax.annotation.Nonnull EventEnum event) {
    
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventEnum getEvent() {
    return event;
  }


  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvent(@javax.annotation.Nonnull EventEnum event) {
    this.event = event;
  }

  public MessageStreamEventOneOf1 data(@javax.annotation.Nonnull MessageObject data) {
    
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MessageObject getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(@javax.annotation.Nonnull MessageObject data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageStreamEventOneOf1 messageStreamEventOneOf1 = (MessageStreamEventOneOf1) o;
    return Objects.equals(this.event, messageStreamEventOneOf1.event) &&
        Objects.equals(this.data, messageStreamEventOneOf1.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStreamEventOneOf1 {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

    // add `event` to the URL query string
    if (getEvent() != null) {
      try {
        joiner.add(String.format("%sevent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEvent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `data` to the URL query string
    if (getData() != null) {
      joiner.add(getData().toUrlQueryString(prefix + "data" + suffix));
    }

    return joiner.toString();
  }

}

