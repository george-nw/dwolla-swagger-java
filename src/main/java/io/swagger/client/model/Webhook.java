package io.swagger.client.model;

import io.swagger.client.model.WebhookAttempt;
import io.swagger.client.model.HalLink;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;



@ApiModel(description = "")
public class Webhook  {
  
  private Map<String, HalLink> links = new HashMap<String, HalLink>() ;
  private Object embedded = null;
  private String id = null;
  private String topic = null;
  private String accountId = null;
  private String eventId = null;
  private String subscriptionId = null;
  private List<WebhookAttempt> attempts = new ArrayList<WebhookAttempt>() ;
  private String locationHeader;


  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  public Map<String, HalLink> getLinks() {
    return links;
  }
  public void setLinks(Map<String, HalLink> links) {
    this.links = links;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public Object getEmbedded() {
    return embedded;
  }
  public void setEmbedded(Object embedded) {
    this.embedded = embedded;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("topic")
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("subscriptionId")
  public String getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attempts")
  public List<WebhookAttempt> getAttempts() {
    return attempts;
  }
  public void setAttempts(List<WebhookAttempt> attempts) {
    this.attempts = attempts;
  }

  


  /**
   * Used to deserialize Location field in
   * HTTP headers, primarily for HAL-styled
   * POST requests.
   **/
  @JsonProperty("Location")
  public String getLocationHeader() { return locationHeader; }
  public void setLocationHeader(ArrayList<String> locationHeader) { this.locationHeader = locationHeader.get(0); }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("  links: ").append(links).append("\n");
    sb.append("  embedded: ").append(embedded).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  topic: ").append(topic).append("\n");
    sb.append("  accountId: ").append(accountId).append("\n");
    sb.append("  eventId: ").append(eventId).append("\n");
    sb.append("  subscriptionId: ").append(subscriptionId).append("\n");
    sb.append("  attempts: ").append(attempts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
