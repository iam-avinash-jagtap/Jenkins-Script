pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                sh 'git clone https://github.com/iamtruptimane/student-app.git'
            }
        }    
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Your Application is successfully tested'
            }
        }
        stage('Deploy') {
            steps {
                echo 'YAAHUU..!, Your Application is deployed On Production Server'
            }
        }
    }
}