/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.ResourceProviderOperationDetailListResult;
import com.microsoft.windowsazure.core.ResourceIdentity;
import com.microsoft.windowsazure.exception.ServiceException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;

/**
* Operations for managing Resource provider operations.
*/
public interface ResourceProviderOperationDetailsOperations {
    /**
    * Gets a list of resource providers.
    *
    * @param identity Required. Resource identity.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return List of resource provider operations.
    */
    ResourceProviderOperationDetailListResult list(ResourceIdentity identity) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Gets a list of resource providers.
    *
    * @param identity Required. Resource identity.
    * @return List of resource provider operations.
    */
    Future<ResourceProviderOperationDetailListResult> listAsync(ResourceIdentity identity);
}
