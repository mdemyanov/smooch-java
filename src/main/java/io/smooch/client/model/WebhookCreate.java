/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 2.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * WebhookCreate
 */

public class WebhookCreate {
  @SerializedName("target")
  private String target = null;

  @SerializedName("triggers")
  private List<String> triggers = null;

  public WebhookCreate target(String target) {
    this.target = target;
    return this;
  }

   /**
   * URL to be called when the webhook is triggered.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "URL to be called when the webhook is triggered.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public WebhookCreate triggers(List<String> triggers) {
    this.triggers = triggers;
    return this;
  }

  public WebhookCreate addTriggersItem(String triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<String>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * An array of triggers you wish to have the webhook listen to. If unspecified the default trigger is *message*.
   * @return triggers
  **/
  @ApiModelProperty(value = "An array of triggers you wish to have the webhook listen to. If unspecified the default trigger is *message*.")
  public List<String> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<String> triggers) {
    this.triggers = triggers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookCreate webhookCreate = (WebhookCreate) o;
    return Objects.equals(this.target, webhookCreate.target) &&
        Objects.equals(this.triggers, webhookCreate.triggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, triggers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookCreate {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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

