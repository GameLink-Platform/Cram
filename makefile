Teamname=TEAM_NAME_HERE
all: 
	javac -cp Cram.jar algorithms/$(Teamname).java; \
	java -cp Cram.jar:. algorithms.$(Teamname)
