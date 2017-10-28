/*
 * Licensed to the HKRT Software Foundation (HKRTSF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the HKRT License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.scorpion.huakerongtong.com/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.scorpion.huakerongtong.rabbit.websocket.pojo;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import javax.websocket.Session;

/**
 * ByteBuffer specific concrete implementation for handling partial messages.
 */
public class PojoMessageHandlerPartialBinary
        extends PojoMessageHandlerPartialBase<ByteBuffer> {

    public PojoMessageHandlerPartialBinary(Object pojo, Method method,
            Session session, Object[] params, int indexPayload, boolean convert,
            int indexBoolean, int indexSession, long maxMessageSize) {
        super(pojo, method, session, params, indexPayload, convert, indexBoolean,
                indexSession, maxMessageSize);
    }
}
