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

package com.microsoft.azure.management.notificationhubs.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* The response of the List NotificationHub operation.
*/
public class NotificationHubListResponse {
    private String nextLink;
    
    /**
    * Optional. Gets or sets link to the next set of results. Not empty if
    * Value contains incomplete list of NotificationHub
    * @return The NextLink value.
    */
    public String getNextLink() {
        return this.nextLink;
    }
    
    /**
    * Optional. Gets or sets link to the next set of results. Not empty if
    * Value contains incomplete list of NotificationHub
    * @param nextLinkValue The NextLink value.
    */
    public void setNextLink(final String nextLinkValue) {
        this.nextLink = nextLinkValue;
    }
    
    private ArrayList<NotificationHubResource> value;
    
    /**
    * Optional. Gets or sets result of the List NotificationHub operation.
    * @return The Value value.
    */
    public ArrayList<NotificationHubResource> getValue() {
        return this.value;
    }
    
    /**
    * Optional. Gets or sets result of the List NotificationHub operation.
    * @param valueValue The Value value.
    */
    public void setValue(final ArrayList<NotificationHubResource> valueValue) {
        this.value = valueValue;
    }
    
    /**
    * Initializes a new instance of the NotificationHubListResponse class.
    *
    */
    public NotificationHubListResponse() {
        this.setValue(new LazyArrayList<NotificationHubResource>());
    }
}
