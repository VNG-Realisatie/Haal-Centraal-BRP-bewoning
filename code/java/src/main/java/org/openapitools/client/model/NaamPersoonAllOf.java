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
import org.openapitools.client.model.NaamPersoonInOnderzoek;
import org.openapitools.client.model.NaamgebruikEnum;

/**
 * NaamPersoonAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T11:06:48.381Z[Etc/UTC]")
public class NaamPersoonAllOf {
  public static final String SERIALIZED_NAME_AANHEF = "aanhef";
  @SerializedName(SERIALIZED_NAME_AANHEF)
  private String aanhef;

  public static final String SERIALIZED_NAME_AANSCHRIJFWIJZE = "aanschrijfwijze";
  @SerializedName(SERIALIZED_NAME_AANSCHRIJFWIJZE)
  private String aanschrijfwijze;

  public static final String SERIALIZED_NAME_REGEL_VOORAFGAAND_AAN_AANSCHRIJFWIJZE = "regelVoorafgaandAanAanschrijfwijze";
  @SerializedName(SERIALIZED_NAME_REGEL_VOORAFGAAND_AAN_AANSCHRIJFWIJZE)
  private String regelVoorafgaandAanAanschrijfwijze;

  public static final String SERIALIZED_NAME_GEBRUIK_IN_LOPENDE_TEKST = "gebruikInLopendeTekst";
  @SerializedName(SERIALIZED_NAME_GEBRUIK_IN_LOPENDE_TEKST)
  private String gebruikInLopendeTekst;

  public static final String SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK = "aanduidingNaamgebruik";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK)
  private NaamgebruikEnum aanduidingNaamgebruik;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private NaamPersoonInOnderzoek inOnderzoek = null;


  public NaamPersoonAllOf aanhef(String aanhef) {
    
    this.aanhef = aanhef;
    return this;
  }

   /**
   * Kun je gebruiken als aanhef in een brief gericht aan persoon. 
   * @return aanhef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hoogwelgeboren heer", value = "Kun je gebruiken als aanhef in een brief gericht aan persoon. ")

  public String getAanhef() {
    return aanhef;
  }


  public void setAanhef(String aanhef) {
    this.aanhef = aanhef;
  }


  public NaamPersoonAllOf aanschrijfwijze(String aanschrijfwijze) {
    
    this.aanschrijfwijze = aanschrijfwijze;
    return this;
  }

   /**
   * Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. 
   * @return aanschrijfwijze
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "H.W. baron van den Aedel", value = "Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. ")

  public String getAanschrijfwijze() {
    return aanschrijfwijze;
  }


  public void setAanschrijfwijze(String aanschrijfwijze) {
    this.aanschrijfwijze = aanschrijfwijze;
  }


  public NaamPersoonAllOf regelVoorafgaandAanAanschrijfwijze(String regelVoorafgaandAanAanschrijfwijze) {
    
    this.regelVoorafgaandAanAanschrijfwijze = regelVoorafgaandAanAanschrijfwijze;
    return this;
  }

   /**
   * Deze regel moet als aparte regel boven de aanschrijfwijze worden geplaatst. Komt alleen voor bij personen met een adellijke titel of predicaat. 
   * @return regelVoorafgaandAanAanschrijfwijze
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "De hoogwelgeboren heer", value = "Deze regel moet als aparte regel boven de aanschrijfwijze worden geplaatst. Komt alleen voor bij personen met een adellijke titel of predicaat. ")

  public String getRegelVoorafgaandAanAanschrijfwijze() {
    return regelVoorafgaandAanAanschrijfwijze;
  }


  public void setRegelVoorafgaandAanAanschrijfwijze(String regelVoorafgaandAanAanschrijfwijze) {
    this.regelVoorafgaandAanAanschrijfwijze = regelVoorafgaandAanAanschrijfwijze;
  }


  public NaamPersoonAllOf gebruikInLopendeTekst(String gebruikInLopendeTekst) {
    
    this.gebruikInLopendeTekst = gebruikInLopendeTekst;
    return this;
  }

   /**
   * Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. 
   * @return gebruikInLopendeTekst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "baron Van den Aedel", value = "Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. ")

  public String getGebruikInLopendeTekst() {
    return gebruikInLopendeTekst;
  }


  public void setGebruikInLopendeTekst(String gebruikInLopendeTekst) {
    this.gebruikInLopendeTekst = gebruikInLopendeTekst;
  }


  public NaamPersoonAllOf aanduidingNaamgebruik(NaamgebruikEnum aanduidingNaamgebruik) {
    
    this.aanduidingNaamgebruik = aanduidingNaamgebruik;
    return this;
  }

   /**
   * Get aanduidingNaamgebruik
   * @return aanduidingNaamgebruik
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NaamgebruikEnum getAanduidingNaamgebruik() {
    return aanduidingNaamgebruik;
  }


  public void setAanduidingNaamgebruik(NaamgebruikEnum aanduidingNaamgebruik) {
    this.aanduidingNaamgebruik = aanduidingNaamgebruik;
  }


  public NaamPersoonAllOf inOnderzoek(NaamPersoonInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NaamPersoonInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(NaamPersoonInOnderzoek inOnderzoek) {
    this.inOnderzoek = inOnderzoek;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaamPersoonAllOf naamPersoonAllOf = (NaamPersoonAllOf) o;
    return Objects.equals(this.aanhef, naamPersoonAllOf.aanhef) &&
        Objects.equals(this.aanschrijfwijze, naamPersoonAllOf.aanschrijfwijze) &&
        Objects.equals(this.regelVoorafgaandAanAanschrijfwijze, naamPersoonAllOf.regelVoorafgaandAanAanschrijfwijze) &&
        Objects.equals(this.gebruikInLopendeTekst, naamPersoonAllOf.gebruikInLopendeTekst) &&
        Objects.equals(this.aanduidingNaamgebruik, naamPersoonAllOf.aanduidingNaamgebruik) &&
        Objects.equals(this.inOnderzoek, naamPersoonAllOf.inOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aanhef, aanschrijfwijze, regelVoorafgaandAanAanschrijfwijze, gebruikInLopendeTekst, aanduidingNaamgebruik, inOnderzoek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaamPersoonAllOf {\n");
    sb.append("    aanhef: ").append(toIndentedString(aanhef)).append("\n");
    sb.append("    aanschrijfwijze: ").append(toIndentedString(aanschrijfwijze)).append("\n");
    sb.append("    regelVoorafgaandAanAanschrijfwijze: ").append(toIndentedString(regelVoorafgaandAanAanschrijfwijze)).append("\n");
    sb.append("    gebruikInLopendeTekst: ").append(toIndentedString(gebruikInLopendeTekst)).append("\n");
    sb.append("    aanduidingNaamgebruik: ").append(toIndentedString(aanduidingNaamgebruik)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
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

