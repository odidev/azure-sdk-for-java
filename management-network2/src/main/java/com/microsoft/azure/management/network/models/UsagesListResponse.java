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

package com.microsoft.azure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The List Usages operation response.
*/
public class UsagesListResponse extends OperationResponse implements Iterable<Usage> {
    private ArrayList<Usage> usages;
    
    /**
    * Optional. Gets or sets the list Network Resource Usages.
    * @return The Usages value.
    */
    public ArrayList<Usage> getUsages() {
        return this.usages;
    }
    
    /**
    * Optional. Gets or sets the list Network Resource Usages.
    * @param usagesValue The Usages value.
    */
    public void setUsages(final ArrayList<Usage> usagesValue) {
        this.usages = usagesValue;
    }
    
    /**
    * Initializes a new instance of the UsagesListResponse class.
    *
    */
    public UsagesListResponse() {
        super();
        this.setUsages(new LazyArrayList<Usage>());
    }
    
    /**
    * Gets the sequence of Usages.
    *
    */
    public Iterator<Usage> iterator() {
        return this.getUsages().iterator();
    }
}
