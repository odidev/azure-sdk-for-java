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

package com.microsoft.windowsazure.management.sql.models;

/**
* The parameters that are used by the service to provision a server.  The
* parameters marked optional are not required by the service.
*/
public class ServerCreateParameters {
    private String administratorPassword;
    
    /**
    * Required. Gets or sets the administrator password for the new server.
    * @return The AdministratorPassword value.
    */
    public String getAdministratorPassword() {
        return this.administratorPassword;
    }
    
    /**
    * Required. Gets or sets the administrator password for the new server.
    * @param administratorPasswordValue The AdministratorPassword value.
    */
    public void setAdministratorPassword(final String administratorPasswordValue) {
        this.administratorPassword = administratorPasswordValue;
    }
    
    private String administratorUserName;
    
    /**
    * Required. Gets or sets the administrator username that will be used for
    * the new server.
    * @return The AdministratorUserName value.
    */
    public String getAdministratorUserName() {
        return this.administratorUserName;
    }
    
    /**
    * Required. Gets or sets the administrator username that will be used for
    * the new server.
    * @param administratorUserNameValue The AdministratorUserName value.
    */
    public void setAdministratorUserName(final String administratorUserNameValue) {
        this.administratorUserName = administratorUserNameValue;
    }
    
    private String location;
    
    /**
    * Required. Gets or sets the region in which this server will be created.
    * See http://azure.microsoft.com/en-us/regions/#services for a list of
    * all the available regions.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Required. Gets or sets the region in which this server will be created.
    * See http://azure.microsoft.com/en-us/regions/#services for a list of
    * all the available regions.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private String version;
    
    /**
    * Optional. Gets or sets the version of server to create.  Valid values
    * are: 1.0, 2.0.
    * @return The Version value.
    */
    public String getVersion() {
        return this.version;
    }
    
    /**
    * Optional. Gets or sets the version of server to create.  Valid values
    * are: 1.0, 2.0.
    * @param versionValue The Version value.
    */
    public void setVersion(final String versionValue) {
        this.version = versionValue;
    }
    
    /**
    * Initializes a new instance of the ServerCreateParameters class.
    *
    */
    public ServerCreateParameters() {
    }
    
    /**
    * Initializes a new instance of the ServerCreateParameters class with
    * required arguments.
    *
    * @param administratorUserName Gets or sets the administrator username that
    * will be used for the new server.
    * @param administratorPassword Gets or sets the administrator password for
    * the new server.
    * @param location Gets or sets the region in which this server will be
    * created.  See http://azure.microsoft.com/en-us/regions/#services for a
    * list of all the available regions.
    */
    public ServerCreateParameters(String administratorUserName, String administratorPassword, String location) {
        if (administratorUserName == null) {
            throw new NullPointerException("administratorUserName");
        }
        if (administratorPassword == null) {
            throw new NullPointerException("administratorPassword");
        }
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setAdministratorUserName(administratorUserName);
        this.setAdministratorPassword(administratorPassword);
        this.setLocation(location);
    }
}
