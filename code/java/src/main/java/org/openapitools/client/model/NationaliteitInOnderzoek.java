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
import org.openapitools.client.model.DatumOnvolledig;

/**
 * Geeft aan welke gegevens over de nationaliteit in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature) 
 */
@ApiModel(description = "Geeft aan welke gegevens over de nationaliteit in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature) ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T11:06:48.381Z[Etc/UTC]")
public class NationaliteitInOnderzoek {
  public static final String SERIALIZED_NAME_AANDUIDING_BIJZONDER_NEDERLANDERSCHAP = "aanduidingBijzonderNederlanderschap";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_BIJZONDER_NEDERLANDERSCHAP)
  private Boolean aanduidingBijzonderNederlanderschap;

  public static final String SERIALIZED_NAME_NATIONALITEIT = "nationaliteit";
  @SerializedName(SERIALIZED_NAME_NATIONALITEIT)
  private Boolean nationaliteit;

  public static final String SERIALIZED_NAME_REDEN_OPNAME = "redenOpname";
  @SerializedName(SERIALIZED_NAME_REDEN_OPNAME)
  private Boolean redenOpname;

  public static final String SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK = "datumIngangOnderzoek";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK)
  private DatumOnvolledig datumIngangOnderzoek;


  public NationaliteitInOnderzoek aanduidingBijzonderNederlanderschap(Boolean aanduidingBijzonderNederlanderschap) {
    
    this.aanduidingBijzonderNederlanderschap = aanduidingBijzonderNederlanderschap;
    return this;
  }

   /**
   * Get aanduidingBijzonderNederlanderschap
   * @return aanduidingBijzonderNederlanderschap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAanduidingBijzonderNederlanderschap() {
    return aanduidingBijzonderNederlanderschap;
  }


  public void setAanduidingBijzonderNederlanderschap(Boolean aanduidingBijzonderNederlanderschap) {
    this.aanduidingBijzonderNederlanderschap = aanduidingBijzonderNederlanderschap;
  }


  public NationaliteitInOnderzoek nationaliteit(Boolean nationaliteit) {
    
    this.nationaliteit = nationaliteit;
    return this;
  }

   /**
   * Get nationaliteit
   * @return nationaliteit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNationaliteit() {
    return nationaliteit;
  }


  public void setNationaliteit(Boolean nationaliteit) {
    this.nationaliteit = nationaliteit;
  }


  public NationaliteitInOnderzoek redenOpname(Boolean redenOpname) {
    
    this.redenOpname = redenOpname;
    return this;
  }

   /**
   * Get redenOpname
   * @return redenOpname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRedenOpname() {
    return redenOpname;
  }


  public void setRedenOpname(Boolean redenOpname) {
    this.redenOpname = redenOpname;
  }


  public NationaliteitInOnderzoek datumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    
    this.datumIngangOnderzoek = datumIngangOnderzoek;
    return this;
  }

   /**
   * Get datumIngangOnderzoek
   * @return datumIngangOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangOnderzoek() {
    return datumIngangOnderzoek;
  }


  public void setDatumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    this.datumIngangOnderzoek = datumIngangOnderzoek;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NationaliteitInOnderzoek nationaliteitInOnderzoek = (NationaliteitInOnderzoek) o;
    return Objects.equals(this.aanduidingBijzonderNederlanderschap, nationaliteitInOnderzoek.aanduidingBijzonderNederlanderschap) &&
        Objects.equals(this.nationaliteit, nationaliteitInOnderzoek.nationaliteit) &&
        Objects.equals(this.redenOpname, nationaliteitInOnderzoek.redenOpname) &&
        Objects.equals(this.datumIngangOnderzoek, nationaliteitInOnderzoek.datumIngangOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aanduidingBijzonderNederlanderschap, nationaliteit, redenOpname, datumIngangOnderzoek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NationaliteitInOnderzoek {\n");
    sb.append("    aanduidingBijzonderNederlanderschap: ").append(toIndentedString(aanduidingBijzonderNederlanderschap)).append("\n");
    sb.append("    nationaliteit: ").append(toIndentedString(nationaliteit)).append("\n");
    sb.append("    redenOpname: ").append(toIndentedString(redenOpname)).append("\n");
    sb.append("    datumIngangOnderzoek: ").append(toIndentedString(datumIngangOnderzoek)).append("\n");
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

