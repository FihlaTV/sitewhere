/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.microservice.state;

import com.sitewhere.spi.microservice.state.ITenantEngineState;
import com.sitewhere.spi.server.lifecycle.LifecycleStatus;

/**
 * Model object for tenant engine state.
 * 
 * @author Derek
 */
public class TenantEngineState implements ITenantEngineState {

    /** Microservice identifier */
    private String microserviceIdentifier;

    /** Microservice hostname */
    private String microserviceHostname;

    /** Tenant id */
    private String tenantId;

    /** Lifecycle status */
    private LifecycleStatus lifecycleStatus;

    /*
     * @see com.sitewhere.spi.microservice.state.ITenantEngineState#
     * getMicroserviceIdentifier()
     */
    @Override
    public String getMicroserviceIdentifier() {
	return microserviceIdentifier;
    }

    public void setMicroserviceIdentifier(String microserviceIdentifier) {
	this.microserviceIdentifier = microserviceIdentifier;
    }

    /*
     * @see com.sitewhere.spi.microservice.state.ITenantEngineState#
     * getMicroserviceHostname()
     */
    @Override
    public String getMicroserviceHostname() {
	return microserviceHostname;
    }

    public void setMicroserviceHostname(String microserviceHostname) {
	this.microserviceHostname = microserviceHostname;
    }

    /*
     * @see com.sitewhere.spi.microservice.state.ITenantEngineState#getTenantId()
     */
    @Override
    public String getTenantId() {
	return tenantId;
    }

    public void setTenantId(String tenantId) {
	this.tenantId = tenantId;
    }

    /*
     * @see
     * com.sitewhere.spi.microservice.state.ITenantEngineState#getLifecycleStatus()
     */
    @Override
    public LifecycleStatus getLifecycleStatus() {
	return lifecycleStatus;
    }

    public void setLifecycleStatus(LifecycleStatus lifecycleStatus) {
	this.lifecycleStatus = lifecycleStatus;
    }
}