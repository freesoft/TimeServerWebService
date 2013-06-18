This is super-simple SOAP WebService template project. This project uses JAX-WS libraries included in Java 1.6+.
(Project itself is using Java 7)

# author 
* Wonhee Jung

# build environment 
* Java 1.6+
* Maven
* Project also includes Eclipse Juno's configuration.

# how to run 
This project is mavenized and has two maven module, which is server and client.
To run server first,
* java -jar <jar filename under /target> or simply
* ./start.sh under /server.
To run client
* ./client.sh

Generated jar with "mvn package" isn't executable jar, so you can't "java -jar xxx.jar" for client running.


# how to get result 

For testing, you can simply send SOAP message as below through your telnet, RestClient in FireFox, or others.

```<connection info>
POST http://127.0.0.1:5000 HTTP/ 1.0

<http header>
Accept: text/xml
Accept: application/soap
Content-Type: text/xml; charset=utf-8
SOAPAction: ""

<http body>
<?xml version="1.0" encoding="UTF-8"?>
<soap:Envelope soap:encodingStyle="http:// schemas.xmlsoap.org/soap/encoding/"
     xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
     xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xmlns:tns="http://potatosoft.com/"
     xmlns:xsd ="http://www.w3.org/2001/XMLSchema">
  <soap:Body>
    <tns:getTimeAsString xsi:nil="true" />
  </soap:Body>
</soap:Envelope>
```

Or simply run included client module according to above instructions.