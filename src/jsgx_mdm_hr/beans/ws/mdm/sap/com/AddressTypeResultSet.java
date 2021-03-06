/**
 * AddressTypeResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class AddressTypeResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressType[] addressType;

    public AddressTypeResultSet() {
    }

    public AddressTypeResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressType[] addressType) {
        super(
            executionStatus);
        this.addressType = addressType;
    }


    /**
     * Gets the addressType value for this AddressTypeResultSet.
     * 
     * @return addressType
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressType[] getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this AddressTypeResultSet.
     * 
     * @param addressType
     */
    public void setAddressType(jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressType[] addressType) {
        this.addressType = addressType;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressType getAddressType(int i) {
        return this.addressType[i];
    }

    public void setAddressType(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressType _value) {
        this.addressType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressTypeResultSet)) return false;
        AddressTypeResultSet other = (AddressTypeResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              java.util.Arrays.equals(this.addressType, other.getAddressType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAddressType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressTypeResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "addressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
