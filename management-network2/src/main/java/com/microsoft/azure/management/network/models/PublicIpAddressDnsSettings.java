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

/**
* Contains FQDN of the DNS record associated with the public IP address
*/
public class PublicIpAddressDnsSettings {
    private String domainNameLabel;
    
    /**
    * Optional. Gets or sets the Domain name label.The concatenation of the
    * domain name label and the regionalized DNS zone make up the fully
    * qualified domain name associated with the public IP address. If a domain
    * name label is specified, an A DNS record is created for the public IP in
    * the Microsoft Azure DNS system.
    * @return The DomainNameLabel value.
    */
    public String getDomainNameLabel() {
        return this.domainNameLabel;
    }
    
    /**
    * Optional. Gets or sets the Domain name label.The concatenation of the
    * domain name label and the regionalized DNS zone make up the fully
    * qualified domain name associated with the public IP address. If a domain
    * name label is specified, an A DNS record is created for the public IP in
    * the Microsoft Azure DNS system.
    * @param domainNameLabelValue The DomainNameLabel value.
    */
    public void setDomainNameLabel(final String domainNameLabelValue) {
        this.domainNameLabel = domainNameLabelValue;
    }
    
    private String fqdn;
    
    /**
    * Optional. Gets the FQDN, Fully qualified domain name of the A DNS record
    * associated with the public IP. This is the concatenation of the
    * domainNameLabel and the regionalized DNS zone.
    * @return The Fqdn value.
    */
    public String getFqdn() {
        return this.fqdn;
    }
    
    /**
    * Optional. Gets the FQDN, Fully qualified domain name of the A DNS record
    * associated with the public IP. This is the concatenation of the
    * domainNameLabel and the regionalized DNS zone.
    * @param fqdnValue The Fqdn value.
    */
    public void setFqdn(final String fqdnValue) {
        this.fqdn = fqdnValue;
    }
    
    private String reverseFqdn;
    
    /**
    * Optional. Gets or Sests the Reverse FQDN. A user-visible, fully qualified
    * domain name that resolves to this public IP address. If the reverseFqdn
    * is specified, then a PTR DNS record is created pointing from the IP
    * address in the in-addr.arpa domain to the reverse FQDN.
    * @return The ReverseFqdn value.
    */
    public String getReverseFqdn() {
        return this.reverseFqdn;
    }
    
    /**
    * Optional. Gets or Sests the Reverse FQDN. A user-visible, fully qualified
    * domain name that resolves to this public IP address. If the reverseFqdn
    * is specified, then a PTR DNS record is created pointing from the IP
    * address in the in-addr.arpa domain to the reverse FQDN.
    * @param reverseFqdnValue The ReverseFqdn value.
    */
    public void setReverseFqdn(final String reverseFqdnValue) {
        this.reverseFqdn = reverseFqdnValue;
    }
}
