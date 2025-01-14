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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The aggregated moderations usage details of the specific time bucket.
 */
@JsonPropertyOrder({
  UsageModerationsResult.JSON_PROPERTY_OBJECT,
  UsageModerationsResult.JSON_PROPERTY_INPUT_TOKENS,
  UsageModerationsResult.JSON_PROPERTY_NUM_MODEL_REQUESTS,
  UsageModerationsResult.JSON_PROPERTY_PROJECT_ID,
  UsageModerationsResult.JSON_PROPERTY_USER_ID,
  UsageModerationsResult.JSON_PROPERTY_API_KEY_ID,
  UsageModerationsResult.JSON_PROPERTY_MODEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class UsageModerationsResult {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_MODERATIONS_RESULT(String.valueOf("organization.usage.moderations.result"));

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

  public static final String JSON_PROPERTY_INPUT_TOKENS = "input_tokens";
  @javax.annotation.Nonnull
  private Integer inputTokens;

  public static final String JSON_PROPERTY_NUM_MODEL_REQUESTS = "num_model_requests";
  @javax.annotation.Nonnull
  private Integer numModelRequests;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  @javax.annotation.Nullable
  private JsonNullable<String> projectId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  @javax.annotation.Nullable
  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_API_KEY_ID = "api_key_id";
  @javax.annotation.Nullable
  private JsonNullable<String> apiKeyId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODEL = "model";
  @javax.annotation.Nullable
  private JsonNullable<String> model = JsonNullable.<String>undefined();

  public UsageModerationsResult() {
  }

  public UsageModerationsResult _object(@javax.annotation.Nonnull ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * Get _object
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

  public UsageModerationsResult inputTokens(@javax.annotation.Nonnull Integer inputTokens) {
    
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * The aggregated number of input tokens used.
   * @return inputTokens
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getInputTokens() {
    return inputTokens;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInputTokens(@javax.annotation.Nonnull Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  public UsageModerationsResult numModelRequests(@javax.annotation.Nonnull Integer numModelRequests) {
    
    this.numModelRequests = numModelRequests;
    return this;
  }

  /**
   * The count of requests made to the model.
   * @return numModelRequests
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUM_MODEL_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumModelRequests() {
    return numModelRequests;
  }


  @JsonProperty(JSON_PROPERTY_NUM_MODEL_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumModelRequests(@javax.annotation.Nonnull Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  public UsageModerationsResult projectId(@javax.annotation.Nullable String projectId) {
    this.projectId = JsonNullable.<String>of(projectId);
    
    return this;
  }

  /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
   * @return projectId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProjectId() {
        return projectId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProjectId_JsonNullable() {
    return projectId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  public void setProjectId_JsonNullable(JsonNullable<String> projectId) {
    this.projectId = projectId;
  }

  public void setProjectId(@javax.annotation.Nullable String projectId) {
    this.projectId = JsonNullable.<String>of(projectId);
  }

  public UsageModerationsResult userId(@javax.annotation.Nullable String userId) {
    this.userId = JsonNullable.<String>of(userId);
    
    return this;
  }

  /**
   * When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
   * @return userId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUserId() {
        return userId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUserId_JsonNullable() {
    return userId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = JsonNullable.<String>of(userId);
  }

  public UsageModerationsResult apiKeyId(@javax.annotation.Nullable String apiKeyId) {
    this.apiKeyId = JsonNullable.<String>of(apiKeyId);
    
    return this;
  }

  /**
   * When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
   * @return apiKeyId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getApiKeyId() {
        return apiKeyId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_API_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getApiKeyId_JsonNullable() {
    return apiKeyId;
  }
  
  @JsonProperty(JSON_PROPERTY_API_KEY_ID)
  public void setApiKeyId_JsonNullable(JsonNullable<String> apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  public void setApiKeyId(@javax.annotation.Nullable String apiKeyId) {
    this.apiKeyId = JsonNullable.<String>of(apiKeyId);
  }

  public UsageModerationsResult model(@javax.annotation.Nullable String model) {
    this.model = JsonNullable.<String>of(model);
    
    return this;
  }

  /**
   * When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
   * @return model
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getModel() {
        return model.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getModel_JsonNullable() {
    return model;
  }
  
  @JsonProperty(JSON_PROPERTY_MODEL)
  public void setModel_JsonNullable(JsonNullable<String> model) {
    this.model = model;
  }

  public void setModel(@javax.annotation.Nullable String model) {
    this.model = JsonNullable.<String>of(model);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageModerationsResult usageModerationsResult = (UsageModerationsResult) o;
    return Objects.equals(this._object, usageModerationsResult._object) &&
        Objects.equals(this.inputTokens, usageModerationsResult.inputTokens) &&
        Objects.equals(this.numModelRequests, usageModerationsResult.numModelRequests) &&
        equalsNullable(this.projectId, usageModerationsResult.projectId) &&
        equalsNullable(this.userId, usageModerationsResult.userId) &&
        equalsNullable(this.apiKeyId, usageModerationsResult.apiKeyId) &&
        equalsNullable(this.model, usageModerationsResult.model);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, inputTokens, numModelRequests, hashCodeNullable(projectId), hashCodeNullable(userId), hashCodeNullable(apiKeyId), hashCodeNullable(model));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageModerationsResult {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    numModelRequests: ").append(toIndentedString(numModelRequests)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

    // add `object` to the URL query string
    if (getObject() != null) {
      try {
        joiner.add(String.format("%sobject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObject()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `input_tokens` to the URL query string
    if (getInputTokens() != null) {
      try {
        joiner.add(String.format("%sinput_tokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInputTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `num_model_requests` to the URL query string
    if (getNumModelRequests() != null) {
      try {
        joiner.add(String.format("%snum_model_requests%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumModelRequests()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `project_id` to the URL query string
    if (getProjectId() != null) {
      try {
        joiner.add(String.format("%sproject_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProjectId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `user_id` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suser_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `api_key_id` to the URL query string
    if (getApiKeyId() != null) {
      try {
        joiner.add(String.format("%sapi_key_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApiKeyId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `model` to the URL query string
    if (getModel() != null) {
      try {
        joiner.add(String.format("%smodel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

