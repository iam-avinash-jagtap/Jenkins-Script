pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                git 'https://github.com/iam-avinash-jagtap/IAM-Access-Management.git'
            }
        }    
        stage('Build') {
            steps {
                echo 'Your code build Successfull'
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