/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.access.types;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @since 3.0
 */
public class DateType implements ExtendedType<Date> {

    @Override
    public String getClassName() {
        return Date.class.getName();
    }

    @Override
    public Date materializeObject(ResultSet rs, int index, int type) throws Exception {
        return rs.getDate(index);
    }

    @Override
    public Date materializeObject(CallableStatement rs, int index, int type)
            throws Exception {
        return rs.getDate(index);
    }

    @Override
    public void setJdbcObject(
            PreparedStatement statement,
            Date value,
            int pos,
            int type,
            int scale) throws Exception {

        if (value == null) {
            statement.setNull(pos, type);
        }
        else {
            statement.setDate(pos, value);
        }
    }

    @Override
    public String toString(Date value) {
        if (value == null) {
            return "NULL";
        }

        return '\'' + value.toString() + '\'';
    }
}
