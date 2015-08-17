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

package com.microsoft.azure.management.dns.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The response to a RecordSet Get operation.
*/
public class RecordSetGetResponse extends OperationResponse {
    private RecordSet recordSet;
    
    /**
    * Optional. Gets or sets information about the RecordSet in the response.
    * @return The RecordSet value.
    */
    public RecordSet getRecordSet() {
        return this.recordSet;
    }
    
    /**
    * Optional. Gets or sets information about the RecordSet in the response.
    * @param recordSetValue The RecordSet value.
    */
    public void setRecordSet(final RecordSet recordSetValue) {
        this.recordSet = recordSetValue;
    }
}
