/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media.models;

import com.microsoft.windowsazure.services.media.implementation.ODataEntity;
import com.microsoft.windowsazure.services.media.implementation.atom.LinkType;

/**
 * Provides access to OData links
 * 
 */
public class LinkInfo<T extends ODataEntity<?>> {
    private final LinkType rawLink;

    /**
     * Construct a new {@link LinkInfo} instance
     */
    public LinkInfo(LinkType rawLink) {
        this.rawLink = rawLink;
    }

    /**
     * Get link href
     * 
     * @return the href
     */
    public String getHref() {
        return rawLink.getHref();
    }
}
