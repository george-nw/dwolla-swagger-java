package io.swagger.client.model;

import io.swagger.client.model.HalLink;
import io.swagger.client.model.Amount;
import io.swagger.client.model.FacilitatorFeeRequest;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;



@ApiModel(description = "")
public class TransferRequestBody  {
  
  private Map<String, HalLink> links = new HashMap<String, HalLink>() ;
  private Amount amount = null;
  private Object metadata = null;
  private List<FacilitatorFeeRequest> fees = new ArrayList<FacilitatorFeeRequest>() ;
  private Clearing clearing = null;
  private String locationHeader;


  
  /**
   **/
  @ApiModelProperty(value = "")
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
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }
  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fees")
  public List<FacilitatorFeeRequest> getFees() {
    return fees;
  }
  public void setFees(List<FacilitatorFeeRequest> fees) {
    this.fees = fees;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("clearing")
  public Clearing getClearing() {
    return clearing;
  }
  public void setClearing(Clearing clearing) {
    this.clearing = clearing;
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
    sb.append("class TransferRequestBody {\n");
    
    sb.append("  links: ").append(links).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  fees: ").append(fees).append("\n");
    sb.append("  clearing: ").append(clearing).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
