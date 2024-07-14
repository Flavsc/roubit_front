@ECHO OFF
setlocal

set DIRNAME=%~dp0
set APP_HOME=%DIRNAME%

"%APP_HOME%gradle\bin\gradle" %*
