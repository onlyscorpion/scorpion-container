/*
 * Licensed to the HKRT Software Foundation (HKRTSF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the HKRT License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.scorpion.huakerongtong.com/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.scorpion.huakerongtong.turnip.valves;


import java.io.IOException;

import javax.servlet.ServletException;

import com.scorpion.huakerongtong.turnip.connector.Request;
import com.scorpion.huakerongtong.turnip.connector.Response;
import com.scorpion.huakerongtong.juli.logging.Log;
import com.scorpion.huakerongtong.juli.logging.LogFactory;


/**
 * Concrete implementation of <code>RequestFilterValve</code> that filters
 * based on the string representation of the remote client's IP address
 * optionally combined with the server connector port number.
 *
 * @author Craig R. McClanahan
 */

public final class RemoteAddrValve extends RequestFilterValve {

    private static final Log log = LogFactory.getLog(RemoteAddrValve.class);


    // ----------------------------------------------------- Instance Variables

    /**
     * The descriptive information related to this implementation.
     */
    private static final String info =
        "com.scorpion.huakerongtong.turnip.valves.RemoteAddrValve/1.0";


    // ------------------------------------------------------------- Properties


    /**
     * Return descriptive information about this Valve implementation.
     */
    @Override
    public String getInfo() {

        return (info);

    }


    // --------------------------------------------------------- Public Methods

    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException {
        String property;
        if (getAddConnectorPort()) {
            property = request.getRequest().getRemoteAddr() + ";" + request.getConnector().getPort();
        } else {
            property = request.getRequest().getRemoteAddr();
        }
        process(property, request, response);
    }



    @Override
    protected Log getLog() {
        return log;
    }
}
