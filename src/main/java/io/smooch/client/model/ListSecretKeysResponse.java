/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.SecretKey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ListSecretKeysResponse
 */

public class ListSecretKeysResponse {
  @SerializedName("keys")
  private List<SecretKey> keys = new ArrayList<SecretKey>();

  public ListSecretKeysResponse keys(List<SecretKey> keys) {
    this.keys = keys;
    return this;
  }

  public ListSecretKeysResponse addKeysItem(SecretKey keysItem) {
    this.keys.add(keysItem);
    return this;
  }

   /**
   * The list of secret keys.
   * @return keys
  **/
  @ApiModelProperty(example = "null", value = "The list of secret keys.")
  public List<SecretKey> getKeys() {
    return keys;
  }

  public void setKeys(List<SecretKey> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSecretKeysResponse listSecretKeysResponse = (ListSecretKeysResponse) o;
    return Objects.equals(this.keys, listSecretKeysResponse.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSecretKeysResponse {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
