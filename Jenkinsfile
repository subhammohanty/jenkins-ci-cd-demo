// pipeline {
//     agent any
//
//     tools {
//         // Install the Maven version configured as "M3" and add it to the path.
//         maven "maven"
//     }
//
//     stages {
//         stage('SCM checkout') {
//             steps {
//                echo 'Git Checkout...'
//                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/subhammohanty/jenkins-ci-cd-demo.git']])
//             }
//         }
//          stage("Build Process"){
//             steps{
//                 script{
//                     echo 'Build Process...'
//                     bat 'mvn clean install'
//                 }
//             }
//         }
//     }
//     post{
//             always{
//                 emailext attachLog: true,
//                 body: ''' <html>
//         <body>
//             <p>Build Status: ${BUILD_STATUS}</p>
//             <p>Build Number: ${BUILD_NUMBER}</p>
//             <p>Check the <a href="${BUILD_URL}">console output</a>.</p>
//         </body>
//     </html>''', mimeType: 'text/html', replyTo: 'subhammohanty2511@gmail.com', subject: 'Pipeline Status : ${BUILD_NUMBER}', to: 'subhammohanty2511@gmail.com'
//
//             }
//         }
//
// }
