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
package com.scorpion.huakerongtong.rabbit.util.scan;

import java.io.IOException;
import java.net.URL;

/**
 * Provide a mechanism to obtain objects that implement {@link Jar}.
 */
public class JarFactory {

    private JarFactory() {
        // Factory class. Hide public constructor.
    }

    public static Jar newInstance(URL url) throws IOException {
        String jarUrl = url.toString();
        if (jarUrl.startsWith("jar:file:")) {
            return new FileUrlJar(url);
        } else {
            return new UrlJar(url);
        }
    }
}
