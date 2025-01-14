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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The event type.
 */
public enum AuditLogEventType {
  
  API_KEY_CREATED("api_key.created"),
  
  API_KEY_UPDATED("api_key.updated"),
  
  API_KEY_DELETED("api_key.deleted"),
  
  INVITE_SENT("invite.sent"),
  
  INVITE_ACCEPTED("invite.accepted"),
  
  INVITE_DELETED("invite.deleted"),
  
  LOGIN_SUCCEEDED("login.succeeded"),
  
  LOGIN_FAILED("login.failed"),
  
  LOGOUT_SUCCEEDED("logout.succeeded"),
  
  LOGOUT_FAILED("logout.failed"),
  
  ORGANIZATION_UPDATED("organization.updated"),
  
  PROJECT_CREATED("project.created"),
  
  PROJECT_UPDATED("project.updated"),
  
  PROJECT_ARCHIVED("project.archived"),
  
  SERVICE_ACCOUNT_CREATED("service_account.created"),
  
  SERVICE_ACCOUNT_UPDATED("service_account.updated"),
  
  SERVICE_ACCOUNT_DELETED("service_account.deleted"),
  
  RATE_LIMIT_UPDATED("rate_limit.updated"),
  
  RATE_LIMIT_DELETED("rate_limit.deleted"),
  
  USER_ADDED("user.added"),
  
  USER_UPDATED("user.updated"),
  
  USER_DELETED("user.deleted");

  private String value;

  AuditLogEventType(String value) {
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
  public static AuditLogEventType fromValue(String value) {
    for (AuditLogEventType b : AuditLogEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }
}

