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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.restdoc.api.util.RestDocObject;

/**
 * @author hoegertn
 * 
 */
@JsonPropertyOrder({"description", "required"})
public class HeaderDefinition extends RestDocObject {
	
	private String description = "";
	
	private boolean required = false;
	
	
	/**
	 * 
	 */
	public HeaderDefinition() {
		//
	}
	
	/**
	 * @param description
	 */
	public HeaderDefinition(final String description) {
		this(description, false);
	}
	
	/**
	 * @param description
	 * @param required
	 */
	public HeaderDefinition(final String description, final boolean required) {
		this.description = description;
		this.required = required;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}
	
	/**
	 * @return the required
	 */
	public boolean isRequired() {
		return this.required;
	}
	
	/**
	 * @param required the required to set
	 */
	public void setRequired(final boolean required) {
		this.required = required;
	}
	
}
