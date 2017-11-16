/*
 * Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.extension.siddhi.device.test.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.device.mgt.common.Device;
import org.wso2.carbon.device.mgt.common.DeviceIdentifier;
import org.wso2.carbon.device.mgt.common.GroupPaginationRequest;
import org.wso2.carbon.device.mgt.common.group.mgt.DeviceGroup;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestUtils {

    private static final Log log = LogFactory.getLog(TestUtils.class);

    public static void cleanupResources(Connection conn, Statement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                log.warn("Error occurred while closing result set", e);
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                log.warn("Error occurred while closing prepared statement", e);
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                log.warn("Error occurred while closing database connection", e);
            }
        }
    }


    public static DeviceGroup createDeviceGroup1(){
        DeviceGroup group = new DeviceGroup();
        group.setName("TEST_GROUP_01");
        group.setDescription("TEST_GROUP_01 - Description");
        group.setOwner("admin");
        return group;
    }


    public static DeviceGroup createDeviceGroup2(){
        DeviceGroup group = new DeviceGroup();
        group.setName("TEST_GROUP_02");
        group.setDescription("TEST_GROUP_02 - Description");
        group.setOwner("admin");
        return group;
    }

    public static List<DeviceIdentifier> getDeviceIdentifiersList(String deviceType){

        Device device = TestDataHolder.generateDummyDeviceData(deviceType);
        DeviceIdentifier identifier = new DeviceIdentifier();
        identifier.setId(device.getDeviceIdentifier());
        identifier.setType(deviceType);

        List<DeviceIdentifier> list = new ArrayList<>();
        list.add(identifier);

        return list;
    }
}
