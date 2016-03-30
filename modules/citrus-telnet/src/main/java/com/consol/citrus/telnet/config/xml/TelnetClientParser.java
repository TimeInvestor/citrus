/*
 * Copyright 2006-2016 the original author or authors.
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

package com.consol.citrus.telnet.config.xml;

import com.consol.citrus.config.util.BeanDefinitionParserUtils;
import com.consol.citrus.config.xml.AbstractEndpointParser;
import com.consol.citrus.endpoint.Endpoint;
import com.consol.citrus.endpoint.EndpointConfiguration;
import com.consol.citrus.telnet.client.TelnetClient;
import com.consol.citrus.telnet.client.TelnetEndpointConfiguration;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @author Michael Wurmbrand
 * @since 2.6
 */
public class TelnetClientParser extends AbstractEndpointParser {

    @Override
    protected void parseEndpointConfiguration(BeanDefinitionBuilder endpointConfiguration, Element element, ParserContext parserContext) {
        super.parseEndpointConfiguration(endpointConfiguration, element, parserContext);

        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration, element.getAttribute("host"), "host");
        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration, element.getAttribute("port"), "port");
        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration, element.getAttribute("command-timeout"), "commandTimeout");
        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration, element.getAttribute("connection-timeout"), "connectionTimeout");
        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration, element.getAttribute("user"), "user");
        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration, element.getAttribute("password"), "password");
        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration, element.getAttribute("prompt"), "prompt");

        BeanDefinitionParserUtils.setPropertyReference(endpointConfiguration, element.getAttribute("message-correlator"), "correlator");
        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration, element.getAttribute("polling-interval"), "pollingInterval");

        BeanDefinitionParserUtils.setPropertyReference(endpointConfiguration, element.getAttribute("message-converter"), "messageConverter");
    }

    @Override
    protected Class<? extends Endpoint> getEndpointClass() {
        return TelnetClient.class;
    }

    @Override
    protected Class<? extends EndpointConfiguration> getEndpointConfigurationClass() {
        return TelnetEndpointConfiguration.class;
    }

}
