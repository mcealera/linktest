A simple command line application that evaluates signal power levels 
for a given device position against a list of 3 base points, defined by location and reach.

The application receives device coordinates as input and returns the ideal link station and power level.

Base station list:

(0,0,10)
(20,20,5)
(10,0,12)

Example output:

Input:(0,0)
Best link station is at (0,0), power is 100.0

Input:(100,100)
No link station in range for device at 100,100

Input:(15,10)
Best link station is at (10,0), power is 0.6718427000252355

Input:(18,18)
Best link station is at (20,20), power is 4.715728752538098

1. Running the compiled jar

	1.1 Navigate to LinkTest/target
	1.2 Execute the jar file with (x,y) as arguments:
		
		java -jar LinkTest.jar 3 3

2. Loading the project into IDE, editor config. 

	The project was built and compiled in IntelliJ.
	Iml and .idea directory are provided for convenience. 
	To open the project in IntelliJ IDEA simply go to File > Open and select the LinkTest diretory

3. Maven

	The project follows Maven file structure and contains a pom.xml file.
	It can therefore be built, compiled and repackeged using standard Maven commands.

	3.1 Test

	In order to run the Unit Tests, run the following mvn command

	mvn test

	3.2 Compile & Package

	This will compile the project and create the standalone LinkTest.jar executable under LinkTest/target

	mvn clean compile assembly:single

		