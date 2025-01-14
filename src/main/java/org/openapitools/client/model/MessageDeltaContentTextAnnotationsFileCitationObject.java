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
import org.openapitools.client.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;file_search\&quot; tool to search files.
 */
@JsonPropertyOrder({
  MessageDeltaContentTextAnnotationsFileCitationObject.JSON_PROPERTY_INDEX,
  MessageDeltaContentTextAnnotationsFileCitationObject.JSON_PROPERTY_TYPE,
  MessageDeltaContentTextAnnotationsFileCitationObject.JSON_PROPERTY_TEXT,
  MessageDeltaContentTextAnnotationsFileCitationObject.JSON_PROPERTY_FILE_CITATION,
  MessageDeltaContentTextAnnotationsFileCitationObject.JSON_PROPERTY_START_INDEX,
  MessageDeltaContentTextAnnotationsFileCitationObject.JSON_PROPERTY_END_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class MessageDeltaContentTextAnnotationsFileCitationObject {
  public static final String JSON_PROPERTY_INDEX = "index";
  @javax.annotation.Nonnull
  private Integer index;

  /**
   * Always &#x60;file_citation&#x60;.
   */
  public enum TypeEnum {
    FILE_CITATION(String.valueOf("file_citation"));

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

  public static final String JSON_PROPERTY_TEXT = "text";
  @javax.annotation.Nullable
  private String text;

  public static final String JSON_PROPERTY_FILE_CITATION = "file_citation";
  @javax.annotation.Nullable
  private MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  public static final String JSON_PROPERTY_START_INDEX = "start_index";
  @javax.annotation.Nullable
  private Integer startIndex;

  public static final String JSON_PROPERTY_END_INDEX = "end_index";
  @javax.annotation.Nullable
  private Integer endIndex;

  public MessageDeltaContentTextAnnotationsFileCitationObject() {
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject index(@javax.annotation.Nonnull Integer index) {
    
    this.index = index;
    return this;
  }

  /**
   * The index of the annotation in the text content part.
   * @return index
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndex(@javax.annotation.Nonnull Integer index) {
    this.index = index;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject type(@javax.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * Always &#x60;file_citation&#x60;.
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

  public MessageDeltaContentTextAnnotationsFileCitationObject text(@javax.annotation.Nullable String text) {
    
    this.text = text;
    return this;
  }

  /**
   * The text in the message content that needs to be replaced.
   * @return text
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(@javax.annotation.Nullable String text) {
    this.text = text;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject fileCitation(@javax.annotation.Nullable MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    
    this.fileCitation = fileCitation;
    return this;
  }

  /**
   * Get fileCitation
   * @return fileCitation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_CITATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }


  @JsonProperty(JSON_PROPERTY_FILE_CITATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileCitation(@javax.annotation.Nullable MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject startIndex(@javax.annotation.Nullable Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

  /**
   * Get startIndex
   * minimum: 0
   * @return startIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(@javax.annotation.Nullable Integer startIndex) {
    this.startIndex = startIndex;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject endIndex(@javax.annotation.Nullable Integer endIndex) {
    
    this.endIndex = endIndex;
    return this;
  }

  /**
   * Get endIndex
   * minimum: 0
   * @return endIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndIndex() {
    return endIndex;
  }


  @JsonProperty(JSON_PROPERTY_END_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndIndex(@javax.annotation.Nullable Integer endIndex) {
    this.endIndex = endIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaContentTextAnnotationsFileCitationObject messageDeltaContentTextAnnotationsFileCitationObject = (MessageDeltaContentTextAnnotationsFileCitationObject) o;
    return Objects.equals(this.index, messageDeltaContentTextAnnotationsFileCitationObject.index) &&
        Objects.equals(this.type, messageDeltaContentTextAnnotationsFileCitationObject.type) &&
        Objects.equals(this.text, messageDeltaContentTextAnnotationsFileCitationObject.text) &&
        Objects.equals(this.fileCitation, messageDeltaContentTextAnnotationsFileCitationObject.fileCitation) &&
        Objects.equals(this.startIndex, messageDeltaContentTextAnnotationsFileCitationObject.startIndex) &&
        Objects.equals(this.endIndex, messageDeltaContentTextAnnotationsFileCitationObject.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, text, fileCitation, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextAnnotationsFileCitationObject {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fileCitation: ").append(toIndentedString(fileCitation)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

    // add `index` to the URL query string
    if (getIndex() != null) {
      try {
        joiner.add(String.format("%sindex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndex()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `text` to the URL query string
    if (getText() != null) {
      try {
        joiner.add(String.format("%stext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getText()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `file_citation` to the URL query string
    if (getFileCitation() != null) {
      joiner.add(getFileCitation().toUrlQueryString(prefix + "file_citation" + suffix));
    }

    // add `start_index` to the URL query string
    if (getStartIndex() != null) {
      try {
        joiner.add(String.format("%sstart_index%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `end_index` to the URL query string
    if (getEndIndex() != null) {
      try {
        joiner.add(String.format("%send_index%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

