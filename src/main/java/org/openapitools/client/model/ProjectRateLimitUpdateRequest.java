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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ProjectRateLimitUpdateRequest
 */
@JsonPropertyOrder({
  ProjectRateLimitUpdateRequest.JSON_PROPERTY_MAX_REQUESTS_PER1_MINUTE,
  ProjectRateLimitUpdateRequest.JSON_PROPERTY_MAX_TOKENS_PER1_MINUTE,
  ProjectRateLimitUpdateRequest.JSON_PROPERTY_MAX_IMAGES_PER1_MINUTE,
  ProjectRateLimitUpdateRequest.JSON_PROPERTY_MAX_AUDIO_MEGABYTES_PER1_MINUTE,
  ProjectRateLimitUpdateRequest.JSON_PROPERTY_MAX_REQUESTS_PER1_DAY,
  ProjectRateLimitUpdateRequest.JSON_PROPERTY_BATCH1_DAY_MAX_INPUT_TOKENS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class ProjectRateLimitUpdateRequest {
  public static final String JSON_PROPERTY_MAX_REQUESTS_PER1_MINUTE = "max_requests_per_1_minute";
  @javax.annotation.Nullable
  private Integer maxRequestsPer1Minute;

  public static final String JSON_PROPERTY_MAX_TOKENS_PER1_MINUTE = "max_tokens_per_1_minute";
  @javax.annotation.Nullable
  private Integer maxTokensPer1Minute;

  public static final String JSON_PROPERTY_MAX_IMAGES_PER1_MINUTE = "max_images_per_1_minute";
  @javax.annotation.Nullable
  private Integer maxImagesPer1Minute;

  public static final String JSON_PROPERTY_MAX_AUDIO_MEGABYTES_PER1_MINUTE = "max_audio_megabytes_per_1_minute";
  @javax.annotation.Nullable
  private Integer maxAudioMegabytesPer1Minute;

  public static final String JSON_PROPERTY_MAX_REQUESTS_PER1_DAY = "max_requests_per_1_day";
  @javax.annotation.Nullable
  private Integer maxRequestsPer1Day;

  public static final String JSON_PROPERTY_BATCH1_DAY_MAX_INPUT_TOKENS = "batch_1_day_max_input_tokens";
  @javax.annotation.Nullable
  private Integer batch1DayMaxInputTokens;

  public ProjectRateLimitUpdateRequest() {
  }

  public ProjectRateLimitUpdateRequest maxRequestsPer1Minute(@javax.annotation.Nullable Integer maxRequestsPer1Minute) {
    
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
    return this;
  }

  /**
   * The maximum requests per minute.
   * @return maxRequestsPer1Minute
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_REQUESTS_PER1_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxRequestsPer1Minute() {
    return maxRequestsPer1Minute;
  }


  @JsonProperty(JSON_PROPERTY_MAX_REQUESTS_PER1_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxRequestsPer1Minute(@javax.annotation.Nullable Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxTokensPer1Minute(@javax.annotation.Nullable Integer maxTokensPer1Minute) {
    
    this.maxTokensPer1Minute = maxTokensPer1Minute;
    return this;
  }

  /**
   * The maximum tokens per minute.
   * @return maxTokensPer1Minute
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_TOKENS_PER1_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxTokensPer1Minute() {
    return maxTokensPer1Minute;
  }


  @JsonProperty(JSON_PROPERTY_MAX_TOKENS_PER1_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxTokensPer1Minute(@javax.annotation.Nullable Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxImagesPer1Minute(@javax.annotation.Nullable Integer maxImagesPer1Minute) {
    
    this.maxImagesPer1Minute = maxImagesPer1Minute;
    return this;
  }

  /**
   * The maximum images per minute. Only relevant for certain models.
   * @return maxImagesPer1Minute
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_IMAGES_PER1_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxImagesPer1Minute() {
    return maxImagesPer1Minute;
  }


  @JsonProperty(JSON_PROPERTY_MAX_IMAGES_PER1_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxImagesPer1Minute(@javax.annotation.Nullable Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxAudioMegabytesPer1Minute(@javax.annotation.Nullable Integer maxAudioMegabytesPer1Minute) {
    
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
    return this;
  }

  /**
   * The maximum audio megabytes per minute. Only relevant for certain models.
   * @return maxAudioMegabytesPer1Minute
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_AUDIO_MEGABYTES_PER1_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxAudioMegabytesPer1Minute() {
    return maxAudioMegabytesPer1Minute;
  }


  @JsonProperty(JSON_PROPERTY_MAX_AUDIO_MEGABYTES_PER1_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAudioMegabytesPer1Minute(@javax.annotation.Nullable Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxRequestsPer1Day(@javax.annotation.Nullable Integer maxRequestsPer1Day) {
    
    this.maxRequestsPer1Day = maxRequestsPer1Day;
    return this;
  }

  /**
   * The maximum requests per day. Only relevant for certain models.
   * @return maxRequestsPer1Day
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_REQUESTS_PER1_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxRequestsPer1Day() {
    return maxRequestsPer1Day;
  }


  @JsonProperty(JSON_PROPERTY_MAX_REQUESTS_PER1_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxRequestsPer1Day(@javax.annotation.Nullable Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
  }

  public ProjectRateLimitUpdateRequest batch1DayMaxInputTokens(@javax.annotation.Nullable Integer batch1DayMaxInputTokens) {
    
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
    return this;
  }

  /**
   * The maximum batch input tokens per day. Only relevant for certain models.
   * @return batch1DayMaxInputTokens
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH1_DAY_MAX_INPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBatch1DayMaxInputTokens() {
    return batch1DayMaxInputTokens;
  }


  @JsonProperty(JSON_PROPERTY_BATCH1_DAY_MAX_INPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatch1DayMaxInputTokens(@javax.annotation.Nullable Integer batch1DayMaxInputTokens) {
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest = (ProjectRateLimitUpdateRequest) o;
    return Objects.equals(this.maxRequestsPer1Minute, projectRateLimitUpdateRequest.maxRequestsPer1Minute) &&
        Objects.equals(this.maxTokensPer1Minute, projectRateLimitUpdateRequest.maxTokensPer1Minute) &&
        Objects.equals(this.maxImagesPer1Minute, projectRateLimitUpdateRequest.maxImagesPer1Minute) &&
        Objects.equals(this.maxAudioMegabytesPer1Minute, projectRateLimitUpdateRequest.maxAudioMegabytesPer1Minute) &&
        Objects.equals(this.maxRequestsPer1Day, projectRateLimitUpdateRequest.maxRequestsPer1Day) &&
        Objects.equals(this.batch1DayMaxInputTokens, projectRateLimitUpdateRequest.batch1DayMaxInputTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRequestsPer1Minute, maxTokensPer1Minute, maxImagesPer1Minute, maxAudioMegabytesPer1Minute, maxRequestsPer1Day, batch1DayMaxInputTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRateLimitUpdateRequest {\n");
    sb.append("    maxRequestsPer1Minute: ").append(toIndentedString(maxRequestsPer1Minute)).append("\n");
    sb.append("    maxTokensPer1Minute: ").append(toIndentedString(maxTokensPer1Minute)).append("\n");
    sb.append("    maxImagesPer1Minute: ").append(toIndentedString(maxImagesPer1Minute)).append("\n");
    sb.append("    maxAudioMegabytesPer1Minute: ").append(toIndentedString(maxAudioMegabytesPer1Minute)).append("\n");
    sb.append("    maxRequestsPer1Day: ").append(toIndentedString(maxRequestsPer1Day)).append("\n");
    sb.append("    batch1DayMaxInputTokens: ").append(toIndentedString(batch1DayMaxInputTokens)).append("\n");
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

    // add `max_requests_per_1_minute` to the URL query string
    if (getMaxRequestsPer1Minute() != null) {
      try {
        joiner.add(String.format("%smax_requests_per_1_minute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxRequestsPer1Minute()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_tokens_per_1_minute` to the URL query string
    if (getMaxTokensPer1Minute() != null) {
      try {
        joiner.add(String.format("%smax_tokens_per_1_minute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxTokensPer1Minute()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_images_per_1_minute` to the URL query string
    if (getMaxImagesPer1Minute() != null) {
      try {
        joiner.add(String.format("%smax_images_per_1_minute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxImagesPer1Minute()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_audio_megabytes_per_1_minute` to the URL query string
    if (getMaxAudioMegabytesPer1Minute() != null) {
      try {
        joiner.add(String.format("%smax_audio_megabytes_per_1_minute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxAudioMegabytesPer1Minute()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_requests_per_1_day` to the URL query string
    if (getMaxRequestsPer1Day() != null) {
      try {
        joiner.add(String.format("%smax_requests_per_1_day%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxRequestsPer1Day()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `batch_1_day_max_input_tokens` to the URL query string
    if (getBatch1DayMaxInputTokens() != null) {
      try {
        joiner.add(String.format("%sbatch_1_day_max_input_tokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBatch1DayMaxInputTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

