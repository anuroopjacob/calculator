pipeline {
	agent any 
	stages {
		stage ("Compile") {
			steps {
		    	sh "./gradlew compileJava"
		    	//echo "compileJava"
		    }
		}
		stage ("Unit test") {
			steps {
		    	sh "./gradlew test"
		    	//echo "test"
		    }
		}
	}
}