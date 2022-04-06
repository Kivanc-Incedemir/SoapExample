# SoapExample

This is a project dedicated for showing SOAP API.



## Installing

After checking out the git repo run the following maven command

```bash
mvn clean install
```

This should install all packages, run all unit tests

## Starting

To start the server please run the following maven command

```bash
mvn spring-boot:run
```


## Testing

To execute the unit tests against the business logic service classes please run the following maven command

```bash
mvn test
```



## Using

### API Endpoint

* Http Method - **POST**
* Endpoint - **localhost:8080/api/v1/discounts**

Example request

```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:us="http://kivanc.com/spring-boot-soap-example">

    <soapenv:Header/>

    <soapenv:Body>
        <us:getUserRequest>
            <us:name>Peter</us:name>
        </us:getUserRequest>
    </soapenv:Body>
</soapenv:Envelope>
```

The response is net payable amount.

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:getUserResponse xmlns:ns2="http://kivanc.com/spring-boot-soap-example">
            <ns2:user>
                <ns2:name>Peter</ns2:name>
                <ns2:empId>1111</ns2:empId>
                <ns2:salary>12000.0</ns2:salary>
            </ns2:user>
        </ns2:getUserResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```