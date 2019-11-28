/*
* Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.identity.integration.test.rest.api.server.idp.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;


public class RoleMapping   {
  
  private String idpRole;

  private String localRole;


  /**
   **/
  public RoleMapping idpRole(String idpRole) {
    this.idpRole = idpRole;
    return this;
  }

  
  @ApiModelProperty(example = "google-manager", value = "")
  @JsonProperty("idpRole")
  @Valid
  public String getIdpRole() {
    return idpRole;
  }
  public void setIdpRole(String idpRole) {
    this.idpRole = idpRole;
  }


  /**
   **/
  public RoleMapping localRole(String localRole) {
    this.localRole = localRole;
    return this;
  }

  
  @ApiModelProperty(example = "manager", value = "")
  @JsonProperty("localRole")
  @Valid
  public String getLocalRole() {
    return localRole;
  }
  public void setLocalRole(String localRole) {
    this.localRole = localRole;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMapping roleMapping = (RoleMapping) o;
    return Objects.equals(this.idpRole, roleMapping.idpRole) &&
        Objects.equals(this.localRole, roleMapping.localRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpRole, localRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMapping {\n");

    sb.append("    idpRole: ").append(toIndentedString(idpRole)).append("\n");
    sb.append("    localRole: ").append(toIndentedString(localRole)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
