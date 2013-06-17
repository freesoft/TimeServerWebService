#!/bin/bash 

# wsimport is included in JDK, so you have to install JDK before execute this shell script
# also server should run on 5000 port before running this script

wsimport -keep -d client -clientjar client.jar -verbose -p com.potatosoft.TimeServerWebService.client http://localhost:5000/ts?wsdl
