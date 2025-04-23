# GotIt Merchant SDK
SDK Technical document for Merchant APIs

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.dayone</groupId>
  <artifactId>gotit-merchant</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'gotit-merchant' jar has been published to maven central.
    mavenLocal()       // Needed if the 'gotit-merchant' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.dayone:gotit-merchant:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/gotit-merchant-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GotItMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi-stg.gotit.vn");

    GotItMerchantApi apiInstance = new GotItMerchantApi(defaultClient);

    String pin = "4205";
    String billNumber = "BILL071717127083";
    String sku1 = "3002275";
    int quantity1 = 2;
    int price1 = 100000;
    String sku2 = "3002980";
    int quantity2 = 3;
    int price2 = 100000;

    RequestCheckMultipleBodySchema body = new RequestCheckMultipleBodySchema();
    body.setPin(pin);
    body.setCodes(Arrays.asList("071717127083"));
    body.setBillNumber(billNumber);
    body.setSkusInfo(Arrays.asList(
            new RequestCheckMultipleBodySchemaSkusInfoInner().sku(sku1).quantity(quantity1).price(price1),
            new RequestCheckMultipleBodySchemaSkusInfoInner().sku(sku2).quantity(quantity2).price(price2)
    ));
    try {
      ResponseCheckMultipleSchema result = apiInstance.checkMultiple(body);
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

## Documentation for API Endpoints

All URIs are relative to *https://openapi-stg.gotit.vn*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GotItMerchantApi* | [**checkMultiple**](docs/GotItMerchantApi.md#checkMultiple) | **POST** /merchant/v6.0/checkmultiple | Check multiple vouchers are valid or not
*GotItMerchantApi* | [**reserved**](docs/GotItMerchantApi.md#reserved) | **POST** /merchant/v6.0/reserved | Reserved multiple vouchers for a fixed bill number.
*GotItMerchantApi* | [**unreserved**](docs/GotItMerchantApi.md#unreserved) | **POST** /merchant/v6.0/unreserved | Reserved multiple vouchers for a fixed bill number.
*GotItMerchantApi* | [**useMultiple**](docs/GotItMerchantApi.md#useMultiple) | **POST** /merchant/v6.0/usemultiple | Reserved multiple vouchers for a fixed bill number.


## Documentation for Models

 - [RequestCheckMultipleBodySchema](docs/RequestCheckMultipleBodySchema.md)
 - [RequestCheckMultipleBodySchemaSkusInfoInner](docs/RequestCheckMultipleBodySchemaSkusInfoInner.md)
 - [RequestMarkUseMultipleBodySchema](docs/RequestMarkUseMultipleBodySchema.md)
 - [RequestReservedBodySchema](docs/RequestReservedBodySchema.md)
 - [RequestUnReservedBodySchema](docs/RequestUnReservedBodySchema.md)
 - [ResponseCheckMultipleSchema](docs/ResponseCheckMultipleSchema.md)
 - [ResponseCheckMultipleSchemaDataInner](docs/ResponseCheckMultipleSchemaDataInner.md)
 - [ResponseCheckMultipleSchemaDataInnerConditions](docs/ResponseCheckMultipleSchemaDataInnerConditions.md)
 - [ResponseCheckMultipleSchemaDataInnerRedemptions](docs/ResponseCheckMultipleSchemaDataInnerRedemptions.md)
 - [ResponseCheckMultipleSchemaDataInnerRedemptionsRedeemSkuCodesInner](docs/ResponseCheckMultipleSchemaDataInnerRedemptionsRedeemSkuCodesInner.md)
 - [ResponseCheckMultipleSchemaDataInnerRedemptionsUsedStore](docs/ResponseCheckMultipleSchemaDataInnerRedemptionsUsedStore.md)
 - [ResponseMarkUseMultipleSchema](docs/ResponseMarkUseMultipleSchema.md)
 - [ResponseMarkUseMultipleSchemaDataInner](docs/ResponseMarkUseMultipleSchemaDataInner.md)
 - [ResponseMarkUseMultipleSchemaDataInnerConditions](docs/ResponseMarkUseMultipleSchemaDataInnerConditions.md)
 - [ResponseMarkUseMultipleSchemaDataInnerRedemptions](docs/ResponseMarkUseMultipleSchemaDataInnerRedemptions.md)
 - [ResponseReservedSchema](docs/ResponseReservedSchema.md)
 - [ResponseReservedSchemaDataInner](docs/ResponseReservedSchemaDataInner.md)
 - [ResponseReservedSchemaDataInnerRedemptions](docs/ResponseReservedSchemaDataInnerRedemptions.md)
 - [ResponseReservedSchemaUsedStore](docs/ResponseReservedSchemaUsedStore.md)
 - [ResponseUnReservedSchema](docs/ResponseUnReservedSchema.md)
 - [ResponseUnReservedSchemaDataInner](docs/ResponseUnReservedSchemaDataInner.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Tests

To run the tests, use:

```bash
mvn test
```
