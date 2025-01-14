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
import org.openapitools.client.model.MessageContentTextAnnotationsFileCitationObject;
import org.openapitools.client.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.client.model.MessageContentTextAnnotationsFilePathObject;
import org.openapitools.client.model.MessageContentTextAnnotationsFilePathObjectFilePath;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MessageContentTextObjectTextAnnotationsInner
 */
@JsonPropertyOrder({
  MessageContentTextObjectTextAnnotationsInner.JSON_PROPERTY_TYPE,
  MessageContentTextObjectTextAnnotationsInner.JSON_PROPERTY_TEXT,
  MessageContentTextObjectTextAnnotationsInner.JSON_PROPERTY_FILE_CITATION,
  MessageContentTextObjectTextAnnotationsInner.JSON_PROPERTY_START_INDEX,
  MessageContentTextObjectTextAnnotationsInner.JSON_PROPERTY_END_INDEX,
  MessageContentTextObjectTextAnnotationsInner.JSON_PROPERTY_FILE_PATH
})
@JsonTypeName("MessageContentTextObject_text_annotations_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class MessageContentTextObjectTextAnnotationsInner {
  /**
   * Always &#x60;file_citation&#x60;.
   */
  public enum TypeEnum {
    CITATION(String.valueOf("file_citation")),
    
    PATH(String.valueOf("file_path"));

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
  @javax.annotation.Nonnull
  private String text;

  public static final String JSON_PROPERTY_FILE_CITATION = "file_citation";
  @javax.annotation.Nonnull
  private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  public static final String JSON_PROPERTY_START_INDEX = "start_index";
  @javax.annotation.Nonnull
  private Integer startIndex;

  public static final String JSON_PROPERTY_END_INDEX = "end_index";
  @javax.annotation.Nonnull
  private Integer endIndex;

  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  @javax.annotation.Nonnull
  private MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  public MessageContentTextObjectTextAnnotationsInner() {
  }

  public MessageContentTextObjectTextAnnotationsInner type(@javax.annotation.Nonnull TypeEnum type) {
    
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

  public MessageContentTextObjectTextAnnotationsInner text(@javax.annotation.Nonnull String text) {
    
    this.text = text;
    return this;
  }

  /**
   * The text in the message content that needs to be replaced.
   * @return text
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setText(@javax.annotation.Nonnull String text) {
    this.text = text;
  }

  public MessageContentTextObjectTextAnnotationsInner fileCitation(@javax.annotation.Nonnull MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    
    this.fileCitation = fileCitation;
    return this;
  }

  /**
   * Get fileCitation
   * @return fileCitation
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_CITATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }


  @JsonProperty(JSON_PROPERTY_FILE_CITATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileCitation(@javax.annotation.Nonnull MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  public MessageContentTextObjectTextAnnotationsInner startIndex(@javax.annotation.Nonnull Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

  /**
   * Get startIndex
   * minimum: 0
   * @return startIndex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartIndex(@javax.annotation.Nonnull Integer startIndex) {
    this.startIndex = startIndex;
  }

  public MessageContentTextObjectTextAnnotationsInner endIndex(@javax.annotation.Nonnull Integer endIndex) {
    
    this.endIndex = endIndex;
    return this;
  }

  /**
   * Get endIndex
   * minimum: 0
   * @return endIndex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEndIndex() {
    return endIndex;
  }


  @JsonProperty(JSON_PROPERTY_END_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndIndex(@javax.annotation.Nonnull Integer endIndex) {
    this.endIndex = endIndex;
  }

  public MessageContentTextObjectTextAnnotationsInner filePath(@javax.annotation.Nonnull MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    
    this.filePath = filePath;
    return this;
  }

  /**
   * Get filePath
   * @return filePath
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MessageContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }


  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilePath(@javax.annotation.Nonnull MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentTextObjectTextAnnotationsInner messageContentTextObjectTextAnnotationsInner = (MessageContentTextObjectTextAnnotationsInner) o;
    return Objects.equals(this.type, messageContentTextObjectTextAnnotationsInner.type) &&
        Objects.equals(this.text, messageContentTextObjectTextAnnotationsInner.text) &&
        Objects.equals(this.fileCitation, messageContentTextObjectTextAnnotationsInner.fileCitation) &&
        Objects.equals(this.startIndex, messageContentTextObjectTextAnnotationsInner.startIndex) &&
        Objects.equals(this.endIndex, messageContentTextObjectTextAnnotationsInner.endIndex) &&
        Objects.equals(this.filePath, messageContentTextObjectTextAnnotationsInner.filePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, fileCitation, startIndex, endIndex, filePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextObjectTextAnnotationsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fileCitation: ").append(toIndentedString(fileCitation)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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

    // add `file_path` to the URL query string
    if (getFilePath() != null) {
      joiner.add(getFilePath().toUrlQueryString(prefix + "file_path" + suffix));
    }

    return joiner.toString();
  }

}

