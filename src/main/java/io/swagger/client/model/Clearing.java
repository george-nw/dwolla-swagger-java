package io.swagger.client.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class Clearing {

    private String source = "next-day";
    private String destination = "next-available";


    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Clearing {\n");

        sb.append("  source: ").append(source).append("\n");
        sb.append("  destination: ").append(destination).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
