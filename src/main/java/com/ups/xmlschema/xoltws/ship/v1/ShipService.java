
package com.ups.xmlschema.xoltws.ship.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "ShipService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/Ship/v1.0", wsdlLocation = "file:/Users/wallace/ups/Shipping_Pkg/ShippingPACKAGE/PACKAGEWebServices/SCHEMA-WSDLs/Ship.wsdl")
public class ShipService
    extends Service
{

    private final static URL SHIPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHIPSERVICE_EXCEPTION;
    private final static QName SHIPSERVICE_QNAME = new QName("http://www.ups.com/WSDL/XOLTWS/Ship/v1.0", "ShipService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/wallace/ups/Shipping_Pkg/ShippingPACKAGE/PACKAGEWebServices/SCHEMA-WSDLs/Ship.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHIPSERVICE_WSDL_LOCATION = url;
        SHIPSERVICE_EXCEPTION = e;
    }

    public ShipService() {
        super(__getWsdlLocation(), SHIPSERVICE_QNAME);
    }

    public ShipService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ShipPortType
     */
    @WebEndpoint(name = "ShipPort")
    public ShipPortType getShipPort() {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/Ship/v1.0", "ShipPort"), ShipPortType.class);
    }

    private static URL __getWsdlLocation() {
        if (SHIPSERVICE_EXCEPTION!= null) {
            throw SHIPSERVICE_EXCEPTION;
        }
        return SHIPSERVICE_WSDL_LOCATION;
    }

}
