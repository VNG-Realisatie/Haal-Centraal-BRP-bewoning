/*
 * Bewoning
 * API voor het zoeken en raadplegen van bewoningen en metagegevens over bewoning (verloop). Een bewoning is een adresseerbaar object (verblijfsobject, ligplaats of standplaats) met ingeschreven bewoner(s). Iedere samenstelling van bewoners van het object is een bewoning. Overleden personen maken onderdeel uit van een bewoning tot het moment van overlijden. Gegevens over de bewoners zijn actueel. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BewoningHal;

/**
 * BewoningHalCollectieEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T11:06:48.381Z[Etc/UTC]")
public class BewoningHalCollectieEmbedded {
  public static final String SERIALIZED_NAME_BEWONINGEN = "bewoningen";
  @SerializedName(SERIALIZED_NAME_BEWONINGEN)
  private List<BewoningHal> bewoningen = null;


  public BewoningHalCollectieEmbedded bewoningen(List<BewoningHal> bewoningen) {
    
    this.bewoningen = bewoningen;
    return this;
  }

  public BewoningHalCollectieEmbedded addBewoningenItem(BewoningHal bewoningenItem) {
    if (this.bewoningen == null) {
      this.bewoningen = new ArrayList<>();
    }
    this.bewoningen.add(bewoningenItem);
    return this;
  }

   /**
   * Get bewoningen
   * @return bewoningen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BewoningHal> getBewoningen() {
    return bewoningen;
  }


  public void setBewoningen(List<BewoningHal> bewoningen) {
    this.bewoningen = bewoningen;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BewoningHalCollectieEmbedded bewoningHalCollectieEmbedded = (BewoningHalCollectieEmbedded) o;
    return Objects.equals(this.bewoningen, bewoningHalCollectieEmbedded.bewoningen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bewoningen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BewoningHalCollectieEmbedded {\n");
    sb.append("    bewoningen: ").append(toIndentedString(bewoningen)).append("\n");
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

