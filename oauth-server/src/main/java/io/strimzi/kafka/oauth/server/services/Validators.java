/*
 * Copyright 2017-2020, Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.kafka.oauth.server.services;

import io.strimzi.kafka.oauth.validator.TokenValidator;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class Validators {

    private ConcurrentHashMap<ValidatorKey, TokenValidator> registry = new ConcurrentHashMap<>();


    public void put(ValidatorKey key, TokenValidator validator) {
        registry.put(key, validator);
    }

    public TokenValidator get(ValidatorKey key) {
        return registry.get(key);
    }

    public TokenValidator get(ValidatorKey key, Supplier<TokenValidator> factory) {
        return registry.computeIfAbsent(key, k -> factory.get());
    }
}
