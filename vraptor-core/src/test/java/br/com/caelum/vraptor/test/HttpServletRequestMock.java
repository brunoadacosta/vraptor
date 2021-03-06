/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.caelum.vraptor.test;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;

import br.com.caelum.vraptor.http.MutableRequest;

/**
 * @author Fabio Kung
 */
public class HttpServletRequestMock extends HttpServletRequestWrapper implements MutableRequest {
    private final Map<String, Object> attributes = new HashMap<String, Object>();
	private HttpSession session;

    public HttpServletRequestMock(HttpSession session, final MutableRequest mock) {
    	super(mock);
        this.session = session;
    }

    @Override
    public HttpSession getSession() {
    	return session;
    }
    @Override
    public HttpSession getSession(boolean allowCreate) {
    	return session;
    }

    @Override
    public Object getAttribute(String name) {
    	return attributes.get(name);
    }

    @Override
    public void setAttribute(String name, Object o) {
    	attributes.put(name, o);
    }

	public void setParameter(String key, String... value) {
	}

	public HttpServletRequest getOriginalRequest() {
		return this;
	}
}
