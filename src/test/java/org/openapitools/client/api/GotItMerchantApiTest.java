package gotit_merchant_apis_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.GotItMerchantApi;
import org.openapitools.client.model.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class GotItMerchantApiTest {

    private GotItMerchantApi api;

    @BeforeEach
    public void setUp() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://openapi-stg.gotit.vn");
        api = new GotItMerchantApi(apiClient);
    }

    @Nested
    @DisplayName("Test CheckMultiple")
    class TestCheckMultiple {
        @Test
        public void testCheckMultiple() {
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
                ResponseCheckMultipleSchema response = api.checkMultiple(body);
                assertNotNull(response);
                assertFalse(response.getSuccess());
            } catch (ApiException e) {
                fail("Exception when calling GotItMerchantApi#checkMultiple: " + e.getMessage());
            }
        }
    }

    @Nested
    @DisplayName("Test Reserved")
    class TestReserved {
        @Test
        public void testReserved() {
            String pin = "4205";
            String billNumber = "BILL071717127083";
            String sku1 = "3002275";
            int quantity1 = 2;
            int price1 = 100000;
            String sku2 = "3002980";
            int quantity2 = 3;
            int price2 = 100000;

            RequestReservedBodySchema body = new RequestReservedBodySchema();
            body.setPin(pin);
            body.setCodes(Arrays.asList("071717127083"));
            body.setBillNumber(billNumber);
            body.setSkusInfo(Arrays.asList(
                    new RequestCheckMultipleBodySchemaSkusInfoInner().sku(sku1).quantity(quantity1).price(price1),
                    new RequestCheckMultipleBodySchemaSkusInfoInner().sku(sku2).quantity(quantity2).price(price2)
            ));

            try {
                ResponseReservedSchema response = api.reserved(body);
                assertNotNull(response);
                assertFalse(response.getSuccess());
            } catch (ApiException e) {
                fail("Exception when calling GotItMerchantApi#reserved: " + e.getMessage());
            }
        }
    }

    @Nested
    @DisplayName("Test Unreserved")
    class TestUnreserved {
        @Test
        public void testUnreserved() {
            String pin = "4205";
            String billNumber = "BILL071717127083";

            RequestUnReservedBodySchema body = new RequestUnReservedBodySchema();
            body.setPin(pin);
            body.setCodes(Arrays.asList("071717127083"));
            body.setBillNumber(billNumber);

            try {
                ResponseUnReservedSchema response = api.unreserved(body);
                assertNotNull(response);
                assertFalse(response.getSuccess());
            } catch (ApiException e) {
                fail("Exception when calling GotItMerchantApi#unreserved: " + e.getMessage());
            }
        }
    }

    @Nested
    @DisplayName("Test UseMultiple")
    class TestUseMultiple {
        @Test
        public void testUseMultiple() {
            String pin = "4205";
            String billNumber = "BILL071717127083";
            String sku1 = "3002275";
            int quantity1 = 2;
            int price1 = 100000;
            String sku2 = "3002980";
            int quantity2 = 3;
            int price2 = 100000;

            RequestMarkUseMultipleBodySchema body = new RequestMarkUseMultipleBodySchema();
            body.setPin(pin);
            body.setCodes(Arrays.asList("071717127083"));
            body.setBillNumber(billNumber);
            body.setSkusInfo(Arrays.asList(
                    new RequestCheckMultipleBodySchemaSkusInfoInner().sku(sku1).quantity(quantity1).price(price1),
                    new RequestCheckMultipleBodySchemaSkusInfoInner().sku(sku2).quantity(quantity2).price(price2)
            ));

            try {
                ResponseMarkUseMultipleSchema response = api.useMultiple(body);
                assertNotNull(response);
                assertFalse(response.getSuccess());
            } catch (ApiException e) {
                fail("Exception when calling GotItMerchantApi#useMultiple: " + e.getMessage());
            }
        }
    }
}
