/**
 * Copyright 2012 Thorsten Höger, RestDoc.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.restdoc.api;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.restdoc.api.util.RestDocObject;

/**
 * @author hoegertn
 * 
 */
@JsonPropertyOrder({"request", "response"})
public class GlobalHeader extends RestDocObject {
	
	@JsonProperty("request")
	private final Map<String, HeaderDefinition> requestHeader = new HashMap<String, HeaderDefinition>();
	
	@JsonProperty("response")
	private final Map<String, HeaderDefinition> responseHeader = new HashMap<String, HeaderDefinition>();
	
	
	/**
	 * @return the requestHeader
	 */
	public Map<String, HeaderDefinition> getRequestHeader() {
		return this.requestHeader;
	}
	
	/**
	 * @return the responseHeader
	 */
	public Map<String, HeaderDefinition> getResponseHeader() {
		return this.responseHeader;
	}
	
	// #############################################################
	// nice builder methods
	// #############################################################
	
	/**
	 * @param _name
	 * @param _description
	 * @param _required
	 * @return this
	 */
	public GlobalHeader request(final String _name, final String _description, final boolean _required) {
		final HeaderDefinition def = new HeaderDefinition(_description, _required);
		this.getRequestHeader().put(_name, def);
		return this;
	}
	
	/**
	 * @param _name
	 * @param _description
	 * @param _required
	 * @return this
	 */
	public GlobalHeader response(final String _name, final String _description, final boolean _required) {
		final HeaderDefinition def = new HeaderDefinition(_description, _required);
		this.getResponseHeader().put(_name, def);
		return this;
	}
	
}
