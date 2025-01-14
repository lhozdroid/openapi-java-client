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
import org.openapitools.client.model.CreateFineTuningJobRequestHyperparametersBatchSize;
import org.openapitools.client.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
import org.openapitools.client.model.CreateFineTuningJobRequestHyperparametersNEpochs;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running &#x60;supervised&#x60; jobs.
 */
@JsonPropertyOrder({
  FineTuningJobHyperparameters.JSON_PROPERTY_BATCH_SIZE,
  FineTuningJobHyperparameters.JSON_PROPERTY_LEARNING_RATE_MULTIPLIER,
  FineTuningJobHyperparameters.JSON_PROPERTY_N_EPOCHS
})
@JsonTypeName("FineTuningJob_hyperparameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class FineTuningJobHyperparameters {
  public static final String JSON_PROPERTY_BATCH_SIZE = "batch_size";
  @javax.annotation.Nullable
  private CreateFineTuningJobRequestHyperparametersBatchSize batchSize = new CreateFineTuningJobRequestHyperparametersBatchSize();

  public static final String JSON_PROPERTY_LEARNING_RATE_MULTIPLIER = "learning_rate_multiplier";
  @javax.annotation.Nullable
  private CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier = new CreateFineTuningJobRequestHyperparametersLearningRateMultiplier();

  public static final String JSON_PROPERTY_N_EPOCHS = "n_epochs";
  @javax.annotation.Nullable
  private CreateFineTuningJobRequestHyperparametersNEpochs nEpochs = new CreateFineTuningJobRequestHyperparametersNEpochs();

  public FineTuningJobHyperparameters() {
  }

  public FineTuningJobHyperparameters batchSize(@javax.annotation.Nullable CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    
    this.batchSize = batchSize;
    return this;
  }

  /**
   * Get batchSize
   * @return batchSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateFineTuningJobRequestHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }


  @JsonProperty(JSON_PROPERTY_BATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatchSize(@javax.annotation.Nullable CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

  public FineTuningJobHyperparameters learningRateMultiplier(@javax.annotation.Nullable CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
    
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

  /**
   * Get learningRateMultiplier
   * @return learningRateMultiplier
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEARNING_RATE_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }


  @JsonProperty(JSON_PROPERTY_LEARNING_RATE_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLearningRateMultiplier(@javax.annotation.Nullable CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  public FineTuningJobHyperparameters nEpochs(@javax.annotation.Nullable CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
    
    this.nEpochs = nEpochs;
    return this;
  }

  /**
   * Get nEpochs
   * @return nEpochs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_N_EPOCHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateFineTuningJobRequestHyperparametersNEpochs getnEpochs() {
    return nEpochs;
  }


  @JsonProperty(JSON_PROPERTY_N_EPOCHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setnEpochs(@javax.annotation.Nullable CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
    this.nEpochs = nEpochs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuningJobHyperparameters fineTuningJobHyperparameters = (FineTuningJobHyperparameters) o;
    return Objects.equals(this.batchSize, fineTuningJobHyperparameters.batchSize) &&
        Objects.equals(this.learningRateMultiplier, fineTuningJobHyperparameters.learningRateMultiplier) &&
        Objects.equals(this.nEpochs, fineTuningJobHyperparameters.nEpochs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, learningRateMultiplier, nEpochs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobHyperparameters {\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    learningRateMultiplier: ").append(toIndentedString(learningRateMultiplier)).append("\n");
    sb.append("    nEpochs: ").append(toIndentedString(nEpochs)).append("\n");
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

    // add `batch_size` to the URL query string
    if (getBatchSize() != null) {
      joiner.add(getBatchSize().toUrlQueryString(prefix + "batch_size" + suffix));
    }

    // add `learning_rate_multiplier` to the URL query string
    if (getLearningRateMultiplier() != null) {
      joiner.add(getLearningRateMultiplier().toUrlQueryString(prefix + "learning_rate_multiplier" + suffix));
    }

    // add `n_epochs` to the URL query string
    if (getnEpochs() != null) {
      joiner.add(getnEpochs().toUrlQueryString(prefix + "n_epochs" + suffix));
    }

    return joiner.toString();
  }

}

