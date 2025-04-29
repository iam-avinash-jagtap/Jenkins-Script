pipeline {
    agent any

    stages {
        stage('Code') {
            steps {
                echo 'Pulling code from GitHub'
                git branch: 'master', url: 'https://github.com/iam-avinash-jagtap/2-Tier-Application.git'
                echo 'Code Clone Successful.'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the code...'
                sh 'whoami'
                sh 'docker build -t flaskapp:latest .'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the application...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application on Docker...'
                sh 'docker-compose up -d'
            }
        }
    }
}
