/*
 * Copyright 2006-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.consol.citrus.admin.model;

/**
 * @author Christoph Deppisch
 * @since 1.3.1
 */
public class EndpointData {

    private String type;
    private String name;
    private String destination;

    /**
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * @param value
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param value
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * @return
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param value
     */
    public void setDestination(String value) {
        this.destination = value;
    }

}