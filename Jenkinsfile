pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven"
    }

    stages {
        stage('SCM checkout') {
            steps {
               echo 'Git Checkout...'
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/subhammohanty/jenkins-ci-cd-demo.git']])
            }
        }
         stage("Build Process"){
            steps{
                script{
                    echo 'Build Process...'
                    bat 'mvn clean install'
                }
            }
        }

    }
}
