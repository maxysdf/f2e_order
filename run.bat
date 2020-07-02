@echo off

rem setting ---------------------
set mvn=mvn
set java=java

if /I "%1" EQU "compile" (
    rem compile ---------------------
    cmd /c %mvn% -P deploy clean package

    rem deploy ---------------------
    if exist deploy rd /s /q deploy
    mkdir deploy
    mkdir deploy\conf
    mkdir deploy\conf\data
    xcopy /E /I target\lib deploy\lib
    xcopy target\f2e_order-0.0.1-SNAPSHOT.jar deploy
    xcopy src\main\resources\application.properties deploy\conf
    xcopy /E /I src\main\resources\data deploy\conf\data

    rem clean -------------------
    cmd /c %mvn% clean
)

rem run ---------------------
%java% -cp deploy\f2e_order-0.0.1-SNAPSHOT.jar;deploy\conf idv.maxy.f2e_order.F2EMain



