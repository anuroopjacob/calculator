pipeline {
	agent any 
	stages {
		stage ("Compile") {
			steps {
		    	./gradlew.bat buildApp
		    }
		}
		stage ("Unit test") {
			steps {
		    	./gradlew.bat test
		    }
		}
	}
}