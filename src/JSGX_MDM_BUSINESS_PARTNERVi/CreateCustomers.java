/**
 * CreateCustomers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_BUSINESS_PARTNERVi;

public class CreateCustomers  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate[] customers;

    private beans.core.mdm.sap.com.RepositoryInformation reposInfo;

    private beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters;

    public CreateCustomers() {
    }

    public CreateCustomers(
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate[] customers,
           beans.core.mdm.sap.com.RepositoryInformation reposInfo,
           beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) {
           this.customers = customers;
           this.reposInfo = reposInfo;
           this.configurationParameters = configurationParameters;
    }


    /**
     * Gets the customers value for this CreateCustomers.
     * 
     * @return customers
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate[] getCustomers() {
        return customers;
    }


    /**
     * Sets the customers value for this CreateCustomers.
     * 
     * @param customers
     */
    public void setCustomers(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate[] customers) {
        this.customers = customers;
    }


    /**
     * Gets the reposInfo value for this CreateCustomers.
     * 
     * @return reposInfo
     */
    public beans.core.mdm.sap.com.RepositoryInformation getReposInfo() {
        return reposInfo;
    }


    /**
     * Sets the reposInfo value for this CreateCustomers.
     * 
     * @param reposInfo
     */
    public void setReposInfo(beans.core.mdm.sap.com.RepositoryInformation reposInfo) {
        this.reposInfo = reposInfo;
    }


    /**
     * Gets the configurationParameters value for this CreateCustomers.
     * 
     * @return configurationParameters
     */
    public beans.ws.mdm.sap.com.CreateConfigurationParameters getConfigurationParameters() {
        return configurationParameters;
    }


    /**
     * Sets the configurationParameters value for this CreateCustomers.
     * 
     * @param configurationParameters
     */
    public void setConfigurationParameters(beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) {
        this.configurationParameters = configurationParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomers)) return false;
        CreateCustomers other = (CreateCustomers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customers==null && other.getCustomers()==null) || 
             (this.customers!=null &&
              java.util.Arrays.equals(this.customers, other.getCustomers()))) &&
            ((this.reposInfo==null && other.getReposInfo()==null) || 
             (this.reposInfo!=null &&
              this.reposInfo.equals(other.getReposInfo()))) &&
            ((this.configurationParameters==null && other.getConfigurationParameters()==null) || 
             (this.configurationParameters!=null &&
              this.configurationParameters.equals(other.getConfigurationParameters())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReposInfo() != null) {
            _hashCode += getReposInfo().hashCode();
        }
        if (getConfigurationParameters() != null) {
            _hashCode += getConfigurationParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", ">createCustomers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "customers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersCreate"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersCreate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reposInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "configurationParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
