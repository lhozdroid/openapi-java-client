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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AssistantObjectToolsInner;
import org.openapitools.client.model.AssistantsApiResponseFormatOption;
import org.openapitools.client.model.AssistantsApiToolChoiceOption;
import org.openapitools.client.model.CreateMessageRequest;
import org.openapitools.client.model.CreateRunRequestModel;
import org.openapitools.client.model.TruncationObject;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for CreateRunRequest
 */
class CreateRunRequestTest {
    private final CreateRunRequest model = new CreateRunRequest();

    /**
     * Model tests for CreateRunRequest
     */
    @Test
    void testCreateRunRequest() {
        // TODO: test CreateRunRequest
    }

    /**
     * Test the property 'assistantId'
     */
    @Test
    void assistantIdTest() {
        // TODO: test assistantId
    }

    /**
     * Test the property 'model'
     */
    @Test
    void modelTest() {
        // TODO: test model
    }

    /**
     * Test the property 'instructions'
     */
    @Test
    void instructionsTest() {
        // TODO: test instructions
    }

    /**
     * Test the property 'additionalInstructions'
     */
    @Test
    void additionalInstructionsTest() {
        // TODO: test additionalInstructions
    }

    /**
     * Test the property 'additionalMessages'
     */
    @Test
    void additionalMessagesTest() {
        // TODO: test additionalMessages
    }

    /**
     * Test the property 'tools'
     */
    @Test
    void toolsTest() {
        // TODO: test tools
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'temperature'
     */
    @Test
    void temperatureTest() {
        // TODO: test temperature
    }

    /**
     * Test the property 'topP'
     */
    @Test
    void topPTest() {
        // TODO: test topP
    }

    /**
     * Test the property 'stream'
     */
    @Test
    void streamTest() {
        // TODO: test stream
    }

    /**
     * Test the property 'maxPromptTokens'
     */
    @Test
    void maxPromptTokensTest() {
        // TODO: test maxPromptTokens
    }

    /**
     * Test the property 'maxCompletionTokens'
     */
    @Test
    void maxCompletionTokensTest() {
        // TODO: test maxCompletionTokens
    }

    /**
     * Test the property 'truncationStrategy'
     */
    @Test
    void truncationStrategyTest() {
        // TODO: test truncationStrategy
    }

    /**
     * Test the property 'toolChoice'
     */
    @Test
    void toolChoiceTest() {
        // TODO: test toolChoice
    }

    /**
     * Test the property 'parallelToolCalls'
     */
    @Test
    void parallelToolCallsTest() {
        // TODO: test parallelToolCalls
    }

    /**
     * Test the property 'responseFormat'
     */
    @Test
    void responseFormatTest() {
        // TODO: test responseFormat
    }

}
