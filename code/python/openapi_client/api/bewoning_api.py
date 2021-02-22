"""
    Bewoning

    API voor het zoeken en raadplegen van bewoningen en metagegevens over bewoning (verloop). Een bewoning is een adresseerbaar object (verblijfsobject, ligplaats of standplaats) met ingeschreven bewoner(s). Iedere samenstelling van bewoners van het object is een bewoning. Overleden personen maken onderdeel uit van een bewoning tot het moment van overlijden. Gegevens over de bewoners zijn actueel.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from openapi_client.api_client import ApiClient, Endpoint as _Endpoint
from openapi_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from openapi_client.model.bad_request_foutbericht import BadRequestFoutbericht
from openapi_client.model.bewoning_hal import BewoningHal
from openapi_client.model.bewoning_hal_collectie import BewoningHalCollectie
from openapi_client.model.foutbericht import Foutbericht
from openapi_client.model.verloop import Verloop


class BewoningApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __get_bewoning(
            self,
            adresseerbaar_object_identificatie,
            **kwargs
        ):
            """get_bewoning  # noqa: E501

            Raadpleeg een bewoning door een adresseerbaarobjectIdentificatie op te geven.   # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_bewoning(adresseerbaar_object_identificatie, async_req=True)
            >>> result = thread.get()

            Args:
                adresseerbaar_object_identificatie (str): De unieke identificatie van een verblijfsobject, standplaats of ligplaats. 

            Keyword Args:
                expand (str): Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature).. [optional]
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature). [optional]
                peildatum (date): De datum waarop de resource wordt opgevraagd.. [optional]
                datum_van (date): De begindatum van de periode waarover de resource wordt opgevraagd.. [optional]
                datum_tot_en_met (date): De einddatum van de periode waarover de resource wordt opgevraagd.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                BewoningHal
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['adresseerbaar_object_identificatie'] = \
                adresseerbaar_object_identificatie
            return self.call_with_http_info(**kwargs)

        self.get_bewoning = _Endpoint(
            settings={
                'response_type': (BewoningHal,),
                'auth': [],
                'endpoint_path': '/bewoningen/{adresseerbaarObjectIdentificatie}',
                'operation_id': 'get_bewoning',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'adresseerbaar_object_identificatie',
                    'expand',
                    'fields',
                    'peildatum',
                    'datum_van',
                    'datum_tot_en_met',
                ],
                'required': [
                    'adresseerbaar_object_identificatie',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'adresseerbaar_object_identificatie',
                ]
            },
            root_map={
                'validations': {
                    ('adresseerbaar_object_identificatie',): {

                        'regex': {
                            'pattern': r'^[0-9]{16}$',  # noqa: E501
                        },
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'adresseerbaar_object_identificatie':
                        (str,),
                    'expand':
                        (str,),
                    'fields':
                        (str,),
                    'peildatum':
                        (date,),
                    'datum_van':
                        (date,),
                    'datum_tot_en_met':
                        (date,),
                },
                'attribute_map': {
                    'adresseerbaar_object_identificatie': 'adresseerbaarObjectIdentificatie',
                    'expand': 'expand',
                    'fields': 'fields',
                    'peildatum': 'peildatum',
                    'datum_van': 'datumVan',
                    'datum_tot_en_met': 'datumTotEnMet',
                },
                'location_map': {
                    'adresseerbaar_object_identificatie': 'path',
                    'expand': 'query',
                    'fields': 'query',
                    'peildatum': 'query',
                    'datum_van': 'query',
                    'datum_tot_en_met': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_bewoning
        )

        def __get_bewoningen(
            self,
            **kwargs
        ):
            """get_bewoningen  # noqa: E501

            Zoek bewoningen door een adresseerbaarObjectIdentificatie of een burgerservicenummer op te geven, samen met een peildatum of periode.   # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_bewoningen(async_req=True)
            >>> result = thread.get()


            Keyword Args:
                expand (str): Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature).. [optional]
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature). [optional]
                peildatum (date): De datum waarop de resource wordt opgevraagd.. [optional]
                datum_van (date): De begindatum van de periode waarover de resource wordt opgevraagd.. [optional]
                datum_tot_en_met (date): De einddatum van de periode waarover de resource wordt opgevraagd.. [optional]
                burgerservicenummer (str): Uniek persoonsnummer. . [optional]
                adresseerbaar_object_identificatie (str): De unieke identificatie van een verblijfsobject, standplaats of ligplaats. . [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                BewoningHalCollectie
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            return self.call_with_http_info(**kwargs)

        self.get_bewoningen = _Endpoint(
            settings={
                'response_type': (BewoningHalCollectie,),
                'auth': [],
                'endpoint_path': '/bewoningen',
                'operation_id': 'get_bewoningen',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'expand',
                    'fields',
                    'peildatum',
                    'datum_van',
                    'datum_tot_en_met',
                    'burgerservicenummer',
                    'adresseerbaar_object_identificatie',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'burgerservicenummer',
                    'adresseerbaar_object_identificatie',
                ]
            },
            root_map={
                'validations': {
                    ('burgerservicenummer',): {
                        'max_length': 9,
                        'min_length': 9,
                        'regex': {
                            'pattern': r'^[0-9]*$',  # noqa: E501
                        },
                    },
                    ('adresseerbaar_object_identificatie',): {

                        'regex': {
                            'pattern': r'^[0-9]{16}$',  # noqa: E501
                        },
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'expand':
                        (str,),
                    'fields':
                        (str,),
                    'peildatum':
                        (date,),
                    'datum_van':
                        (date,),
                    'datum_tot_en_met':
                        (date,),
                    'burgerservicenummer':
                        (str,),
                    'adresseerbaar_object_identificatie':
                        (str,),
                },
                'attribute_map': {
                    'expand': 'expand',
                    'fields': 'fields',
                    'peildatum': 'peildatum',
                    'datum_van': 'datumVan',
                    'datum_tot_en_met': 'datumTotEnMet',
                    'burgerservicenummer': 'burgerservicenummer',
                    'adresseerbaar_object_identificatie': 'adresseerbaarObjectIdentificatie',
                },
                'location_map': {
                    'expand': 'query',
                    'fields': 'query',
                    'peildatum': 'query',
                    'datum_van': 'query',
                    'datum_tot_en_met': 'query',
                    'burgerservicenummer': 'query',
                    'adresseerbaar_object_identificatie': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_bewoningen
        )

        def __get_bewoningverloop(
            self,
            adresseerbaar_object_identificatie,
            **kwargs
        ):
            """get_bewoningverloop  # noqa: E501

            Raadpleeg het verloop van de bewoning van een adresseerbaar object over een periode door een adresseerbaarobjectIdentificatie en een periode op te geven. Het antwoord bevat het aantal verhuizingen van en naar het object en het gemiddelde aantal bewoners in de opgegeven periode.   # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_bewoningverloop(adresseerbaar_object_identificatie, async_req=True)
            >>> result = thread.get()

            Args:
                adresseerbaar_object_identificatie (str): De unieke identificatie van een verblijfsobject, standplaats of ligplaats. 

            Keyword Args:
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature). [optional]
                datum_van (date): De begindatum van de periode waarover de resource wordt opgevraagd.. [optional]
                datum_tot_en_met (date): De einddatum van de periode waarover de resource wordt opgevraagd.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                Verloop
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['adresseerbaar_object_identificatie'] = \
                adresseerbaar_object_identificatie
            return self.call_with_http_info(**kwargs)

        self.get_bewoningverloop = _Endpoint(
            settings={
                'response_type': (Verloop,),
                'auth': [],
                'endpoint_path': '/bewoningen/{adresseerbaarObjectIdentificatie}/verloop',
                'operation_id': 'get_bewoningverloop',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'adresseerbaar_object_identificatie',
                    'fields',
                    'datum_van',
                    'datum_tot_en_met',
                ],
                'required': [
                    'adresseerbaar_object_identificatie',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'adresseerbaar_object_identificatie',
                ]
            },
            root_map={
                'validations': {
                    ('adresseerbaar_object_identificatie',): {

                        'regex': {
                            'pattern': r'^[0-9]{16}$',  # noqa: E501
                        },
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'adresseerbaar_object_identificatie':
                        (str,),
                    'fields':
                        (str,),
                    'datum_van':
                        (date,),
                    'datum_tot_en_met':
                        (date,),
                },
                'attribute_map': {
                    'adresseerbaar_object_identificatie': 'adresseerbaarObjectIdentificatie',
                    'fields': 'fields',
                    'datum_van': 'datumVan',
                    'datum_tot_en_met': 'datumTotEnMet',
                },
                'location_map': {
                    'adresseerbaar_object_identificatie': 'path',
                    'fields': 'query',
                    'datum_van': 'query',
                    'datum_tot_en_met': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_bewoningverloop
        )
