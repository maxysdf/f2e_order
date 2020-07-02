#!/bin/sh

# setting ---------------------
mvn=mvn
java=$(which java)

if [ "$1" == "compile" ]; then
    # compile ---------------------
    $mvn clean package

    # deploy ---------------------
    [ -d deploy ] && rm -rf deploy
    mkdir deploy
    mkdir deploy/conf
    cp -r target/lib deploy
    cp target/f2e_order-0.0.1-SNAPSHOT.jar deploy
    cp src/main/resources/application.properties deploy/conf
    cp -r src/main/resources/data deploy/conf

    # clean -------------------
    $mvn clean
fi

# run ---------------------
$java -cp deploy/f2e_order-0.0.1-SNAPSHOT.jar:deploy/conf idv.maxy.f2e_order.F2EMain


