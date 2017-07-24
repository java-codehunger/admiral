/*
 * Copyright (c) 2016-2017 VMware, Inc. All Rights Reserved.
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices
 * and license terms. Your use of these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package com.vmware.iaas.consumer.api.model;

import io.swagger.annotations.ApiModelProperty;

import com.vmware.iaas.consumer.api.model.base.ZoneScopedResource;

public class BlockDevice extends ZoneScopedResource {

    @ApiModelProperty(value = "Capacity of the block device in MB.")
    public Integer capacityInMB;

}
