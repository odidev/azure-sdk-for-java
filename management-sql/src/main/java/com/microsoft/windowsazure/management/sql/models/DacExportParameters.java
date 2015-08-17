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

import java.net.URI;

/**
* Represents the parameters needed to initiate an Azure SQL Database Export
* operation.
*/
public class DacExportParameters {
    private DacExportParameters.BlobCredentialsParameter blobCredentials;
    
    /**
    * Optional. Gets or sets the credentials information needed for setting
    * where the DACPAC file will be exported to in Azure Blob Storage.
    * @return The BlobCredentials value.
    */
    public DacExportParameters.BlobCredentialsParameter getBlobCredentials() {
        return this.blobCredentials;
    }
    
    /**
    * Optional. Gets or sets the credentials information needed for setting
    * where the DACPAC file will be exported to in Azure Blob Storage.
    * @param blobCredentialsValue The BlobCredentials value.
    */
    public void setBlobCredentials(final DacExportParameters.BlobCredentialsParameter blobCredentialsValue) {
        this.blobCredentials = blobCredentialsValue;
    }
    
    private DacExportParameters.ConnectionInfoParameter connectionInfo;
    
    /**
    * Optional. Gets or sets the connection information needed for the Azure
    * SQL Database.
    * @return The ConnectionInfo value.
    */
    public DacExportParameters.ConnectionInfoParameter getConnectionInfo() {
        return this.connectionInfo;
    }
    
    /**
    * Optional. Gets or sets the connection information needed for the Azure
    * SQL Database.
    * @param connectionInfoValue The ConnectionInfo value.
    */
    public void setConnectionInfo(final DacExportParameters.ConnectionInfoParameter connectionInfoValue) {
        this.connectionInfo = connectionInfoValue;
    }
    
    /**
    * The credentials needed to connect to Azure Blob Storage to export the
    * DACPAC file.
    */
    public static class BlobCredentialsParameter {
        private String storageAccessKey;
        
        /**
        * Required. Gets or sets the access key for the Azure Storage account.
        * @return The StorageAccessKey value.
        */
        public String getStorageAccessKey() {
            return this.storageAccessKey;
        }
        
        /**
        * Required. Gets or sets the access key for the Azure Storage account.
        * @param storageAccessKeyValue The StorageAccessKey value.
        */
        public void setStorageAccessKey(final String storageAccessKeyValue) {
            this.storageAccessKey = storageAccessKeyValue;
        }
        
        private URI uri;
        
        /**
        * Required. Gets or sets the URI of where the DACPAC file should be
        * stored in Azure Blob Storage.
        * @return The Uri value.
        */
        public URI getUri() {
            return this.uri;
        }
        
        /**
        * Required. Gets or sets the URI of where the DACPAC file should be
        * stored in Azure Blob Storage.
        * @param uriValue The Uri value.
        */
        public void setUri(final URI uriValue) {
            this.uri = uriValue;
        }
        
        /**
        * Initializes a new instance of the BlobCredentialsParameter class.
        *
        */
        public BlobCredentialsParameter() {
        }
        
        /**
        * Initializes a new instance of the BlobCredentialsParameter class with
        * required arguments.
        *
        * @param uri Gets or sets the URI of where the DACPAC file should be
        * stored in Azure Blob Storage.
        * @param storageAccessKey Gets or sets the access key for the Azure
        * Storage account.
        */
        public BlobCredentialsParameter(URI uri, String storageAccessKey) {
            if (uri == null) {
                throw new NullPointerException("uri");
            }
            if (storageAccessKey == null) {
                throw new NullPointerException("storageAccessKey");
            }
            this.setUri(uri);
            this.setStorageAccessKey(storageAccessKey);
        }
    }
    
    /**
    * Represents the connection information for the Azure SQL Database to
    * export.
    */
    public static class ConnectionInfoParameter {
        private String databaseName;
        
        /**
        * Required. Gets or sets the name of the database to be exported.
        * @return The DatabaseName value.
        */
        public String getDatabaseName() {
            return this.databaseName;
        }
        
        /**
        * Required. Gets or sets the name of the database to be exported.
        * @param databaseNameValue The DatabaseName value.
        */
        public void setDatabaseName(final String databaseNameValue) {
            this.databaseName = databaseNameValue;
        }
        
        private String password;
        
        /**
        * Required. Gets or sets the password for the database administrator
        * user.
        * @return The Password value.
        */
        public String getPassword() {
            return this.password;
        }
        
        /**
        * Required. Gets or sets the password for the database administrator
        * user.
        * @param passwordValue The Password value.
        */
        public void setPassword(final String passwordValue) {
            this.password = passwordValue;
        }
        
        private String serverName;
        
        /**
        * Required. Gets or sets the Azure SQL Database Server name where the
        * database resides.
        * @return The ServerName value.
        */
        public String getServerName() {
            return this.serverName;
        }
        
        /**
        * Required. Gets or sets the Azure SQL Database Server name where the
        * database resides.
        * @param serverNameValue The ServerName value.
        */
        public void setServerName(final String serverNameValue) {
            this.serverName = serverNameValue;
        }
        
        private String userName;
        
        /**
        * Required. Gets or sets the username of the database administrator
        * user.
        * @return The UserName value.
        */
        public String getUserName() {
            return this.userName;
        }
        
        /**
        * Required. Gets or sets the username of the database administrator
        * user.
        * @param userNameValue The UserName value.
        */
        public void setUserName(final String userNameValue) {
            this.userName = userNameValue;
        }
    }
}
