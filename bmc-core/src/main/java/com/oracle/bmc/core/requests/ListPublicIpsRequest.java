/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListPublicIpsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * Whether the public IP is regional or specific to a particular Availability Domain.
     * <p>
     * `REGION`: The public IP exists within a region and can be assigned to a private IP
     * in any Availability Domain in the region. Reserved public IPs have `scope` = `REGION`.
     * <p>
     * `AVAILABILITY_DOMAIN`: The public IP exists within the Availability Domain of the private IP
     * it's assigned to, which is specified by the `availabilityDomain` property of the public IP object.
     * Ephemeral public IPs have `scope` = `AVAILABILITY_DOMAIN`.
     *
     */
    private Scope scope;

    /**
     * Whether the public IP is regional or specific to a particular Availability Domain.
     * <p>
     * `REGION`: The public IP exists within a region and can be assigned to a private IP
     * in any Availability Domain in the region. Reserved public IPs have `scope` = `REGION`.
     * <p>
     * `AVAILABILITY_DOMAIN`: The public IP exists within the Availability Domain of the private IP
     * it's assigned to, which is specified by the `availabilityDomain` property of the public IP object.
     * Ephemeral public IPs have `scope` = `AVAILABILITY_DOMAIN`.
     *
     **/
    public enum Scope {
        Region("REGION"),
        AvailabilityDomain("AVAILABILITY_DOMAIN"),
        ;

        private final String value;
        private static java.util.Map<String, Scope> map;

        static {
            map = new java.util.HashMap<>();
            for (Scope v : Scope.values()) {
                map.put(v.getValue(), v);
            }
        }

        Scope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Scope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid Scope: " + key);
        }
    };

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     * <p>
     * Example: `500`
     *
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

    /**
     * The name of the Availability Domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     */
    private String availabilityDomain;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListPublicIpsRequest o) {
            scope(o.getScope());
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            availabilityDomain(o.getAvailabilityDomain());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of ListPublicIpsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListPublicIpsRequest
         */
        public ListPublicIpsRequest build() {
            ListPublicIpsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
