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
 * Geeft aan wie het gezag heeft over de minderjarige persoon. * &#x60;ouder1&#x60; - 1 * &#x60;ouder2&#x60; - 2 * &#x60;derden&#x60; - D * &#x60;ouder1_en_derde&#x60; - 1D * &#x60;ouder2_en_derde&#x60; - 2D * &#x60;ouder1_en_ouder2&#x60; - 12 
 */
@JsonAdapter(IndicatieGezagMinderjarigeEnum.Adapter.class)
public enum IndicatieGezagMinderjarigeEnum {
  
  OUDER1("ouder1"),
  
  OUDER2("ouder2"),
  
  DERDEN("derden"),
  
  OUDER1_EN_DERDE("ouder1_en_derde"),
  
  OUDER2_EN_DERDE("ouder2_en_derde"),
  
  OUDER1_EN_OUDER2("ouder1_en_ouder2");

  private String value;

  IndicatieGezagMinderjarigeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IndicatieGezagMinderjarigeEnum fromValue(String value) {
    for (IndicatieGezagMinderjarigeEnum b : IndicatieGezagMinderjarigeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IndicatieGezagMinderjarigeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final IndicatieGezagMinderjarigeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IndicatieGezagMinderjarigeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IndicatieGezagMinderjarigeEnum.fromValue(value);
    }
  }
}

