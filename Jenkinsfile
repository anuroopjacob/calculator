pipeline {
	agent any 
	stages {
		stage ("Compile") {
			steps {
		    	gradlew buildApp
		    }
		}
		stage ("Unit test") {
			steps {
		    	gradlew test
		    }
		}
	}
}