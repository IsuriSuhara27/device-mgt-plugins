/*
 * Copyright (c) 2018 - 2023, Entgra (Pvt) Ltd. (http://www.entgra.io) All Rights Reserved.
 *
 * Entgra (Pvt) Ltd. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.entgra.device.mgt.plugins.mobile.android.impl.dao;

public class AndroidFeatureManagementDAOException extends MobileDeviceManagementDAOException {

    private String message;
    private static final long serialVersionUID = 2021891706072918865L;

    /**
     * Constructs a new MobileDeviceManagementDAOException with the specified detail message and
     * nested exception.
     *
     * @param message         error message
     * @param nestedException exception
     */
    public AndroidFeatureManagementDAOException(String message, Exception nestedException) {
        super(message, nestedException);
        setErrorMessage(message);
    }

    /**
     * Constructs a new MobileDeviceManagementDAOException with the specified detail message
     * and cause.
     *
     * @param message the detail message.
     * @param cause   the cause of this exception.
     */
    public AndroidFeatureManagementDAOException(String message, Throwable cause) {
        super(message, cause);
        setErrorMessage(message);
    }

    /**
     * Constructs a new MobileDeviceManagementDAOException with the specified detail message.
     *
     * @param message the detail message.
     */
    public AndroidFeatureManagementDAOException(String message) {
        super(message);
        setErrorMessage(message);
    }

    /**
     * Constructs a new MobileDeviceManagementDAOException with the specified and cause.
     *
     * @param cause the cause of this exception.
     */
    public AndroidFeatureManagementDAOException(Throwable cause) {
        super(cause);
    }

    public String getMessage() {
        return message;
    }

    public void setErrorMessage(String errorMessage) {
        this.message = errorMessage;
    }

}
