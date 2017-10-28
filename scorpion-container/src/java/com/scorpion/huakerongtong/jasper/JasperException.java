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

package com.scorpion.huakerongtong.jasper;

/**
 * Base class for all exceptions generated by the JSP engine. Makes it
 * convenient to catch just this at the top-level. 
 *
 * @author Anil K. Vijendran
 */
public class JasperException extends javax.servlet.ServletException {
    
    private static final long serialVersionUID = 1L;

    public JasperException(String reason) {
        super(reason);
    }

    /**
     * Creates a JasperException with the embedded exception and the reason for
     * throwing a JasperException
     */
    public JasperException (String reason, Throwable exception) {
        super(reason, exception);
    }

    /**
     * Creates a JasperException with the embedded exception
     */
    public JasperException (Throwable exception) {
        super(exception);
    }
}
