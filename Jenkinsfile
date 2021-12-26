pipeline {
	agent any 
	stages {
		stage ("Compile") {
			steps {
		    	gradlew.bat compileJava
		    }
		}
		stage ("Unit test") {
			steps {
		    	gradlew.bat test
		    }
		}
	}
}