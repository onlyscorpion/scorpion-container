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
package com.scorpion.huakerongtong.turnip.ant.jmx;

/**
 *
 * @author Peter Rossbach
 * @since 5.5.10
 */
public class Arg {
    /**
     * @deprecated  Use getter/setter
     */
    @Deprecated
    String type;
    /**
     * @deprecated  Use getter/setter
     */
    @Deprecated
    String value;

    public void setType( String type) {
        this.type=type;
    }
    public void setValue( String value ) {
        this.value=value;
    }
    /**
     * @deprecated  Use {@link #setValue(String)}
     */
    @Deprecated
    public void addText( String text ) {
        this.value=text;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
