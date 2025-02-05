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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CreateCompletionRequest;
import org.openapitools.client.model.CreateCompletionResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompletionsApi
 */
@Disabled
public class CompletionsApiTest {

    private final CompletionsApi api = new CompletionsApi();

    /**
     * Creates a completion for the provided prompt and parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCompletionTest() throws ApiException {
        CreateCompletionRequest createCompletionRequest = null;
        CreateCompletionResponse response = api.createCompletion(createCompletionRequest);

        // TODO: test validations
    }
}
