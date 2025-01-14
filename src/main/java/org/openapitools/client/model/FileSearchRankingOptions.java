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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 */
@JsonPropertyOrder({
  FileSearchRankingOptions.JSON_PROPERTY_RANKER,
  FileSearchRankingOptions.JSON_PROPERTY_SCORE_THRESHOLD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class FileSearchRankingOptions {
  /**
   * The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker.
   */
  public enum RankerEnum {
    AUTO(String.valueOf("auto")),
    
    DEFAULT_2024_08_21(String.valueOf("default_2024_08_21"));

    private String value;

    RankerEnum(String value) {
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
    public static RankerEnum fromValue(String value) {
      for (RankerEnum b : RankerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RANKER = "ranker";
  @javax.annotation.Nullable
  private RankerEnum ranker;

  public static final String JSON_PROPERTY_SCORE_THRESHOLD = "score_threshold";
  @javax.annotation.Nonnull
  private BigDecimal scoreThreshold;

  public FileSearchRankingOptions() {
  }

  public FileSearchRankingOptions ranker(@javax.annotation.Nullable RankerEnum ranker) {
    
    this.ranker = ranker;
    return this;
  }

  /**
   * The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker.
   * @return ranker
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RANKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RankerEnum getRanker() {
    return ranker;
  }


  @JsonProperty(JSON_PROPERTY_RANKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRanker(@javax.annotation.Nullable RankerEnum ranker) {
    this.ranker = ranker;
  }

  public FileSearchRankingOptions scoreThreshold(@javax.annotation.Nonnull BigDecimal scoreThreshold) {
    
    this.scoreThreshold = scoreThreshold;
    return this;
  }

  /**
   * The score threshold for the file search. All values must be a floating point number between 0 and 1.
   * minimum: 0
   * maximum: 1
   * @return scoreThreshold
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCORE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getScoreThreshold() {
    return scoreThreshold;
  }


  @JsonProperty(JSON_PROPERTY_SCORE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScoreThreshold(@javax.annotation.Nonnull BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSearchRankingOptions fileSearchRankingOptions = (FileSearchRankingOptions) o;
    return Objects.equals(this.ranker, fileSearchRankingOptions.ranker) &&
        Objects.equals(this.scoreThreshold, fileSearchRankingOptions.scoreThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranker, scoreThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSearchRankingOptions {\n");
    sb.append("    ranker: ").append(toIndentedString(ranker)).append("\n");
    sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
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

    // add `ranker` to the URL query string
    if (getRanker() != null) {
      try {
        joiner.add(String.format("%sranker%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRanker()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `score_threshold` to the URL query string
    if (getScoreThreshold() != null) {
      try {
        joiner.add(String.format("%sscore_threshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScoreThreshold()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

