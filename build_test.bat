@echo off

cls

cd C:\\Users\\Duncan\\Documents\\2012\\COMP204\\Assignment-2\\src\\src\\com\\github\\C204_242_DJSMT\\Assignment_2

del *.class

javac -cp "C:\Users\Duncan\Documents\2012\COMP204\Assignment-2\src\src" *.java

cd tests

del *.class

javac -cp "C:\Users\Duncan\Documents\2012\COMP204\Assignment-2\src\src;C:\Users\Duncan\Documents\2012\COMP204\Assignment-2\src\jars\junit-4.10.jar" *.java

java -cp "C:\Users\Duncan\Documents\2012\COMP204\Assignment-2\src\src;C:\Users\Duncan\Documents\2012\COMP204\Assignment-2\src\jars\junit-4.10.jar" org.junit.runner.JUnitCore com.github.C204_242_DJSMT.Assignment_2.tests.Tests

cd C:\\Users\\Duncan\\Documents\\2012\\COMP204\\Assignment-2