# GotItMerchantApi

All URIs are relative to *https://openapi-stg.gotit.vn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkMultiple**](GotItMerchantApi.md#checkMultiple) | **POST** /merchant/v6.0/checkmultiple | Check multiple vouchers are valid or not |
| [**reserved**](GotItMerchantApi.md#reserved) | **POST** /merchant/v6.0/reserved | Reserved multiple vouchers for a fixed bill number. |
| [**unreserved**](GotItMerchantApi.md#unreserved) | **POST** /merchant/v6.0/unreserved | Reserved multiple vouchers for a fixed bill number. |
| [**useMultiple**](GotItMerchantApi.md#useMultiple) | **POST** /merchant/v6.0/usemultiple | Reserved multiple vouchers for a fixed bill number. |


<a id="checkMultiple"></a>
# **checkMultiple**
> ResponseCheckMultipleSchema checkMultiple(requestCheckMultipleBodySchema)

Check multiple vouchers are valid or not

Check multiple vouchers are valid or not

### Example
```java
// Import classes:
import com.gotit_merchant_api.ApiClient;
import com.gotit_merchant_api.ApiException;
import com.gotit_merchant_api.Configuration;
import com.gotit_merchant_api.models.*;
import com.gotit_merchant_api.GotItMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi-stg.gotit.vn");

    GotItMerchantApi apiInstance = new GotItMerchantApi(defaultClient);
    RequestCheckMultipleBodySchema requestCheckMultipleBodySchema = new RequestCheckMultipleBodySchema(); // RequestCheckMultipleBodySchema | 
    try {
      ResponseCheckMultipleSchema result = apiInstance.checkMultiple(requestCheckMultipleBodySchema);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GotItMerchantApi#checkMultiple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestCheckMultipleBodySchema** | [**RequestCheckMultipleBodySchema**](RequestCheckMultipleBodySchema.md)|  | [optional] |

### Return type

[**ResponseCheckMultipleSchema**](ResponseCheckMultipleSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was received and processed. |  -  |
| **500** | Unexpected error |  -  |

<a id="reserved"></a>
# **reserved**
> ResponseReservedSchema reserved(requestReservedBodySchema)

Reserved multiple vouchers for a fixed bill number.

Reserved multiple vouchers for a fixed bill number.

### Example
```java
// Import classes:
import com.gotit_merchant_api.ApiClient;
import com.gotit_merchant_api.ApiException;
import com.gotit_merchant_api.Configuration;
import com.gotit_merchant_api.models.*;
import com.gotit_merchant_api.GotItMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi-stg.gotit.vn");

    GotItMerchantApi apiInstance = new GotItMerchantApi(defaultClient);
    RequestReservedBodySchema requestReservedBodySchema = new RequestReservedBodySchema(); // RequestReservedBodySchema | 
    try {
      ResponseReservedSchema result = apiInstance.reserved(requestReservedBodySchema);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GotItMerchantApi#reserved");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestReservedBodySchema** | [**RequestReservedBodySchema**](RequestReservedBodySchema.md)|  | [optional] |

### Return type

[**ResponseReservedSchema**](ResponseReservedSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was received and processed. |  -  |
| **500** | Unexpected error |  -  |

<a id="unreserved"></a>
# **unreserved**
> ResponseUnReservedSchema unreserved(requestUnReservedBodySchema)

Reserved multiple vouchers for a fixed bill number.

Reserved multiple vouchers for a fixed bill number.

### Example
```java
// Import classes:
import com.gotit_merchant_api.ApiClient;
import com.gotit_merchant_api.ApiException;
import com.gotit_merchant_api.Configuration;
import com.gotit_merchant_api.models.*;
import com.gotit_merchant_api.GotItMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi-stg.gotit.vn");

    GotItMerchantApi apiInstance = new GotItMerchantApi(defaultClient);
    RequestUnReservedBodySchema requestUnReservedBodySchema = new RequestUnReservedBodySchema(); // RequestUnReservedBodySchema | 
    try {
      ResponseUnReservedSchema result = apiInstance.unreserved(requestUnReservedBodySchema);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GotItMerchantApi#unreserved");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestUnReservedBodySchema** | [**RequestUnReservedBodySchema**](RequestUnReservedBodySchema.md)|  | [optional] |

### Return type

[**ResponseUnReservedSchema**](ResponseUnReservedSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was received and processed. |  -  |
| **500** | Unexpected error |  -  |

<a id="useMultiple"></a>
# **useMultiple**
> ResponseMarkUseMultipleSchema useMultiple(requestMarkUseMultipleBodySchema)

Reserved multiple vouchers for a fixed bill number.

Reserved multiple vouchers for a fixed bill number.

### Example
```java
// Import classes:
import com.gotit_merchant_api.ApiClient;
import com.gotit_merchant_api.ApiException;
import com.gotit_merchant_api.Configuration;
import com.gotit_merchant_api.models.*;
import com.gotit_merchant_api.GotItMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi-stg.gotit.vn");

    GotItMerchantApi apiInstance = new GotItMerchantApi(defaultClient);
    RequestMarkUseMultipleBodySchema requestMarkUseMultipleBodySchema = new RequestMarkUseMultipleBodySchema(); // RequestMarkUseMultipleBodySchema | 
    try {
      ResponseMarkUseMultipleSchema result = apiInstance.useMultiple(requestMarkUseMultipleBodySchema);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GotItMerchantApi#useMultiple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestMarkUseMultipleBodySchema** | [**RequestMarkUseMultipleBodySchema**](RequestMarkUseMultipleBodySchema.md)|  | [optional] |

### Return type

[**ResponseMarkUseMultipleSchema**](ResponseMarkUseMultipleSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was received and processed. |  -  |
| **500** | Unexpected error |  -  |

