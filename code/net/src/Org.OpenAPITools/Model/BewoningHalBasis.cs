/* 
 * Bewoning
 *
 * API voor het zoeken en raadplegen van bewoningen en metagegevens over bewoning (verloop). Een bewoning is een adresseerbaar object (verblijfsobject, ligplaats of standplaats) met ingeschreven bewoner(s). Iedere samenstelling van bewoners van het object is een bewoning. Overleden personen maken onderdeel uit van een bewoning tot het moment van overlijden. Gegevens over de bewoners zijn actueel. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// BewoningHalBasis
    /// </summary>
    [DataContract]
    public partial class BewoningHalBasis :  IEquatable<BewoningHalBasis>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BewoningHalBasis" /> class.
        /// </summary>
        /// <param name="adresseerbaarObjectIdentificatie">De unieke identificatie van een verblijfsobject, standplaats of ligplaats. .</param>
        /// <param name="bewoners">bewoners.</param>
        /// <param name="indicatieVeelBewoners">Geeft aan dat het adresseerbaar object zo veel bewoners heeft of had in de gevraagde periode dat zij niet in het antwoord worden opgenomen, met uitzondering van de persoon waarvan de BSN is opgegeven. .</param>
        /// <param name="adressen">adressen.</param>
        /// <param name="links">links.</param>
        public BewoningHalBasis(string adresseerbaarObjectIdentificatie = default(string), List<Bewoner> bewoners = default(List<Bewoner>), bool indicatieVeelBewoners = default(bool), List<AdresUitgebreid> adressen = default(List<AdresUitgebreid>), BewoningLinks links = default(BewoningLinks))
        {
            this.AdresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
            this.Bewoners = bewoners;
            this.IndicatieVeelBewoners = indicatieVeelBewoners;
            this.Adressen = adressen;
            this.Links = links;
        }
        
        /// <summary>
        /// De unieke identificatie van een verblijfsobject, standplaats of ligplaats. 
        /// </summary>
        /// <value>De unieke identificatie van een verblijfsobject, standplaats of ligplaats. </value>
        [DataMember(Name="adresseerbaarObjectIdentificatie", EmitDefaultValue=false)]
        public string AdresseerbaarObjectIdentificatie { get; set; }

        /// <summary>
        /// Gets or Sets Bewoners
        /// </summary>
        [DataMember(Name="bewoners", EmitDefaultValue=false)]
        public List<Bewoner> Bewoners { get; set; }

        /// <summary>
        /// Geeft aan dat het adresseerbaar object zo veel bewoners heeft of had in de gevraagde periode dat zij niet in het antwoord worden opgenomen, met uitzondering van de persoon waarvan de BSN is opgegeven. 
        /// </summary>
        /// <value>Geeft aan dat het adresseerbaar object zo veel bewoners heeft of had in de gevraagde periode dat zij niet in het antwoord worden opgenomen, met uitzondering van de persoon waarvan de BSN is opgegeven. </value>
        [DataMember(Name="indicatieVeelBewoners", EmitDefaultValue=false)]
        public bool IndicatieVeelBewoners { get; set; }

        /// <summary>
        /// Gets or Sets Adressen
        /// </summary>
        [DataMember(Name="adressen", EmitDefaultValue=false)]
        public List<AdresUitgebreid> Adressen { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public BewoningLinks Links { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BewoningHalBasis {\n");
            sb.Append("  AdresseerbaarObjectIdentificatie: ").Append(AdresseerbaarObjectIdentificatie).Append("\n");
            sb.Append("  Bewoners: ").Append(Bewoners).Append("\n");
            sb.Append("  IndicatieVeelBewoners: ").Append(IndicatieVeelBewoners).Append("\n");
            sb.Append("  Adressen: ").Append(Adressen).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as BewoningHalBasis);
        }

        /// <summary>
        /// Returns true if BewoningHalBasis instances are equal
        /// </summary>
        /// <param name="input">Instance of BewoningHalBasis to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BewoningHalBasis input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AdresseerbaarObjectIdentificatie == input.AdresseerbaarObjectIdentificatie ||
                    (this.AdresseerbaarObjectIdentificatie != null &&
                    this.AdresseerbaarObjectIdentificatie.Equals(input.AdresseerbaarObjectIdentificatie))
                ) && 
                (
                    this.Bewoners == input.Bewoners ||
                    this.Bewoners != null &&
                    input.Bewoners != null &&
                    this.Bewoners.SequenceEqual(input.Bewoners)
                ) && 
                (
                    this.IndicatieVeelBewoners == input.IndicatieVeelBewoners ||
                    (this.IndicatieVeelBewoners != null &&
                    this.IndicatieVeelBewoners.Equals(input.IndicatieVeelBewoners))
                ) && 
                (
                    this.Adressen == input.Adressen ||
                    this.Adressen != null &&
                    input.Adressen != null &&
                    this.Adressen.SequenceEqual(input.Adressen)
                ) && 
                (
                    this.Links == input.Links ||
                    (this.Links != null &&
                    this.Links.Equals(input.Links))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AdresseerbaarObjectIdentificatie != null)
                    hashCode = hashCode * 59 + this.AdresseerbaarObjectIdentificatie.GetHashCode();
                if (this.Bewoners != null)
                    hashCode = hashCode * 59 + this.Bewoners.GetHashCode();
                if (this.IndicatieVeelBewoners != null)
                    hashCode = hashCode * 59 + this.IndicatieVeelBewoners.GetHashCode();
                if (this.Adressen != null)
                    hashCode = hashCode * 59 + this.Adressen.GetHashCode();
                if (this.Links != null)
                    hashCode = hashCode * 59 + this.Links.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
