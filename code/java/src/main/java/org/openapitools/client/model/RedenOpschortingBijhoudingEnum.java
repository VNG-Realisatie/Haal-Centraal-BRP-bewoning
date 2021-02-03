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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Redenen voor opschorting van de bijhouding * &#x60;overlijden&#x60; - O * &#x60;emigratie&#x60; - E * &#x60;ministerieel_besluit&#x60; - M * &#x60;pl_aangelegd_in_de_rni&#x60; - R - opgeschort omdat persoon is ingeschreven in het Register Niet Ingezeten (RNI). * &#x60;fout&#x60; - F 
 */
@JsonAdapter(RedenOpschortingBijhoudingEnum.Adapter.class)
public enum RedenOpschortingBijhoudingEnum {
  
  OVERLIJDEN("overlijden"),
  
  EMIGRATIE("emigratie"),
  
  MINISTERIEEL_BESLUIT("ministerieel_besluit"),
  
  PL_AANGELEGD_IN_DE_RNI("pl_aangelegd_in_de_rni"),
  
  FOUT("fout");

  private String value;

  RedenOpschortingBijhoudingEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RedenOpschortingBijhoudingEnum fromValue(String value) {
    for (RedenOpschortingBijhoudingEnum b : RedenOpschortingBijhoudingEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RedenOpschortingBijhoudingEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final RedenOpschortingBijhoudingEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RedenOpschortingBijhoudingEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RedenOpschortingBijhoudingEnum.fromValue(value);
    }
  }
}

