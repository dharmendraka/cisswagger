/*
 * cis-verification-cpd-service
 * This document consists of unecrypted version of  Experian Verify service endpoints. This service returns standard payroll data Report which has paycheck, employer, employee PII, grosspay and other information.
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.AuthenticationErrorResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.VoieRequestParams;
import org.openapitools.client.model.VoieResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumerServicesApi {
    private ApiClient localVarApiClient;

    public ConsumerServicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConsumerServicesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCpdIncomeAndEmploymentData
     * @param clientReferenceId API client generated reference Id to uniquely identify the  transaction. (required)
     * @param contentType Input Request format (required)
     * @param accept Output Response format (required)
     * @param subcode unique value provided by experian at onboarding (required)
     * @param body Consumer&#39;s PII , Requestor Information, Addons and any custom options to be specified here. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> API responds with a JSON. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 405 </td><td> Method not Allowed </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> bad gateway. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway Timeout. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCpdIncomeAndEmploymentDataCall(String clientReferenceId, String contentType, String accept, String subcode, VoieRequestParams body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/experianverify";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clientReferenceId != null) {
            localVarHeaderParams.put("clientReferenceId", localVarApiClient.parameterToString(clientReferenceId));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        if (subcode != null) {
            localVarHeaderParams.put("subcode", localVarApiClient.parameterToString(subcode));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OauthSecurity" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCpdIncomeAndEmploymentDataValidateBeforeCall(String clientReferenceId, String contentType, String accept, String subcode, VoieRequestParams body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clientReferenceId' is set
        if (clientReferenceId == null) {
            throw new ApiException("Missing the required parameter 'clientReferenceId' when calling getCpdIncomeAndEmploymentData(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling getCpdIncomeAndEmploymentData(Async)");
        }
        
        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling getCpdIncomeAndEmploymentData(Async)");
        }
        
        // verify the required parameter 'subcode' is set
        if (subcode == null) {
            throw new ApiException("Missing the required parameter 'subcode' when calling getCpdIncomeAndEmploymentData(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getCpdIncomeAndEmploymentData(Async)");
        }
        

        okhttp3.Call localVarCall = getCpdIncomeAndEmploymentDataCall(clientReferenceId, contentType, accept, subcode, body, _callback);
        return localVarCall;

    }

    /**
     * Experian Verify income and employment report
     * Returns income and employment data for a given consumer from employee payroll provider.
     * @param clientReferenceId API client generated reference Id to uniquely identify the  transaction. (required)
     * @param contentType Input Request format (required)
     * @param accept Output Response format (required)
     * @param subcode unique value provided by experian at onboarding (required)
     * @param body Consumer&#39;s PII , Requestor Information, Addons and any custom options to be specified here. (required)
     * @return VoieResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> API responds with a JSON. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 405 </td><td> Method not Allowed </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> bad gateway. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway Timeout. </td><td>  -  </td></tr>
     </table>
     */
    public VoieResponse getCpdIncomeAndEmploymentData(String clientReferenceId, String contentType, String accept, String subcode, VoieRequestParams body) throws ApiException {
        ApiResponse<VoieResponse> localVarResp = getCpdIncomeAndEmploymentDataWithHttpInfo(clientReferenceId, contentType, accept, subcode, body);
        return localVarResp.getData();
    }

    /**
     * Experian Verify income and employment report
     * Returns income and employment data for a given consumer from employee payroll provider.
     * @param clientReferenceId API client generated reference Id to uniquely identify the  transaction. (required)
     * @param contentType Input Request format (required)
     * @param accept Output Response format (required)
     * @param subcode unique value provided by experian at onboarding (required)
     * @param body Consumer&#39;s PII , Requestor Information, Addons and any custom options to be specified here. (required)
     * @return ApiResponse&lt;VoieResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> API responds with a JSON. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 405 </td><td> Method not Allowed </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> bad gateway. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway Timeout. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VoieResponse> getCpdIncomeAndEmploymentDataWithHttpInfo(String clientReferenceId, String contentType, String accept, String subcode, VoieRequestParams body) throws ApiException {
        okhttp3.Call localVarCall = getCpdIncomeAndEmploymentDataValidateBeforeCall(clientReferenceId, contentType, accept, subcode, body, null);
        Type localVarReturnType = new TypeToken<VoieResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Experian Verify income and employment report (asynchronously)
     * Returns income and employment data for a given consumer from employee payroll provider.
     * @param clientReferenceId API client generated reference Id to uniquely identify the  transaction. (required)
     * @param contentType Input Request format (required)
     * @param accept Output Response format (required)
     * @param subcode unique value provided by experian at onboarding (required)
     * @param body Consumer&#39;s PII , Requestor Information, Addons and any custom options to be specified here. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> API responds with a JSON. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found. </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 405 </td><td> Method not Allowed </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> bad gateway. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway Timeout. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCpdIncomeAndEmploymentDataAsync(String clientReferenceId, String contentType, String accept, String subcode, VoieRequestParams body, final ApiCallback<VoieResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCpdIncomeAndEmploymentDataValidateBeforeCall(clientReferenceId, contentType, accept, subcode, body, _callback);
        Type localVarReturnType = new TypeToken<VoieResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
