pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven"
    }
    environment {
        APP_NAME = "spring-docker-cicd"
        RELEASE_NO = "1.0.0"
        DOCKER_USER = "subhammohanty123"
        IMAGE_NAME = "${DOCKER_USER}/${APP_NAME}"
        IMAGE_TAG = "${RELEASE_NO}-${BUILD_NUMBER}"
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
                    bat 'mvn clean install'
                }
            }
        }

        stage("Build Docker Image"){
            steps{
                powershell '''
                docker build -t ${env:IMAGE_NAME}:${env:IMAGE_TAG} .
                '''
            }
        }

        stage("Deploy Docker Image"){
            steps{
                withCredentials([string(credentialsId: 'docker-new-cred', variable: 'docker-new-cred')]) {
                    powershell '''
                    docker login -u ${env:DOCKER_USER} -p ${env:docker-new-cred}
                    docker push ${env:IMAGE_NAME}:${env:IMAGE_TAG}
                    '''
                }
            }
        }
    }
    post{
            always{
                emailext attachLog: true,
                body: ''' <html>
        <body>
            <p>Build Status: ${BUILD_STATUS}</p>
            <p>Build Number: ${BUILD_NUMBER}</p>
            <p>Check the <a href="${BUILD_URL}">console output</a>.</p>
        </body>
    </html>''', mimeType: 'text/html', replyTo: 'subhammohanty2511@gmail.com', subject: 'Pipeline Status : ${BUILD_NUMBER}', to: 'subhammohanty2511@gmail.com'

            }
        }

}
