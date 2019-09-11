/*
 * Copyright 2017-2019, Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.kafka.oauth.client;

import io.strimzi.kafka.oauth.common.Config;

public class ClientConfig extends Config {

    public static final String OAUTH_ACCESS_TOKEN = "oauth.access.token";
    public static final String OAUTH_REFRESH_TOKEN = "oauth.refresh.token";
    public static final String OAUTH_TOKEN_ENDPOINT_URI = "oauth.token.endpoint.uri";

    public ClientConfig() {
    }

    public ClientConfig(java.util.Properties p) {
        super(p);
    }
}
