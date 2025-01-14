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
import org.openapitools.client.model.UsageResponse;
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
 * API tests for UsageApi
 */
@Disabled
public class UsageApiTest {

    private final UsageApi api = new UsageApi();

    /**
     * Get audio speeches usage details for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageAudioSpeechesTest() throws ApiException {
        Integer startTime = null;
        Integer endTime = null;
        String bucketWidth = null;
        List<String> projectIds = null;
        List<String> userIds = null;
        List<String> apiKeyIds = null;
        List<String> models = null;
        List<String> groupBy = null;
        Integer limit = null;
        String page = null;
        UsageResponse response = api.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        // TODO: test validations
    }
    /**
     * Get audio transcriptions usage details for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageAudioTranscriptionsTest() throws ApiException {
        Integer startTime = null;
        Integer endTime = null;
        String bucketWidth = null;
        List<String> projectIds = null;
        List<String> userIds = null;
        List<String> apiKeyIds = null;
        List<String> models = null;
        List<String> groupBy = null;
        Integer limit = null;
        String page = null;
        UsageResponse response = api.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        // TODO: test validations
    }
    /**
     * Get code interpreter sessions usage details for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageCodeInterpreterSessionsTest() throws ApiException {
        Integer startTime = null;
        Integer endTime = null;
        String bucketWidth = null;
        List<String> projectIds = null;
        List<String> groupBy = null;
        Integer limit = null;
        String page = null;
        UsageResponse response = api.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);

        // TODO: test validations
    }
    /**
     * Get completions usage details for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageCompletionsTest() throws ApiException {
        Integer startTime = null;
        Integer endTime = null;
        String bucketWidth = null;
        List<String> projectIds = null;
        List<String> userIds = null;
        List<String> apiKeyIds = null;
        List<String> models = null;
        Boolean batch = null;
        List<String> groupBy = null;
        Integer limit = null;
        String page = null;
        UsageResponse response = api.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page);

        // TODO: test validations
    }
    /**
     * Get costs details for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageCostsTest() throws ApiException {
        Integer startTime = null;
        Integer endTime = null;
        String bucketWidth = null;
        List<String> projectIds = null;
        List<String> groupBy = null;
        Integer limit = null;
        String page = null;
        UsageResponse response = api.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);

        // TODO: test validations
    }
    /**
     * Get embeddings usage details for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageEmbeddingsTest() throws ApiException {
        Integer startTime = null;
        Integer endTime = null;
        String bucketWidth = null;
        List<String> projectIds = null;
        List<String> userIds = null;
        List<String> apiKeyIds = null;
        List<String> models = null;
        List<String> groupBy = null;
        Integer limit = null;
        String page = null;
        UsageResponse response = api.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        // TODO: test validations
    }
    /**
     * Get images usage details for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageImagesTest() throws ApiException {
        Integer startTime = null;
        Integer endTime = null;
        String bucketWidth = null;
        List<String> sources = null;
        List<String> sizes = null;
        List<String> projectIds = null;
        List<String> userIds = null;
        List<String> apiKeyIds = null;
        List<String> models = null;
        List<String> groupBy = null;
        Integer limit = null;
        String page = null;
        UsageResponse response = api.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        // TODO: test validations
    }
    /**
     * Get moderations usage details for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageModerationsTest() throws ApiException {
        Integer startTime = null;
        Integer endTime = null;
        String bucketWidth = null;
        List<String> projectIds = null;
        List<String> userIds = null;
        List<String> apiKeyIds = null;
        List<String> models = null;
        List<String> groupBy = null;
        Integer limit = null;
        String page = null;
        UsageResponse response = api.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        // TODO: test validations
    }
    /**
     * Get vector stores usage details for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageVectorStoresTest() throws ApiException {
        Integer startTime = null;
        Integer endTime = null;
        String bucketWidth = null;
        List<String> projectIds = null;
        List<String> groupBy = null;
        Integer limit = null;
        String page = null;
        UsageResponse response = api.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);

        // TODO: test validations
    }
}
