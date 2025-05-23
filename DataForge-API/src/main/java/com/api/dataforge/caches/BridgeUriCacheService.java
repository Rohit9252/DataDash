package com.api.dataforge.caches;


import com.api.dataforge.components.BridgeApiUriBuilder;
import com.api.dataforge.components.MockServerURLBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
public class BridgeUriCacheService {


    private final Map<String, String> uriCache = new ConcurrentHashMap<>();

    private final BridgeApiUriBuilder bridgeApiUriBuilder;

    private final MockServerURLBuilder mockServerURLBuilder;

    public BridgeUriCacheService(BridgeApiUriBuilder bridgeApiUriBuilder, MockServerURLBuilder mockServerURLBuilder) {
        this.bridgeApiUriBuilder = bridgeApiUriBuilder;
        this.mockServerURLBuilder = mockServerURLBuilder;
    }

    public String getUri(String dataSet, String resource) {
        String key = String.format("BUILD::%s::%s", dataSet, resource);
        return uriCache.computeIfAbsent(key, k -> {
            String uri = bridgeApiUriBuilder.build(dataSet, resource);
            log.info("🔧 Built new URI: {}", uri);
            return uri;
        });
    }

    public String getUriWithId(String dataSet, String resource, String keyId) {
        String key = String.format("BUILD_ID::%s::%s::%s", dataSet, resource, keyId);
        return uriCache.computeIfAbsent(key, k -> {
            String uri = bridgeApiUriBuilder.buildWithId(dataSet, resource, keyId);
            log.info("🔧 Built new URI with ID: {}", uri);
            return uri;
        });
    }

    public String getODataUri(String dataSet, String entityName) {
        String key = String.format("ODATA::%s::%s", dataSet, entityName);
        return uriCache.computeIfAbsent(key, k -> {
            String uri = bridgeApiUriBuilder.buildOData(dataSet, entityName);
            log.info("🔧 Built new OData URI: {}", uri);
            return uri;
        });
    }

    public String getODataUriWithKey(String dataSet, String entityName, String keyId) {
        String key = String.format("ODATA_KEY::%s::%s::%s", dataSet, entityName, keyId);
        return uriCache.computeIfAbsent(key, k -> {
            String uri = bridgeApiUriBuilder.buildODataWithKey(dataSet, entityName, keyId);
            log.info("🔧 Built new OData URI with Key: {}", uri);
            return uri;
        });
    }

    public String getODataPathUri(String... pathSegments) {
        String key = "ODATA_PATH::" + String.join("/", pathSegments);
        return uriCache.computeIfAbsent(key, k -> {
            String uri = bridgeApiUriBuilder.buildODataPath(pathSegments);
            log.info("🔧 Built new OData Path URI: {}", uri);
            return uri;
        });
    }

    public String getUriWithParams(String dataSet, String resource, Map<String, String> params) {
        StringBuilder keyBuilder = new StringBuilder(String.format("BUILD_PARAMS::%s::%s", dataSet, resource));
        params.forEach((k, v) -> keyBuilder.append("::").append(k).append("=").append(v));

        String key = keyBuilder.toString();
        return uriCache.computeIfAbsent(key, k -> {
            String uri = bridgeApiUriBuilder.buildWithParams(dataSet, resource, params);
            log.info("🔧 Built new URI with Params: {}", uri);
            return uri;
        });
    }

    public String getMockUri(String dataSet, String resource) {
        String key = String.format("MOCK::%s::%s", dataSet, resource);
        return uriCache.computeIfAbsent(key, k -> {
            String uri = mockServerURLBuilder.buildUri(dataSet, resource);
            log.info("🔧 Built new MOCK URI: {}", uri);
            return uri;
        });
    }

    public String getMockUri(String dataSet, String... resources) {
        String key = "MOCK_VARARGS::" + dataSet + "::" + String.join("/", resources);
        return uriCache.computeIfAbsent(key, k -> {
            String uri = mockServerURLBuilder.buildUri(dataSet, resources);
            log.info("🔧 Built new MOCK URI (varargs): {}", uri);
            return uri;
        });
    }


}
