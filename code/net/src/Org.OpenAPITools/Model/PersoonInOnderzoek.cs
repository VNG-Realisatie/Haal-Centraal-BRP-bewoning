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
    /// Geeft aan welke gegevens van de persoon in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature). 
    /// </summary>
    [DataContract]
    public partial class PersoonInOnderzoek :  IEquatable<PersoonInOnderzoek>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PersoonInOnderzoek" /> class.
        /// </summary>
        /// <param name="burgerservicenummer">burgerservicenummer.</param>
        /// <param name="geslachtsaanduiding">geslachtsaanduiding.</param>
        /// <param name="datumIngangOnderzoek">datumIngangOnderzoek.</param>
        public PersoonInOnderzoek(bool burgerservicenummer = default(bool), bool geslachtsaanduiding = default(bool), DatumOnvolledig datumIngangOnderzoek = default(DatumOnvolledig))
        {
            this.Burgerservicenummer = burgerservicenummer;
            this.Geslachtsaanduiding = geslachtsaanduiding;
            this.DatumIngangOnderzoek = datumIngangOnderzoek;
        }
        
        /// <summary>
        /// Gets or Sets Burgerservicenummer
        /// </summary>
        [DataMember(Name="burgerservicenummer", EmitDefaultValue=false)]
        public bool Burgerservicenummer { get; set; }

        /// <summary>
        /// Gets or Sets Geslachtsaanduiding
        /// </summary>
        [DataMember(Name="geslachtsaanduiding", EmitDefaultValue=false)]
        public bool Geslachtsaanduiding { get; set; }

        /// <summary>
        /// Gets or Sets DatumIngangOnderzoek
        /// </summary>
        [DataMember(Name="datumIngangOnderzoek", EmitDefaultValue=false)]
        public DatumOnvolledig DatumIngangOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersoonInOnderzoek {\n");
            sb.Append("  Burgerservicenummer: ").Append(Burgerservicenummer).Append("\n");
            sb.Append("  Geslachtsaanduiding: ").Append(Geslachtsaanduiding).Append("\n");
            sb.Append("  DatumIngangOnderzoek: ").Append(DatumIngangOnderzoek).Append("\n");
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
            return this.Equals(input as PersoonInOnderzoek);
        }

        /// <summary>
        /// Returns true if PersoonInOnderzoek instances are equal
        /// </summary>
        /// <param name="input">Instance of PersoonInOnderzoek to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersoonInOnderzoek input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Burgerservicenummer == input.Burgerservicenummer ||
                    (this.Burgerservicenummer != null &&
                    this.Burgerservicenummer.Equals(input.Burgerservicenummer))
                ) && 
                (
                    this.Geslachtsaanduiding == input.Geslachtsaanduiding ||
                    (this.Geslachtsaanduiding != null &&
                    this.Geslachtsaanduiding.Equals(input.Geslachtsaanduiding))
                ) && 
                (
                    this.DatumIngangOnderzoek == input.DatumIngangOnderzoek ||
                    (this.DatumIngangOnderzoek != null &&
                    this.DatumIngangOnderzoek.Equals(input.DatumIngangOnderzoek))
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
                if (this.Burgerservicenummer != null)
                    hashCode = hashCode * 59 + this.Burgerservicenummer.GetHashCode();
                if (this.Geslachtsaanduiding != null)
                    hashCode = hashCode * 59 + this.Geslachtsaanduiding.GetHashCode();
                if (this.DatumIngangOnderzoek != null)
                    hashCode = hashCode * 59 + this.DatumIngangOnderzoek.GetHashCode();
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
